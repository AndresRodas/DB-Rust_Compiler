package environment

type ByReference struct {
	Exp interface{}
	Ref bool
}

func NewByReference(ex interface{}, ref bool) ByReference {
	exp := ByReference{Exp: ex, Ref: ref}
	return exp
}
