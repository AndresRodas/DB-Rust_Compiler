package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	arrayList "github.com/colegno/arraylist"
	"strings"
)

type While struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    *arrayList.List
}

func NewWhile(lin int, col int, condition interfaces.Expression, bloque *arrayList.List) While {
	Inst := While{lin, col, condition, bloque}
	return Inst
}
func (p While) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	gen.AddComment("Generando While")
	var condicion, result environment.Value
	//etiqueta de retorno
	RetLvl := gen.NewLabel()
	gen.AddLabel(RetLvl)
	//ejecutando expresion (if)
	condicion = p.Expresion.Ejecutar(ast, env, gen)
	//******************** add break & continue lvls
	gen.AddContinue(RetLvl)
	gen.AddBreak(condicion.FalseLabel.ToArray()[0].(string))
	//add true labels
	for _, lvl := range condicion.TrueLabel.ToArray() {
		gen.AddLabel(lvl.(string))
	}
	//instrucciones while
	for _, s := range p.Bloque.ToArray() {
		if strings.Contains(fmt.Sprintf("%T", s), "instructions") {
			result = s.(interfaces.Instruction).Ejecutar(ast, env, gen)
			//comprobar si es brak
			if result.BreakFlag {
				gen.AddGoto(gen.BreakLabel)
				result.BreakFlag = false
			}
			//comprobar si es continue
			if result.ContinueFlag {
				gen.AddGoto(gen.ContinueLabel)
				result.ContinueFlag = false
			}
			//agregando etiquetas de salida
			for _, lvl := range result.OutLabel.ToArray() {
				gen.AddLabel(lvl.(string))
			}
		} else if strings.Contains(fmt.Sprintf("%T", s), "expressions") {
			result = s.(interfaces.Expression).Ejecutar(ast, env, gen)
			//comprobar si es brak
			if result.BreakFlag {
				gen.AddGoto(gen.BreakLabel)
				result.BreakFlag = false
			}
			//comprobar si es continue
			if result.ContinueFlag {
				gen.AddGoto(gen.ContinueLabel)
				result.ContinueFlag = false
			}
			//agregando etiquetas de salida
			for _, lvl := range result.OutLabel.ToArray() {
				gen.AddLabel(lvl.(string))
			}
		} else {
			fmt.Println("Error en bloque")
		}
	}
	//retorno
	gen.AddGoto(RetLvl)
	//add false labels
	for _, lvl := range condicion.FalseLabel.ToArray() {
		gen.AddLabel(lvl.(string))
	}
	return result
}
