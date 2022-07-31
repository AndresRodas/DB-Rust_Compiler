package instructions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	arrayList "github.com/colegno/arraylist"
	"strings"
)

type Function struct {
	Lin     int
	Col     int
	Id      string
	ListDec *arrayList.List
	Tipo    environment.TipoExpresion
	Bloque  *arrayList.List
	FuncId  string
}

func NewFunction(lin int, col int, id string, listd *arrayList.List, tipo environment.TipoExpresion, bloc *arrayList.List, fid string) Function {
	instr := Function{lin, col, id, listd, tipo, bloc, fid}
	return instr
}

func (p Function) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	gen.AddComment("Funcion " + p.Id)
	gen.AddTittle(p.Id)
	//entorno
	var envFunc environment.Environment
	envFunc = environment.NewEnvironment(env.(environment.Environment), p.Id)
	envFunc.Size["size"] = envFunc.Size["size"] + 1
	//variables
	for _, s := range p.ListDec.ToArray() {
		res := s.(interfaces.Instruction).Ejecutar(ast, env, gen)
		envFunc.SaveVariable(res.Value, res.Type, res.ArrType)
		fmt.Println("se guarda", res.Value)
	}

	//instrucciones func
	for _, s := range p.Bloque.ToArray() {
		if strings.Contains(fmt.Sprintf("%T", s), "instructions") {
			result = s.(interfaces.Instruction).Ejecutar(ast, envFunc, gen)
			//agregando etiquetas de salida
			for _, lvl := range result.OutLabel.ToArray() {
				gen.AddLabel(lvl.(string))
			}
		} else if strings.Contains(fmt.Sprintf("%T", s), "expressions") {
			result = s.(interfaces.Expression).Ejecutar(ast, envFunc, gen)
			//agregando etiquetas de salida
			for _, lvl := range result.OutLabel.ToArray() {
				gen.AddLabel(lvl.(string))
			}
		} else {
			fmt.Println("Error en bloque")
		}
	}
	gen.AddEnd()

	return result
}
