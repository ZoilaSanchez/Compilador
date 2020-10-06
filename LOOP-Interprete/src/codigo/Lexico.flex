
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


TABULADOR = [\t]
TABULADORES = {TABULADOR}*
FINLINEA = [\r|\n|\r\n]
ESPACIOENBLANCO = [\s]

{TABULADOR} {
    lexeme=yytext();
    return tabulador;
}
{TABULADORES} {
    lexeme=yytext();
    return tabuladores;
}
{FINLINEA} {
    lexeme=yytext();
    return finLinea;
}
{ESPACIOENBLANCO} {
    lexeme=yytext();
    return espacioBlanco;
}


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
