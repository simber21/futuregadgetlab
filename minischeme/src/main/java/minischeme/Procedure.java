package minischeme;

import java.util.List;

@FunctionalInterface
public interface Procedure {

  public Object call(final List<Object> args);

}
