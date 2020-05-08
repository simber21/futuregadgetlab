package minischeme;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class Application {

  public static void main(String... args) throws Exception {
   
    List<Object> code = new ObjectMapper().readValue(new File(args[0]), List.class);
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(new ObjectMapper().writeValueAsString(result));
    
  } 
}
