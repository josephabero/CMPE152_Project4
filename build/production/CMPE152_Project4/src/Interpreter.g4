grammar Interpreter;

start
    :
     block EOF
    ;

block
    :LEFTCB decls stmts RIGHTCB
    ;

decls
    : | decls decl
    ;

decl
    :
    type ID SEMICOLON
    ;

type
    :
    'int' | 'float' | 'bool'
    ;


stmts
    :  | stmts stmt
    ;

assign
    :
    ID EQUAL allexpr SEMICOLON
    ;

stmt
    :
    assign | IF allexpr RIGHTPAREN stmt | IF allexpr RIGHTPAREN stmt ELSE stmt | WHILE allexpr RIGHTPAREN stmt |
    DO stmt WHILE allexpr RIGHTPAREN SEMICOLON | FOR assign allexpr SEMICOLON incdecexpr RIGHTPAREN stmt | BREAK | block
    ;

allexpr
    :
    allexpr OR andexpr  | andexpr
    ;

andexpr
    :
    andexpr AND equal | equal
    ;

equal
    :
    equal EQUIVALENT rel | equal NOTEQUALTO rel | rel
    ;


rel :
    expr LESSTHAN expr | expr LTOET expr | expr GREATERTHAN expr | expr GTOET expr | expr
    ;

expr
    :
    expr (PLUS) term | expr (MINUS) term | term
    ;

term
    :term (MULTIPLY) factor | term (DIVIDE) factor | factor

    ;
incdecexpr
    :
    ID(INC) | ID(DEC)
    ;

factor
    :
     LEFTPAREN allexpr RIGHTPAREN | incdecexpr | ID | INT | REAL | BOOL | FLOAT
    ;


/** Lexer grammar rules (modified regular expression)**/
ELSE        :'else';
ID          : [a-zA-Z]+ ; // match identifiers
INT         : [0-9]+ ; // match integers
FLOAT       :  [+-]?([0-9]*[.])?[0-9]+ ;// match floating point number
NEWLINE     :'\r'? '\n' ; // return newlines to parser
WS          : [ \t]+ -> skip ; // toss out whitespace
PLUS        :  '+';
MINUS       :  '-';
MULTIPLY    :  '*';
DIVIDE      :  '/';
INC         :  '++';
DEC         :  '--';
BOOL        :  'true' | 'false';
EQUAL       : '=';
LEFTCB      : '{';
RIGHTCB     : '}';
LEFTPAREN   :'(';
RIGHTPAREN  :')';
LESSTHAN    : '<';
GREATERTHAN :  '>';
LTOET       : '<=';
GTOET       : '>=';
EPSILON     :  ' ';
EQUIVALENT  : '==';
NOTEQUALTO  : '!=';
AND         :'&&';
OR          :'||';
IF          :'if(';
WHILE       :'while(';
SEMICOLON   :';';
DO          :'do';
FOR         :'for(';
BREAK       :'break;';

/** Parser grammar rules
