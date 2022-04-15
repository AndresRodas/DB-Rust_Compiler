package environment

import "github.com/colegno/arraylist"

type Value struct {
	Value      string
	IsTemp     bool
	Type       TipoExpresion
	TrueLabel  *arraylist.List
	FalseLabel *arraylist.List
}

func NewValue(Val string, tmp bool, typ TipoExpresion) Value {
	result := Value{
		Value:      Val,
		IsTemp:     tmp,
		Type:       typ,
		TrueLabel:  arraylist.New(),
		FalseLabel: arraylist.New(),
	}
	return result
}
