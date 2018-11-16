package io.hsjang.dql.parser;// Generated from DQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DQLParser#dql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDql(DQLParser.DqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(DQLParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(DQLParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(DQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(DQLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(DQLParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#fieldparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldparams(DQLParser.FieldparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#queries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueries(DQLParser.QueriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#queryparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryparams(DQLParser.QueryparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(DQLParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#paramparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamparams(DQLParser.ParamparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(DQLParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(DQLParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(DQLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(DQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#dotname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotname(DQLParser.DotnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(DQLParser.NameContext ctx);
}