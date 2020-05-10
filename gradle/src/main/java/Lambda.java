package minischeme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Lambda implements Procedure {

  private final List<String> params;
  private final List<Object> body;
  private final Evaluator evaluator;
  private final Map<String, Object> env;

  public Lambda(List<String> params, List<Object> body, Evaluator evaluator, Map<String, Object> env) {
    this.params = params;
    this.body = body;
    this.evaluator = evaluator;
    this.env = env;
  }

  @Override
  public Object call(final List<Object> args) {
    var localEnv = new HashMap<String, Object>();
    localEnv.putAll(env);
    for (int i = 0; i < params.size(); i++) localEnv.put(params.get(i), args.get(i));

    return evaluator.eval(body, localEnv);
  }
}
