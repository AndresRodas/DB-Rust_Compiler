package environment

import (
	arrayList "github.com/colegno/arraylist"
)

type AST struct {
	Main         *arrayList.List
	Instructions *arrayList.List
}

func NewAST(main *arrayList.List, inst *arrayList.List) AST {
	ast := AST{Main: main, Instructions: inst}
	return ast
}
