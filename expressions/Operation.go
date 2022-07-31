package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
	"strconv"
	//"github.com/colegno/arraylist"
)

type Operation struct {
	Lin      int
	Col      int
	Op_izq   interfaces.Expression
	Operador string
	Op_der   interfaces.Expression
}

func (o Operation) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var dominante environment.TipoExpresion

	suma_resta_dominante := [12][12]environment.TipoExpresion{
		//		INTEGER			FLOAT				STRING				STR				CHAR			BOOLEAN
		//INTEGER
		{environment.INTEGER, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//FLOAT
		{environment.NULL, environment.FLOAT, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//STRING
		{environment.NULL, environment.NULL, environment.NULL, environment.STRING, environment.NULL, environment.NULL},
		//STR
		{environment.NULL, environment.NULL, environment.STRING, environment.NULL, environment.NULL, environment.NULL},
		//CHAR
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//BOOLEAN
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
	}
	multi_division_dominante := [12][12]environment.TipoExpresion{
		//		INTEGER			FLOAT				STRING				STR				CHAR			BOOLEAN
		//INTEGER
		{environment.INTEGER, environment.FLOAT, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//FLOAT
		{environment.FLOAT, environment.FLOAT, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//STRING
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//STR
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//CHAR
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//BOOLEAN
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
	}
	relacional_dominante := [12][12]environment.TipoExpresion{
		//		INTEGER			FLOAT				STRING				STR				CHAR			BOOLEAN
		//INTEGER
		{environment.INTEGER, environment.FLOAT, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//FLOAT
		{environment.FLOAT, environment.FLOAT, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//STRING
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//STR
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//CHAR
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
		//BOOLEAN
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
	}

	var op1, op2, result environment.Value
	//var result = environment.NewValue()

	newTemp := gen.NewTemp()

	switch o.Operador {
	case "+":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = suma_resta_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "+")
				result = environment.NewValue(newTemp, true, dominante, false, false, false)
				result.IntValue = op1.IntValue + op2.IntValue
				return result
			} else if dominante == environment.STRING {
				//llamar a generar concatstring
				gen.GenerateConcatString()
				//concat
				gen.AddComment("Concatenando strings")
				envSize := strconv.Itoa(env.(environment.Environment).Size["size"])
				tmp1 := gen.NewTemp()
				tmp2 := gen.NewTemp()
				gen.AddExpression(tmp1, "P", envSize, "+")
				gen.AddExpression(tmp1, tmp1, "1", "+")
				gen.AddSetStack("(int)"+tmp1, op1.Value)
				gen.AddExpression(tmp1, tmp1, "1", "+")
				gen.AddSetStack("(int)"+tmp1, op2.Value)
				gen.AddExpression("P", "P", envSize, "+")
				gen.AddCall("dbrust_concatString")
				gen.AddGetStack(tmp2, "(int)P")
				gen.AddExpression("P", "P", envSize, "-")
				gen.AddBr()
				result = environment.NewValue(tmp2, true, dominante, false, false, false)
				return result
			} else {
				fmt.Println("ERROR: No es posible sumar ", dominante)
				return result
			}
		}
	case "-":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = suma_resta_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "-")
				result = environment.NewValue(newTemp, true, dominante, false, false, false)
				result.IntValue = op1.IntValue - op2.IntValue
				return result
			} else {
				fmt.Println("ERROR: No es posible restar")
			}
		}
	case "*":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = multi_division_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "*")
				result = environment.NewValue(newTemp, true, dominante, false, false, false)
				result.IntValue = op1.IntValue * op2.IntValue
				return result
			} else {
				fmt.Println("ERROR: No es posible Multiplicar")
			}

		}
	case "/":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = multi_division_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				lvl1 := gen.NewLabel()
				lvl2 := gen.NewLabel()

				gen.AddIf(op2.Value, "0", "!=", lvl1)
				gen.AddPrintf("c", "77")
				gen.AddPrintf("c", "97")
				gen.AddPrintf("c", "116")
				gen.AddPrintf("c", "104")
				gen.AddPrintf("c", "69")
				gen.AddPrintf("c", "114")
				gen.AddPrintf("c", "114")
				gen.AddPrintf("c", "111")
				gen.AddPrintf("c", "114")
				gen.AddExpression(newTemp, "0", "", "")
				gen.AddGoto(lvl2)
				gen.AddLabel(lvl1)
				gen.AddExpression(newTemp, op1.Value, op2.Value, "/")
				gen.AddLabel(lvl2)
				result = environment.NewValue(newTemp, true, dominante, false, false, false)
				return result
			} else {
				fmt.Println("ERROR: No es posible Dividir")
			}

		}
	case "%":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = multi_division_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, "fmod("+op1.Value, op2.Value+")", ",")
				result = environment.NewValue(newTemp, true, dominante, false, false, false)
				return result
			} else {
				fmt.Println("ERROR: No es posible hacer modulo ")
			}

		}
	case "<":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, "<", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
				//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
				result.TrueLabel.Add(trueLabel)
				result.FalseLabel.Add(falseLabel)
				return result

			} else {
				fmt.Println("ERROR: No es posible comparar <")
			}
		}
	case ">":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, ">", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
				//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
				result.TrueLabel.Add(trueLabel)
				result.FalseLabel.Add(falseLabel)
				return result
			} else {
				fmt.Println("ERROR: No es posible comparar >")
			}
		}
	case "<=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, "<=", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
				//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
				result.TrueLabel.Add(trueLabel)
				result.FalseLabel.Add(falseLabel)
				return result
			} else {
				fmt.Println("ERROR: No es posible comparar <=")
			}
		}
	case ">=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, ">=", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
				//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
				result.TrueLabel.Add(trueLabel)
				result.FalseLabel.Add(falseLabel)
				return result
			} else {
				fmt.Println("ERROR: No es posible comparar >=")
			}
		}
	case "==":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, "==", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
				//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
				result.TrueLabel.Add(trueLabel)
				result.FalseLabel.Add(falseLabel)
				return result
			} else {
				fmt.Println("ERROR: No es posible comparar ==")
			}
		}
	case "!=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, "!=", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
				//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
				result.TrueLabel.Add(trueLabel)
				result.FalseLabel.Add(falseLabel)
				return result
			} else {
				fmt.Println("ERROR: No es posible comparar !=")
			}
		}
	case "&&":
		{
			//1- true -> 2
			//1- false -> false
			//2- true -> true
			//2- false -> false
			//1 false = 2 false
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			//add op1 labels
			for _, lvl := range op1.TrueLabel.ToArray() {
				gen.AddLabel(lvl.(string))
			}

			op2 = o.Op_der.Ejecutar(ast, env, gen)

			result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
			//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
			result.TrueLabel.AddAll(op2.TrueLabel.ToArray())
			result.FalseLabel.AddAll(op1.FalseLabel.ToArray())
			result.FalseLabel.AddAll(op2.FalseLabel.ToArray())
			return result
		}
	case "||":
		{
			//1- true -> true
			//1- false -> 2
			//2- true -> true
			//2- false -> false
			//1 true = 2 true
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			//add op1 labels
			for _, lvl := range op1.FalseLabel.ToArray() {
				gen.AddLabel(lvl.(string))
			}
			op2 = o.Op_der.Ejecutar(ast, env, gen)

			result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
			//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
			result.TrueLabel.AddAll(op1.TrueLabel.ToArray())
			result.TrueLabel.AddAll(op2.TrueLabel.ToArray())
			result.FalseLabel.AddAll(op2.FalseLabel.ToArray())
			return result
		}
	case "!":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			if op1.Type == environment.BOOLEAN {
				result = environment.NewValue("", false, environment.BOOLEAN, false, false, false)
				//result = environment.Value{Value: "", IsTemp: false, Type: environment.BOOLEAN}
				result.TrueLabel.AddAll(op1.FalseLabel.ToArray())
				result.FalseLabel.AddAll(op1.TrueLabel.ToArray())
				return result
			} else {
				fmt.Println("ERROR: tipo no compatible !")
			}
		}
	case "MENOS_UNARIO":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			if op1.Type == environment.INTEGER {
				gen.AddExpression(newTemp, "0", op1.Value, "-")
				result = environment.NewValue(newTemp, true, environment.INTEGER, false, false, false)
				return result
			} else if op1.Type == environment.FLOAT {
				gen.AddExpression(newTemp, "0", op1.Value, "-")
				result = environment.NewValue(newTemp, true, environment.FLOAT, false, false, false)
				return result
			} else {
				fmt.Println("ERROR: tipo no compatible -")
			}
		}
	}
	gen.AddBr()
	return environment.Value{}
}

func NewOperation(lin, col int, Op1 interfaces.Expression, Operador string, Op2 interfaces.Expression) Operation {
	exp := Operation{Lin: lin, Col: col, Op_izq: Op1, Operador: Operador, Op_der: Op2}
	return exp
}
