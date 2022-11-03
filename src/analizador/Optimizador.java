/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

import extraObjects.objRelacionDatoVar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author TeamPotato
 */
public class Optimizador {

    private static int lineIndex = 0;
    private static String[] line;
    private static ArrayList<objRelacionDatoVar> tablaValores = new ArrayList<>();
    private static objRelacionDatoVar lastVar;
    private static String code;

    private static final List<String> palabrasReservadas = Arrays.asList(
            "If",
            "Else",
            "While",
            "class",
            "Pack",
            "public",
            "private",
            "break",
            "do",
            "char",
            "string",
            "int",
            "float",
            "boolean",
            "Try",
            "Catch",
            "Super",
            "this",
            "Derivate",
            "return",
            "Final",
            "void",
            "null",
            "import",
            "true",
            "false",
            "For",
            "Switch",
            "Case",
            "principalMain",
            "double",
            "Except",
            "Default"
    );

    private Optimizador() {
    }

    public static String Optimizar(String texto) {
        texto = texto.replaceAll("/[*](\\S|\\n)*[*]/", "");
        ArrayList<String> textIn = convertirTextToArray(texto);
        String textOut = "";

        code = texto;

        //Analisis linea por linea
        for (int i = 0; i < textIn.size(); i++) {

            if (!textIn.get(i).equals("") && !textIn.get(i).matches("(\\s)+")) {
                textIn.set(i, textIn.get(i).replaceAll("//(\\S)*", ""));

                line = separarConCaracteresTokenizer(textIn.get(i));
                for (lineIndex = 0; lineIndex < line.length; lineIndex++) {
                    switch (line[lineIndex]) {
                        case "int":
                        case "double":
                        case "float":
                        case "string":
                        case "boolean":
                            if (lineIndex == 0) {
//                                decVar();
                                lineIndex++;
                                if (line.length > lineIndex) {
                                    String var;
                                    var = line[lineIndex];
//                                JOptionPane.showMessageDialog(null, var);
                                    if (isVar(var)) {
//                                    JOptionPane.showMessageDialog(null, "Var found");
//                                    lastVar = new objRelacionDatoVar(var, 0);
//                                    tablaValores.add(lastVar);
//                                    asig();
                                        if (!isUsed(var)) {
//                                        JOptionPane.showMessageDialog(null,"NO usage found");
                                            textIn.set(i, "");
                                        } else {
//                                        textOut += textIn.get(i) + "\n";
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            if (!isPalRes(line[lineIndex]) && isVar(line[lineIndex])) {
                                asig();
                            }
//                            textOut += textIn.get(i) + "\n";
                            break;
                    }
                }
                if (!"".equals(textIn.get(i))) {
                    textOut += textIn.get(i) + "\n";
                }

            }
        }

        return textOut;
    }

    private static boolean isUsed(String var) {
        String[] tokenList = separarConCaracteresTokenizer(code);
        for (int i = 0 + 1; i < tokenList.length; i++) {
            if (tokenList[i].equals(var)) {
                for (int j = i + 1; j < tokenList.length; j++) {
                    if (tokenList[j].equals(var)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static ArrayList<String> convertirTextToArray(String texto) {
        ArrayList<String> array = new ArrayList<>();
        String[] texto2 = texto.split("\n");
        for (int i = 0; i < texto2.length; i++) {
            array.add(texto2[i]);
        }
        return array;
    }

    private static void decVar() {
        lineIndex++;
        if (line.length > lineIndex) {
            String var = line[lineIndex];
            if (isVar(var)) {
                lastVar = new objRelacionDatoVar(var, 0);
                asig();
            }
        }
    }

    private static void asig() {
        lineIndex++;
        if (line.length > lineIndex) {
            if ("=".equals(line[lineIndex])) {
                expr();
            }
        }

    }

    private static void expr() {
        lineIndex++;
        if (line.length > lineIndex) {
            switch (line[lineIndex]) {
                case "(":
                    expr();
                    lineIndex++;
                    if (line.length > lineIndex && line[lineIndex].equals(")")) {
                        expr2();
                    }
                    break;
                default:

            }
        }
    }

    private static void expr2() {
        lineIndex++;
        if (line.length > lineIndex) {
            switch (line[lineIndex]) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    dato();
            }
        }
    }

    private static void dato() {
        lineIndex++;
        if (line.length > lineIndex) {
            if (isVar(line[lineIndex])) {
                reportVarUsage(line[lineIndex]);
            }

        }
    }

    private static String[] separarConCaracteresTokenizer(String cadena) {
        StringTokenizer st = new StringTokenizer(cadena, "=-+*/^; ()[]{}<>\n\t", true);
        ArrayList<String> cadenaArray = new ArrayList<>();
        while (st.hasMoreTokens()) {

            String parrafo = st.nextToken();
            if (!" ".equals(parrafo)) {
//                cadenaSeparada[i] = parrafo;
                cadenaArray.add(parrafo);
//                JOptionPane.showMessageDialog(null, parrafo);
            }
//            System.out.println(parrafo);
        }
        String[] cadenaSeparada = new String[cadenaArray.size()];
        for (int i = 0; i < cadenaArray.size(); i++) {
            cadenaSeparada[i] = cadenaArray.get(i);
        }

        return cadenaSeparada;
    }

    private static boolean isVar(String cadena) {
        return cadena.matches("([a-z]|[A-Z])([a-z]|[A-Z]|[1-9])*");
    }

    private static boolean isPalRes(String cadena) {
        return palabrasReservadas.contains(cadena);
    }

    private static void reportVarUsage(String image) {
        objRelacionDatoVar obj = getFromTablaValores(image);
        if (obj != null) {
            obj.setDato(1);
        }
    }

    private static objRelacionDatoVar getFromTablaValores(String id) {
        for (int i = 0; i < tablaValores.size(); i++) {
            if (tablaValores.get(i).getID().equals(id)) {
                return tablaValores.get(i);
            }
        }
        return null;
    }

}
