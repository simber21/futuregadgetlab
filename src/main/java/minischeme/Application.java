package minischeme;

import minischeme.parser.api.Parser;

public class Application {


  public static void main(String... args) throws Exception {
<<<<<<< HEAD
    String source = "(+ 1.0 5.0)";
    Object code = new Parser().parseString(source);
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(result.toString());
  }
=======
   
    List<Object> code = new ObjectMapper().readValue(new File(args[0]), List.class);
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(new ObjectMapper().writeValueAsString(result));
    
  } 
>>>>>>> de0fee4273805cce9fa490e60359f73ecae4d19b
}
