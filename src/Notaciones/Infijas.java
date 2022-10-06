/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notaciones;

/**
 *
 * @author JuanO
 */
public class Infijas {
    public static void main(String[] args){
        NotacionPostFicaPrefija np = new NotacionPostFicaPrefija();
        String cadena = "3+8*2+1";
        np.analizar(cadena);
        System.out.println(np.postfija);
    }
    
}
