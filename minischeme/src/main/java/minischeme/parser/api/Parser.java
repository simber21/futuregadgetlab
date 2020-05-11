package minischeme.parser.api;

import java.util.List;

import minischeme.parser.*;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;

public class Parser {

  @SuppressWarnings("unchecked")
  public static List<Object> parseString(final String source) throws Exception {
    var input = CharStreams.fromString(source);
    var lexer = new MinischemeLexer(input);
    var tokens = new CommonTokenStream(lexer);
    var parser = new MinischemeParser(tokens);
    var tree = parser.sexpr();

    var visitor = new MinischemeDefaultVisitor();
    return (List<Object>) visitor.visit(tree);
  }
}
