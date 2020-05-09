package minischeme;

import minischeme.parser.api.Parser;

import java.io.File;
import java.util.List;

public class Application {

  public static void main(String... args) throws Exception {
    String source = "";
    List<Object> code = new Parser().parseString(source);
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(new Parser().parseString(result));
  }
}
