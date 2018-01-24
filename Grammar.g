grammar Grammar;

options {
	backtrack 		= false;
	k 		= 1;
	output 		= AST;
}

tokens {
}

axiom	: fichier EOF
;

fichier : decl*
;

decl : declFun
| declStruct
;

declStruct : 'struct' IDF '{' structIDF? '}'
;

structIDF : IDF ':' type (',' IDF ':' type)*
;

declFun : 'fn' IDF '(' structIDF* ')' ('->' type)? block
;

type : IDF ('<' type '>')?
| '&' type
;

block : '{' instruct* '}'
	;

instruct : exprP ';'
| ';'
| 'let' 'mut'? IDF '=' (exprP )';'
| 'while' exprP block
| 'return' exprP? ';'
| ifExpr
;

ifExpr : 'if' exprP block ('else' block )?
;



expr : INT
| 'true'
| 'false'
| IDF ('(' exprP* ')' | '{' IDF ':' exprP (',' IDF ':' exprP)* '}')?
| UNAIRE exprP
| 'vec' '!' '[' exprP ']'
| 'print' '!' '(' exprP ')'
| block
| '(' exprP ')'
;

exprP : 
	expr suite*
	;

suite : BINAIRE exprP
| '.' IDF
| '.' 'len' '(' ')'
| '[' exprP ']'
;

BINAIRE :  '+' | '-' | '*' | '/' | '&&' | '||' | '<' | '<=' | '>' | '>=' | '==' | '!=';
UNAIRE :  '-' | '!' | '*' | '&';

IDF 			: ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;


INT 			: '0'..'9'+
;

STRING	
: '"' ~('\r' | '\n' | '"')* '"'
;	

COMMENT			: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

WS  			: ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};