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
        Operaciones oper = new Operaciones();
        String cadena = "(A+C/15.3)+(B/C/2+100)";
//        np.analizar(cadena);
//        System.out.println(cadena);
//        System.out.println(np.postfija);
oper.Asufijo(cadena, 0);
    }
    
}
