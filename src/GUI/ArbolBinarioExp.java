/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import GUI.GramaticaConstants;
import GUI.objRelacionDatoVar;
import GUI.typeTableInstance;
import javax.swing.JOptionPane;

/**
 *
 * @author TeamPotato:)
 */
public class ArbolBinarioExp {

    public String evaluacion = "\n";
    NodoArbol raiz;
    int contador = 1;

    public ArbolBinarioExp() {
        raiz = null;
        evaluacion = "\n";
    }

    public ArbolBinarioExp(String cadena) {
        raiz = creaArbolBE(cadena);
    }

    public void reiniciaArbol() {
        raiz = null;
    }

    public void creaNodo(Object dato) {
        raiz = new NodoArbol(dato);
    }

    public NodoArbol creaSubArbol(NodoArbol dato2, NodoArbol dato1, NodoArbol operador) {
        operador.izquierdo = dato1;
        operador.derecho = dato2;
        return operador;
    }

    public boolean arbolVacio() {
        return raiz == null;
    }

    public String preorden(NodoArbol subArbol, String c) {
        String cadena;
        cadena = "";
        if (subArbol != null) {
            cadena = c + subArbol.dato.toString() + " " + preorden(subArbol.izquierdo, c) + preorden(subArbol.derecho, c);
        }
        return cadena;
    }

    public String toString(int a) {
        String cadena = "";
        switch (a) {
            case 0:
                cadena = preorden(raiz, cadena);
                break;
            default:
                cadena = "Hubo un error";
                break;
        }
        return cadena;
    }

    private int prioridad(char c) {
        int p;
        switch (c) {
            case '+':
            case '-':
                p = 10;
                break;
            case '*':
            case '/':
                p = 20;
                break;
            case '^':
                p = 30;
                break;
            default:
                p = 0;
                break;
        }
        return p;
    }

    private boolean esOperador(char c) {
        boolean resultado;
        switch (c) {
            case '(':
            case ')':
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                resultado = true;
                break;
            default:
                resultado = false;
                break;
        }
        return resultado;

    }

    private NodoArbol creaArbolBE(String cadena) {
        PilaArbolExp PilaOperadores;
        PilaArbolExp PilaExpresiones;
        NodoArbol token;
        NodoArbol op1;
        NodoArbol op2;
        NodoArbol op;
        PilaOperadores = new PilaArbolExp();
        PilaExpresiones = new PilaArbolExp();
        char caracterEvaluado;
        for (int i = 0; i < cadena.length(); i++) {
            String s = "";
            caracterEvaluado = cadena.charAt(i);
            int j = 0;
            while (!esOperador(caracterEvaluado)) {
                s += caracterEvaluado;
                j++;
                if (i + j < cadena.length()) {
                    caracterEvaluado = cadena.charAt(i + j);
                } else {
                    break;
                }
            }

            if (!"".equals(s)) { //Es un operando
                i += j - 1;
                token = new NodoArbol(s);
                PilaExpresiones.insertar(token);
            } else {
                token = new NodoArbol(caracterEvaluado);
                switch (caracterEvaluado) {
                    case '(':
                        PilaOperadores.insertar(token);
                        break;
                    case ')':
                        while (!PilaOperadores.pilaVacia() && !PilaOperadores.topePila().dato.equals('(')) {
                            op2 = PilaExpresiones.quitar();
                            op1 = PilaExpresiones.quitar();
                            op = PilaOperadores.quitar();
                            op = creaSubArbol(op2, op1, op);
                            PilaExpresiones.insertar(op);
                        }
                        PilaOperadores.quitar();
                        break;

                    default:
                        while (!PilaOperadores.pilaVacia() && prioridad(caracterEvaluado) <= prioridad(PilaOperadores.topePila().dato.toString().charAt(0))) {
                            op2 = PilaExpresiones.quitar();
                            op1 = PilaExpresiones.quitar();
                            op = PilaOperadores.quitar();
                            op = creaSubArbol(op2, op1, op);
                            PilaExpresiones.insertar(op);
                        }
                        PilaOperadores.insertar(token);
                    //break;
                }
            }
        }
        while (!PilaOperadores.pilaVacia()) {
            op2 = PilaExpresiones.quitar();
            op1 = PilaExpresiones.quitar();
            op = PilaOperadores.quitar();
            op = creaSubArbol(op2, op1, op);
            PilaExpresiones.insertar(op);
        }
        op = PilaExpresiones.quitar();
        return op;
    }

    public double EvaluaExpresion() {
        return evalua(raiz);
    }

    private double evalua(NodoArbol subArbol) {

        double acum = 0;
        String dato = subArbol.dato.toString();
        if (!esOperador(dato.charAt(0))) {
            if (dato.matches("([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*")) {
                if (typeTableInstance.getInstance().checkVariable(dato)) {
                    objRelacionDatoVar dat = typeTableInstance.getInstance().getFromTablaValores(dato);
                    if (dat != null) {
                        return (Double) dat.getDato();
                    }
                    return 0;
                }
                return 0;
            } else {
                return Double.parseDouble(subArbol.dato.toString());
            }
        } else {
            switch (subArbol.dato.toString().charAt(0)) {
                case '^':
                    acum = acum + Math.pow(evalua(subArbol.izquierdo), evalua(subArbol.derecho));
                    evaluacion = evaluacion + subArbol.dato.toString() + "\t" + subArbol.izquierdo.dato + "\t"
                            + subArbol.derecho.dato + "\t" + acum + "\t" + "T" + contador + "\n";
                    subArbol.dato = "T" + contador;
                    contador++;
                    break;
                case '*':
                    acum = acum + evalua(subArbol.izquierdo) * evalua(subArbol.derecho);
                    evaluacion = evaluacion + subArbol.dato.toString() + "\t" + subArbol.izquierdo.dato + "\t"
                            + subArbol.derecho.dato + "\t" + acum + "\t" + "T" + contador + "\n";
                    subArbol.dato = "T" + contador;
                    contador++;
                    break;
                case '/':
                    acum = acum + evalua(subArbol.izquierdo) / evalua(subArbol.derecho);
                    evaluacion = evaluacion + subArbol.dato.toString() + "\t" + subArbol.izquierdo.dato + "\t"
                            + subArbol.derecho.dato + "\t" + acum + "\t" + "T" + contador + "\n";
                    subArbol.dato = "T" + contador;
                    contador++;
                    break;
                case '+':
                    acum = acum + evalua(subArbol.izquierdo) + evalua(subArbol.derecho);
                    evaluacion = evaluacion + subArbol.dato.toString() + "\t" + subArbol.izquierdo.dato + "\t"
                            + subArbol.derecho.dato + "\t" + acum + "\t" + "T" + contador + "\n";
                    subArbol.dato = "T" + contador;
                    contador++;
                    break;
                case '-':
                    acum = acum + evalua(subArbol.izquierdo) - evalua(subArbol.derecho);
                    evaluacion = evaluacion + subArbol.dato.toString() + "\t" + subArbol.izquierdo.dato + "\t"
                            + subArbol.derecho.dato + "\t" + acum + "\t" + "T" + contador + "\n";
                    subArbol.dato = "T" + contador;
                    contador++;
                    break;
            }
        }
        return acum;
    }
}
