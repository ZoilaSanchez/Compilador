
package codigo;
import static codigo.Tokens.*;
%%
%class Lexico
%type Tokens
letrasma=[A-Z]
letrasmi=[a-z]
signo="_"
%{
    public String lexeme;
%}
%%

{signo}*({letrasmi}+)({letrasma}|{letrasmi})* {lexeme=yytext(); return Identificador;}
{letrasma}+({letrasmi}|{letrasma})* {lexeme=yytext(); return incorrecto;}
. {return error;}
