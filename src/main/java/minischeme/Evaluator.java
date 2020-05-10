package minischeme;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toList;


public class Evaluator {

  @SuppressWarnings("unchecked")
  public Object eval(final Object expr, final Map<String, Object> env) {
    if (expr instanceof String) {
      return env.get((String) expr);
    }
    else if (! (expr instanceof List)) {
      return expr;
    }

    final var sexpr = (List<Object>) expr;
    final var head = sexpr.get(0);
    final var tail = sexpr.subList(1, sexpr.size());

    
    if (head.equals("list")) {
      return tail.stream().map(a -> eval(a, env)).collect(toList());
    }
    else if (head.equals("if")) {
      var branch = ((boolean) eval(tail.get(0), env)) ? tail.get(1) : tail.get(2);
      return eval(branch, env);
    }
    else if (head.equals("and")) {
    /*
    L'opérateur AND prend en paramètre une liste d'expression booléene.
    Les deux conditions incluent dans la boucle for permet de retourner FALSE lorsque
    la dernière epression dans la liste est TRUE.
    */
      boolean result = true;
      for ( int j = 1; result && j < sexpr.size() ; j++ ) {

        result = (boolean) sexpr.get(j);

      }
      return result;
    }
    else if (head.equals("count")) {
      /*
      La fonction COUNT retourne un double, car les variables
      des tests (et du GlobalEnvironment) sont des double.
      */
      double counter = 0.0;
      for( int k=1; k < sexpr.size(); k++) {
        counter = counter + 1;
      }
      return counter;
    }
    else if (head.equals("head")) {
      /*
      Puisque la variable tail retourne déjà une liste sans l'opérateur,
      la valeur à l'indice 0 sera toujours le premier élément de la liste.
       */
       return tail.get(0);
    }
    else if (head.equals("tail")) {
      /*
      Puisque la fonction TAIL ne retourne que les derniers éléments d'une liste
      sans le premier élément (qu'on obtient avec la fonction HEAD).
      */
      List <Object> branch = List.of("Une seule valeur, utiliser HEAD");

      if (sexpr.size() > 2) {
         branch = sexpr.subList(2, sexpr.size());
      }
      return branch;
    }
    else if (head.equals("not")) {
      var branch = (eval(tail.get(0), env) != eval(tail.get(1), env));
      return eval(branch, env);
    }
    else if (head.equals("define")) {
      env.put((String) tail.get(0), eval(tail.get(1), env));
      return null;
    }
    else if (head.equals("lambda")) {
      return new Lambda((List<String>) tail.get(0), (List<Object>) tail.get(1), this, env);
    }
    else {
      final var proc = (Procedure) eval(head, env);
      if (tail.size() == 0) {
        return proc;
      }
      else {
        final List<Object> args = tail.stream().map(a -> eval(a, env)).collect(toList());
        return proc.call(args);
      }
    }
  }
}
