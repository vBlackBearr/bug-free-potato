/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversor;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author TeamPotato:)
 */
public class Conversor {

    public static ArrayList<String> arrayInfijo = new ArrayList<String>();
    public static Stack pilaInfijo = new Stack();
    public static Stack pilaAuxiliar = new Stack();
    public static int tope = 0;
    public static String opc = "";
    public static String opc2 = " ";
    public static String prefijo = "";

    public static void main(String[] args) {
        boolean band = true;
        String infija = JOptionPane.showInputDialog("Dame infijo :");
        System.out.println(infija);
        System.out.println("Prefijo : ");
        StringTokenizer st = new StringTokenizer(infija, "/*-+^()", true);

        while (st.hasMoreTokens()) {
            opc = st.nextToken();
            pilaInfijo.push(opc);
        }

        while (!pilaInfijo.empty()) {
            if (band) {
                opc = (String) pilaInfijo.pop();
                band = false;
            }
            if (opc.matches("\\+") || opc.matches("-") || opc.matches("\\*") || opc.matches("/") || opc.matches("^") || opc.matches("\\(") || opc.matches("\\)")) { // Es un operador o paréntesis
                if (jerarquia(opc) > jerarquia(opc2)) {
                    pilaAuxiliar.push(opc);
                    opc2 = opc;
                    band = true;
                } else {
                    opc2 = (String) pilaAuxiliar.pop();
                    prefijo = opc2 + prefijo;
                    if (!pilaAuxiliar.empty()) {
                        opc2 = (String) pilaAuxiliar.pop();
                    } else {
                        opc2 = " ";
                    }

                }

            } else {//es un operando
                prefijo = opc + prefijo;
                band = true;

            }

        }

        prefijo = pilaAuxiliar.pop() + prefijo;

        System.out.println(prefijo);

    }

    public static int jerarquia(String elemento) {
        int res = 0;
        if (elemento.equals("\\^")) {
            System.out.println("AGRIA BANDAAAAAAAA");
        }
        switch (elemento.charAt(0)) {
            case '^':
                System.out.println("AAgria");
                res = 5;
                break;
            case '*':
                System.out.println("Multiplicacion");
                res = 4;
                break;
            case '/':
                System.out.println("Division");
                res = 4;
                break;
            case '+':
                System.out.println("Suma");
                res = 2;
                break;
            case '-':
                System.out.println("Resta");
                res = 2;
                break;
            default:
                System.out.println("Resta");
                res = 0;
                break;
        }
        return res;
    }

    public static void comparaJerarquía() {
        int topeAux = 0;
        String aux2 = (String) pilaAuxiliar.pop();
        prefijo = aux2 + prefijo;
        if (jerarquia(aux2) > tope) {
            pilaAuxiliar.push(opc);
            tope = jerarquia(opc);
        } else {
            comparaJerarquía();
        }

    }

}
