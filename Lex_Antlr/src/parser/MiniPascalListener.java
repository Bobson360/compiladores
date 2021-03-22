// Generated from MiniPascal.g4 by ANTLR 4.7.1

	package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MiniPascalParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MiniPascalParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MiniPascalParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MiniPascalParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(MiniPascalParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(MiniPascalParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniPascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniPascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(MiniPascalParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(MiniPascalParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(MiniPascalParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(MiniPascalParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(MiniPascalParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(MiniPascalParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(MiniPascalParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(MiniPascalParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(MiniPascalParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(MiniPascalParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniPascalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniPascalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(MiniPascalParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(MiniPascalParser.CmdselecaoContext ctx);
}