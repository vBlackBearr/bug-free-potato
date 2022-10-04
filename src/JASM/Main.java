/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JASM;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanO
 */
public class Main {

    public static void main(String[] args) {
       // String command = "cd C:\\Users\\JuanO\\Documents\\GitHub\\bug-free-potato\\src\\JASM";
        String command2 = "java Factorial";
        try {
            //Process p1 = Runtime.getRuntime().exec(command);
            Process p2 = Runtime.getRuntime().exec(command2);
            System.out.println(p2.getInputStream());
        } catch (IOException ex) {
            
        }

    }

}
