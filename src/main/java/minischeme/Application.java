package minischeme;

import minischeme.parser.api.Parser;

public class Application {


  public static void main(String... args) throws Exception {
    String source = "";
    Object code = new Parser().parseString(source);
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(result.toString());
  }
}
