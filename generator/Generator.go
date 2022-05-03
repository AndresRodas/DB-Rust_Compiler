package generator

import (
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Generator struct {
	Temporal        int
	Label           int
	Code            *arrayList.List
	FinalCode       *arrayList.List
	Natives         *arrayList.List
	TempList        *arrayList.List
	PrintStringFlag bool
}

func NewGenerator() Generator {
	generator := Generator{
		Temporal:        0,
		Label:           0,
		Code:            arrayList.New(),
		FinalCode:       arrayList.New(),
		Natives:         arrayList.New(),
		TempList:        arrayList.New(),
		PrintStringFlag: true,
	}
	return generator
}

func (g Generator) GetCode() *arrayList.List {
	return g.Code
}

func (g Generator) GetFinalCode() *arrayList.List {
	return g.FinalCode
}

func (g Generator) GetTemps() *arrayList.List {
	return g.TempList
}

//Generar un nuevo temporal
func (g *Generator) NewTemp() string {
	temp := "t" + fmt.Sprintf("%v", g.Temporal)
	g.Temporal = g.Temporal + 1
	//Lo guardamos para declararlo
	g.TempList.Add(temp)
	return temp
}

//Generador de Label
func (g *Generator) NewLabel() string {
	temp := g.Label
	g.Label = g.Label + 1
	return "L" + fmt.Sprintf("%v", temp)
}

//Añade Label al codigo
func (g *Generator) AddLabel(Label string) {
	g.Code.Add(Label + ":\n")
}

func (g *Generator) AddIf(left string, right string, operator string, Label string) {
	g.Code.Add("if(" + left + " " + operator + " " + right + ") goto " + Label + ";\n")
}

func (g *Generator) AddGoto(Label string) {
	g.Code.Add("goto " + Label + ";\n")
}

func (g *Generator) AddExpression(target string, left string, right string, operator string) {
	g.Code.Add(target + " = " + left + " " + operator + " " + right + ";\n")
}

func (g *Generator) AddAssign(target, val string) {
	g.Code.Add(target + " = " + val + ";\n")
}

func (g *Generator) AddPrintf(typePrint string, value string) {
	g.Code.Add("printf(\"%" + typePrint + "\", " + value + ");\n")
	//g.Code.Add("printf(\"%c\", (char)10);\n")
}

func (g *Generator) AddSetHeap(index string, value string) {
	g.Code.Add("heap[" + index + "] = " + value + ";\n")
}

func (g *Generator) AddGetHeap(target string, index string) {
	g.Code.Add(target + " = heap[" + index + "];\n")
}

func (g *Generator) AddSetStack(index string, value string) {
	g.Code.Add("stack[" + index + "] = " + value + ";\n")
}

func (g *Generator) AddGetStack(target string, index string) {
	g.Code.Add(target + " = stack[" + index + "];\n")
}

func (g *Generator) AddCall(target string) {
	g.Code.Add(target + "();\n")
}

func (g *Generator) AddBr() {
	g.Code.Add("\n")
}

func (g *Generator) AddComment(target string) {
	g.Code.Add("//" + target + "\n")
}

//agregar headers
func (g *Generator) GenerateFinalCode() {
	//****************** add head
	g.FinalCode.Add("/*------HEADER------*/\n")
	g.FinalCode.Add("#include <stdio.h>\n")
	g.FinalCode.Add("#include <math.h>\n")
	g.FinalCode.Add("double heap[30101999];\n")
	g.FinalCode.Add("double stack[30101999];\n")
	g.FinalCode.Add("double P;\n")
	g.FinalCode.Add("double H;\n")
	g.FinalCode.Add("double ")
	//****************** add temporal declaration
	tmpDec := fmt.Sprintf("%v", g.GetTemps().GetValue(0))
	g.GetTemps().RemoveAtIndex(0)
	for _, s := range g.GetTemps().ToArray() {
		tmpDec += ", "
		tmpDec += fmt.Sprintf("%v", s)
	}
	tmpDec += ";\n\n"
	g.FinalCode.Add(tmpDec)
	//****************** add natives functions
	if g.Natives.Len() > 0 {
		g.FinalCode.Add("/*------NATIVES------*/\n")
		for _, s := range g.Natives.ToArray() {
			g.FinalCode.Add(s)
		}
	}
	//****************** add main
	g.FinalCode.Add("/*------MAIN------*/\n")
	g.FinalCode.Add("void main() {\n")
	g.FinalCode.Add("\tP = 0; H = 0;\n\n")
	for _, s := range g.Code.ToArray() {
		g.FinalCode.Add("\t" + s.(string))
	}
	g.FinalCode.Add("\n\treturn;\n}\n")
}

func (g *Generator) GeneratePrintString() {
	if g.PrintStringFlag {
		//generando temporales y etiquetas
		newTemp1 := g.NewTemp()
		newTemp2 := g.NewTemp()
		newTemp3 := g.NewTemp()
		newLvl1 := g.NewLabel()
		newLvl2 := g.NewLabel()
		//se genera la funcion printstring
		g.Natives.Add("void dbrust_printString() {\n")
		g.Natives.Add("\t" + newTemp1 + " = P + 1;\n")
		g.Natives.Add("\t" + newTemp2 + " = stack[(int)" + newTemp1 + "];\n")
		g.Natives.Add("\t" + newLvl2 + ":\n")
		g.Natives.Add("\t" + newTemp3 + " = heap[(int)" + newTemp2 + "];\n")
		g.Natives.Add("\tif(" + newTemp3 + " == -1) goto " + newLvl1 + ";\n")
		g.Natives.Add("\tprintf(\"%c\", (char)" + newTemp3 + ");\n")
		g.Natives.Add("\t" + newTemp2 + " = " + newTemp2 + " + 1;\n")
		g.Natives.Add("\tgoto " + newLvl2 + ";\n")
		g.Natives.Add("\t" + newLvl1 + ":\n")
		g.Natives.Add("\treturn;\n")
		g.Natives.Add("}\n\n")
		g.PrintStringFlag = false
	}
}
