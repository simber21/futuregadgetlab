package minischeme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Lambda implements Procedure {

  private transient final List<String> params;
  private transient final List<Object> body;
  private transient final Evaluator evaluator;
  private transient final Map<String, Object> env;

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
