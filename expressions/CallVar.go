package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"strconv"
)

type CallVar struct {
	Lin int
	Col int
	Id  string
}

func NewCallVar(lin int, col int, id string) CallVar {
	exp := CallVar{lin, col, id}
	return exp
}

func (p CallVar) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	gen.AddComment("Llamando una variable")
	var result environment.Value
	retSym := env.(environment.Environment).GetVariable(p.Id)
	newTemp := gen.NewTemp()
	newTemp2 := gen.NewTemp()
	if gen.MainCode {
		gen.AddGetStack(newTemp2, strconv.Itoa(retSym.Posicion))
	} else {
		gen.AddExpression(newTemp, "P", strconv.Itoa(retSym.Posicion), "+")
		gen.AddGetStack(newTemp2, "(int)"+newTemp)
	}

	if retSym.Tipo == environment.BOOLEAN {
		trueLabel := gen.NewLabel()
		falseLabel := gen.NewLabel()
		gen.AddIf(newTemp2, "1", "==", trueLabel)
		gen.AddGoto(falseLabel)
		result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
		result.TrueLabel.Add(trueLabel)
		result.FalseLabel.Add(falseLabel)
	} else {
		result = environment.NewValue(newTemp2, true, retSym.Tipo, false, false, false)
		result.ArrType = retSym.TipoArr
	}

	//result = environment.Value{Value: newTemp, IsTemp: true, Type: retSym.Tipo}
	return result
}
