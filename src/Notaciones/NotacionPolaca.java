/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notaciones;

/**
 *
 * @author TeamPotato:)
 */
public class NotacionPolaca {

    public String cadenaEvaluada = "";
    public double resultado;
    public int contador = 0;

    public String notacionPolaca(String infijo, String variables) {
        contador++;
        ArbolBinarioExp ABE = new ArbolBinarioExp(infijo);
        //resultado = ABE.EvaluaExpresion();
        cadenaEvaluada = "- - - - - - - - - - - - - - - - - - - - - - - - - - -"
                + "\nOperación: " + contador
                + "\nInfija: " + infijo
                + "\nPrefija: " + Conversion.conversionPrefijo(infijo).toString()
                + "\nVariables: " + variables
                + "\nCuartiles: \nOper\tIzq\tDer\tResul\tVarTemp" //    + ABE.evaluacion
                + "\nResultado = " ;//+ resultado;
        return cadenaEvaluada;
    }
}
