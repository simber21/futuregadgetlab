package minischeme;

import minischeme.parser.api.Parser;

import java.io.File;
import java.util.List;

public class Application {

  public static void main(String... args) throws Exception {
    List<Object> code = new Parser().readValue(new File(args[0]), List.class);
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(new Parser().writeValueAsString(result));
  }
}
