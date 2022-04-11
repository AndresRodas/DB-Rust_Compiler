package environment

type Value struct {
	Value      string
	IsTemp     bool
	Type       TipoExpresion
	TrueLabel  string
	FalseLabel string
}
