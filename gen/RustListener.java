// Generated from C:/Users/Andres/Documents/Proyectos/DB-Rust/parser\Rust.g4 by ANTLR 4.9.2

    import arrayList "github.com/colegno/arraylist"
    import "OLC2/interfaces"
    import "OLC2/expressions"
    import "OLC2/instructions"
    import "OLC2/environment"
    import "strings"

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Rust}.
 */
public interface RustListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Rust#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Rust.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Rust.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#global_env}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_env(Rust.Global_envContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#global_env}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_env(Rust.Global_envContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(Rust.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(Rust.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(Rust.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(Rust.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(Rust.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(Rust.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#loopWhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopWhile(Rust.LoopWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#loopWhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopWhile(Rust.LoopWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#loopBucle}.
	 * @param ctx the parse tree
	 */
	void enterLoopBucle(Rust.LoopBucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#loopBucle}.
	 * @param ctx the parse tree
	 */
	void exitLoopBucle(Rust.LoopBucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#loopForin}.
	 * @param ctx the parse tree
	 */
	void enterLoopForin(Rust.LoopForinContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#loopForin}.
	 * @param ctx the parse tree
	 */
	void exitLoopForin(Rust.LoopForinContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#transBreak}.
	 * @param ctx the parse tree
	 */
	void enterTransBreak(Rust.TransBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#transBreak}.
	 * @param ctx the parse tree
	 */
	void exitTransBreak(Rust.TransBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#transContinue}.
	 * @param ctx the parse tree
	 */
	void enterTransContinue(Rust.TransContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#transContinue}.
	 * @param ctx the parse tree
	 */
	void exitTransContinue(Rust.TransContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#condIf}.
	 * @param ctx the parse tree
	 */
	void enterCondIf(Rust.CondIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#condIf}.
	 * @param ctx the parse tree
	 */
	void exitCondIf(Rust.CondIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#condElseIf}.
	 * @param ctx the parse tree
	 */
	void enterCondElseIf(Rust.CondElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#condElseIf}.
	 * @param ctx the parse tree
	 */
	void exitCondElseIf(Rust.CondElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#condElse}.
	 * @param ctx the parse tree
	 */
	void enterCondElse(Rust.CondElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#condElse}.
	 * @param ctx the parse tree
	 */
	void exitCondElse(Rust.CondElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Rust.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Rust.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#condMatch}.
	 * @param ctx the parse tree
	 */
	void enterCondMatch(Rust.CondMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#condMatch}.
	 * @param ctx the parse tree
	 */
	void exitCondMatch(Rust.CondMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#listArms}.
	 * @param ctx the parse tree
	 */
	void enterListArms(Rust.ListArmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#listArms}.
	 * @param ctx the parse tree
	 */
	void exitListArms(Rust.ListArmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#listMatch}.
	 * @param ctx the parse tree
	 */
	void enterListMatch(Rust.ListMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#listMatch}.
	 * @param ctx the parse tree
	 */
	void exitListMatch(Rust.ListMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#defaultArm}.
	 * @param ctx the parse tree
	 */
	void enterDefaultArm(Rust.DefaultArmContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#defaultArm}.
	 * @param ctx the parse tree
	 */
	void exitDefaultArm(Rust.DefaultArmContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#impression}.
	 * @param ctx the parse tree
	 */
	void enterImpression(Rust.ImpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#impression}.
	 * @param ctx the parse tree
	 */
	void exitImpression(Rust.ImpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Rust.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Rust.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#structCreation}.
	 * @param ctx the parse tree
	 */
	void enterStructCreation(Rust.StructCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#structCreation}.
	 * @param ctx the parse tree
	 */
	void exitStructCreation(Rust.StructCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#listStructDec}.
	 * @param ctx the parse tree
	 */
	void enterListStructDec(Rust.ListStructDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#listStructDec}.
	 * @param ctx the parse tree
	 */
	void exitListStructDec(Rust.ListStructDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Rust.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Rust.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#listAccessStruct}.
	 * @param ctx the parse tree
	 */
	void enterListAccessStruct(Rust.ListAccessStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#listAccessStruct}.
	 * @param ctx the parse tree
	 */
	void exitListAccessStruct(Rust.ListAccessStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Rust.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Rust.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Rust.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Rust.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(Rust.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(Rust.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(Rust.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(Rust.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#listParams}.
	 * @param ctx the parse tree
	 */
	void enterListParams(Rust.ListParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#listParams}.
	 * @param ctx the parse tree
	 */
	void exitListParams(Rust.ListParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Rust.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Rust.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#expr_arit}.
	 * @param ctx the parse tree
	 */
	void enterExpr_arit(Rust.Expr_aritContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#expr_arit}.
	 * @param ctx the parse tree
	 */
	void exitExpr_arit(Rust.Expr_aritContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(Rust.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(Rust.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#stringsTypes}.
	 * @param ctx the parse tree
	 */
	void enterStringsTypes(Rust.StringsTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#stringsTypes}.
	 * @param ctx the parse tree
	 */
	void exitStringsTypes(Rust.StringsTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#listArray}.
	 * @param ctx the parse tree
	 */
	void enterListArray(Rust.ListArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#listArray}.
	 * @param ctx the parse tree
	 */
	void exitListArray(Rust.ListArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rust#listStructExp}.
	 * @param ctx the parse tree
	 */
	void enterListStructExp(Rust.ListStructExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rust#listStructExp}.
	 * @param ctx the parse tree
	 */
	void exitListStructExp(Rust.ListStructExpContext ctx);
}