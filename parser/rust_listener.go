// Code generated from Rust.g4 by ANTLR 4.7.2. DO NOT EDIT.

package parser // Rust

import "github.com/antlr/antlr4/runtime/Go/antlr"

// RustListener is a complete listener for a parse tree produced by Rust.
type RustListener interface {
	antlr.ParseTreeListener

	// EnterStart is called when entering the start production.
	EnterStart(c *StartContext)

	// EnterGlobal_env is called when entering the global_env production.
	EnterGlobal_env(c *Global_envContext)

	// EnterModule is called when entering the module production.
	EnterModule(c *ModuleContext)

	// EnterModuleContent is called when entering the moduleContent production.
	EnterModuleContent(c *ModuleContentContext)

	// EnterModuleAction is called when entering the moduleAction production.
	EnterModuleAction(c *ModuleActionContext)

	// EnterMain is called when entering the main production.
	EnterMain(c *MainContext)

	// EnterInstructions is called when entering the instructions production.
	EnterInstructions(c *InstructionsContext)

	// EnterInstruction is called when entering the instruction production.
	EnterInstruction(c *InstructionContext)

	// EnterInsVectors is called when entering the insVectors production.
	EnterInsVectors(c *InsVectorsContext)

	// EnterListParamsCall is called when entering the listParamsCall production.
	EnterListParamsCall(c *ListParamsCallContext)

	// EnterLoopWhile is called when entering the loopWhile production.
	EnterLoopWhile(c *LoopWhileContext)

	// EnterLoopBucle is called when entering the loopBucle production.
	EnterLoopBucle(c *LoopBucleContext)

	// EnterLoopForin is called when entering the loopForin production.
	EnterLoopForin(c *LoopForinContext)

	// EnterTransBreak is called when entering the transBreak production.
	EnterTransBreak(c *TransBreakContext)

	// EnterTransContinue is called when entering the transContinue production.
	EnterTransContinue(c *TransContinueContext)

	// EnterTransReturn is called when entering the transReturn production.
	EnterTransReturn(c *TransReturnContext)

	// EnterCondIf is called when entering the condIf production.
	EnterCondIf(c *CondIfContext)

	// EnterCondElseIf is called when entering the condElseIf production.
	EnterCondElseIf(c *CondElseIfContext)

	// EnterCondElse is called when entering the condElse production.
	EnterCondElse(c *CondElseContext)

	// EnterBlock is called when entering the block production.
	EnterBlock(c *BlockContext)

	// EnterCondMatch is called when entering the condMatch production.
	EnterCondMatch(c *CondMatchContext)

	// EnterListArms is called when entering the listArms production.
	EnterListArms(c *ListArmsContext)

	// EnterListMatch is called when entering the listMatch production.
	EnterListMatch(c *ListMatchContext)

	// EnterDefaultArm is called when entering the defaultArm production.
	EnterDefaultArm(c *DefaultArmContext)

	// EnterImpression is called when entering the impression production.
	EnterImpression(c *ImpressionContext)

	// EnterDeclaration is called when entering the declaration production.
	EnterDeclaration(c *DeclarationContext)

	// EnterVectDeclaration is called when entering the vectDeclaration production.
	EnterVectDeclaration(c *VectDeclarationContext)

	// EnterTypeVect is called when entering the typeVect production.
	EnterTypeVect(c *TypeVectContext)

	// EnterStructCreation is called when entering the structCreation production.
	EnterStructCreation(c *StructCreationContext)

	// EnterListStructDec is called when entering the listStructDec production.
	EnterListStructDec(c *ListStructDecContext)

	// EnterAssignment is called when entering the assignment production.
	EnterAssignment(c *AssignmentContext)

	// EnterListArrStr is called when entering the listArrStr production.
	EnterListArrStr(c *ListArrStrContext)

	// EnterListAccessStruct is called when entering the listAccessStruct production.
	EnterListAccessStruct(c *ListAccessStructContext)

	// EnterListAccessArray is called when entering the listAccessArray production.
	EnterListAccessArray(c *ListAccessArrayContext)

	// EnterArrayType is called when entering the arrayType production.
	EnterArrayType(c *ArrayTypeContext)

	// EnterFunction is called when entering the function production.
	EnterFunction(c *FunctionContext)

	// EnterListParamsFunc is called when entering the listParamsFunc production.
	EnterListParamsFunc(c *ListParamsFuncContext)

	// EnterTypes is called when entering the types production.
	EnterTypes(c *TypesContext)

	// EnterListParams is called when entering the listParams production.
	EnterListParams(c *ListParamsContext)

	// EnterCallFunction is called when entering the callFunction production.
	EnterCallFunction(c *CallFunctionContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterExpr_arit is called when entering the expr_arit production.
	EnterExpr_arit(c *Expr_aritContext)

	// EnterPrimitive is called when entering the primitive production.
	EnterPrimitive(c *PrimitiveContext)

	// EnterListArray is called when entering the listArray production.
	EnterListArray(c *ListArrayContext)

	// EnterListStructExp is called when entering the listStructExp production.
	EnterListStructExp(c *ListStructExpContext)

	// EnterExpVectors is called when entering the expVectors production.
	EnterExpVectors(c *ExpVectorsContext)

	// EnterListVec is called when entering the listVec production.
	EnterListVec(c *ListVecContext)

	// EnterCallModule is called when entering the callModule production.
	EnterCallModule(c *CallModuleContext)

	// EnterListIdMod is called when entering the listIdMod production.
	EnterListIdMod(c *ListIdModContext)

	// ExitStart is called when exiting the start production.
	ExitStart(c *StartContext)

	// ExitGlobal_env is called when exiting the global_env production.
	ExitGlobal_env(c *Global_envContext)

	// ExitModule is called when exiting the module production.
	ExitModule(c *ModuleContext)

	// ExitModuleContent is called when exiting the moduleContent production.
	ExitModuleContent(c *ModuleContentContext)

	// ExitModuleAction is called when exiting the moduleAction production.
	ExitModuleAction(c *ModuleActionContext)

	// ExitMain is called when exiting the main production.
	ExitMain(c *MainContext)

	// ExitInstructions is called when exiting the instructions production.
	ExitInstructions(c *InstructionsContext)

	// ExitInstruction is called when exiting the instruction production.
	ExitInstruction(c *InstructionContext)

	// ExitInsVectors is called when exiting the insVectors production.
	ExitInsVectors(c *InsVectorsContext)

	// ExitListParamsCall is called when exiting the listParamsCall production.
	ExitListParamsCall(c *ListParamsCallContext)

	// ExitLoopWhile is called when exiting the loopWhile production.
	ExitLoopWhile(c *LoopWhileContext)

	// ExitLoopBucle is called when exiting the loopBucle production.
	ExitLoopBucle(c *LoopBucleContext)

	// ExitLoopForin is called when exiting the loopForin production.
	ExitLoopForin(c *LoopForinContext)

	// ExitTransBreak is called when exiting the transBreak production.
	ExitTransBreak(c *TransBreakContext)

	// ExitTransContinue is called when exiting the transContinue production.
	ExitTransContinue(c *TransContinueContext)

	// ExitTransReturn is called when exiting the transReturn production.
	ExitTransReturn(c *TransReturnContext)

	// ExitCondIf is called when exiting the condIf production.
	ExitCondIf(c *CondIfContext)

	// ExitCondElseIf is called when exiting the condElseIf production.
	ExitCondElseIf(c *CondElseIfContext)

	// ExitCondElse is called when exiting the condElse production.
	ExitCondElse(c *CondElseContext)

	// ExitBlock is called when exiting the block production.
	ExitBlock(c *BlockContext)

	// ExitCondMatch is called when exiting the condMatch production.
	ExitCondMatch(c *CondMatchContext)

	// ExitListArms is called when exiting the listArms production.
	ExitListArms(c *ListArmsContext)

	// ExitListMatch is called when exiting the listMatch production.
	ExitListMatch(c *ListMatchContext)

	// ExitDefaultArm is called when exiting the defaultArm production.
	ExitDefaultArm(c *DefaultArmContext)

	// ExitImpression is called when exiting the impression production.
	ExitImpression(c *ImpressionContext)

	// ExitDeclaration is called when exiting the declaration production.
	ExitDeclaration(c *DeclarationContext)

	// ExitVectDeclaration is called when exiting the vectDeclaration production.
	ExitVectDeclaration(c *VectDeclarationContext)

	// ExitTypeVect is called when exiting the typeVect production.
	ExitTypeVect(c *TypeVectContext)

	// ExitStructCreation is called when exiting the structCreation production.
	ExitStructCreation(c *StructCreationContext)

	// ExitListStructDec is called when exiting the listStructDec production.
	ExitListStructDec(c *ListStructDecContext)

	// ExitAssignment is called when exiting the assignment production.
	ExitAssignment(c *AssignmentContext)

	// ExitListArrStr is called when exiting the listArrStr production.
	ExitListArrStr(c *ListArrStrContext)

	// ExitListAccessStruct is called when exiting the listAccessStruct production.
	ExitListAccessStruct(c *ListAccessStructContext)

	// ExitListAccessArray is called when exiting the listAccessArray production.
	ExitListAccessArray(c *ListAccessArrayContext)

	// ExitArrayType is called when exiting the arrayType production.
	ExitArrayType(c *ArrayTypeContext)

	// ExitFunction is called when exiting the function production.
	ExitFunction(c *FunctionContext)

	// ExitListParamsFunc is called when exiting the listParamsFunc production.
	ExitListParamsFunc(c *ListParamsFuncContext)

	// ExitTypes is called when exiting the types production.
	ExitTypes(c *TypesContext)

	// ExitListParams is called when exiting the listParams production.
	ExitListParams(c *ListParamsContext)

	// ExitCallFunction is called when exiting the callFunction production.
	ExitCallFunction(c *CallFunctionContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitExpr_arit is called when exiting the expr_arit production.
	ExitExpr_arit(c *Expr_aritContext)

	// ExitPrimitive is called when exiting the primitive production.
	ExitPrimitive(c *PrimitiveContext)

	// ExitListArray is called when exiting the listArray production.
	ExitListArray(c *ListArrayContext)

	// ExitListStructExp is called when exiting the listStructExp production.
	ExitListStructExp(c *ListStructExpContext)

	// ExitExpVectors is called when exiting the expVectors production.
	ExitExpVectors(c *ExpVectorsContext)

	// ExitListVec is called when exiting the listVec production.
	ExitListVec(c *ListVecContext)

	// ExitCallModule is called when exiting the callModule production.
	ExitCallModule(c *CallModuleContext)

	// ExitListIdMod is called when exiting the listIdMod production.
	ExitListIdMod(c *ListIdModContext)
}
