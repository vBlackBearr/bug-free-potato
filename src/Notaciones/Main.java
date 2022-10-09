/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notaciones;

/**
 *
 * @author JuanO
 */
public class Main {
    public static void main(String[] args){
        NotacionPolaca np = new NotacionPolaca();
        String infijo="2+4/5*(5-3)*(4/8*9-9)";
        String operacion = np.notacionPolaca(infijo, "variables");
        System.out.println(operacion);
    }
}
