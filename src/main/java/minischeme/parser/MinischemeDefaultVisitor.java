package minischeme.parser;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class MinischemeDefaultVisitor extends MinischemeBaseVisitor<Object> {

  public Object visitSexpr(MinischemeParser.SexprContext ctx) {
    return ctx.list() != null ? visit(ctx.list()) : List.of();
  }

  public Object visitItem(MinischemeParser.ItemContext ctx) {
    return visit(ctx.atom() != null ? ctx.atom() : ctx.list());
  }

  public Object visitList(MinischemeParser.ListContext ctx) {
    return ctx.item() != null ? ctx.item().stream().map(this::visit).collect(toList()) : List.of();
  }

  public Object visitAtom(MinischemeParser.AtomContext ctx) {
    if (ctx.SYMBOL() != null) {
      var symbol = ctx.SYMBOL().getText();
      switch (symbol) {
        case "#t": return true;
        case "#f": return false;
        default: return symbol;
      }
    } else {
      return Double.valueOf(ctx.NUMBER().getText());
    }
  }
}
