package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	arrayList "github.com/colegno/arraylist"
	"strconv"
)

type Array struct {
	Lin     int
	Col     int
	ListExp *arrayList.List
}

func NewArray(lin int, col int, list *arrayList.List) Array {
	exp := Array{lin, col, list}
	return exp
}

func (p Array) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result, val environment.Value
	var arrType environment.TipoExpresion
	size := p.ListExp.Len()
	//generando array
	gen.AddComment("Generando array")
	newtmp1 := gen.NewTemp()
	newtmp2 := gen.NewTemp()
	gen.AddAssign(newtmp1, "H")
	gen.AddExpression(newtmp2, newtmp1, "1", "+")
	gen.AddSetHeap("(int)H", strconv.Itoa(size))
	gen.AddExpression("H", "H", strconv.Itoa(size+1), "+")
	//recorriendo lista de expressiones
	for _, s := range p.ListExp.ToArray() {
		val = s.(interfaces.Expression).Ejecutar(ast, env, gen)
		arrType = val.Type
		gen.AddSetHeap("(int)"+newtmp2, val.Value)
		gen.AddExpression(newtmp2, newtmp2, "1", "+")
	}
	result = environment.NewValue(newtmp1, true, environment.ARRAY, false, false, false)
	result.ArrType = arrType
	return result
}
