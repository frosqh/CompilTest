grammar lastYearGrammar;

options {
	backtrack 		= false;
	k 		= 1;
	output 		= AST;
	ASTLabelType	= CommonTree;
}

tokens {
	DoExpr;
	Inner;
	Void;
}

p			: pROGRAM EOF -> pROGRAM
;

pROGRAM			: cLASS_DECL* vAR_DECL* iNSTRUCTION+
;

cLASS_DECL			: (ClassStat IDFMAJ (InheritStat IDFMAJ)? '=') '(' cLASS_ITEM_DECL ')' -> ^(ClassStat IDFMAJ ^(InheritStat IDFMAJ)? cLASS_ITEM_DECL?)
;

InheritStat			: 'inherit'
;

ClassStat			: 'class'
;			

cLASS_ITEM_DECL		: vAR_DECL* mETHOD_DECL*
;	

vAR_DECL			: VarStat IDF ':' tYPE ';' -> ^(VarStat IDF tYPE)
;

VarStat			: 'var'
;			


tYPE 			: INTTYPE
| STRINGTYPE
| IDFMAJ
;

mETHOD_DECL		: MethodStat IDF '(' mETHOD_ARGS* ')' mETHOD_TYPE '{' vAR_DECL* iNSTRUCTION+ '}' -> ^(MethodStat ^(IDF mETHOD_ARGS* mETHOD_TYPE) vAR_DECL* iNSTRUCTION+)
;

mETHOD_TYPE		: (':' tYPE) -> tYPE
| -> Void;


MethodStat			: 'method'
;

mETHOD_ARGS		: IDF ':' tYPE (',' IDF ':' tYPE)* -> ^(IDF tYPE)*
;

iNSTRUCTION!		: IDF ':=' (eXPRESSION) ';' -> ^(':=' IDF eXPRESSION)
| IfStat eXPRESSION ThenStat iNSTRUCTION ('else' iNSTRUCTION)? FiStat -> ^(IfStat eXPRESSION ^(ThenStat iNSTRUCTION) ^('else' iNSTRUCTION)?)
| ForStat IDF InStat eXPRESSION '..' eXPRESSION DoStat iNSTRUCTION+ EndStat -> ^(ForStat ^(InStat IDF eXPRESSION eXPRESSION) ^(DoStat iNSTRUCTION+))
| '{' vAR_DECL* iNSTRUCTION+ '}' -> ^(Inner vAR_DECL* iNSTRUCTION*)
| DoStat eXPRESSION';' -> ^(DoExpr eXPRESSION)
| pRINT
| rEAD
| rETURN2
;
IfStat			: 'if'
;
ThenStat			: 'then'
;
FiStat			: 'fi'
;
ForStat			: 'for'
;
InStat			: 'in'
;

DoStat			: 'do'
;

EndStat			: 'end'
;

pRINT			: WriteStat^ eXPRESSION ';'!
;	
WriteStat			: 'write'
;

rEAD			: ReadStat^ IDF ';'!
;
ReadStat			: 'read'
;
rETURN2			: ReturnStat^ '('! eXPRESSION ')'! ';'!
;

ReturnStat			: 'return'
;

aTOM 			: INT
| STRING
| '('! eXPRESSION ')'!
|eXPRESSION2
;

aTOMBIS			: ThisStat
|IDF
|SuperStat
|NewStat^ IDFMAJ
;


bOOLEXPR			: (mOINEXPR|nOTMOINSEXPR) (BOOLOPER^ (mOINEXPR|nOTMOINSEXPR))*
;

mULTEXPR			: bOOLEXPR (('*'|'/')^ bOOLEXPR)*
;

aDDEXPR			: mULTEXPR (('+'|'-')^ mULTEXPR)*
;

mOINEXPR		: '-' aTOM-> ^('-' aTOM);

nOTMOINSEXPR			: aTOM;

eXPRESSION 			: aDDEXPR
;

eXPRESSION2			: aTOMBIS^ sUITE*;

sUITE				: ('.'! IDF^ '('! (eXPRESSION (','! eXPRESSION)*)? ')'!) 
;

ThisStat			: 'this'
;
SuperStat			: 'super'
;
NewStat			: 'new'
;



BOOLOPER			: '<' | '<=' | '>' | '>=' | '==' | '!='	;

INTTYPE       			: 'int'
;

STRINGTYPE     		: 'String'
;

IDFMAJ			: ('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
IDF  			: ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;

INT 			: '0'..'9'+
;

STRING	
: '"' ~('\r' | '\n' | '"')* '"'
;	

COMMENT			: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

WS  			: ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
