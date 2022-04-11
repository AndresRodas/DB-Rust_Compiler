package interfaces

import (
	"OLC2/environment"
	"OLC2/generator"
)

type Instruction interface {
	Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value
}
