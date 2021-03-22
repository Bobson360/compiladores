package main;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.MiniPascalLexer;
import parser.MiniPascalParser;



public class Main {
	
	public static void main(String[] args) {
		try {
			MiniPascalLexer lexer;
			MiniPascalParser parser;
			
			lexer = new MiniPascalLexer(CharStreams.fromFileName("input.txt"));
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new MiniPascalParser(tokenStream);
			
			System.out.println("Compilation sucssesfull");
			
			parser.program();
		} catch (Exception e) {
			System.out.println("ERROR " + e.getMessage());
		}
	}
}
