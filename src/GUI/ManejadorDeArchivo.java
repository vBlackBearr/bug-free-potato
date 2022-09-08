/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author JuanO
 */
public class ManejadorDeArchivo {
    File codigoSeleccionado;
    JFileChooser seleccionarCodigo;

    public  void cargarCodigo() {
        
        seleccionarCodigo = new JFileChooser();
        seleccionarCodigo.showOpenDialog(null);
        codigoSeleccionado = seleccionarCodigo.getSelectedFile();
        System.out.println("Archivo Seleccionado " + codigoSeleccionado);
        System.out.println("Path Actual " + seleccionarCodigo.getCurrentDirectory());
    }
    
}
