package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"fmt"
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
	gen.AddComment("Agregando una llamada a variable")
	var result environment.Value
	retSym := env.(environment.Environment).GetVariable(p.Id)
	newTemp := gen.NewTemp()
	gen.AddGetStack(newTemp, strconv.Itoa(retSym.Posicion))
	fmt.Println(retSym.Tipo)
	if retSym.Tipo == environment.BOOLEAN {
		trueLabel := gen.NewLabel()
		falseLabel := gen.NewLabel()
		gen.AddIf(newTemp, "1", "==", trueLabel)
		gen.AddGoto(falseLabel)
		result = environment.NewValue("", false, environment.BOOLEAN)
		result.TrueLabel.Add(trueLabel)
		result.FalseLabel.Add(falseLabel)
	} else {
		gen.AddBr()
		result = environment.NewValue(newTemp, true, retSym.Tipo)

	}

	//result = environment.Value{Value: newTemp, IsTemp: true, Type: retSym.Tipo}
	return result
}
