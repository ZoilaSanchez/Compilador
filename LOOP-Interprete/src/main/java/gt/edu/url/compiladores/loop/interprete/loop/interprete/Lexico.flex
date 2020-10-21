
package gt.edu.url.compiladores.loop.interprete.loop.interprete;
import static gt.edu.url.compiladores.loop.interprete.loop.interprete.Tokens.*;
%%
%class Lexico
%type Tokens
%line
letrasma=[A-Z_\u00D1\u00C1\u00C9\u00CD\u00D3\u00DA\u00DC]
may=[A-Z]+
letrasmi=[a-z]+
ace=[\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC]
noace=[0-9\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC\u0023\u0022\u0024\u003C\u003E\u003D\u003D\u0021\u003D\u0021\u0025\u0026\u0027\u002E\u002D\u002B\u003D\u005B\u005C\u005D\u005E\u0060\u007B\u007C\u007D\u003D\u007E\u00A1\u00B4\u003D\u00BF\u01C0\u01C3\u02C4\u003A]
noace2=[A-Z\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC\u0023\u0022\u0024\u003C\u003E\u003D\u003D\u0021\u003D\u0021\u0025\u0026\u0027\u002E\u002D\u002B\u003D\u005B\u005C\u005D\u005E\u0060\u007B\u007C\u007D\u003D\u007E\u00A1\u00B4\u003D\u00BF\u01C0\u01C3\u02C4\u003A]
simbolos=[\u0020\u0028\u0021\u0022\u0023\u0024\u0025\u0026\u0027\u0028\u0029\u002A\u002B\u002C\u002D\u002E\u003A\u003B\u003C\u002D\u002E\u002F\u0040\u005B\u005C\u005D\u005E\u0022\u005F\u007B\u007C\u007D\u007E\u00A1\u02B9]
diago=[\u002F]
signo="_"
num=[0-9]
igual="="
coma=","
TABULADOR = [\t]
TABULADORES = {TABULADOR}*
FINLINEA = [\r|\n|\r\n]
ESPACIOENBLANCO = " "
fin=";"
comentario = [\u002F][\u002F]([\u0020]*|{num}*|{ace}|{letrasma}*|{letrasmi}*|{noace}|{diago}|{simbolos})*
comn=[\u002A]({num}*|{ace}|{letrasma}|{letrasmi}|{noace}|{diago}|{simbolos})*
comini=[\u002F][\u002A]
comfin=[\u002A][\u002F]
comentarios = {comini}([\u0020]*|{num}*|{ace}|{letrasma}|{letrasmi}|{noace}|{diago}{simbolos})*{comfin}{comfin}*
nocomentarios = {comini}({num}*|{ace}|{letrasma}|{letrasmi}|{noace}|{diago}{simbolos})*
retu="devolver"[\u0020]*{num}
nocome=[\u002F]
enter = "-"?[0-9]+
real = "-"?[0-9]+("." [0-9]+)?
boleanos = "verdadero"|"falso"
nulo = "nulo"
Cadena ="cadena"[\u0020]\u0022[a-zA-Z0-9" "_.\+\-@,\*\^\|&=/\[\]\{\}\(\)$#!\?><;:¿¡~\t´]*\u0022
NoNum = [a-zA-Z0-9_.]+{simbolos}*
tipos=("entero"|"boolean"|"real"|"cadena")
variables=({letrasmi}+{signo}*{num}*)({ace}|{letrasma}|{letrasmi}+|{num})*
clases="clase"[\u0020]{may}+{letrasmi}*
insta= {letrasmi}+"."{letrasmi}+(("()")|"("{tipos}[\u0020]({variables}|{num})+(","[\u0020]+{tipos}[\u0020]+({variables}|{num})*")")*)
noclases=clases={num}*{may}+{letrasmi}*({ace}*|{noace}*|{letrasmi}|{letrasma}|{num}|{diago}*|{simbolos})*
nova={num}*{noace2}{diago}+({ace}*|{noace}*|{letrasmi}|{letrasma}|{num}|{diago}*)*|({letrasmi}*{letrasma}*{noace}{diago}*)*{letrasmi}*{letrasma}*{diago}*
opera="="|"++"|"--"|"+"|"-"|"*"|"/"|"%"|"^"|">"|"<"|"=="|"!="
operalo="AND"|"OR"
fun={tipos}[\u0020]+{letrasmi}+({may}|{letrasmi})*("("({tipos}[\u0020]+{variables})(","[\u0020]+{tipos}[\u0020]+{variables})*")"|"("")")
estructura={tipos}{variables}({coma}{variables})*({ESPACIOENBLANCO}|{igual}{num}+|{fin})
pro="propiedades"[\u0020]("privadas:"|"publicas:")
me="metodos"[\u0020]("privados:"|"publicos:")
tipovar={tipos}[\u0020]{variables}
%{
    public String lexeme;
    public int linea;
%}
%%

{tipos}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return tipo;}
{pro}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return propiedades;}
{me}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return metodos;}
{retu}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return retornar;}
{insta}                 {lexeme=yytext(); 
                        linea= yyline; 
                        return instancias;}
"escribir"              {lexeme=yytext(); 
                        return entrada;}

"leer"                  {lexeme=yytext(); 
                        return salida;}

{boleanos}              {lexeme=yytext();  
                       return boleano;}

{variables}             {lexeme=yytext(); 
                        return identificador;}

","                     {lexeme=yytext(); 
                        return opcional;}
";"                     {lexeme=yytext(); 
                        return fin_de_linea;}
{opera}                  {lexeme=yytext(); 
                         return operadores;}
{operalo}                {lexeme=yytext(); 
                         return operador_Logico;}
{clases}                 {lexeme=yytext(); 
                         return clases;}
{fun}                    {lexeme=yytext(); 
                         return funcion;}


//Quité esto porque no debería ir en el archivo de tokens
{TABULADOR}             {}
{TABULADORES}           {}
{FINLINEA}              {}
{ESPACIOENBLANCO}       {}

{comentario}           {lexeme=yytext();  return comentario;}
{comentarios}          {lexeme=yytext();  return comentarios;}
{enter}               {lexeme=yytext();  return inte;}
{real}                 {lexeme=yytext();  return real;}
{nulo}                 {}
{Cadena}               {lexeme=yytext();  return cadena;}


//Estos son los errores que consideramos
{NoNum}                 {lexeme=yytext();  
                        System.out.println("Error verificar "+yytext());
                        return nonu;}
{noclases}              {lexeme=yytext();  
                        System.out.println("Error verificar "+yytext());
                        return noclas;}

{nova}                  {lexeme=yytext();
                        System.out.println("Error verificar "+yytext());
                        return No;}
{nocomentarios}         {lexeme=yytext();
                        System.out.println("Error verificar "+yytext());
                        return nocom;}
.                       {System.out.println("Error verificar "+yytext());
                        return error;}
