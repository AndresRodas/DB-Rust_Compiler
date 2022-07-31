package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
)

type ArrayAccess struct {
	Lin   int
	Col   int
	Array interfaces.Expression
	Index interfaces.Expression
}

func NewArrayAccess(lin int, col int, array interfaces.Expression, index interfaces.Expression) ArrayAccess {
	exp := ArrayAccess{lin, col, array, index}
	return exp
}

func (p ArrayAccess) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {

	var tempArray, tempIndex, result environment.Value

	tempArray = p.Array.Ejecutar(ast, env, gen) //se ejecuta el array -> *arr*[5] retorna un temporal

	tempIndex = p.Index.Ejecutar(ast, env, gen) //se ejecuta el indice -> arr[*5*] retorna un temporal

	//llamada
	newTmp := gen.NewTemp()
	lvl1 := gen.NewLabel()
	lvl2 := gen.NewLabel()
	lvl3 := gen.NewLabel()
	gen.AddIf(tempIndex.Value, "0", "<", lvl1)
	tmp := gen.NewTemp()
	gen.AddGetHeap(tmp, "(int)"+tempArray.Value)
	gen.AddIf(tempIndex.Value, tmp, ">", lvl1)

	gen.AddGoto(lvl2)
	gen.AddLabel(lvl1)
	gen.AddPrintf("c", "66")
	gen.AddPrintf("c", "111")
	gen.AddPrintf("c", "117")
	gen.AddPrintf("c", "110")
	gen.AddPrintf("c", "100")
	gen.AddPrintf("c", "115")
	gen.AddPrintf("c", "69")
	gen.AddPrintf("c", "114")
	gen.AddPrintf("c", "114")
	gen.AddPrintf("c", "111")
	gen.AddPrintf("c", "114")
	gen.AddGoto(lvl3)
	gen.AddLabel(lvl2)

	gen.AddExpression(newTmp, tempArray.Value, tempIndex.Value, "+")
	gen.AddExpression(newTmp, newTmp, "1", "+")
	newTmp2 := gen.NewTemp()
	gen.AddGetHeap(newTmp2, "(int)"+newTmp)
	gen.AddLabel(lvl3)
	//ToDo: to change
	result = environment.NewValue(newTmp2, true, tempArray.ArrType, false, false, false)
	result.ArrType = tempArray.ArrType
	return result
}
