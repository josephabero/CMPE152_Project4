grammar Interpreter;

start
    :
     block EOF
    ;

block
    :'{'decls stmts'}'
    ;

decls
    : | decls decl
    ;

decl
    :
    type ID';'
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
    ID '=' allexpr ';'
    ;

stmt
    :
    assign | 'if('allexpr')' stmt | 'if('allexpr')'| stmt 'else' stmt |'while('allexpr')' stmt |
    'do' stmt 'while('allexpr');' | 'for('assign allexpr ';'incdecexpr')' stmt | 'break;' | block
    ;

allexpr
    :
    allexpr '||' andexpr  | andexpr
    ;

andexpr
    :
    andexpr '&&' equal | equal
    ;

equal
    :
    equal '==' rel | equal '!=' rel | rel
    ;


rel :
    expr '<' expr | expr '<=' expr | expr '>' expr | expr '>=' expr | expr
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
    '('allexpr')' | incdecexpr | ID | INT | BOOL | FLOAT
    ;


/** Lexer grammar rules (modified regular expression)**/
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
TYPE        : INT | FLOAT | BOOL;

EPSILON     :  ' ';


/** Parser grammar rules

