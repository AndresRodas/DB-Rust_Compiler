package expressions

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
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
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
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

	var op1, op2 environment.Value

	op1 = o.Op_izq.Ejecutar(ast, env, gen) //si es prim numero trae el valor, //si es prim string trae temporal

	if o.Op_der != nil {
		op2 = o.Op_der.Ejecutar(ast, env, gen)
	}

	newTemp := gen.NewTemp()

	switch o.Operador {
	case "+":
		{
			dominante = suma_resta_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				gen.AddExpression(newTemp, op1.Value, op2.Value, "+")
				return environment.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else if dominante == environment.STRING {

			} else {
				fmt.Println("ERROR: No es posible sumar")
			}
		}
	case "-":
		{
			dominante = suma_resta_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "-")
				return environment.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}
			} else {
				fmt.Println("ERROR: No es posible restar")
			}
		}
	case "*":
		{
			dominante = multi_division_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "*")
				return environment.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}
			} else {
				fmt.Println("ERROR: No es posible Multiplicar")
			}

		}
	case "/":
		{
			dominante = multi_division_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "/")
				return environment.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}
			} else {
				fmt.Println("ERROR: No es posible Dividir")
			}

		}
	case "%":
		{
			dominante = multi_division_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER {

			} else if dominante == environment.FLOAT {

			} else {
				fmt.Println("ERROR: No es posible hacer modulo ")
			}

		}
	case "<":
		{
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER {

			} else if dominante == environment.FLOAT {

			} else {
				fmt.Println("ERROR: No es posible comparar <")
			}
		}
	case ">":
		{
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER {

			} else if dominante == environment.FLOAT {

			} else {
				fmt.Println("ERROR: No es posible comparar <")
			}
		}
	case "<=":
		{
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER {

			} else if dominante == environment.FLOAT {

			} else {
				fmt.Println("ERROR: No es posible comparar <")
			}
		}
	case ">=":
		{
			dominante = relacional_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER {

			} else if dominante == environment.FLOAT {

			} else {
				fmt.Println("ERROR: No es posible comparar <")
			}
		}
	case "==":
		{
			if op1.Type == op2.Type {

			} else {
				fmt.Println("ERROR: No es posible comparar == ", o.Lin, o.Col)
			}
		}
	case "!=":
		{
			if op1.Type == op2.Type {

			} else {
				fmt.Println("ERROR: No es posible comparar !=")
			}
		}
	case "&&":
		{
			if (op1.Type == environment.BOOLEAN) && (op2.Type == environment.BOOLEAN) {

			} else {
				fmt.Print("ERROR: tipo no compatible &&")
			}
		}
	case "||":
		{
			if (op1.Type == environment.BOOLEAN) && (op2.Type == environment.BOOLEAN) {

			} else {
				fmt.Println("ERROR: tipo no compatible ||")
			}
		}
	case "!":
		{
			if op1.Type == environment.BOOLEAN {

			} else {
				fmt.Println("ERROR: tipo no compatible !")
			}
		}
	case "MENOS_UNARIO":
		{
			if op1.Type == environment.INTEGER {

			} else if op1.Type == environment.FLOAT {

			} else {
				fmt.Println("ERROR: tipo no compatible -")
			}
		}
	}

	return environment.Value{}
}

func NewOperation(lin, col int, Op1 interfaces.Expression, Operador string, Op2 interfaces.Expression) Operation {
	exp := Operation{Lin: lin, Col: col, Op_izq: Op1, Operador: Operador, Op_der: Op2}
	return exp
}
