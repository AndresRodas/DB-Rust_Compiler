package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
)

type Continue struct {
	Lin int
	Col int
}

func NewContinue(lin int, col int) Continue {
	ContinueInstr := Continue{lin, col}
	return ContinueInstr
}

func (p Continue) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	//validar ciclo entorno
	result = environment.NewValue("", false, environment.NULL, false, false, true)
	return result
}
