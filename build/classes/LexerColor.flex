import compilerTools.TextColor;
import java.awt.Color;

%%
%class LexerColor
%type TextColor
%char
%{
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
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
{Comentario} { return textColor(yychar, yylength(), new Color(146, 146, 146)); }
{EspacioEnBlanco} { /*Ignorar*/ }

{TerminadorDeLinea} { /*Ignorar*/ }


/* Identificador */
\#{Identificador} { return textColor(yychar, yylength(), new Color(135, 206, 250)); }

/* Tipos de dato */
dec |
ent |
ing |
cad { return textColor(yychar, yylength(), new Color(64, 224, 208)); }

/* Entero */
{ent} { return textColor(yychar, yylength(), new Color(64, 224, 208)); }

/* Decimal */
{dec} { return textColor(yychar, yylength(), new Color(64, 224, 208)); }

/* Ingrediente */
{ing} { return textColor(yychar, yylength(), new Color(64, 224, 208)); }

/* Cadenas */
{cad} { return textColor(yychar, yylength(), new Color(64, 224, 208)); }

/* Operadores de agrupación */
"(" { return textColor(yychar, yylength(), new Color(0, 191, 255)); }
")" { return textColor(yychar, yylength(), new Color(0, 191, 255)); }
"[" { return textColor(yychar, yylength(), new Color(0, 191, 255)); }
"]" { return textColor(yychar, yylength(), new Color(0, 191, 255)); }

/* Signos de puntuación */
"," { return textColor(yychar, yylength(), new Color(0, 191, 255)); }

/* Operador de asignación */
\<- { return textColor(yychar, yylength(), new Color(0, 191, 255)); }


/* Estructura si */
si |
sino { return textColor(yychar, yylength(), new Color(0, 191, 255)); }

/* Repetir */
hacer |
mientras { return textColor(yychar, yylength(), new Color(0, 191, 255)); }

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
mostrar { return textColor(yychar, yylength(), new Color(0, 191, 255)); }

// Identificador sin $
{Identificador} { /* Ignorar */ }
. { /* Ignorar */ }