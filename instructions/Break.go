package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
)

type Break struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
}

func NewBreak(lin int, col int, exp interfaces.Expression) Break {
	breakInstr := Break{lin, col, exp}
	return breakInstr
}

func (p Break) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	//validar ciclo entorno
	if p.Expresion == nil { //BREAK SIN VALOR
		result = environment.NewValue("", false, environment.NULL, false, true, false)
	} else { //BREAK CON VALOR
		tmpVal := p.Expresion.Ejecutar(ast, env, gen)
		tmpVal.BreakFlag = true
		result = tmpVal
	}

	return result
}
