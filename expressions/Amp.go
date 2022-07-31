package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
)

type Amp struct {
	Lin int
	Col int
	Exp interface{}
}

func NewAmp(lin int, col int, ex interface{}) Amp {
	expr := Amp{lin, col, ex}
	return expr
}

func (p Amp) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	result = p.Exp.(interfaces.Expression).Ejecutar(ast, env, gen)
	result.Type = environment.STR
	return result
}
