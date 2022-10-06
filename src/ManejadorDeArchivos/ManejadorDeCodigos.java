/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejadorDeArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;

/**
 *
 * @author TeamPotato:)
 */
public class ManejadorDeCodigos {
    File codigoSeleccionado;
    JFileChooser seleccionarCodigo;

    public String cargarCodigo() {
        seleccionarCodigo = new JFileChooser();
        seleccionarCodigo.showOpenDialog(null);
        codigoSeleccionado = seleccionarCodigo.getSelectedFile();
        System.out.println("Archivo Seleccionado " + codigoSeleccionado);
        System.out.println("Path Actual " + seleccionarCodigo.getCurrentDirectory());
        
        String contenido="";
        try {
            FileReader fr = new FileReader(codigoSeleccionado);
            BufferedReader br = new BufferedReader(fr);
            String txt;
            while((txt=br.readLine())!=null){
                contenido=contenido+txt;
            }
        } catch (Exception ex) {
            return "/- - - - - - - - Hubo un error - - - - - - - -/";
        
        }
        return contenido;
    }
    
}
