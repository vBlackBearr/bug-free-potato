/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author TeamPotato:)
 */
public class ManejadorDeArchivo {
    File codigoSeleccionado;
    JFileChooser seleccionarCodigo;

    public void cargarCodigo() {
        
        seleccionarCodigo = new JFileChooser();
        seleccionarCodigo.showOpenDialog(null);
        codigoSeleccionado = seleccionarCodigo.getSelectedFile();
        System.out.println("Archivo Seleccionado " + codigoSeleccionado);
        System.out.println("Path Actual " + seleccionarCodigo.getCurrentDirectory());
    }
    
    public static void generarArchivo(String texto, String ruta) throws IOException{
        File file = new File(ruta);
        FileWriter fw = new FileWriter(file);
        fw.write(texto);
        fw.close();
    }
    
}
