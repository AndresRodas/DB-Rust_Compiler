package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"strconv"
)

type Declaration struct {
	Lin       int
	Col       int
	Id        string
	Tipo      environment.TipoExpresion
	Expresion interfaces.Expression
	Mutable   bool
}

func NewDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression, mut bool) Declaration {
	instr := Declaration{lin, col, id, tipo, val, mut}
	return instr
}

func (p Declaration) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {

	var result environment.Value
	var newVar environment.Symbol
	result = p.Expresion.Ejecutar(ast, env, gen)

	newVar = env.(environment.Environment).SaveVariable(p.Id, p.Tipo)
	gen.AddSetStack(strconv.Itoa(newVar.Posicion), result.Value)
	gen.AddBr()
	return result
}
