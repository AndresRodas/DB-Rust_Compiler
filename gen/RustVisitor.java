// Generated from C:/Users/Andres/Documents/Proyectos/DB-Rust/parser\Rust.g4 by ANTLR 4.9.2

    import arrayList "github.com/colegno/arraylist"
    import "OLC2/interfaces"
    import "OLC2/expressions"
    import "OLC2/instructions"
    import "OLC2/environment"
    import "strings"

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Rust}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RustVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Rust#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Rust.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#global_env}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_env(Rust.Global_envContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(Rust.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(Rust.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(Rust.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#loopWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopWhile(Rust.LoopWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#loopBucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBucle(Rust.LoopBucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#loopForin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopForin(Rust.LoopForinContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#transBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransBreak(Rust.TransBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#transContinue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransContinue(Rust.TransContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#condIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIf(Rust.CondIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#condElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondElseIf(Rust.CondElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#condElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondElse(Rust.CondElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Rust.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#condMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondMatch(Rust.CondMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#listArms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListArms(Rust.ListArmsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#listMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListMatch(Rust.ListMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#defaultArm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultArm(Rust.DefaultArmContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#impression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpression(Rust.ImpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Rust.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#structCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructCreation(Rust.StructCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#listStructDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStructDec(Rust.ListStructDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Rust.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#listAccessStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAccessStruct(Rust.ListAccessStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Rust.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Rust.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(Rust.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(Rust.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#listParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListParams(Rust.ListParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Rust.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#expr_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_arit(Rust.Expr_aritContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(Rust.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#stringsTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringsTypes(Rust.StringsTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#listArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListArray(Rust.ListArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rust#listStructExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStructExp(Rust.ListStructExpContext ctx);
}