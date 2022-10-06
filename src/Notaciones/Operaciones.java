/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanO
 */
public class Operaciones {

    public void Asufijo(String infijo, int longitud) {
        char p1[] = new char[longitud], p2[] = new char[longitud];
        int contp1 = 0, contp2 = 0;
        String sufijo = "";
        for (int i = 1; i < longitud; i++) {
            char tmp = infijo.charAt(i);
            switch (tmp) {
                case '(':
                    if (contp2 <= 0) {        //Si p2 está vacío mete operador
                        p2[contp2] = tmp;
                        contp2++;
                    } else {
                        p2[contp2] = tmp;
                        contp2++;
                    }
                    break;
                case '^':
                    if (contp2 <= 0) {        //Si p2 está vacío mete operador
                        p2[contp2] = tmp;
                        contp2++;
                    } else {
                        if (p2[contp2 - 1] == '^') {
                            for (int j = contp2; j > 0; j--) {    //Paso a p1
                                if (p2[contp2 - 1] == '(') {
                                    contp2 = j - 1;
                                } else {
                                    p1[contp1] = p2[j - 1];
                                    contp1++;
                                }
                            }
                            contp2++;
                            p2[contp2] = tmp;
                            contp2++;
                        } else {
                            p2[contp2] = tmp;
                            contp2++;
                        }
                    }
                    break;
                case '*':
                case '/':
                    if (contp2 <= 0) {        //Si p2 está vacío mete operador
                        p2[contp2] = tmp;
                        contp2++;
                    } else {
                        if (p2[contp2 - 1] == '(' || p2[contp2 - 1] == '-' || p2[contp2 - 1] == '+') {
                            p2[contp2] = tmp;
                            contp2++;
                        } else {
                            for (int j = contp2; j > 0; j--) {        //Paso a p1
                                if (p2[contp2 - 1] == '(') //Checa si comienzan operaciones anidadas
                                {
                                    contp2 = j - 1;
                                } else {
                                    p1[contp1] = p2[j - 1];
                                    contp1++;
                                }
                            }
                            contp2++;
                            p2[contp2] = tmp;
                            contp2++;
                        }
                    }
                    break;
                case '+':
                case '-':
                    if (contp2 <= 0) {        //Si p2 está vacío mete operador
                        p2[contp2] = tmp;
                        contp2++;
                    } else {
                        if (p2[contp2 - 1] == '(') {  //Checa si comienzan operaciones anidadas
                            p2[contp2] = tmp;
                            contp2++;
                        } else {
                            for (int j = contp2; j > 0; j--) {   //Si no son anidadas simplemente pasa a p1
                                if (p2[contp2 - 1] == '(') {
                                    contp2 = j - 1;
                                } else {
                                    p1[contp1] = p2[j - 1];
                                    contp1++;
                                }
                            }
                            contp2++;
                            p2[contp2] = tmp;
                            contp2++;
                        }
                    }
                    break;
                case ')':
                    if (contp2 <= 0) {       //Hace push de p2 a p1, solo si hay un solo operador
                        p2[contp2] = tmp;
                        contp2++;
                    } else {
                        for (int j = contp2; j > 0; j--) {    //Paso a p1
                            if (p2[contp2 - 1] == '(') {
                                contp2 = j - 1;
                            } else {
                                p1[contp1] = p2[j - 1];
                                contp1++;
                            }
                        }
                    }
                    break;
                default:
                    p1[contp1] = tmp;
                    contp1++;
                    break;
            }
        }
        for (int i = 0; i < longitud; i++) //Imprime el sufijo
        {
            sufijo += p1[i];
        }
        JOptionPane.showMessageDialog(null, sufijo);
    }
    public void Aprefijo(String infijo, int longitud){
            char p1[]=new char[longitud], p2[]=new char[longitud];
            String prefijo="";
            int contp1=0, contp2=0;
            for(int i=longitud-1;i>=0;i--){
                char tmp=infijo.charAt(i);
                switch(tmp){
                case '^':case')':
                    if(contp2<=0){      //Si p2 está vacio, mete el operador
                        p2[contp2]=tmp;
                        contp2++;
                        }
                        else{
                    p2[contp2]=tmp;
                    contp2++;
                    }break;
                case '/':case '*':
                    if(contp2<=0){      //Si p2 está vacio, mete el operador
                        p2[contp2]=tmp;
                        contp2++;
                        }
                        else{
                    if(p2[contp2-1]=='^'){
                        while(p2[contp2]-1=='^'){
                            for(int j=contp2; j>0; j--){    //Paso a p1
                                if(p2[contp2-1]==p2[contp2-2]){
                                    contp2=j-1; 
                                    j=0;
                                }
                                else{
                                    p1[contp1]=p2[j-1];
                                    contp1++;
                                }
                        contp2++;
                        }
                        p2[contp2]=tmp;
                        contp2++;
                        }
                    }
                    else{
                        p2[contp2]=tmp;
                        contp2++;
                    }
                }break;
                case '+':case '-':              
                    if(contp2<=0){          //Si no hay nada en p2, mete el operador
                        p2[contp2]=tmp;
                        contp2++;
                        }
                        else{
                    if(p2[contp2-1]==')'||p2[contp2-1]=='+'||p2[contp2-1]=='-'){
                        p2[contp2]=tmp;
                        contp2++;
                    }
                    else{
                        while(!(p2[i-1]==')'||p2[i-1]=='+'||p2[i-1]=='-')){
                            for(int j=contp2; j>0; j--){    //Paso a p1
                                if(p2[contp2-1]==p2[contp2-2]){
                                    contp2=j-1;
                                    j=0;
                                }
                                else{
                                    p1[contp1]=p2[j-1];
                                    contp1++;
                                }
                            contp2++;
                        }
                        p2[contp2]=tmp;
                        contp2++;
                        }
                    }
                }break;
                case '(':
                    if(contp2<=0){              //Si no hay nada agrega a p2
                        p2[contp2]=tmp;
                        contp2++;
                        }
                        else{
                    for(int j=contp2; j>0; j--){    //Paso a p1
                        if(p2[contp2-1]==')'){      //Si el de abajo de tmp es ')', baja el contador 
                            contp2=j-1;
                            j=0;
                        }
                        else{
                            p1[contp1]=p2[j-1];
                            contp1++;
                        }
                    }
                }break;
                default:p1[contp1]=tmp;          
                    contp1++;
                    break;
                }
                
            }
            for(int i=longitud-1; i>=0 ;i--)
                prefijo=""+prefijo+""+p1[i];
            System.out.println(prefijo);
            JOptionPane.showMessageDialog(null,prefijo);
        } 
}
