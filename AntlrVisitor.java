import antlr;

public class AntlrInterpreterListener extends InterpreterBaseListener {

    @Override
    public void enterStart(InterpreterParser.StartContext ctx) {
        System.out.println(ctx.getText());
    }

    private void printInterpreter(String START) {
        // get lexer
        InterpreterLexer lexer = new InterpreterLexer(new ANTLRInputStream(start));

        // get list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // pass tokens to parser
        InterpreterParser parser = new InterpreterParser(tokens);

        // Specify our entry point
        StartContext startContext = parser.start();

        //walk and attatch listener
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrInterpreterListener = new AntlrInterpreterListener();
        walker.walk(listener, startContext);
    }
}