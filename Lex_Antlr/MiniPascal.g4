grammar MiniPascal;

@header{
	package parser;
}

program	:  'program' STR bloco  END DOT;

bloco	: (begin)+
		;
 
decl    :  (declaravar)+
        ;

declaravar	: VAR  ID  (  VIR ID )* CL type SC
			;

type      	: INT	{ System.out.println("Int type declared"); }
			| TEXT	{ System.out.println("Text type declared"); }
			| FLOAT	{ System.out.println("Float type declared"); }
			| CHAR	{ System.out.println("Character type declared"); }
           	;
		 
cmd 	: declaravar { System.out.println("Variable declaration"); }
		| cmdleitura { System.out.println("Read Command"); } 
		| cmdescrita { System.out.println("Write command"); }
		| cmdattrib  { System.out.println("Assignment command"); }
		| cmdselecao { System.out.println("Logical command"); }
		;
		
begin	: (declaravar { System.out.println("Declaracao de variavel"); })*
		BEGIN { System.out.println("Inicio do Bloco"); }
		(cmd)+ 
		END SC  { System.out.println("End Block"); }
		;	

cmdleitura	: READ		AP 
						ID { System.out.println("READ: ID = " + _input.LT(-1).getText()); } 
						FP 
						SC
			;
			

cmdescrita	:			WRITE AP 
						ID { System.out.println("WRITE: ID = " + _input.LT(-1).getText()); }
						FP 
						SC
			;
cmdattrib 	: ID ATTR expr SC
			;
			
expr		: term | NUMBER ( OP term | OP NUMBER)* SC
			;

term 		: ID NUMBER 
			; 

cmdselecao  :  IF AP ID OPREL (ID | NUMBER) FP 'then' 
				(cmd)+ 
              (ELSE 
              		(cmd+) 
              )?
			;

STR  : '"'[a-zA-Z0-9\t ]*'"'
	 ;
	 			
AP	: '('
	;
	
FP	: ')'
	;
	
SC	: ';'
	;

CL	: ':'
	;

OP	: '+' | '-' | '*' | '/'
	;
	
ATTR : ':='
	 ;
	 
VIR  : ','
     ;
     
ACH  : '{'
     ;
     
FCH	 : '}'
     ;
  
DOT	 : '.'
	 ;
	 
	 
//KEYWORDS
VAR		:	'var'		;
IF		:	'if'		;
ELSE	:	'else'		;
BEGIN	:	'begin'		;
END		:	'end'		;
READ	:	'read'		;
WRITE	:	'write'		;
INT		:	'int'		;
FLOAT	:	'float'		;
TEXT	:	'text'		;
CHAR	:	'char'		;
BOOL	:	'boolean'	;

	 
OPREL : '>' | '<' | '>=' | '<=' | '==' | '!='
      ;
      
ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;
	
NUMBER	: [0-9]+ ('.' [0-9]+)?
		;
		
WS	: (' ' | '\t' | '\n' | '\r') -> skip; 