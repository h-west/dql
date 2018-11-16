package io.hsjang.dql.parser;// Generated from DQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DQLParser}.
 */
public interface DQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DQLParser#dql}.
	 * @param ctx the parse tree
	 */
	void enterDql(DQLParser.DqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#dql}.
	 * @param ctx the parse tree
	 */
	void exitDql(DQLParser.DqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#single}.
	 * @param ctx the parse tree
	 */
	void enterSingle(DQLParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#single}.
	 * @param ctx the parse tree
	 */
	void exitSingle(DQLParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(DQLParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(DQLParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(DQLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(DQLParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(DQLParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(DQLParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#fieldparams}.
	 * @param ctx the parse tree
	 */
	void enterFieldparams(DQLParser.FieldparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#fieldparams}.
	 * @param ctx the parse tree
	 */
	void exitFieldparams(DQLParser.FieldparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#queries}.
	 * @param ctx the parse tree
	 */
	void enterQueries(DQLParser.QueriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#queries}.
	 * @param ctx the parse tree
	 */
	void exitQueries(DQLParser.QueriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#queryparams}.
	 * @param ctx the parse tree
	 */
	void enterQueryparams(DQLParser.QueryparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#queryparams}.
	 * @param ctx the parse tree
	 */
	void exitQueryparams(DQLParser.QueryparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(DQLParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(DQLParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#paramparams}.
	 * @param ctx the parse tree
	 */
	void enterParamparams(DQLParser.ParamparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#paramparams}.
	 * @param ctx the parse tree
	 */
	void exitParamparams(DQLParser.ParamparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(DQLParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(DQLParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(DQLParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(DQLParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DQLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DQLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(DQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(DQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#dotname}.
	 * @param ctx the parse tree
	 */
	void enterDotname(DQLParser.DotnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#dotname}.
	 * @param ctx the parse tree
	 */
	void exitDotname(DQLParser.DotnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DQLParser.NameContext ctx);
}