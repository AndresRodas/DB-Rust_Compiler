package environment

import "github.com/colegno/arraylist"

type Value struct {
	Value        string
	IsTemp       bool
	Type         TipoExpresion
	ArrType      TipoExpresion
	TrueLabel    *arraylist.List
	FalseLabel   *arraylist.List
	OutLabel     *arraylist.List
	ReturnFlag   bool
	BreakFlag    bool
	ContinueFlag bool
	IntValue     int
}

func NewValue(Val string, tmp bool, typ TipoExpresion, ret, br, cont bool) Value {
	result := Value{
		Value:        Val,
		IsTemp:       tmp,
		Type:         typ,
		ArrType:      NULL,
		TrueLabel:    arraylist.New(),
		FalseLabel:   arraylist.New(),
		OutLabel:     arraylist.New(),
		ReturnFlag:   ret,
		BreakFlag:    br,
		ContinueFlag: cont,
		IntValue:     0,
	}
	return result
}
