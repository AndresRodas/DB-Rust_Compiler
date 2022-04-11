package environment

import (
	arrayList "github.com/colegno/arraylist"
)

type Code struct {
	Main         *arrayList.List
	Instructions *arrayList.List
}

func NewCode(main *arrayList.List, inst *arrayList.List) Code {
	code := Code{Main: main, Instructions: inst}
	return code
}
