package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	arrayList "github.com/colegno/arraylist"
	"strings"
)

type If struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    *arrayList.List
	ElseIf    *arrayList.List
	ElseInst  *arrayList.List
}

func NewIf(lin int, col int, condition interfaces.Expression, bloque *arrayList.List, elif *arrayList.List, elinst *arrayList.List) If {
	ifInstr := If{lin, col, condition, bloque, elif, elinst}
	return ifInstr
}
func (p If) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	gen.AddComment("Generando If")
	var condicion, result environment.Value
	var OutLvls *arrayList.List
	OutLvls = arrayList.New()
	condicion = p.Expresion.Ejecutar(ast, env, gen) //imprime el if de operacion
	newLabel := gen.NewLabel()                      //salida
	//*****************************************add true labels
	for _, lvl := range condicion.TrueLabel.ToArray() {
		gen.AddLabel(lvl.(string))
	}
	//instrucciones if
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
			//out lbls
			for _, lvl := range result.OutLabel.ToArray() {
				OutLvls.Add(lvl)
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
			//out lbls
			for _, lvl := range result.OutLabel.ToArray() {
				OutLvls.Add(lvl)
			}
		} else {
			fmt.Println("Error en bloque")
		}
	}
	//*****************************************add out labels
	gen.AddGoto(newLabel)
	//*****************************************add false labels
	for _, lvl := range condicion.FalseLabel.ToArray() {
		gen.AddLabel(lvl.(string))
	}
	//ELSE IF
	if p.ElseIf.Len() > 0 {
		//instrucciones elseif
		for _, s := range p.ElseIf.ToArray() {
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
				//out lbls
				for _, lvl := range result.OutLabel.ToArray() {
					OutLvls.Add(lvl)
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
				//out lbls
				for _, lvl := range result.OutLabel.ToArray() {
					OutLvls.Add(lvl)
				}
			} else {
				fmt.Println("Error en bloque")
			}
		}
	}
	//ELSE
	if p.ElseInst.Len() > 0 {
		//instrucciones else
		for _, s := range p.ElseInst.ToArray() {
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
				//out lbls
				for _, lvl := range result.OutLabel.ToArray() {
					OutLvls.Add(lvl)
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
				//out lbls
				for _, lvl := range result.OutLabel.ToArray() {
					OutLvls.Add(lvl)
				}
			} else {
				fmt.Println("Error en bloque")
			}
		}
	}

	OutLvls.Add(newLabel)
	result.OutLabel = OutLvls.Clone()
	return result
}
