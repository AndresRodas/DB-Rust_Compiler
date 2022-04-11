package generator

import (
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Generator struct {
	temporal int
	label    int
	code     *arrayList.List
	tempList *arrayList.List
}

func NewGenerator() Generator {
	generator := Generator{temporal: 0, label: 0, code: arrayList.New(), tempList: arrayList.New()}
	return generator
}

func (g Generator) GetCode() *arrayList.List {
	return g.code
}

func (g Generator) GetTemps() *arrayList.List {
	return g.tempList
}

//Generar un nuevo temporal
func (g *Generator) NewTemp() string {
	temp := "t" + fmt.Sprintf("%v", g.temporal)
	g.temporal = g.temporal + 1
	//Lo guardamos para declararlo
	g.tempList.Add(temp)
	return temp
}

//Generador de label
func (g *Generator) NewLabel() string {
	temp := g.label
	g.label = g.label + 1
	return "L" + fmt.Sprintf("%v", temp)
}

//Añade label al codigo
func (g *Generator) AddLabel(label string) {
	g.code.Add(label + ":")
}

func (g *Generator) AddIf(left string, right string, operator string, label string) {
	g.code.Add("if(" + left + " " + operator + " " + right + ") goto " + label + ";")
}

func (g *Generator) AddGoto(label string) {
	g.code.Add("goto " + label + ";")
}

func (g *Generator) AddExpression(target string, left string, right string, operator string) {
	g.code.Add(target + " = " + left + " " + operator + " " + right + ";\n")
}

func (g *Generator) AddAssign(target, val string) {
	g.code.Add(target + " = " + val + ";\n")
}

func (g *Generator) AddPrintf(typePrint string, value string) {
	g.code.Add("printf(\"%" + typePrint + "\", " + value + ");\n")
	//g.code.Add("printf(\"%c\", (char)10);\n")
}

func (g *Generator) AddSetHeap(index string, value string) {
	g.code.Add("heap[" + index + "] = " + value + ";\n")
}

func (g *Generator) AddGetHeap(target string, index string) {
	g.code.Add(target + " = heap[" + index + "];")
}

func (g *Generator) AddSetStack(index string, value string) {
	g.code.Add("stack[" + index + "] = " + value + ";")
}

func (g *Generator) AddGetStack(target string, index string) {
	g.code.Add(target + " = stack[" + index + "];")
}

//agregar headers
func (g *Generator) AddHeaders() {
	var tempList *arrayList.List
	tempList = arrayList.New()
	//******************add head
	head := "/*------HEADER------*/\n"
	head += "#include <stdio.h>\n"
	head += "#include <math.h>\n"
	head += "double heap[30101999];\n"
	head += "double stack[30101999];\n"
	head += "double P;\n"
	head += "double H;\n"
	head += "double "
	head += fmt.Sprintf("%v", g.GetTemps().GetValue(0))
	g.GetTemps().RemoveAtIndex(0)
	for _, s := range g.GetTemps().ToArray() {
		head += ", "
		head += fmt.Sprintf("%v", s)
	}
	head += ";\n\n"
	//add in pos 0
	tempList.Add(head)
	for _, s := range g.code.ToArray() {
		tempList.Add(s)
	}
	g.code = tempList
	//fmt.Println(g.code.ToArray())

}

//add main
func (g *Generator) AddMain() {
	var tempList *arrayList.List
	tempList = arrayList.New()
	//********************add main
	main := "/*------MAIN------*/\nvoid main(){\n\tP = 0; H = 0;\n\n"
	for i := 1; i < g.code.Len(); i++ {
		main += "\t" + fmt.Sprintf("%v", g.code.ToArray()[i])
	}
	main += "\n\treturn;\n}\n"

	//add in pos 0
	tempList.Add(g.code.ToArray()[0])
	tempList.Add(main)

	g.code = tempList
}
