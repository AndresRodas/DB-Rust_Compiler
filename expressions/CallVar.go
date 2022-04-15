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
	var result environment.Value
	retSym := env.(environment.Environment).GetVariable(p.Id)
	newTemp := gen.NewTemp()
	gen.AddGetStack(newTemp, strconv.Itoa(retSym.Posicion))
	gen.AddBr()
	result = environment.NewValue(newTemp, true, retSym.Tipo)
	//result = environment.Value{Value: newTemp, IsTemp: true, Type: retSym.Tipo}
	return result
}
