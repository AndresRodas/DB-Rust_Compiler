package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	"github.com/colegno/arraylist"
	"strconv"
)

type Range struct {
	Lin  int
	Col  int
	Exp1 interfaces.Expression
	Exp2 interfaces.Expression
	Tipo environment.TipoExpresion
}

func NewRange(lin int, col int, expuno interfaces.Expression, expdos interfaces.Expression) Range {
	exp := Range{lin, col, expuno, expdos, 0}
	return exp
}

func (p Range) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	var arrType environment.TipoExpresion
	var tmpList *arraylist.List
	tmpList = arraylist.New()
	val1 := p.Exp1.Ejecutar(ast, env, gen)
	val2 := p.Exp2.Ejecutar(ast, env, gen)
	if val1.Type == environment.INTEGER && (val2.Type == environment.INTEGER || val2.Type == environment.ARRAY) {
		s1 := val1.IntValue
		s2 := val2.IntValue
		size := s2 - s1 + 1
		//creando lista
		for i := s1; i <= s2; i++ {
			fmt.Println("asdsad", s1, i, s2)
			res := environment.NewValue(strconv.Itoa(i), false, environment.INTEGER, false, false, false)
			tmpList.Add(res)
		}
		//generando array
		gen.AddComment("Generando array")
		newtmp1 := gen.NewTemp()
		newtmp2 := gen.NewTemp()
		gen.AddAssign(newtmp1, "H")
		gen.AddExpression(newtmp2, newtmp1, "1", "+")
		gen.AddSetHeap("(int)H", strconv.Itoa(size))
		gen.AddExpression("H", "H", strconv.Itoa(size+1), "+")
		//recorriendo lista de expressiones
		for _, s := range tmpList.ToArray() {
			arrType = s.(environment.Value).Type
			gen.AddSetHeap("(int)"+newtmp2, s.(environment.Value).Value)
			gen.AddExpression(newtmp2, newtmp2, "1", "+")
		}
		result = environment.NewValue(newtmp1, true, environment.ARRAY, false, false, false)
		result.ArrType = arrType
	}

	return result
}
