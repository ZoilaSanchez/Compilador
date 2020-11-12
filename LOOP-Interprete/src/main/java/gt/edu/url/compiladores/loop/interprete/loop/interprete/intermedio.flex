

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
noace=[0-9\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC\u0023\u0022\u0024\u003C\u003E\u003D\u003D\u0021\u003D\u0021\u0025\u0026\u0027\u002E\u002D\u002B\u003D\u005B\u005C\u005D\u005E\u0060\u007B\u007C\u007D\u003D\u007E\u00A1\u00B4\u003D\u00BF\u01C0\u01C3\u02C4\u003A]
noace2=[A-Z\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC\u0023\u0022\u0024\u003C\u003E\u003D\u003D\u0021\u003D\u0021\u0025\u0026\u0027\u002E\u002D\u002B\u003D\u005B\u005C\u005D\u005E\u0060\u007B\u007C\u007D\u003D\u007E\u00A1\u00B4\u003D\u00BF\u01C0\u01C3\u02C4\u003A]
simbolos=[\u0020\u0028\u0021\u0022\u0023\u0024\u0025\u0026\u0027\u0028\u0029\u002A\u002B\u002C\u002D\u002E\u003A\u003B\u003C\u002D\u002E\u002F\u0040\u005B\u005C\u005D\u005E\u0022\u005F\u007B\u007C\u007D\u007E\u00A1\u02B9\u00C3]
diago=[\u002F]
signo="_"
num=[0-9]
igual="="
coma=","
TABULADOR = [\t]
TABULADORES = {TABULADOR}*
FINLINEA = \r|\n|\r\n
ESPACIOENBLANCO = " "
fin=";"
comentario = [\u002F][\u002F][\u0020]*([\u0020]*|{num}*|{ace}*|{letrasma}*|{letrasmi}*|{noace}|{diago}|{simbolos})*
comn=[\u002A]({num}*|{ace}|{letrasma}|{letrasmi}|{noace}|{diago}|{simbolos})*
comini=[\u002F][\u002A]
comfin=[\u002A][\u002F]
comentarios = {comini}[\u0020]*([\u0020]*|{num}*|{ace}*|{letrasma}|{letrasmi}|{noace}|{diago}{simbolos}|{simbolos})*[\u0020]*{comfin}+
nocomentarios = {comini}({num}*|{ace}|{letrasma}|{letrasmi}|{noace}|{diago}{simbolos})*
retu="devolver"[\u0020]*
nocome=[\u002F]
enter = "-"?[0-9]+
real = "-"?[0-9]+("." [0-9]+)?
boleanos = "verdadero"|"falso"
nulo = "nulo"
Cadena =\u0022[a-zA-Z0-9" "_.\+\-@,\*\^\|&=/\[\]\{\}\(\)$#!\?><;:¿¡~\t´]*\u0022
NoNum = [a-zA-Z0-9_.]+
tipos=("entero"|"boolean"|"real"|"cadena")
variables={letrasmi}+({signo}*|{ace}|{letrasma}|{letrasmi}+|{num})*
clases={may}+({letrasmi}|{may})*|{may}+({letrasmi}*|{may}*)*("("")")*
menin={tipos}[\u0020]"Principal"[\u0020]"("({tipos}[\u0020]{variables})*")"
insta= {letrasmi}+"."{letrasmi}+(("()")|"("{tipos}[\u0020]({variables}|{num})+(","[\u0020]+{tipos}[\u0020]+({variables}|{num})*")")*)|"instanciar"[\u0020]{may}+({letrasmi}+|{may}+)*("("({num}*|{variables}*)*")")*
noclases={num}+{may}+{letrasmi}*({ace}*|{noace}*|{letrasmi}|{letrasma}|{num}|{diago}*|{simbolos})*
nova={num}+{noace2}*{diago}+({ace}*|{noace}*|{num}|{diago}*)*|({letrasmi}*{letrasma}*{noace}{diago}*)*{letrasmi}*{letrasma}*{diago}*
opera="="|"++"|"--"|"+"|"-"|"*"|"/"|"%"|"^"|">"|"<"|"=="|"!="
operalo="AND"|"OR"
fun={tipos}[\u0020]+{letrasmi}+({may}|{letrasmi})*("("[\u0020]*({tipos}[\u0020]*{variables})(","[\u0020]*{tipos}[\u0020]+{variables})*[\u0020]*")"|[\u0020]*"("")")[\u0020]*
estructura={tipos}{variables}({coma}{variables})*({ESPACIOENBLANCO}|{igual}{num}+|{fin})
pro=("privadas:"|"publicas:")
me=("privados:"|"publicos:")
parena="("
parenb=")"

palabrasReservadas = ("clase"|"propiedades"|"metodos"
    |"si"|"entonces"|"sino"|"devolver"|"constructor"|"escribir"|"leer"
    |"devolver"|"desde"|"mientras"|"incrementar"|"hacer"|"destructor"
    |"eliminar"|"extiende"|"incluir")

%{
    public String lexeme;
    public int linea;
%}
%%


"entero"                 {lexeme=yytext(); return new Symbol(sym.tipo_ent,yytext());}
"boolean"                 {lexeme=yytext(); return new Symbol(sym.tipo_bol,yytext());}
"real"                {lexeme=yytext(); return new Symbol(sym.tipo_real,yytext());}
"cadena"                 {lexeme=yytext(); return new Symbol(sym.tipo_cadena,yytext());}

{menin}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.principal,yytext());}
{pro}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.propiedades,yytext());}
{me}                    {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.metodos,yytext());}
{retu}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.retornar,yytext());}
{insta}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.instancias,yytext());}
"escribir"              {lexeme=yytext(); 
                        return new Symbol(sym.entrada,yytext());}
"leer"                  {lexeme=yytext(); 
                        return new Symbol(sym.salida,yytext());}
{boleanos}              {lexeme=yytext();  
                        return new Symbol(sym.boleano,yytext());}

{variables}             {lexeme=yytext(); 
                         return new Symbol(sym.identificador,yytext());}
","                     {lexeme=yytext(); 
                        return new Symbol(sym.coma,yytext());}
"="                     {lexeme=yytext(); 
                        return new Symbol(sym.asignacion,yytext());}
";"                     {lexeme=yytext(); 
                         return  new Symbol(sym.fin_de_linea,yytext());}
{opera}                  {lexeme=yytext(); 
                          return new Symbol(sym.operadores,yytext());}
{operalo}                {lexeme=yytext(); 
                         return new Symbol(sym.operador_Logico,yytext());}
{clases}                 {lexeme=yytext(); 
                         return new Symbol(sym.clases,yytext());}
{fun}                    {lexeme=yytext(); 
                         return new Symbol(sym.funcion,yytext());}


//Quité esto porque no debería ir en el archivo de tokens
{TABULADOR}             {}
{TABULADORES}           {}
{FINLINEA}              {return new Symbol(sym.newline,yytext());}
{ESPACIOENBLANCO}       {return new Symbol(sym.libre,yytext());}
{parena}       {return new Symbol(sym.para,yytext());}
{parenb}       {return new Symbol(sym.parb,yytext());}

{comentario}           {lexeme=yytext();  return new Symbol(sym.comentario,yytext());}
{comentarios}          {lexeme=yytext();  return new Symbol(sym.comentarios,yytext());}
{enter}               {lexeme=yytext();   return new Symbol(sym.entero,Integer.parseInt(yytext()));}
{real}                 {lexeme=yytext();  return new Symbol(sym.real,Double.parseDouble(yytext()));}
{nulo}                 {}
{Cadena}               {lexeme=yytext();  return new Symbol(sym.cadena,yytext());}


//Estos son los errores que consideramos
{NoNum}                 {lexeme=yytext();  
                        System.out.println("Error verificar "+yytext());
                        return new Symbol(sym.error);}
{noclases}              {lexeme=yytext();  
                        System.out.println("Error verificar "+yytext());
                        return new Symbol(sym.error);}

{nova}                  {lexeme=yytext();
                        return new Symbol(sym.error);}
                   
{nocomentarios}         {lexeme=yytext();
                        System.out.println("Error verificar "+yytext());
                        return new Symbol(sym.error);}
.                       { System.out.println("Error verificar "+yytext());
                        return new Symbol(sym.error);}
<<EOF>> {return new Symbol(sym.EOF ); }
