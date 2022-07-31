package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
)

type ToString struct {
	Lin int
	Col int
	Exp interface{}
}

func NewToString(lin int, col int, ex interface{}) ToString {
	exp := ToString{lin, col, ex}
	return exp
}

func (p ToString) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result, tmp environment.Value
	tmp = p.Exp.(interfaces.Expression).Ejecutar(ast, env, gen)
	if tmp.Type == environment.STRING || tmp.Type == environment.STR || tmp.Type == environment.CHAR {
		tmp.Type = environment.STRING
		result = tmp
	} else {
		fmt.Println("ERRROR")
	}

	return result
}
