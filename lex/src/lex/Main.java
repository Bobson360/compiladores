package lex;

public class Main {
	public static void main(String[] args) {
		LexScanner sc = new LexScanner("C:/Users/bobso/eclipse-workspace/lex/src/lex/lex.rob");
		Token tk = null;
		
		do {
			tk = sc.nextToken();
			if(tk != null) 
				System.out.println(tk);
		} while (tk != null); 
	}
}
