package environment

import (
	"fmt"
)

type Environment struct {
	Anterior interface{}
	Variable map[string]Symbol
	Id       string
	Size     map[string]int
}

func NewEnvironment(ant interface{}, ide string) Environment {
	env := Environment{
		Anterior: ant,
		Variable: make(map[string]Symbol),
		Id:       ide,
		Size:     make(map[string]int),
	}
	env.Size["size"] = 0
	return env
}

func (env Environment) SaveVariable(id string, tipo TipoExpresion) Symbol {
	if variable, ok := env.Variable[id]; ok {
		fmt.Println("La variable "+id+" ya existe ", variable)
		return env.Variable[id]
	}
	env.Variable[id] = Symbol{Lin: 0, Col: 0, Id: id, Tipo: tipo, Posicion: env.Size["size"]}
	env.Size["size"] = env.Size["size"] + 1
	return env.Variable[id]
}

func (env Environment) GetVariable(id string) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Variable[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Id: "", Tipo: NULL}
}

func (env Environment) SetVariable(id string, value Symbol) Symbol {
	//value.Id = id
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Variable[id]; ok {
			tmpEnv.Variable[id] = value
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Id: "", Tipo: NULL}
}
