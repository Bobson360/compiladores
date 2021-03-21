package main;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.IsiLangLexer;
import parser.IsiLangParser;


public class Main {
	
	public static void main(String[] args) {
		try {
			IsiLangLexer lexer;
			IsiLangParser parser;
			
			lexer = new IsiLangLexer(CharStreams.fromFileName("input.isi"));
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new IsiLangParser(tokenStream);
			
			System.out.println("Compilation sucssesfull");
			
			parser.prog();
		} catch (Exception e) {
			System.out.println("ERROR " + e.getMessage());
		}
	}
}
