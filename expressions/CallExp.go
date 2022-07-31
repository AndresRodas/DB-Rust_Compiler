package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	arrayList "github.com/colegno/arraylist"
	"strconv"
	"strings"
)

type CallExp struct {
	Lin    int
	Col    int
	Id     string
	Params *arrayList.List
}

func NewCallExp(lin int, col int, id string, par *arrayList.List) CallExp {
	exp := CallExp{lin, col, id, par}
	return exp
}

func (p CallExp) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	size := env.(environment.Environment).Size["size"]
	gen.AddComment("Inicio de llamada")
	if p.Params.Len() > 0 {
		tmp1 := gen.NewTemp()
		gen.AddExpression(tmp1, "P", strconv.Itoa(size+1), "+")
		for i := 0; i < p.Params.Len(); i++ {

			//ejecutando parametros
			if strings.Contains(fmt.Sprintf("%T", p.Params.ToArray()[i].(environment.ByReference).Exp), "instructions") {
				result = p.Params.ToArray()[i].(environment.ByReference).Exp.(interfaces.Instruction).Ejecutar(ast, env, gen)
			} else if strings.Contains(fmt.Sprintf("%T", p.Params.ToArray()[i].(environment.ByReference).Exp), "expressions") {
				result = p.Params.ToArray()[i].(environment.ByReference).Exp.(interfaces.Expression).Ejecutar(ast, env, gen)
			} else {
				fmt.Println("Error en bloque")
			}
			//guardando
			gen.AddSetStack("(int)"+tmp1, result.Value)
			if (p.Params.Len() - 1) != i {
				gen.AddExpression(tmp1, tmp1, "1", "+")
			}
		}

		gen.AddExpression("P", "P", strconv.Itoa(size), "+")
		gen.AddCall(p.Id)
		gen.AddGetStack(tmp1, "(int)P")
		gen.AddExpression("P", "P", strconv.Itoa(size), "-")

	} else {
		tmp1 := gen.NewTemp()

		gen.AddExpression("P", "P", strconv.Itoa(size), "+")
		gen.AddCall(p.Id)
		gen.AddGetStack(tmp1, "(int)P")
		gen.AddExpression("P", "P", strconv.Itoa(size), "-")

	}
	gen.AddComment("Final de llamada")
	return result
}
