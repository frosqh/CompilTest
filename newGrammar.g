grammar newGrammar;

options {
	backtrack 		= false;
	k 		= 1;
	output 		= AST;
	ASTLabelType	= CommonTree;
}

tokens {
	BLOCK;
	NEW;
	VEC;
}
@members{
boolean mainFound = false;
}

axiom	: fichier EOF {if (!mainFound){System.err.println("main not found");System.exit(1);}} -> fichier //Ok ! 
;

fichier : decl* //Ok ! 
;

decl : declFun //Ok ! 
| declStruct
;

declStruct : 'struct' IDF '{' args? '}' -> ^('struct' IDF args?) //Ok ! 
;

args : IDF ':' type (',' IDF ':' type)* -> (^(IDF type))*//Ok ! 
;

declFun : 'fn' (IDF '(' args? ')' ('->' type)? block -> ^('fn' IDF args ^('->' type) block)
	|	{mainFound = true;}MAIN '(' ')' block -> ^('fn' MAIN block))
;

type : IDF
	|	'vec' ('<' type '>') -> ^('vec' type) //Ok ! 
| '&' type -> ^('&' type)
;

block : '{' instruct* '}'-> ^(BLOCK instruct*) //Voir pour le dernier return (si expr)
;


callFun : '(' expr (',' expr)? ')';

newStruc : '{' IDF ':' bigExpr (',' IDF ':' bigExpr)* '}' -> ^(NEW ^(IDF bigExpr)*);




instruct : 
expr ';' -> expr
| ';' -> 
| 'let' 'mut'? dotIDF '=' bigExpr ';' -> ^('let' 'mut'? ^('=' dotIDF bigExpr)) 
| 'while' expr block -> ^('while' expr block)
| 'return' expr? ';' -> ^('return' expr?)
| 'loop' block -> ^('loop' block)
| 'break' ';' -> 'break'
| ifExpr
;

dotIDF 	: 
IDF ('.'^ IDF)?;

ifExpr : 'if' expr block ('else' block )? -> ^('if' expr block ^('else' block)?)
;

binExpr : unExpr (BINAIRE^ unExpr)*; 

vectExpr : atom ('[' expr ']' ->^(VEC atom expr)
| );


dotExpr : vectExpr ('.'^ (IDF | 'len' '('')'))?; 

unExpr : UNAIRE? dotExpr;

atom : INT
| BOOL
|	 IDF ((callFun))?
| '('expr')';

expr : 'vec' '!' '[' expr ']'
| 'print' '!' '(' expr ')'
| block
|	binExpr;


bigbinExpr : bigunExpr (BINAIRE bigunExpr)*;

bigvectExpr : bigatom ('[' bigExpr ']')?;

bigdotExpr : bigvectExpr ('.' (IDF | 'len' '('')'))?;

bigunExpr : UNAIRE? bigdotExpr;

bigExpr 
:	'vec' '!' '[' expr (',' expr)*']'
| 'print' '!' '(' expr ')'
| block
|	bigbinExpr;

bigatom : INT
| BOOL
|	 IDF (newStruc|callFun)?
| '('bigExpr')';



BINAIRE :  '+' | '-' | '*' | '/' | '&&' | '||' | '<' | '<=' | '>' | '>=' | '==' | '!=';
UNAIRE :  '!';

IF 	:	 'if'
;

MAIN 	:	'main'
	;

BOOL 	:	'true' | 'false'
;

IDF 			: ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;


INT 			: '0'..'9'+
;



STRING	
: '"' ~('\r' | '\n' | '"')* '"'
;	

COMMENT			: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

ATTRIBUTE : '#' ( options {greedy=false;} : .)* ('\n'|'\t') {$channel=HIDDEN;}; 

WS  			: ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};