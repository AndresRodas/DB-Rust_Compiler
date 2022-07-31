package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	arrayList "github.com/colegno/arraylist"
	"strconv"
	"strings"
)

type ForIn struct {
	Lin  int
	Col  int
	Id   string
	Exp  interfaces.Expression
	Inst *arrayList.List
}

func NewForIn(lin int, col int, id string, exp interfaces.Expression, ins *arrayList.List) ForIn {
	loopInstr := ForIn{lin, col, id, exp, ins}
	return loopInstr
}

func (p ForIn) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	gen.AddComment("Generando For")
	var result environment.Value
	//ejecutando arreglo
	tmpArr := p.Exp.Ejecutar(ast, env, gen) //nos trae el temp
	//forin
	tmp1 := gen.NewTemp()
	tmp2 := gen.NewTemp()
	tmp3 := gen.NewTemp()
	tmp4 := gen.NewTemp()
	tmp5 := gen.NewTemp()
	tmp6 := gen.NewTemp()
	lvl1 := gen.NewLabel()
	lvl2 := gen.NewLabel()
	lvl3 := gen.NewLabel()
	//---------------------------------------Primera parte ciclo FOR
	gen.AddGetHeap(tmp1, "(int)"+tmpArr.Value)                                                     //recuperar tamaño arr
	gen.AddExpression(tmp2, "0", "", "")                                                           //contador inicial
	gen.AddExpression(tmp3, tmp2, "1", "+")                                                        //indice
	gen.AddExpression(tmp4, tmpArr.Value, tmp3, "+")                                               //arr + indice
	gen.AddGetHeap(tmp5, "(int)"+tmp4)                                                             //recuperar valor
	symSave := env.(environment.Environment).SaveVariable(p.Id, environment.ARRAY, tmpArr.ArrType) //save
	gen.AddExpression(tmp6, "P", strconv.Itoa(symSave.Posicion), "+")                              //posicion libre stack
	gen.AddSetStack("(int)"+tmp6, tmp5)                                                            //guardar i
	gen.AddLabel(lvl1)                                                                             //retorno
	gen.AddIf(tmp2, tmp1, "==", lvl3)                                                              //si el cont == tamaño
	//---------------------------------------Instrucciones for
	for _, s := range p.Inst.ToArray() {
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
	//---------------------------------------Segunda parte ciclo FOR
	gen.AddLabel(lvl2)
	gen.AddExpression(tmp2, tmp2, "1", "+")          //aumento contador
	gen.AddExpression(tmp3, tmp2, "1", "+")          //indice
	gen.AddExpression(tmp4, tmpArr.Value, tmp3, "+") //arr + indice
	gen.AddGetHeap(tmp5, "(int)"+tmp4)               //recuperar valor
	gen.AddSetStack("(int)"+tmp6, tmp5)              //guardar i nuevamente
	gen.AddGoto(lvl1)
	gen.AddLabel(lvl3)

	return result
}
