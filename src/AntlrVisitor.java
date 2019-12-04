package src;
import antlr.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AntlrVisitor extends InterpreterBaseVisitor<Integer>{

    public Integer visitStart(InterpreterParser.StartContext ctx)
    {
        System.out.println("visitStart: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitBlock(InterpreterParser.BlockContext ctx)
    {
        System.out.println("visitBlock: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitDecls(InterpreterParser.DeclsContext ctx)
    {
        System.out.println("visitDecls: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitDecl(InterpreterParser.DeclContext ctx)
    {
        System.out.println("visitDecl: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitType(InterpreterParser.TypeContext ctx)
    {
        System.out.println("visitType: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitStmts(InterpreterParser.StmtsContext ctx)
    {
        System.out.println("visitStmts: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitAssign(InterpreterParser.AssignContext ctx)
    {
        System.out.println("visitAssign: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitStmt(InterpreterParser.StmtContext ctx)
    {
        System.out.println("visitStmt: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitAllexpr(InterpreterParser.AllexprContext ctx)
    {
        System.out.println("visitAllexpr: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitAndexpr(InterpreterParser.AndexprContext ctx)
    {
        System.out.println("visitAndexpr: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitEqual(InterpreterParser.EqualContext ctx)
    {
        System.out.println("visitEqual: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitRel(InterpreterParser.RelContext ctx)
    {
        System.out.println("visitRel: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitExpr(InterpreterParser.ExprContext ctx)
    {
        System.out.println("visitExpr: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitTerm(InterpreterParser.TermContext ctx)
    {
        System.out.println("visitTerm: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitIncdecexpr(InterpreterParser.IncdecexprContext ctx)
    {
        System.out.println("visitIncdecexpr: " + ctx.getText().toString());
        return visitChildren(ctx);
    };

    public Integer visitFactor(InterpreterParser.FactorContext ctx)
    {
        System.out.println("visitFactor: " + ctx.getText().toString());
        return visitChildren(ctx);
    };
}
