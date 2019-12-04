package src;

import antlr.InterpreterLexer;
import antlr.InterpreterParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MainIf {
    public static void main(String[] args) {
        InterpreterLexer lexer = new InterpreterLexer(CharStreams.fromString("{int r; int i; r = 0; i = 5; if(r<5) {int x; x = 8;} else i = 7;}"));
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
