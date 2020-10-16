
package gt.edu.url.compiladores.loop.interprete.loop.interprete;
import static gt.edu.url.compiladores.loop.interprete.loop.interprete.Tokens.*;
%%
%class Lexico
%type Tokens
%line
letrasma=[A-Z_]
letrasmi=[a-z]+
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
tipos=("entero"|"boolean"|"String"|"cadena")
variables=({letrasmi}+{signo}*{num}*)({letrasma}|{letrasmi}+|{num})*
nova={letrasma}+({letrasmi}|{letrasma}|{num})*|{num}+({letrasmi}|{letrasma}|{num})*
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
