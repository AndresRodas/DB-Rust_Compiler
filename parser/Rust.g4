parser grammar Rust;

options {
  tokenVocab = RustLexer;
}

@header {
    import arrayList "github.com/colegno/arraylist"
    import "OLC2/interfaces"
    import "OLC2/expressions"
    import "OLC2/instructions"
    import "OLC2/environment"
    import "strings"
}

start returns [environment.Code code]
  : e+=global_env* main e+=global_env*
    {
        global := arrayList.New()
        listInt := localctx.(*StartContext).GetE()
        for _, e := range listInt {
            global.Add(e.GetHi())
        }
        $code = environment.NewCode($main.mainInst, global)
    }
;

global_env returns [interfaces.Instruction hi]
: declaration PYC { $hi = $declaration.dec }
| function { }
| module {  }
| structCreation { }
;

module returns[ interfaces.Instruction mod ]
: MODULE ID LLAVEIZQ moduleContent LLAVEDER {  }
;

moduleContent returns[*arrayList.List m]
: mc=moduleContent PUB module {}
| mc=moduleContent PUB moduleAction { }
| mc=moduleContent module { }
| mc=moduleContent moduleAction {}
| PUB module {}
| PUB moduleAction {}
| module {}
| moduleAction { }
;

moduleAction returns [interfaces.Instruction ma]
: function { }
| structCreation { }
;


main returns [*arrayList.List mainInst]
: FUNC MAIN PARIZQ PARDER LLAVEIZQ block LLAVEDER { $mainInst = $block.blk }
;

instructions returns[*arrayList.List insts]
@init{
    $insts = arrayList.New()
  }
: e+=instruction+
{
        listInt := localctx.(*InstructionsContext).GetE()
        for _, e := range listInt {
            $insts.Add(e.GetInst())
        }
    }
;

instruction returns [interfaces.Instruction inst]
: impression PYC { $inst = $impression.pr }
| declaration PYC { $inst = $declaration.dec }
| assignment PYC { $inst = $assignment.ass }
| condIf { $inst = $condIf.ifCond }
| condMatch { $inst = $condMatch.mtch }
| loopWhile { $inst = $loopWhile.lw }
| loopBucle { $inst = $loopBucle.lb }
| loopForin { $inst = $loopForin.lfi }
| transBreak PYC { $inst = $transBreak.brk }
| transContinue PYC { $inst = $transContinue.cnt }
| transReturn { $inst = $transReturn.rt }
| structCreation { $inst = $structCreation.dec }
| insVectors PYC { $inst = $insVectors.iv }
;

insVectors returns[interfaces.Instruction iv]
: ID PUNTO PUSH PARIZQ expression PARDER { }
| ID PUNTO INSERT PARIZQ exp1=expression COMA exp2=expression PARDER { }
;

listParamsCall returns[*arrayList.List l]
: list=listParamsCall COMA expression{}
| list=listParamsCall COMA AMP MUT expression {}
| expression { }
| AMP MUT expression { }
|      { }
;

loopWhile returns[interfaces.Instruction lw]
: WHILE expression LLAVEIZQ block LLAVEDER { }
;

loopBucle returns[interfaces.Instruction lb]
: LOOP LLAVEIZQ block LLAVEDER {}
;

loopForin returns[interfaces.Instruction lfi]
: FOR ID IN expression LLAVEIZQ block LLAVEDER { }
;

transBreak returns[interfaces.Instruction brk]
: BREAK expression { }
| BREAK { }
;

transContinue returns[interfaces.Instruction cnt]
: CONTINUE { }
;

transReturn returns[interfaces.Instruction rt]
: RETURN expression PYC { }
| RETURN PYC{ }
| RETURN expression { }
| RETURN { }
;

condIf returns [ interfaces.Instruction ifCond ]
: IF expression LLAVEIZQ block LLAVEDER e+=condElseIf* condElse{ }
;

condElseIf returns [interfaces.Instruction elif]
: ELSE IF expression LLAVEIZQ block LLAVEDER { }
;

condElse returns [*arrayList.List blkelse]
: ELSE LLAVEIZQ block LLAVEDER { $blkelse = $block.blk }
| { $blkelse = arrayList.New() }
;

block returns[*arrayList.List blk]
@init{
    $blk = arrayList.New()
  }
: bloque=block instruction {
                            $bloque.blk.Add($instruction.inst)
                            $blk = $bloque.blk
                            }
| bloque=block expression {
                            $bloque.blk.Add($expression.p)
                            $blk = $bloque.blk
                           }
| instruction { $blk.Add($instruction.inst) }
| expression { $blk.Add($expression.p) }
;

condMatch returns [interfaces.Instruction mtch]
: MATCH expression LLAVEIZQ e+=listArms+ defaultArm LLAVEDER {}
;

listArms returns [interfaces.Instruction arms]
: listMatch ARROW2 block COMA{}
| listMatch ARROW2 LLAVEIZQ block LLAVEDER COMA {}
;

listMatch returns[*arrayList.List ma]
: lma=listMatch PLEC expression {}
| expression { }
;

defaultArm returns[*arrayList.List defa]
: UNDERSCORE ARROW2 block COMA { $defa = $block.blk }
| UNDERSCORE ARROW2 LLAVEIZQ block LLAVEDER COMA { $defa = $block.blk }
| { $defa = arrayList.New() }
;

impression returns [interfaces.Instruction pr]
: PRINT PARIZQ listParams PARDER { $pr = instructions.NewPrint($PRINT.line,$PRINT.pos,$listParams.l) }
;

declaration returns [interfaces.Instruction dec]
: LET MUT ID D_PTS types IGUAL expression   {}
| LET MUT ID IGUAL expression               {}
| LET ID D_PTS types IGUAL expression       {}
| LET ID IGUAL expression                   {}
| LET MUT ID D_PTS arrayType IGUAL expression {}
| LET ID D_PTS arrayType IGUAL expression   {}
| vectDeclaration { $dec = $vectDeclaration.vec }
;

vectDeclaration returns[interfaces.Instruction vec]
: LET ID D_PTS VECTOR2 MENOR types MAYOR IGUAL expression { }
| LET MUT ID D_PTS VECTOR2 MENOR types MAYOR IGUAL expression { }
| LET ID D_PTS VECTOR2 MENOR tipo=ID MAYOR IGUAL expression { }
| LET MUT ID D_PTS VECTOR2 MENOR tipo=ID MAYOR IGUAL expression { }
| LET ID D_PTS typeVect IGUAL expression { }
| LET MUT ID D_PTS typeVect IGUAL expression { }
;


typeVect returns[]
: VECTOR2 MENOR tv=typeVect MAYOR
| VECTOR2 MENOR types MAYOR
| VECTOR2 MENOR ID MAYOR
;



structCreation returns[interfaces.Instruction dec]
: STRUCT ID LLAVEIZQ listStructDec LLAVEDER { }
;

listStructDec returns[*arrayList.List l]
: list=listStructDec COMA id1=ID D_PTS types {}
| list=listStructDec COMA id1=ID D_PTS id2=ID {}
| list=listStructDec COMA id1=ID D_PTS arrayType {}
| id1=ID D_PTS types{}
| id1=ID D_PTS id2=ID {}
| id1=ID D_PTS arrayType {}
;

assignment returns [interfaces.Instruction ass]
: ID IGUAL expression { }
| listAccessStruct IGUAL expression { }
| ID listAccessArray IGUAL expression { }
| ID CORIZQ e1=expression CORDER listArrStr IGUAL e2=expression { }
;

listArrStr returns [*arrayList.List l]
: list=listArrStr PUNTO ID {}
| PUNTO ID {}
 ;

listAccessStruct returns[*arrayList.List l]
: list=listAccessStruct PUNTO ID {}
| ID {}
;

listAccessArray returns[*arrayList.List l]
: list=listAccessArray CORIZQ expression CORDER{}
| CORIZQ expression CORDER{}
;

arrayType returns [*arrayList.List t]
: CORIZQ arrayType PYC expression CORDER {}
| CORIZQ types PYC expression CORDER{}
| CORIZQ exp1=expression PYC exp2=expression CORDER{}
| CORIZQ types CORDER{}
;

function returns [ interfaces.Instruction fun ]
: FUNC ID PARIZQ listParamsFunc PARDER LLAVEIZQ block LLAVEDER {}
| FUNC ID PARIZQ listParamsFunc PARDER ARROW1 types LLAVEIZQ block LLAVEDER{}
| FUNC id1=ID PARIZQ listParamsFunc PARDER ARROW1 id2=ID LLAVEIZQ block LLAVEDER{}
| FUNC id1=ID PARIZQ listParamsFunc PARDER ARROW1 VECTOR2 MENOR id2=ID MAYOR LLAVEIZQ block LLAVEDER{}
;

listParamsFunc returns[*arrayList.List lpf]
: list=listParamsFunc COMA ID D_PTS types {}
| list=listParamsFunc COMA ID D_PTS AMP MUT arrayType {}
| list=listParamsFunc COMA id1=ID D_PTS AMP MUT VECTOR2 MENOR id2=ID MAYOR {}
| list=listParamsFunc COMA id1=ID D_PTS AMP MUT VECTOR2 MENOR types MAYOR {}
| list=listParamsFunc COMA ID D_PTS arrayType {}
| list=listParamsFunc COMA id1=ID D_PTS VECTOR2 MENOR id2=ID MAYOR  {}
| list=listParamsFunc COMA id1=ID D_PTS VECTOR2 MENOR types MAYOR  {}
| list=listParamsFunc COMA id1=ID D_PTS AMP MUT id2=ID { }
| list=listParamsFunc COMA id1=ID D_PTS id2=ID {}
| ID D_PTS types{ }
| ID D_PTS AMP MUT arrayType { }
| id1=ID D_PTS AMP MUT VECTOR2 MENOR id2=ID MAYOR {}
| id1=ID D_PTS AMP MUT VECTOR2 MENOR types MAYOR { }
| ID D_PTS arrayType { }
| id1=ID D_PTS VECTOR2 MENOR id2=ID MAYOR  { }
| id1=ID D_PTS VECTOR2 MENOR types MAYOR  { }
| id1=ID D_PTS AMP MUT id2=ID { }
| id1=ID D_PTS +(AMP MUT)? id2=ID {}
|  { $lpf = arrayList.New() }
;

types returns[environment.TipoExpresion ty]
: INT { $ty = environment.INTEGER }
| FLOAT { $ty = environment.FLOAT }
| BOOL { $ty = environment.BOOLEAN }
| CHAR { $ty = environment.CHAR }
| STR1 { $ty = environment.STRING }
| STR2 { $ty = environment.STR }
| VECTOR1 { $ty = environment.VECTOR }
| STRUCT { $ty = environment.STRUCT }
| USIZE { $ty = environment.INTEGER }
| ARRAY { $ty = environment.ARRAY }
;

listParams returns[*arrayList.List l]
: list=listParams COMA expression   {
                                        $list.l.Add($expression.p)
                                        $l = $list.l
                                     }
| expression {
                $l = arrayList.New()
                $l.Add($expression.p)
             }
;

callFunction returns[interfaces.Expression cf]
: ID PARIZQ listParamsCall PARDER PYC   { }
| ID PARIZQ listParamsCall PARDER       { }
;

expression returns[interfaces.Expression p]
: expr_arit { $p = $expr_arit.p }
| expuno=expression PUNTO PUNTO expdos=expression {}
;

expr_arit returns[interfaces.Expression p]
: SUB opDe=expr_arit {$p = expressions.NewOperation($SUB.line,$SUB.pos,$opDe.p,"MENOS_UNARIO",nil)}
| types C_PTS POW PARIZQ exp1=expression COMA exp2=expression PARDER { }
| types C_PTS POWF PARIZQ exp1=expression COMA exp2=expression PARDER { }
| opIz=expr_arit op=(MUL|DIV|MOD) opDe=expr_arit {$p = expressions.NewOperation($opIz.start.GetLine(),$opIz.start.GetColumn(),$opIz.p,$op.text,$opDe.p)}
| exp=expr_arit AS types { }
| exp=expr_arit PUNTO TOSTR { }
| exp=expr_arit PUNTO TOOWN { }
| exp=expr_arit PUNTO CLONE { }
| exp=expr_arit PUNTO ABS  { }
| exp=expr_arit PUNTO SQRT { }
| ID PUNTO REMOVE PARIZQ expression PARDER { }
| ID PUNTO REMOVE PARIZQ expression PARDER PYC { }
| ID PUNTO CAPACITY PARIZQ PARDER { }
| ex1=expr_arit PUNTO CONTAINS PARIZQ AMP ex2=expression PARDER { }
| exp=expr_arit PUNTO LEN PARIZQ PARDER { }
| opIz=expr_arit op=(ADD|SUB) opDe=expr_arit {$p = expressions.NewOperation($opIz.start.GetLine(),$opIz.start.GetColumn(),$opIz.p,$op.text,$opDe.p)}
| opIz=expr_arit op=(MENOR|MENORIGUAL|MAYORIGUAL|MAYOR|IG_IG|DIFERENTE) opDe=expr_arit {$p = expressions.NewOperation($opIz.start.GetLine(),$opIz.start.GetColumn(),$opIz.p,$op.text,$opDe.p)}
| NOT opDe=expr_arit {$p = expressions.NewOperation($NOT.line,$NOT.pos,$opDe.p,$NOT.text,nil)}
| opIz=expr_arit op=AND opDe=expr_arit {$p = expressions.NewOperation($opIz.start.GetLine(),$opIz.start.GetColumn(),$opIz.p,$op.text,$opDe.p)}
| opIz=expr_arit op=OR opDe=expr_arit {$p = expressions.NewOperation($opIz.start.GetLine(),$opIz.start.GetColumn(),$opIz.p,$op.text,$opDe.p)}
| expVectors { $p = $expVectors.ev }
| CORIZQ listParams CORDER { }
| ID LLAVEIZQ listStructExp LLAVEDER { }
| primitive { $p = $primitive.p }
| PARIZQ expression PARDER { $p = $expression.p }
| callFunction { $p = $callFunction.cf }
| callFunction PYC { $p = $callFunction.cf }
| callModule { $p = $callModule.cm }
| callModule PYC { $p = $callModule.cm }
| condIf { $p = $condIf.ifCond }
| condMatch { $p = $condMatch.mtch }
| loopBucle { $p = $loopBucle.lb }
| AMP exp=expr_arit { }
;

primitive returns[interfaces.Expression p]
: NUMBER{
            if (strings.Contains($NUMBER.text,".")){
                num,err := strconv.ParseFloat($NUMBER.text, 64);
                if err!= nil{
                    fmt.Println(err)
                }
                $p = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos, num,environment.FLOAT)
            }else{
                num,err := strconv.Atoi($NUMBER.text)
                if err!= nil{
                    fmt.Println(err)
                }
                $p = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.INTEGER)
            }
        }
| STRING {
             str := $STRING.text
             $p = expressions.NewPrimitive($STRING.line, $STRING.pos,str[1:len(str)-1],environment.STR)
         }
| CHARACTER {
            chr := $CHARACTER.text
            $p = expressions.NewPrimitive($CHARACTER.line, $CHARACTER.pos,chr[1:len(chr)-1],environment.CHAR)
            }
| TRU { $p = expressions.NewPrimitive($TRU.line, $TRU.pos,true,environment.BOOLEAN) }
| FAL { $p = expressions.NewPrimitive($FAL.line, $FAL.pos,false,environment.BOOLEAN) }
| list=listArray { $p = $list.p}
;

listArray returns[interfaces.Expression p]
: list = listArray CORIZQ expression CORDER { }
| list = listArray PUNTO ID { }
| ID { }
;

listStructExp returns[*arrayList.List l]
: list=listStructExp COMA ID D_PTS expression {}
| ID D_PTS expression{}
;

expVectors returns[interfaces.Expression ev]
: VECTOR1 CORIZQ listParams CORDER { }
| VECTOR1 CORIZQ listVec CORDER { }
| VECTOR2 C_PTS NEW PARIZQ PARDER { }
| VECTOR2 C_PTS WCAPACITY PARIZQ expression PARDER { }
;

listVec returns [interfaces.Expression lv]
: exp1=expression PYC exp2=expression { }
;

callModule returns[interfaces.Expression cm]
: listIdMod expression { }
;

listIdMod returns[*arrayList.List l]
: list=listIdMod ID C_PTS {}
| ID C_PTS {}
;
