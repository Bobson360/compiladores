grammar IsiLang;

prog	: 'programa' bloco 'fimprog;'
		;

bloco	: (cmd)+
		;
		
cmd 	: cmdleitura { System.out.println("Comando de leitura"); } 
		| cmdescrita { System.out.println("Comando de escrita"); }
		| cmdattrib  { System.out.println("Comando de atribuicao"); }
		;
		
cmdleitura	: 'leia'	AP 
						ID { System.out.println("ID = " + _input.LT(-1).getText()); } 
						FP 
						SC
			;

cmdescrita	: 'escreva' AP ID FP SC
			;
cmdattrib 	: ID ATTR expr SC
			;
			
expr		: termo ( OP termo )*
			;

termo 		: ID NUMBER
			; 
			
AP	: '('
	;
	
FP	: ')'
	;
	
SC	: ';'
	;
	
OP	: '+' | '-' | '*' | '/'
	;
	
ATTR : '='
	 ;
	 
VIR  : ','
     ;
     
ACH  : '{'
     ;
     
FCH  : '}'
     ;
	 
	 
OPREL : '>' | '<' | '>=' | '<=' | '==' | '!='
      ;
      
ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;
	
NUMBER	: [0-9]+ ('.' [0-9]+)?
		;
		
WS	: (' ' | '\t' | '\n' | '\r') -> skip; 