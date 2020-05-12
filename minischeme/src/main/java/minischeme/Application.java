package minischeme;

import minischeme.parser.api.Parser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class Application {

  public static void main(String... args) throws Exception {
    Path path = Paths.get(args[0]);
    String source = Files.readString(path);
    List<Object> code = new Parser().parseString(source);
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(result);
  } 
}
