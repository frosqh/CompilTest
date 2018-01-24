exprIDF : exprP 
| IDF (newStruc | callFun|suite)? ;

expr : INT
| 'true'
| 'fals'
| UNAIRE expr
| 'vec' '!' '[' exprP ']'
| 'print' '!' '(' exprP ')'
| block
| '(' exprP ')'

;

exprP : 
	expr suite?
	;

suite : BINAIRE exprP
| '.' (IDF | 'len' '('')') 
| '[' exprP ']'
;



binExpr : unExpr (BINAIRE unExpr)*;

vectExpr : binExpr ('[' expr ']')?;

dotExpr : vectExpr ('.' (IDF | 'len' '('')'))?;

unExpr : UNAIRE? atom;

atom : INT
| BOOL
| '('expr')';

expr : 'vec' '!' '[' expr ']'
| 'print' '!' '(' expr ')'
| block
| IDF (newStruct | callFun) ?
;





expr : INT
| 'true'
| 'false'
| UNAIRE expr
| 'vec' '!' '[' expr ']'
| 'print' '!' '(' expr ')'
| block
| '(' expr ')'
| IDF newStruc
| IDF
| IDF callFun
| expr BINAIRE expr
| expr '.' (IDF | 'len' '('')')
| expr '[' expr ']'

;


