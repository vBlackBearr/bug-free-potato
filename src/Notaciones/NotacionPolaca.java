/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notaciones;

import Analizador.GramaticaConstants;
import extraObjects.typeTableInstance;

/**
 *
 * @author TeamPotato:)
 */
public class NotacionPolaca {

    public String cadenaEvaluada = "";
    public double resultado;
    public int contador = 0;

    public String notacionPolaca(String infijo) {
        String[] operacion = infijo.split("=");
        contador++;
        ArbolBinarioExp ABE = new ArbolBinarioExp(operacion[1]);
        resultado = ABE.EvaluaExpresion();
        cadenaEvaluada = "- - - - - - - - - - - - - - - - - - - - - - - - - - -"
                + "\nOperación: " + contador
                + "\nInfija: " + operacion[1]
                + "\nPrefija: " + Conversion.conversionPrefijo(operacion[1]).toString()
                + "\nCuartiles: \nOper\tIzq\tDer\tResul\tVarTemp" + ABE.evaluacion
                + "\n" + operacion[0] + " = Resultado (T" + (ABE.contador - 1) + ") = " + resultado;
        if (typeTableInstance.getInstance().checkVariable(operacion[0])) {
            typeTableInstance.getInstance().setValorVar(operacion[0], resultado);
        }
        return cadenaEvaluada;

    }

    public void insertarValorAVar(String infijo) {
        String[] operacion = infijo.split("=");
        ArbolBinarioExp ABE = new ArbolBinarioExp(operacion[1]);
        resultado = ABE.EvaluaExpresion();
        if (typeTableInstance.getInstance().checkVariable(operacion[0])) {
            typeTableInstance.getInstance().setValorVar(operacion[0], resultado);
        }
    }
}
