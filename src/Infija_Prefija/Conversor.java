/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infija_Prefija;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanO
 */
public class Conversor {
    public static ArrayList<String> arrayInfijo = new ArrayList<String>();
    public static Stack pilaInfijo = new Stack();
    public static Stack pilaAuxiliar = new Stack();
    public static int tope = 0;
    public static String opc="";
    public static String prefijo="";
    public static void main(String[] args) {
        
        String infija= JOptionPane.showInputDialog("Dame infijo :");
        System.out.println(infija);
        System.out.println("Prefijo : ");
        StringTokenizer st = new StringTokenizer(infija, "/*-+^()", true);
        
        
        
        while (st.hasMoreTokens()) {
            opc = st.nextToken();
            pilaInfijo.push(opc);
        }
        opc = (String) pilaInfijo.pop();
        while(!pilaInfijo.empty()){
            
            System.out.println(opc);
            if (opc.matches("\\+")||opc.matches("-")||opc.matches("\\*")||opc.matches("/")||opc.matches("^")||opc.matches("\\(")||opc.matches("\\)")) { // Es un operador o paréntesis
                if(jerarquia(opc)>tope){
                    pilaAuxiliar.push(opc);
                    tope=jerarquia(opc);
                    opc = (String) pilaInfijo.pop();
                    
                }else{
                    prefijo=((String) pilaAuxiliar.pop())+prefijo;
                    pilaAuxiliar.push(opc);
                    tope=jerarquia(opc);
                }
                
            } else {//es un operando
                prefijo=opc+prefijo;
            }
        }
        
            prefijo = pilaAuxiliar.pop() + prefijo;
        
        System.out.println(prefijo);
        
        
        
        
        
    }
 
    public static int jerarquia(String elemento) {
        int res = 5;
        if(elemento.equals("\\^")){
            System.out.println("AGRIA BANDAAAAAAAA");
        }
        switch (elemento) {
        case "\\^":
            System.out.println("AAgria");
            res = 5; break;
        case "*":
            System.out.println("AAgria222");
            res = 4; break;
        case "/":
            res = 4; break;
        case "+":
            res = 3; break;
        case "-":
            res = 3; break;
        }
        return res;
    }
    public static void comparaJerarquía(){
        
    }
    
}
