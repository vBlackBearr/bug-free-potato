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

    public static void main(String[] args) {
        /*Ejemplo de operacion 1 fue usado por el equipo CEDAJO y el resultado es 26.25*/
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Operacion 1:");
        String infijo = "7*4-(5.2+2)/4.2";
        System.out.println("Infija: " + infijo);
        String prefija = Conversion.conversionPrefijo(infijo).toString();
        System.out.println("Expresion prefija: " + prefija);
        System.out.println("Oper\tIzq\tDer\tResul\tVarTemp");
        ArbolBinarioExp ABE = new ArbolBinarioExp(infijo);
        System.out.println("Resultado: " + ABE.EvaluaExpresion());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Operacion 2:");
        String infijo2 = "2+(3-5)/1";
        System.out.println("Infija: " + infijo2);

        String prefija2 = Conversion.conversionPrefijo(infijo2).toString();
        System.out.println("Expresion prefija: " + prefija2);
        System.out.println("Oper\tIzq\tDer\tResul\tVarTemp");
        ArbolBinarioExp ABE2 = new ArbolBinarioExp(infijo2);
        System.out.println("Resultado: " + ABE2.EvaluaExpresion());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }
}
