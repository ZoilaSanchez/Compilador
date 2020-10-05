
package codigo;
import static codigo.Tokens.*;
%%
%class Lexico
%type Tokens
%line
letrasma=[A-Z]
letrasmi=[a-z_]+
signo="_"
coma=","
igual="="
num=[0-9]
sim="'"
espa=[ ,\t,\r,\n]+ 
tipos=("entero"|"boolean"|"String"|"cadena")
variables=({letrasmi}+|{signo}+{num}*)({letrasma}|{letrasmi}+|{num}*)*
%{
    public String lexeme;
    public int linea;
%}
%%
{tipos} {lexeme=yytext(); linea= yyline; return tipo;}
{variables} {lexeme=yytext(); linea= yyline; return Identificador;}
"," {lexeme=yytext();return opcional;}
"=" {lexeme=yytext();return Asignacion;}
{letrasma}+({letrasmi}|{letrasma}|{num})*|{num}+({letrasmi}|{letrasma}|{num})* {return No;}
{espa} {/*Ignore*/}
. {return error;}
