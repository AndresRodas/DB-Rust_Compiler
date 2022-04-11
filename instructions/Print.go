package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	arrayList "github.com/colegno/arraylist"
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
	fmt.Println("print")
	var result environment.Value
	//Recorriendo valores a imprimir
	for _, exp := range p.Values.ToArray() {

		result = exp.(interfaces.Expression).Ejecutar(ast, env, gen)
		gen.AddPrintf("d", "(int)"+fmt.Sprintf("%v", result.Value))
	}
	return result
}
