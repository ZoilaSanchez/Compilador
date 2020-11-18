

package gt.edu.url.compiladores.loop.interprete.loop.interprete;
import java_cup.runtime.Symbol; 
%%
%class intermedio
%line
%column
%cup
letrasma=[A-Z_\u00D1\u00C1\u00C9\u00CD\u00D3\u00DA\u00DC]
may=[A-Z]+
letrasmi=[a-z]+
ace=[\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC]
noace=[0-9\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC\u0023\u0022\u0024\u003C\u003E\u003D\u003D\u0021\u003D\u0021\u0025\u0026\u0027\u002D\u002B\u003D\u005C\u005E\u0060\u007C\u003D\u007E\u00A1\u00B4\u003D\u00BF\u01C0\u01C3\u02C4\u003A]
noace2=[A-Z\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC\u0023\u0022\u0024\u003C\u003E\u003D\u003D\u0021\u003D\u0021\u0025\u0026\u0027\u002D\u002B\u003D\u005C\u005E\u0060\u007C\u003D\u007E\u00A1\u00B4\u003D\u00BF\u01C0\u01C3\u02C4\u003A]
simbolos=[\u0020\u0021\u0022\u0023\u0024\u0025\u0026\u0027\u002A\u002B\u002C\u002D\u003A\u003B\u003C\u002D\u002F\u0040\u005C\u005E\u0022\u005F\u007C\u007E\u00A1\u02B9\u00C3]
diago=[\u002F]
signo="_"
num=[0-9]
igual="="
coma=","
TABULADOR = "    "
TABULADORES = {TABULADOR}*
FINLINEA = [\r|\n|\r\n]+
saltar="\t"
ESPACIOENBLANCO = " "
fin=";"
comentario = [\u002F][\u002F][\u0020]*([\u0020]*|{num}*|{ace}*|{letrasma}*|{letrasmi}*|{noace}|{diago}|{simbolos})*
comini=[\u002F][\u002A]
comfin=[\u002A][\u002F]
comentarios = {comini}([\u0020]*|[\u0020]|{num}|{ace}|{letrasma}|{letrasmi}|{noace}|{diago}|{simbolos}|{simbolos})*
comentariose = "*"([\u0020]+|[\u0020]|{num}|{ace}|{letrasma}|{letrasmi}|{noace}|{diago}|{simbolos}|{simbolos})*
retu="devolver "[\u0020]*
nocome=[\u002F]
enter = "-"?[0-9]+
real = "-"?[0-9]+("." [0-9]+)?
boleanos = "verdadero"|"falso"
nulo = "nulo"
Cadena =\u0022[a-zA-Z0-9" "_.\+\-@,\*\^\|&=/\[\]\{\}\(\)$#!\?><;:¿¡~\t´]*\u0022
NoNum = [a-zA-Z0-9_]+
tipos=("entero"|"boolean"|"real"|"cadena")
variables={letrasmi}+({signo}*|{ace}|{letrasma}|{letrasmi}+|{num})*
clases={may}+({letrasmi}|{may})*
menin={tipos}[\u0020]"Principal"[\u0020]"("({tipos}[\u0020]{variables})*")"
noclases={num}+{may}+{letrasmi}*({ace}*|{noace}*|{letrasmi}|{letrasma}|{num}|{diago}*|{simbolos})*
nova={num}+{noace2}*{diago}+({ace}*|{noace}*|{num}|{diago}*)*|({letrasmi}*{letrasma}*{noace}{diago}*)*{letrasmi}*{letrasma}*{diago}*
aumentos="++"|"--"
Solonum="+"|"*"|"-"|"/"|"%"|"^"
// para estructuras de if
condi="<"|">"|"%"
ambos="=="|"!="

CORa="["
CORb="]"
LLa="{"
LLb="}"
operalo="AND"|"OR"
Instanciars= {variables}"."{variables}
fun={tipos}[\u0020]+{letrasmi}+({may}|{letrasmi})*("("[\u0020]*({tipos}[\u0020]*{variables})(","[\u0020]*{tipos}[\u0020]+{variables})*[\u0020]*")"|[\u0020]*"("")")[\u0020]*
estructura={tipos}{variables}({coma}{variables})*({ESPACIOENBLANCO}|{igual}{num}+|{fin})
pro=("privadas:"|"publicas:")
me=("privados:"|"publicos:")
parena=[\u0028]
parenb=[\u0029]
SIGNO="+"|"-"
palabrasReservadas = ("propiedades"|"metodos"
    |"si"|"entonces"|"sino"|"devolver"|"constructor"|"escribir"|"leer"
    |"devolver"|"desde"|"mientras"|"incrementar"|"hacer"|"destructor"
    |"eliminar"|"extiende"|"incluir")
biblio= \u0022("../")*[a-zA-Z0-9" "_.\+\-@,\*\^\|&=/\[\]\{\}\(\)$#!\?><;:¿¡~\t´]*".loop"\u0022
%{
    public String lexeme;
    public int linea;
%}
%%


"entero"                 {lexeme=yytext(); return new Symbol(sym.tipo_ent,yytext());}
"cadenaAEntero"                 {lexeme=yytext(); return new Symbol(sym.tipo_ca,yytext());}
"cadenaAReal"                 {lexeme=yytext(); return new Symbol(sym.tipo_ca2,yytext());}
"cadenaABoleano"                 {lexeme=yytext(); return new Symbol(sym.tipo_ca3,yytext());}
"seno"                           {lexeme=yytext(); return new Symbol(sym.tipo_ca4,yytext());}
"coseno"                             {lexeme=yytext(); return new Symbol(sym.tipo_ca5,yytext());}
"tangente"                       {lexeme=yytext(); return new Symbol(sym.tipo_ca6,yytext());}
"logaritmo"                      {lexeme=yytext(); return new Symbol(sym.tipo_ca7,yytext());}
"raiz"                           {lexeme=yytext(); return new Symbol(sym.tipo_ca8,yytext());}
"constructor"                   {lexeme=yytext(); return new Symbol(sym.constru,yytext());}
"destructor"                {lexeme=yytext();       return new Symbol(sym.destruir,yytext());}
"eliminar "                {lexeme=yytext();                return new Symbol(sym.borrar,yytext());}
"boolean"                 {lexeme=yytext(); return new Symbol(sym.tipo_bol,yytext());}
"real"                {lexeme=yytext(); return new Symbol(sym.tipo_real,yytext());}
"cadena"                 {lexeme=yytext(); return new Symbol(sym.tipo_cadena,yytext());}
{clases}                  {lexeme=yytext(); return new Symbol(sym.IDmayu,yytext());}  
"clase"                {lexeme=yytext(); 
                         return new Symbol(sym.clase,yytext());}
"extiende"                     {lexeme = yytext();
                           return new Symbol(sym.herencia,yytext());} 
"escribir"              {lexeme=yytext(); 
                        return new Symbol(sym.entrada,yytext());}
"leer"                  {lexeme=yytext(); 
                        return new Symbol(sym.salida,yytext());}
"+"                  {lexeme=yytext(); 
                        return new Symbol(sym.SIG,yytext());}
"++"                  {lexeme=yytext(); 
                        return new Symbol(sym.SI,yytext());}
"--"                  {lexeme=yytext(); 
                        return new Symbol(sym.SIme,yytext());}
"-"                  {lexeme=yytext(); 
                        return new Symbol(sym.SIGme,yytext());}
"/"                  {lexeme=yytext(); 
                        return new Symbol(sym.SIGdiv,yytext());}
"%"                  {lexeme=yytext(); 
                        return new Symbol(sym.SIGpor,yytext());}
"^"                  {lexeme=yytext(); 
                        return new Symbol(sym.SIGex,yytext());}
","                     {lexeme=yytext(); 
                        return new Symbol(sym.coma,yytext());}
"."                     {lexeme=yytext(); 
                        return new Symbol(sym.pun,yytext());}
"="                     {lexeme=yytext(); 
                        return new Symbol(sym.asignacion,yytext());}
";"                     {lexeme=yytext(); 
                         return  new Symbol(sym.fin_de_linea,yytext());}
// estructura del If
"si "                {lexeme=yytext(); 
                         return new Symbol(sym.ifs,yytext());}
"entonces "                {lexeme=yytext(); 
                         return new Symbol(sym.entoncess,yytext());}
"sino "                {lexeme=yytext(); 
                         return new Symbol(sym.els,yytext());}
"estatico"                {lexeme=yytext(); 
                         return new Symbol(sym.estatico,yytext());}
// estructura de for

"desde"                {lexeme=yytext(); 
                         return new Symbol(sym.desdes,yytext());}
"mientras"                {lexeme=yytext(); 
                         return new Symbol(sym.whiles,yytext());}
"incrementar"                {lexeme=yytext(); 
                         return new Symbol(sym.sumarr,yytext());}
"decrementar"                {lexeme=yytext(); 
                         return new Symbol(sym.restarr,yytext());}
"hacer"                {lexeme=yytext(); 
                         return new Symbol(sym.haccer,yytext());}

{Solonum}                  {lexeme=yytext(); 
                          return new Symbol(sym.opnum,yytext());}

"incluir"                {lexeme=yytext(); 
                         return new Symbol(sym.paquetes,yytext());}
{biblio}               {lexeme=yytext(); 
                         return new Symbol(sym.extension,yytext());}
"instanciar "                {lexeme=yytext(); 
                         return new Symbol(sym.insta,yytext());}
//metodos funciones y palabras reservadas, comentarios


"Principal"                 {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.principal,yytext());}
"propiedades"                {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.propiedades,yytext());}
"publicas:"                {lexeme=yytext();  return new Symbol(sym.propu,yytext());}
"privadas:"                {lexeme=yytext();  return new Symbol(sym.propri,yytext());}
"protegidas:"                {lexeme=yytext();  return new Symbol(sym.propro,yytext());}
"publicos:"                {lexeme=yytext();  return new Symbol(sym.propum,yytext());}
"privados:"                {lexeme=yytext();  return new Symbol(sym.proprim,yytext());}
"protegidos:"                {lexeme=yytext();  return new Symbol(sym.proprom,yytext());}
"metodos"                   {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.metodos,yytext());}
"devolver "                {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.retornar,yytext());}

"*/"          {lexeme=yytext();  return new Symbol(sym.comfin,yytext());}
{boleanos}              {lexeme=yytext();  
                        return new Symbol(sym.boleano,yytext());}

{variables}             {lexeme=yytext(); 
                         return new Symbol(sym.identificador,yytext());}

{aumentos}                  {lexeme=yytext(); 
                          return new Symbol(sym.aumento,yytext());}
{Solonum}                  {lexeme=yytext(); 
                          return new Symbol(sym.opnum,yytext());}
{ambos}                  {lexeme=yytext(); 
                          return new Symbol(sym.opcadnum,yytext());}

{condi}                  {lexeme=yytext(); 
                          return new Symbol(sym.condicionales,yytext());}
{operalo}                {lexeme=yytext(); 
                         return new Symbol(sym.operador_Logico,yytext());}

//comernarios
"*"                     {lexeme=yytext();  return new Symbol(sym.porc,yytext());}
{comentario}           {lexeme=yytext();  return new Symbol(sym.comentario,yytext());}
{comentarios}          {lexeme=yytext();  return new Symbol(sym.comentarios,yytext());}
{comentariose}          {lexeme=yytext();  return new Symbol(sym.comentariose,yytext());}


// funciones especiales en el lenguaje



//Quité esto porque no debería ir en el archivo de tokens
{TABULADOR}             {return new Symbol(sym.tabu,yytext());}
{TABULADORES}           {}
{saltar}                {return new Symbol(sym.salto,yytext());}
{FINLINEA}              {return new Symbol(sym.newline,yytext());}
{ESPACIOENBLANCO}       {return new Symbol(sym.libre,yytext());}
{parena}       {return new Symbol(sym.para,yytext());}
{parenb}       {return new Symbol(sym.parb,yytext());}
{CORa}       {return new Symbol(sym.corchetea,yytext());}
{CORb}       {return new Symbol(sym.corcheteb,yytext());}
{LLa}       {return new Symbol(sym.llava,yytext());}
{LLb}       {return new Symbol(sym.llavb,yytext());}
{enter}               {lexeme=yytext();   return new Symbol(sym.entero,Integer.parseInt(yytext()));}
{real}                 {lexeme=yytext();  return new Symbol(sym.real,Double.parseDouble(yytext()));}
{Cadena}               {lexeme=yytext();  return new Symbol(sym.cadena,yytext());}


//Estos son los errores que consideramos
{NoNum}                 {lexeme=yytext();  
                        System.out.println("Error verificar "+yytext());
                        return new Symbol(sym.error);}

                   
.                       { System.out.println("Error verificar . "+yytext());
                        return new Symbol(sym.error);}
<<EOF>> {return new Symbol(sym.EOF ); }
