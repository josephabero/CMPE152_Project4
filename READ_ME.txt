CMPE 152 Project 3

Group 1
-------
Joseph Abero
Jon Andrew Hernandez
Yong Huang
Colin Schardt



ANTLR Parser
------------

Parser developed using ANTLR utilizing IntelliJ IDEA ANTLR plugin and Visual Studio's Railroad Diagram tool


Submission:
1. ANTLR Preview Outputs (Parse Trees)
	Images of the parse trees generated from ANTLR Preview (IntelliJ IDEA)
	Inputs are the same as the Console Output inputs.

2. Console Outputs
	Main_Output:		Console output when using the input in Main.java file
	MainIf_Output:		Console output when using the input in MainIf.java file
	MainFor_Output:		Console output when using the input in MainFor.java file

	* To run a different input, replace main() code in Main.java with main() in desired*

3. Railroad Diagrams

4. src				: code developed for assignment

- antlr:
	auto-generated code. lexer, parser, visitor, listener
- com/implement:
	team-developed code.

	Interpreter.g4		: grammar file
	AntlrListener.java	: extended InterpreterBaseListener
	AntlrVisitor.java	: extended InterpreterBaseVisitor
	Main.java		: main file which demos AntlrListener & AntlrVisitor


5. antlr-4.7.2-complete.jar	: jar file used



Run:
1. Use IntelliJ IDEA
2. Set up a Java project
3. Import the src folder & antlr-4.7.2-complete.jar file
4. Set up antlr-4.7.2-complete.jar DEPENDENCY
	https://stackoverflow.com/questions/1051640/correct-way-to-add-external-jars-lib-jar-to-an-intellij-idea-project
5. Build and Run
	* Run will execute the Main.java file*


IF there are any issues with building and running, please feel free to canvas message!


CLI:
1) download and install antlr4 into the appropriate directories:
	$ cd /usr/local/lib
    	$ curl -O https://www.antlr.org/download/antlr-4.7.1-complete.jar

2) add antlr to your CLASSPATH:
	$ export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"

3) create aliases for antlr by adding these lines to your ~/.profile:
	$ alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
    	$ alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'

4) Navigate to src/antlr in this project directory

5) Run $ javac Interpreter*.java to generate executables and `$ grun Interpreter start -gui' to run the program.

6) Enter input as desired, and press ctrl+D to finish.