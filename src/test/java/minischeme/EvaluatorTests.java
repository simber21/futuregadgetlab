package minischeme;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.*;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import static java.util.stream.Collectors.joining;

class EvaluatorTests {

  private transient Evaluator evaluator;
  private transient Map<String, Object> env;

  @BeforeEach void init() {
    this.evaluator = new Evaluator();
    this.env = GlobalEnvironment.build();
  }

  @Test void multiplicationTest() {
    List<Object> program = List.of("*", 2.0, 3.0, 4.0);
    Object result = evaluator.eval(program, env);
    assertEquals(24.0, result);
  }


  @Test void variableDefinitionTest() {
    List<Object> program = List.of("define", "pi", 3.141592);
    Object result = evaluator.eval(program, env);
    assertEquals(3.141592, env.get("pi"));
  }

  @Test void variableUseTest() {
    /*
    (begin
      (define pi 3.141592)
      (* pi 100.0))
    */
    List<Object> program = List.of(
        "begin",
        List.of("define", "pi", 3.141592),
        List.of("*", "pi", 100.0));
    Object result = evaluator.eval(program, env);
    assertEquals(314.1592, result);
  }

  @Test void lambdaExpressionTest() {
    /*
    (define aire-cercle (lambda (r) (* pi r r)))
    */
    List<Object> program = List.of("define", "aire-cercle", List.of("lambda", List.of("r"), List.of("*", "pi", "r", "r")));
    Object result = evaluator.eval(program, env);
    assertNotNull(env.get("aire-cercle"));
  }

  @Test void anonymousLambdaTest() {
    /*
    (begin
      (define pi 3.141592)
      ((lambda (r) (* pi r r)) 10.0)
    */
    List<Object> program = List.of(
        "begin",
          List.of("define", "pi", 3.141592),
          List.of(List.of("lambda", List.of("r"), List.of("*", "pi", "r", "r")), 10.0));
    Object result = evaluator.eval(program, env);
    assertEquals(314.1592, result);
  }

  @Test void lambdaDefinitionTest() {
    /*
    (begin
      (define pi 3.141592)
      (define aire-cercle (lambda (r) (* pi r r)))
      (aire-cercle 10.0))
    */
    List<Object> program = List.of(
        "begin",
          List.of("define", "pi", 3.141592),
          List.of("define", "aire-cercle", List.of("lambda", List.of("r"), List.of("*", "pi", "r", "r"))),
          List.of("aire-cercle", 10.0));
    Object result = evaluator.eval(program, env);
    assertEquals(314.1592, result);
  }

  @Test void lessThanTest() {
    assertTrue((boolean) evaluator.eval(List.of("<", 1.0, 2.0), env));
    assertTrue((boolean) evaluator.eval(List.of("<", 1.0, 2.0, 3.0), env));
    assertFalse((boolean) evaluator.eval(List.of("<", 2.0, 1.0), env));
    assertFalse((boolean) evaluator.eval(List.of("<", 2.0, 3.0, 1.0), env));
  }

  @Test void substractionTest() {
    assertEquals(2.0, evaluator.eval(List.of("-", 3.0, 1.0), env));
    assertEquals(2.0, evaluator.eval(List.of("-", 5.0, 2.0, 1.0), env));
  }

  @Test void additionTest() {
    assertEquals(5.0, evaluator.eval(List.of("+", 3.0, 2.0), env));
    assertEquals(5.0, evaluator.eval(List.of("+", 0.0, 1.0, 1.0, 3.0), env));
  }

  @Test void ifTest() {
    List<Object> program = List.of("if", List.of("<", 1.0, 2.0), List.of("*", 2.0, 2.0), List.of("*", 3.0, 3.0));
    Object result = evaluator.eval(program, env);
    assertEquals(4.0, result);
  }

  @Test void elseTest() {
    List<Object> program = List.of("if", List.of("<", 2.0, 1.0), List.of("*", 2.0, 2.0), List.of("*", 3.0, 3.0));
    Object result = evaluator.eval(program, env);
    assertEquals(9.0, result);
  }

  @Test void recursionTest() {
    /*
    (begin
      (define facto (lambda (n)
        (if (< n 2.0)
          1.0
          (* n (facto (- n 1.0))))))
      (facto 5.0))
    */
    List<Object> program =
      List.of("begin",
        List.of("define", "facto", List.of("lambda", List.of("n"),
          List.of("if", List.of("<", "n", 2.0),
            1.0,
            List.of("*", "n", List.of("facto", List.of("-", "n", 1.0)))))),
        List.of("facto", 5.0));
    Object result = evaluator.eval(program, env);
    assertEquals(120.0, result);
  }

  /*
  Teste pour voir si la réponse de l'opérateur AND dépend du positionnement de
  la valeur booléenne.
  Une grande liste a aussi été utilisé pour verifier la boucle for dans le
  fichier GlobalEnvironment.java
 */
  @Test void andTest() {
  assertFalse((boolean) evaluator.eval(List.of("and", true, false), env));
  assertTrue((boolean) evaluator.eval(List.of("and", true, true, true, true), env));
  assertFalse((boolean) evaluator.eval(List.of("and", false, true), env));
  assertFalse((boolean) evaluator.eval(List.of("and", true, true, false, true), env));
  }

  @Test void notTest() {
  assertTrue((boolean) evaluator.eval(List.of("not", false), env));
  assertFalse((boolean) evaluator.eval(List.of("not", true), env));
  }

  @Test void eqTest() {
  assertTrue((boolean) evaluator.eval( List.of("eq", 2.0, 2.0), env));
  assertFalse((boolean) evaluator.eval(List.of("eq", 2.0, 22.0), env));
  assertTrue((boolean) evaluator.eval( List.of("eq", 2.0, 2.0, 2.0, 2.0, 2.0), env));
  }

  @Test void countTest(){
    List<Object> program = List.of("count", 1.0, 2.0, 3.0, 4.0);
    Object result = evaluator.eval(program, env);
    assertEquals(4.0, result);
  }

  @Test void headTest(){
    List<Object> program = List.of("head", 2.0, 3.0, 15.0, 20.0);
    Object first = evaluator.eval(program, env);
    assertEquals(2.0, first);
  }

  @Test void tailTest(){
    List<Object> program = List.of("tail", 2.0, 3.0, 15.0, 20.0);
    Object last = evaluator.eval(program, env);
    assertEquals(List.of(3.0, 15.0, 20.0), last );
  }

  @Test void oneValueTest(){
    /*
    Si une seule valeur, un message d'avertissement apparaît
    l'utilisateur devrait utiliser la fonction HEAD
     */
    List<Object> program = List.of("tail", 2.0);
    Object last = evaluator.eval(program, env);
    assertEquals(List.of("Une seule valeur, utiliser HEAD"), last );
  }

  @Test void nandTest(){
    /*
    NAND = NOT (AND)
    */
    assertTrue((boolean) evaluator.eval(List.of("not", List.of("and", true, false)), env));
    assertFalse((boolean) evaluator.eval(List.of("not", List.of("and", true, true)), env));
  }


  @Test void orTest(){
    /*
  L'operateur OR résulte de la négation des variables dans NAND.
     OR = NOT(NAND) =  NOT( AND ((NOT P) (NOT Q)))
   */
    List<Object> program = List.of(
            "begin",
            List.of("define", "p", false),
            List.of("define", "q", true),

            List.of("not", List.of("and", (List.of("not", "p")), (List.of("not", "q")))));
    assertTrue((boolean) evaluator.eval(program, env));
  }


  @Test void fauxOrTest(){
    /*
    Un test négatif de fonction OR
   */
    List<Object> program = List.of(
            "begin",
            List.of("define", "p", false),
            List.of("define", "q", false),

            List.of("not", List.of("and", (List.of("not", "p")), (List.of("not", "q")))));

    assertFalse((boolean) evaluator.eval(program, env));
  }

  @Test void norTest() {
    /*
    Retourne false si au moins une variable est vrai
     NOR = NOT(OR) où OR = NOT(NAND)
     NOR = NOT(NOT(AND(NOT p, NOT q)))
     */
    List<Object> program = List.of(
            "begin",
            List.of("define", "p", false),
            List.of("define", "q", false),

            List.of("not", List.of("not", List.of("and", (List.of("not", "p")), (List.of("not", "q"))))));

    assertTrue((boolean) evaluator.eval(program, env));
  }

  @Test void fauxNorTest(){
    /*
    Test négatif de NOR retourne false
     */
    List<Object> program = List.of(
            "begin",
            List.of("define", "p", true),
            List.of("define", "q", false),

            List.of("not", List.of("not", List.of("and", (List.of("not", "p")), (List.of("not", "q"))))));

    assertFalse((boolean) evaluator.eval(program, env));
  }

  @Test void xorTest(){
      /*
  Fonction XOR
  XOR = !p && q || p && !q
  Donc, ![ !( !p && q) && !( p && !q)]
   */

    List<Object> program = List.of(
            "begin",
            List.of("define", "p", true),
            List.of("define", "q", false),
            List.of("not",
                    List.of("and",
                            List.of("not", List.of("and", "p", List.of("not", "q"))),
                            List.of("not", List.of("and", List.of("not", "p"), "q"))
                    )
            )
    );
    assertTrue((boolean) evaluator.eval(program, env));
  }

  @Test void fauxXorTest() {
    /*
    Test négatif de XOR, retourne false
   */

    List<Object> program = List.of(
            "begin",
            List.of("define", "p", true),
            List.of("define", "q", true),
            List.of("not",
                    List.of("and",
                            List.of("not", List.of("and", "p", List.of("not", "q"))),
                            List.of("not", List.of("and", List.of("not", "p"), "q"))
                    )
            )
    );
    assertFalse((boolean) evaluator.eval(program, env));

  }

}
