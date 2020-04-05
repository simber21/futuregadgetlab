package minischeme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;


public class GlobalEnvironment {

  public static Map<String, Object> build() {
    var env = new HashMap<String, Object>();

    env.put("begin", (Procedure) (List<Object> params) -> {
      return params.get(params.size() - 1);
    });

    env.put("<", (Procedure) (List<Object> params) -> {
      var result = true;
      for (int i = 0; i < params.size()-1; i++) result = result && (Double) params.get(i) < (Double) params.get(i+1);
      return result;
    });

    env.put("*", (Procedure) (List<Object> params) -> {
      var product = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) product *= (Double) x;
      return product;
    });

    env.put("+", (Procedure) (List<Object> params) -> {
      var result = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) result += (Double) x;
      return result;
    });

    env.put("-", (Procedure) (List<Object> params) -> {
      var result = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) result -= (Double) x;
      return result;
    });

    return env;
  }
}
