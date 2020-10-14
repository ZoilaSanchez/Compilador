
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
tipos=("entero"|"boolean"|"String"|"cadena")
variables=({letrasmi}+{signo}*{num}*)({letrasma}|{letrasmi}+|{num})*
nova={letrasma}+({letrasmi}|{letrasma}|{num})*|{num}+({letrasmi}|{letrasma}|{num})*
estructura={tipos}{variables}({coma}{variables})*({ESPACIOENBLANCO}|{igual}{num}+|{fin})
%{
    public String lexeme;
    public int linea;
%}
%%
{estructura}            {lexeme=yytext(); linea= yyline; return correcto;}
{tipos}                 {lexeme=yytext(); linea= yyline; return tipo;}
{variables}             {lexeme=yytext(); return Identificador;}
","                     {lexeme=yytext(); return opcional;}
"="                     {lexeme=yytext(); return Asignacion;}
{nova}                  {lexeme=yytext();return No;}
{TABULADOR}             {lexeme=yytext(); return tabulador;}
{TABULADORES}           {lexeme=yytext();return tabuladores;}
{FINLINEA}              {lexeme=yytext();return finLinea;}
{ESPACIOENBLANCO}       {lexeme=yytext();return espacioBlanco;}
.                       {return error;}
