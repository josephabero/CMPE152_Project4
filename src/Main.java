package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import antlr.InterpreterParser;
import antlr.InterpreterLexer;
import org.antlr.v4.runtime.tree.*;


public class Main {
    public static void main(String[] args) {
        InterpreterLexer lexer = new InterpreterLexer(CharStreams.fromString("{  int r; int dd; int a; int d;  r = a; dd = d;  while( dd <= r ) dd = 2*dd; } "));
        InterpreterParser parser = new InterpreterParser(new CommonTokenStream(lexer));

        InterpreterParser.StartContext tree = parser.start();

        // Listener Demo
        System.out.println("LISTENER DEMO");
        System.out.println("-------------");
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrListener listener = new AntlrListener();
        walker.walk(listener, tree);

        // Visitor Demo
        System.out.print("\n\n\n\n");
        System.out.println("VISITOR DEMO");
        System.out.println("-------------");
        AntlrVisitor visitor = new AntlrVisitor();
        visitor.visit(tree);
    }
}
