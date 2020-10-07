
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

TABULADOR = [\t]
TABULADORES = {TABULADOR}*
FINLINEA = [\r|\n|\r\n]
ESPACIOENBLANCO = " "


tipos=("entero"|"boolean"|"String"|"cadena")
variables=({letrasmi}+{signo}*{num}*)({letrasma}|{letrasmi}+|{num})*
%{
    public String lexeme;
    public int linea;
%}
%%
{tipos} {lexeme=yytext(); linea= yyline; return tipo;}
{variables} {lexeme=yytext(); return Identificador;}
"," {lexeme=yytext(); return opcional;}
"=" {lexeme=yytext(); return Asignacion;}
{letrasma}+({letrasmi}|{letrasma}|{num})*|{num}+({letrasmi}|{letrasma}|{num})* {return No;}

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

. {return error;}
