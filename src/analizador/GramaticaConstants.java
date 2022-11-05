/* Generated By:JavaCC: Do not edit this line. GramaticaConstants.java */
/** Analizador de expresiones aritmeticas sencillas. */
package Analizador;


/** 
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface GramaticaConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int ENTER = 7;
  /** RegularExpression Id. */
  int IF = 8;
  /** RegularExpression Id. */
  int ELSE = 9;
  /** RegularExpression Id. */
  int WHILE = 10;
  /** RegularExpression Id. */
  int CLASS = 11;
  /** RegularExpression Id. */
  int PACK = 12;
  /** RegularExpression Id. */
  int PUBLIC = 13;
  /** RegularExpression Id. */
  int PRIVATE = 14;
  /** RegularExpression Id. */
  int BREAK = 15;
  /** RegularExpression Id. */
  int DO = 16;
  /** RegularExpression Id. */
  int CHAR = 17;
  /** RegularExpression Id. */
  int STRING = 18;
  /** RegularExpression Id. */
  int INT = 19;
  /** RegularExpression Id. */
  int FLOAT = 20;
  /** RegularExpression Id. */
  int BOOLEAN = 21;
  /** RegularExpression Id. */
  int TRY = 22;
  /** RegularExpression Id. */
  int CATCH = 23;
  /** RegularExpression Id. */
  int SUPER = 24;
  /** RegularExpression Id. */
  int THIS = 25;
  /** RegularExpression Id. */
  int DERIVATE = 26;
  /** RegularExpression Id. */
  int RETURN = 27;
  /** RegularExpression Id. */
  int FINAL = 28;
  /** RegularExpression Id. */
  int VOID = 29;
  /** RegularExpression Id. */
  int NULL = 30;
  /** RegularExpression Id. */
  int IMPORT = 31;
  /** RegularExpression Id. */
  int TRUE = 32;
  /** RegularExpression Id. */
  int FALSE = 33;
  /** RegularExpression Id. */
  int FOR = 34;
  /** RegularExpression Id. */
  int SWITCH = 35;
  /** RegularExpression Id. */
  int CASE = 36;
  /** RegularExpression Id. */
  int PRINMAIN = 37;
  /** RegularExpression Id. */
  int DOUBLE = 38;
  /** RegularExpression Id. */
  int EXCEPT = 39;
  /** RegularExpression Id. */
  int DEF = 40;
  /** RegularExpression Id. */
  int LLAVA = 41;
  /** RegularExpression Id. */
  int LLAVC = 42;
  /** RegularExpression Id. */
  int CORA = 43;
  /** RegularExpression Id. */
  int CORC = 44;
  /** RegularExpression Id. */
  int PAREA = 45;
  /** RegularExpression Id. */
  int PAREC = 46;
  /** RegularExpression Id. */
  int PYC = 47;
  /** RegularExpression Id. */
  int COMSIM = 48;
  /** RegularExpression Id. */
  int COM = 49;
  /** RegularExpression Id. */
  int PUNT = 50;
  /** RegularExpression Id. */
  int GUIONB = 51;
  /** RegularExpression Id. */
  int DOSP = 52;
  /** RegularExpression Id. */
  int MAYORQ = 53;
  /** RegularExpression Id. */
  int MENORQ = 54;
  /** RegularExpression Id. */
  int MAYORI = 55;
  /** RegularExpression Id. */
  int MENORI = 56;
  /** RegularExpression Id. */
  int IGUALI = 57;
  /** RegularExpression Id. */
  int DIFER = 58;
  /** RegularExpression Id. */
  int AND = 59;
  /** RegularExpression Id. */
  int OR = 60;
  /** RegularExpression Id. */
  int NOT = 61;
  /** RegularExpression Id. */
  int INCRE = 62;
  /** RegularExpression Id. */
  int DECRE = 63;
  /** RegularExpression Id. */
  int ASIG = 64;
  /** RegularExpression Id. */
  int SUMASIG = 65;
  /** RegularExpression Id. */
  int RESASIG = 66;
  /** RegularExpression Id. */
  int MULASIG = 67;
  /** RegularExpression Id. */
  int DIVASIG = 68;
  /** RegularExpression Id. */
  int MODASIG = 69;
  /** RegularExpression Id. */
  int SUMA = 70;
  /** RegularExpression Id. */
  int RESTA = 71;
  /** RegularExpression Id. */
  int DIVIS = 72;
  /** RegularExpression Id. */
  int POTEN = 73;
  /** RegularExpression Id. */
  int MODUL = 74;
  /** RegularExpression Id. */
  int MULTI = 75;
  /** RegularExpression Id. */
  int letraMay = 76;
  /** RegularExpression Id. */
  int letraMin = 77;
  /** RegularExpression Id. */
  int c = 78;
  /** RegularExpression Id. */
  int cinv = 79;
  /** RegularExpression Id. */
  int c2 = 80;
  /** RegularExpression Id. */
  int digito = 81;
  /** RegularExpression Id. */
  int ENTERO = 82;
  /** RegularExpression Id. */
  int FLOTANTEDOUBLE = 83;
  /** RegularExpression Id. */
  int CLASES = 84;
  /** RegularExpression Id. */
  int CARACTER = 85;
  /** RegularExpression Id. */
  int CADENA = 86;
  /** RegularExpression Id. */
  int VAR1 = 87;
  /** RegularExpression Id. */
  int FUNC = 88;
  /** RegularExpression Id. */
  int LIBR = 89;
  /** RegularExpression Id. */
  int ENTEROINV = 90;
  /** RegularExpression Id. */
  int FLOTDOBINV = 91;
  /** RegularExpression Id. */
  int CADENAINV = 92;
  /** RegularExpression Id. */
  int A = 93;
  /** RegularExpression Id. */
  int GRADOS = 94;
  /** RegularExpression Id. */
  int CPOR = 95;
  /** RegularExpression Id. */
  int PUNTOS = 96;
  /** RegularExpression Id. */
  int ACENTOI = 97;
  /** RegularExpression Id. */
  int ACENTO = 98;
  /** RegularExpression Id. */
  int BARRAI = 99;
  /** RegularExpression Id. */
  int ARROBA = 100;

  /** Lexical state. */
  int SALTO = 0;
  /** Lexical state. */
  int DEFAULT = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "<token of kind 4>",
    "<token of kind 5>",
    "\"\\n\"",
    "\"\\n\"",
    "\"If\"",
    "\"Else\"",
    "\"While\"",
    "\"class\"",
    "\"Pack\"",
    "\"public\"",
    "\"private\"",
    "\"break\"",
    "\"do\"",
    "\"char\"",
    "\"string\"",
    "\"int\"",
    "\"float\"",
    "\"boolean\"",
    "\"Try\"",
    "\"Catch\"",
    "\"Super\"",
    "\"this\"",
    "\"Derivate\"",
    "\"return\"",
    "\"Final\"",
    "\"void\"",
    "\"null\"",
    "\"import\"",
    "\"true\"",
    "\"false\"",
    "\"For\"",
    "\"Switch\"",
    "\"Case\"",
    "\"principalMain\"",
    "\"double\"",
    "\"Except\"",
    "\"Default\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\";\"",
    "\"\\\'\"",
    "\",\"",
    "\".\"",
    "\"_\"",
    "\":\"",
    "\">\"",
    "\"<\"",
    "\">=\"",
    "\"<=\"",
    "\"==\"",
    "\"<>\"",
    "\"AND\"",
    "\"OR\"",
    "\"NOT\"",
    "\"++\"",
    "\"--\"",
    "\"=\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "\"+\"",
    "\"-\"",
    "\"/\"",
    "\"^\"",
    "\"%\"",
    "\"*\"",
    "<letraMay>",
    "<letraMin>",
    "<c>",
    "<cinv>",
    "<c2>",
    "<digito>",
    "<ENTERO>",
    "<FLOTANTEDOUBLE>",
    "<CLASES>",
    "<CARACTER>",
    "<CADENA>",
    "<VAR1>",
    "<FUNC>",
    "<LIBR>",
    "<ENTEROINV>",
    "<FLOTDOBINV>",
    "<CADENAINV>",
    "\"\\u00aa\"",
    "\"\\u00ba\"",
    "\"\\u00e7\"",
    "\"\\u00a8\"",
    "\"`\"",
    "\"\\u00b4\"",
    "\"\\\\\"",
    "\"@\"",
  };

}
