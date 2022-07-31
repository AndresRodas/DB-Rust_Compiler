package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
)

type Abs struct {
	Lin       int
	Col       int
	Expresion interface{}
}

func NewAbs(lin int, col int, valor interface{}) Abs {
	exp := Abs{lin, col, valor}
	return exp
}

func (p Abs) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value

	newTemp := gen.NewTemp()
	result = p.Expresion.(interfaces.Expression).Ejecutar(ast, env, gen)

	if result.Type == environment.INTEGER || result.Type == environment.FLOAT {

		gen.AddExpression(newTemp, "fabs(", ")", result.Value)
		result = environment.NewValue(newTemp, true, result.Type, false, false, false)
		return result

	} else {
		fmt.Println("ERROR: No es posible sumar")
	}

	return result
}
