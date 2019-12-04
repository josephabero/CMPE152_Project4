import antlr.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AntlrInterpreterListener extends InterpreterBaseListener {

    @Override
    public void enterStart(InterpreterParser.StartContext ctx) {
        System.out.println(ctx.getText());
    }

    private void printInterpreter(String START) {
        // get lexer
        InterpreterLexer lexer = new InterpreterLexer(new ANTLRInputStream(START));

        // get list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // pass tokens to parser
        InterpreterParser parser = new InterpreterParser(tokens);

        // Specify our entry point
        InterpreterParser.StartContext startContext = parser.start();

        //walk and attatch listener
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrInterpreterListener listener = new AntlrInterpreterListener();
        walker.walk(listener, startContext);
    }
}