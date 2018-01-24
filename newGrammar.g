grammar newGrammar;

options {
	backtrack 		= false;
	k 		= 1;
	output 		= AST;
}

tokens {
}

axiom	: fichier EOF //Ok ! 
;

fichier : decl* //Ok ! 
;

decl : declFun //Ok ! 
| declStruct
;

declStruct : 'struct' IDF '{' args? '}' //Ok ! 
;

args : IDF ':' type (',' IDF ':' type)* //Ok ! 
;

declFun : 'fn' IDF '(' args? ')' ('->' type)? block
;

type : IDF ('<' type '>')? //Ok ! 
| '&' type
;

block : '{' instruct* '}' //Voir pour le dernier return (si expr)
;


callFun : '(' expr (',' expr)? ')';

newStruc : '{' IDF ':' expr (',' IDF ':' expr)* '}';




instruct : expr ';'
| ';'
| 'let' 'mut'? IDF '=' bigExpr ';'
| 'while' expr block
| 'return' expr? ';'
| 'loop' block
| 'break' ';'
| ifExpr
;

ifExpr : 'if' expr block ('else' block )?
;

binExpr : unExpr (BINAIRE unExpr)*;

vectExpr : binExpr ('[' expr ']')?;

dotExpr : vectExpr ('.' (IDF | 'len' '('')'))?;

unExpr : UNAIRE? atom;

atom : INT
| BOOL
|	 IDF ((callFun)|('=' expr)|('.' 'len''('')'))?
| '('expr')';

expr : 'vec' '!' '[' expr ']'
| 'print' '!' '(' expr ')'
| block
|	binExpr;


bigbinExpr : bigunExpr (BINAIRE bigunExpr)*;

bigvectExpr : binExpr ('[' bigExpr ']')?;

bigdotExpr : bigvectExpr ('.' (IDF | 'len' '('')'))?;

bigunExpr : UNAIRE? bigatom;

bigatom : INT
| BOOL
|	 IDF (newStruc|callFun)?
| '('bigExpr')';

bigExpr 
:	'vec' '!' '[' expr ']'
| 'print' '!' '(' expr ')'
| block
|	bigbinExpr;

BINAIRE :  '+' | '-' | '*' | '/' | '&&' | '||' | '<' | '<=' | '>' | '>=' | '==' | '!=';
UNAIRE :  '!';

IF 	:	 'if'
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

ATTRIBUTE : "#" ( options {greedy=false;} : .)* ('\n'|'\t') {$channel=HIDDEN;}; 

WS  			: ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};