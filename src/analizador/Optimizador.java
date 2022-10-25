/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Luisp
 */
public class Optimizador {

    private Optimizador() {
    }

    public static String Optimizar(String texto) {
        texto = texto.replaceAll("/[*](\\S)*[*]/", "");
        ArrayList<String> textIn = convertirTextToArray(texto);
        String textOut = "";

        //Analisis linea por linea
        for (String linea : textIn) {
            if (!linea.equals("") && !linea.matches("(\\s)+")) {
                linea = linea.replaceAll("//(\\S)*", "");
                textOut += linea + "\n";
            }
        }
        return textOut;
    }

    private static ArrayList<String> convertirTextToArray(String texto) {
        ArrayList<String> array = new ArrayList<>();
        String[] texto2 = texto.split("\n");
        for (int i = 0; i < texto2.length; i++) {
            array.add(texto2[i]);
        }
        return array;
    }
}
