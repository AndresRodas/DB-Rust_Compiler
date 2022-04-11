package environment

import (
	"fmt"
)

type Environment struct {
	Anterior interface{}
	Variable map[string]Symbol
	Id       string
	Size     int
}

func NewEnvironment(ant interface{}, ide string) Environment {
	return Environment{
		Anterior: ant,
		Variable: make(map[string]Symbol),
		Id:       ide,
		Size:     0,
	}
}

func (env Environment) SaveVariable(id string, value Symbol) {
	if variable, ok := env.Variable[id]; ok {
		fmt.Println("La variable "+id+" ya existe ", variable)
		return
	}
	env.Variable[id] = value
	env.Size = env.Size + 1
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
