package minischeme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class GlobalEnvironment {

  public static Map<String, Object> build() {
    var env = new HashMap<String, Object>();

    env.put("begin", (Procedure) (List<Object> params) -> {
      return params.get(params.size() - 1);
    });

    env.put("*", (Procedure) (List<Object> params) -> {
      var product = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) product *= (Double) x;
      return product;
    });

    env.put("<", (Procedure) (List<Object> params) -> {
      var result = true;
      for (int i = 0; i < params.size()-1; i++) result = result && (Double) params.get(i) < (Double) params.get(i+1);
      return result;
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

    env.put("append", (Procedure) (List<Object> params) -> {
      var concat = new ArrayList<Object>();
      for (int i = 0; i < params.size(); i++) concat.addAll((List<Object>) params.get(i));
      return concat;
    });

    env.put("filter", (Procedure) (List<Object> params) -> {
      var fn = (Procedure) params.get(0);
      var xs = (List<Object>) params.get(1);
      return xs.stream().filter(x -> (boolean) fn.call(List.of(x))).collect(toList());
    });

    env.put("and", (Procedure) (List<Object> params) -> {
      var result = true;
      for (int i = 0; i < params.size(); i++) result = result && (boolean) params.get(i);
      return result;
    });
    /*
    Retourne true si false et false si true.
    L'opérateur ne prend qu'un seul paramètre.
     */
    env.put("not", (Procedure) (List<Object> params) -> {
      return !((boolean) params.get(0));
    });

    /*
    Retourne false si un seul élément n'est pas égale.
    La fonction equals de la classe Double est utilisé pour comparer les objets.
    */
    env.put("eq", (Procedure) (List<Object> params) -> {
      var result = true;
      for (int i = 0; i < params.size()-1; i++) result = result && ((Double) params.get(i)).equals((Double) params.get(i+1));
      return result;
    });


    return env;
  }
}
