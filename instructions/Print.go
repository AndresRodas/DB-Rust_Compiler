package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	arrayList "github.com/colegno/arraylist"
	"strconv"
)

type Print struct {
	Lin    int
	Col    int
	Values *arrayList.List
}

func NewPrint(lin int, col int, val *arrayList.List) Print {
	return Print{lin, col, val}
}

func (p Print) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	//Recorriendo valores a imprimir
	for _, exp := range p.Values.ToArray() {
		result = exp.(interfaces.Expression).Ejecutar(ast, env, gen)

		if result.Type == environment.INTEGER || result.Type == environment.FLOAT {
			gen.AddPrintf("d", "(int)"+fmt.Sprintf("%v", result.Value))
			gen.AddPrintf("c", "10")
			gen.AddBr()
		} else if result.Type == environment.BOOLEAN {
			newLabel := gen.NewLabel()
			//gen.AddGoto(result.FalseLabel)
			//add labels
			for _, lvl := range result.TrueLabel.ToArray() {
				gen.AddLabel(lvl.(string))
			}
			gen.AddPrintf("c", "(char)116")
			gen.AddPrintf("c", "(char)114")
			gen.AddPrintf("c", "(char)117")
			gen.AddPrintf("c", "(char)101")
			gen.AddGoto(newLabel)
			//add labels
			for _, lvl := range result.FalseLabel.ToArray() {
				gen.AddLabel(lvl.(string))
			}
			gen.AddPrintf("c", "(char)102")
			gen.AddPrintf("c", "(char)97")
			gen.AddPrintf("c", "(char)108")
			gen.AddPrintf("c", "(char)115")
			gen.AddPrintf("c", "(char)101")
			gen.AddLabel(newLabel)
			gen.AddPrintf("c", "10")
			gen.AddBr()
		} else if result.Type == environment.STRING || result.Type == environment.STR {
			//llamar a generar printstring
			gen.GeneratePrintString()
			//agregar codigo en el main
			newTemp1 := gen.NewTemp()
			newTemp2 := gen.NewTemp()
			size := strconv.Itoa(env.(environment.Environment).Size["size"])
			gen.AddExpression(newTemp1, "P", size, "+")     //nuevo temporal en pos vacia
			gen.AddExpression(newTemp1, newTemp1, "1", "+") //se deja espacio de retorno
			gen.AddSetStack("(int)"+newTemp1, result.Value) //se coloca string en parametro que se manda
			gen.AddExpression("P", "P", size, "+")          // cambio de entorno
			gen.AddCall("dbrust_printString")               //Llamada
			gen.AddGetStack(newTemp2, "(int)P")             //obtencion retorno
			gen.AddExpression("P", "P", size, "-")          //regreso del entorno
			gen.AddPrintf("c", "10")                        //salto de linea
			gen.AddBr()
		}

	}
	return result
}
