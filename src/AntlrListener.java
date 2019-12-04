package src;
import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AntlrListener extends InterpreterBaseListener {

    public void enterStart(InterpreterParser.StartContext ctx) {
        System.out.println("enterStart: " + ctx.getText().toString());
    }


    public void exitStart(InterpreterParser.StartContext ctx) {
        System.out.println("exitStart: " + ctx.getText().toString());
    }


    public void enterBlock(InterpreterParser.BlockContext ctx) {
        System.out.println("enterBlock: " + ctx.getText().toString());
    };


    public void exitBlock(InterpreterParser.BlockContext ctx) {
        System.out.println("exitBlock: " + ctx.getText().toString());
    };


    public void enterDecls(InterpreterParser.DeclsContext ctx) {
        System.out.println("enterDecls: " + ctx.getText().toString());
    };


    public void exitDecls(InterpreterParser.DeclsContext ctx) {
        System.out.println("exitDecls: " + ctx.getText().toString());
    };


    public void enterDecl(InterpreterParser.DeclContext ctx) {
        System.out.println("enterDecl: " + ctx.getText().toString());
    };


    public void exitDecl(InterpreterParser.DeclContext ctx) {
        System.out.println("exitDecl: " + ctx.getText().toString());
    };


    public void enterType(InterpreterParser.TypeContext ctx) {
        System.out.println("enterType: " + ctx.getText().toString());
    };


    public void exitType(InterpreterParser.TypeContext ctx) {
        System.out.println("exitType: " + ctx.getText().toString());
    };


    public void enterStmts(InterpreterParser.StmtsContext ctx) {
        System.out.println("enterStmts: " + ctx.getText().toString());
    };


    public void exitStmts(InterpreterParser.StmtsContext ctx) {
        System.out.println("exitStmts: " + ctx.getText().toString());
    };


    public void enterAssign(InterpreterParser.AssignContext ctx) {
        System.out.println("enterAssign: " + ctx.getText().toString());
    };


    public void exitAssign(InterpreterParser.AssignContext ctx) {
        System.out.println("exitAssign: " + ctx.getText().toString());
    };


    public void enterStmt(InterpreterParser.StmtContext ctx) {
        System.out.println("enterStmt: " + ctx.getText().toString());
    };


    public void exitStmt(InterpreterParser.StmtContext ctx) {
        System.out.println("exitStmt: " + ctx.getText().toString());
    };


    public void enterAllexpr(InterpreterParser.AllexprContext ctx) {
        System.out.println("enterAllexpr: " + ctx.getText().toString());
    };


    public void exitAllexpr(InterpreterParser.AllexprContext ctx) {
        System.out.println("exitAllexpr: " + ctx.getText().toString());
    };


    public void enterAndexpr(InterpreterParser.AndexprContext ctx) {
        System.out.println("enterAndexpr: " + ctx.getText().toString());
    };


    public void exitAndexpr(InterpreterParser.AndexprContext ctx) {
        System.out.println("exitAndexpr: " + ctx.getText().toString());
    };


    public void enterEqual(InterpreterParser.EqualContext ctx) {
        System.out.println("enterEqual: " + ctx.getText().toString());
    };


    public void exitEqual(InterpreterParser.EqualContext ctx) {
        System.out.println("exitEqual: " + ctx.getText().toString());
    };


    public void enterRel(InterpreterParser.RelContext ctx) {
        System.out.println("enterRel: " + ctx.getText().toString());
    };


    public void exitRel(InterpreterParser.RelContext ctx) {
        System.out.println("exitRel: " + ctx.getText().toString());
    };


    public void enterExpr(InterpreterParser.ExprContext ctx) {
        System.out.println("enterExpr: " + ctx.getText().toString());
    };


    public void exitExpr(InterpreterParser.ExprContext ctx) {
        System.out.println("exitExpr: " + ctx.getText().toString());
    };


    public void enterTerm(InterpreterParser.TermContext ctx) {
        System.out.println("enterTerm: " + ctx.getText().toString());
    };


    public void exitTerm(InterpreterParser.TermContext ctx) {
        System.out.println("exitTerm: " + ctx.getText().toString());
    };


    public void enterIncdecexpr(InterpreterParser.IncdecexprContext ctx) {
        System.out.println("enterIncdecexpr: " + ctx.getText().toString());
    };


    public void exitIncdecexpr(InterpreterParser.IncdecexprContext ctx) {
        System.out.println("exitIncdecexpr: " + ctx.getText().toString());
    };


    public void enterFactor(InterpreterParser.FactorContext ctx) {
        System.out.println("enterFactor: " + ctx.getText().toString());
    };


    public void exitFactor(InterpreterParser.FactorContext ctx) {
        System.out.println("exitFactor: " + ctx.getText().toString());
    };

//    public void printInterpreter(String START) {
//        // get lexer
//        InterpreterLexer lexer = new InterpreterLexer(new ANTLRInputStream(START));
//
//        // get list of matched tokens
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        // pass tokens to parser
//        InterpreterParser parser = new InterpreterParser(tokens);
//
//        // Specify our entry point
//
//        //walk and attach listener
//        ParseTreeWalker walker = new ParseTreeWalker();
//        AntlrListener listener = new AntlrListener();
//        walker.walk(listener, parser.start());
//    }
//
//    @Override
//    public void visitTerminal(TerminalNode terminalNode) {
//        //System.out.println(terminalNode.getSymbol().toString());
//    }
//
//    @Override
//    public void visitErrorNode(ErrorNode errorNode) {
//        //System.out.println(errorNode.getSymbol().toString());
//    }
//
//    @Override
//    public void enterEveryRule(ParserRuleContext parserRuleContext) {
//        //System.out.println((parserRuleContext.getText()));
//    }
//
//    @Override
//    public void exitEveryRule(ParserRuleContext parserRuleContext) {
//        //System.out.println((parserRuleContext.getText()));
//    }
}