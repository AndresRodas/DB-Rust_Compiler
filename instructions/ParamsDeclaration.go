package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
)

type ParamsDeclaration struct {
	Lin       int
	Col       int
	Id        string
	Tipo      environment.TipoExpresion
	ExtraTipo string
	Vectipo   environment.TipoExpresion
}

func NewParamsDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, extr string, vt environment.TipoExpresion) ParamsDeclaration {
	instr := ParamsDeclaration{lin, col, id, tipo, extr, vt}
	return instr
}

func (p ParamsDeclaration) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {

	var result environment.Value
	result = environment.NewValue(p.Id, false, p.Tipo, false, false, false)
	//env.(environment.Environment).SaveVariable(p.Id, result)

	return result
}
