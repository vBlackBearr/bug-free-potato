/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenguajee;

import Analizador.Gramatica;
import Analizador.ParseException;
import Analizador.TokenMgrError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanO
 */
public class Analizar {
    public String respuestaLexico ="";
    public String respuestaSintactico ="Sin errores";
    public void AnalizarCodigo(FileReader file){
        respuestaLexico ="";
        respuestaSintactico ="Sin errores";
        try {
            Gramatica parser = new Gramatica(new BufferedReader(file));
            parser.Inicio();
          
        } catch (ParseException e) {
            respuestaLexico="Ocurrió un error Sintáctico...";
            respuestaSintactico=e.getMessage();
        } catch(TokenMgrError e){
            respuestaLexico=e.getMessage();
            respuestaSintactico="Ocurrió un error léxico...";
        }
    
    }
    
}
