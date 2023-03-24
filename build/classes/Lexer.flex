import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Tipo de Datos */
ent = {Digito}{Digito}*
dec = {ent}","{ent}
ing = {Letra}{Letra}*
cad = {Identificador}
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

{TerminadorDeLinea} { return token(yytext(), "FIN_LINEA", yyline, yycolumn); }

/* Identificador */
\#{Identificador} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }

/* Tipos de dato */
dec |
ent |
ing |
cad { return token(yytext(), "TIPO_DATO", yyline, yycolumn); }

/* Entero */
{ent} { return token(yytext(), "ENT", yyline, yycolumn); }

/* Decimal */
{dec} { return token(yytext(), "DEC", yyline, yycolumn); }

/* Ingrediente */
{ing} { return token(yytext(), "ING", yyline, yycolumn); }

/* Cadenas */
{cad} { return token(yytext(), "CAD", yyline, yycolumn); }

/* Operadores de agrupación */
"(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")" { return token(yytext(), "PARENTESIS_C", yyline, yycolumn); }
"[" { return token(yytext(), "CORCHETE_A", yyline, yycolumn); }
"]" { return token(yytext(), "CORCHETE_C", yyline, yycolumn); }

/* Signos de puntuación */
"," { return token(yytext(), "COMA", yyline, yycolumn); }

/* Operador de asignación */
\<- { return token (yytext(), "OP_ASIG", yyline, yycolumn); }

/* Estructura si */
si |
sino { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn); }

/* Repetir */
hacer |
mientras { return token(yytext(), "REPETIR", yyline, yycolumn); }

/* Palabras claves */
si |
sino |  
contrario |
mientras |
hacer |
para |
en |
principal |
retornar |
receta |
atributos |
utensilios |
tiempos |
pasos |
culturas |
leer |
mostrar { return token(yytext(), "PALABRA_CLAVE", yyline, yycolumn); }

/* Final */
final { return token(yytext(), "FINAL", yyline, yycolumn); }

/* Errores */

// Identificador sin #
{Identificador} { /*Ignorar*/ }

. { return token(yytext(), "ERROR", yyline, yycolumn); }