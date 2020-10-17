
package gt.edu.url.compiladores.loop.interprete.loop.interprete;
import static gt.edu.url.compiladores.loop.interprete.loop.interprete.Tokens.*;
%%
%class Lexico
%type Tokens
%line
letrasma=[A-Z_\u00D1\u00C1\u00C9\u00CD\u00D3\u00DA\u00DC]
letrasmi=[a-z]+
ace=[\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC]
noace=[0-9A-Z\u00F1\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC\u0023\u0022\u0024\u003C\u003E\u003D\u003D\u0021\u003D\u0021\u0025\u0026\u0027\u002E\u002D\u002B\u003D\u002F\u005B\u005C\u005D\u005E\u0060\u007B\u007C\u007D\u003D\u007E\u00A1\u00B4\u003D\u00BF\u01C0\u01C3\u02C4\u003A]

signo="_"
num=[0-9]
igual="="
coma=","
TABULADOR = [\t]
TABULADORES = {TABULADOR}*
FINLINEA = [\r|\n|\r\n]
ESPACIOENBLANCO = " "
fin=";"
comentario = "//"[a-zA-Z0-9" "_.\+\-@,\*\^\|&=/\[\]\{\}\(\)$#!\?><;:¿¡~\t´\\\"]*(\r|\n|\r\n)
comentarios = "/"\*[a-zA-Z0-9" "_.\+\-@,\*\^\|&=/\[\]\{\}\(\)$#!\?><;:¿¡~\t´\\\"\r\n(\r\n)]*\*"/"
entero = "-"?[0-9]+
real = "-"?[0-9]+("." [0-9]+)?
boleano = "verdadero"|"falso"
nulo = "nulo"
Cadena = \"[a-zA-Z0-9" "_.\+\-@,\*\^\|&=/\[\]\{\}\(\)$#!\?><;:¿¡~\t´]*\"
NoNum = [a-zA-Z0-9_.]+
tipos=("entero"|"boolean"|"real"|"cadena")
variables=({letrasmi}+{signo}*{num}*)({ace}|{letrasma}|{letrasmi}+|{num})*
nova={noace}+({ace}*|{noace}*|{letrasmi}|{letrasma}|{num})*|{num}+({letrasmi}|{letrasma}|{num})*|({letrasmi}*{letrasma}*{noace})*{letrasmi}*{letrasma}*
estructura={tipos}{variables}({coma}{variables})*({ESPACIOENBLANCO}|{igual}{num}+|{fin})
%{
    public String lexeme;
    public int linea;
%}
%%
{estructura}            {lexeme=yytext(); 
                         linea= yyline;
                         System.out.println("LEX:Correcto " + yytext());
                         return correcto;}

{tipos}                 {lexeme=yytext(); 
                        linea= yyline; 
                        System.out.println("LEX:Tipo " + yytext());
                        return tipo;}

"escribir"              {lexeme=yytext(); 
                        System.out.println("LEX:entrada " + yytext());
                        return entrada;}

"leer"                  {lexeme=yytext(); 
                        System.out.println("LEX:salida " + yytext());
                        return salida;}

{variables}             {lexeme=yytext(); 
                        System.out.println("LEX:Identificador " + yytext());
                        return Identificador;}

","                     {lexeme=yytext(); 
                        System.out.println("LEX:Opcional " + yytext());
                        return opcional;}

"="                     {lexeme=yytext(); 
                        System.out.println("LEX:Asignacion " + yytext());
                        return Asignacion;}

{nova}                  {lexeme=yytext();return No;}

//Quité esto porque no debería ir en el archivo de tokens
{TABULADOR}             {}
{TABULADORES}           {}
{FINLINEA}              {}
{ESPACIOENBLANCO}       {}

{comentario}          {System.out.println("comentario " + yytext());}
{comentarios}               {System.out.println("comentarios  " + yytext());}
{entero}               {System.out.println("Num " + yytext());}
{real}               {System.out.println("Flotante " + yytext());}
{boleano}               {System.out.println("Booleano " + yytext());}
{nulo}               {System.out.println("nulo " + yytext());}
{Cadena}               {System.out.println("Cadena " + yytext());}
{NoNum}               {System.out.println("No Num " + yytext());}
.                       {return error;}
