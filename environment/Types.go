package environment

type TipoExpresion int

const (
	INTEGER  TipoExpresion = iota //0
	FLOAT                         //1
	STRING                        //2
	STR                           //3
	CHAR                          //4
	BOOLEAN                       //5
	ARRAY                         //6
	VECTOR                        //7
	STRUCT                        //8
	NULL                          //9
	WILDCARD                      //10
)
