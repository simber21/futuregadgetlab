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

    if (head.equals("and")) {
      boolean result = true;
      for ( int j = 1; j < sexpr.size(); j++ ) {
        result = (boolean) sexpr.get(j);
      }
      return result;
    }

    if (head.equals("eq")) {
      boolean res = true;
      Object branch = new Object();
        for (int i = 0; i < tail.size() - 1; i++) {
          if ((double) tail.get(i) != (double) tail.get(i+1)) {
            res = false;
          }
          if(res) {
            branch = tail.get(i);
          }
        }

      return eval(branch, env);
    }
    if (head.equals("not")) {
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
