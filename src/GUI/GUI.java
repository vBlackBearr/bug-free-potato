/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.HeadlessException;
import lenguajee.Analizar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import extraObjects.logsAcumulatorInstance;
import extraObjects.typeTableInstance;

/**
 *
 * @author TeamPotato:)
 */
public class GUI extends javax.swing.JFrame {

    File selectedFile = null;
    JFileChooser seleccionarCodigo;
    Analizar an = new Analizar();
    public String muestraLexicos = "";

    /**
     * Creates new form GUI
     */
    public GUI() {
//        GramaticaTokenManager valores = new GramaticaTokenManager();
        initComponents();
        NumeroLinea tln = new NumeroLinea(txtArea_Editor);
        jScroll_Editor.setRowHeaderView(tln);
        txtArea_Editor.setText("");
        setLocationRelativeTo(null);
        logsAcumulatorInstance.getInstance().setGuiInstance(this);
        this.setExtendedState(MAXIMIZED_BOTH);
//        logsAcumulatorInstance.getInstance().addlexicLog
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScroll_Editor = new javax.swing.JScrollPane();
        txtArea_Editor = new javax.swing.JTextArea();
        lbl_Escribiendo = new javax.swing.JLabel();
        lbl_Respuesta = new javax.swing.JLabel();
        lbl_Codigo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        paneOutput = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSintactico = new javax.swing.JTextArea();
        jScroll_Respuesta = new javax.swing.JScrollPane();
        txtAreaLexico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSemantico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaNotacionPolaca = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        btnCompilar = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        jm_Lexico = new javax.swing.JMenuItem();
        jm_Sintactico = new javax.swing.JMenuItem();
        jm_CodInter = new javax.swing.JMenuItem();
        jm_Optimizacion1 = new javax.swing.JMenuItem();
        jm_Semantico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setSize(new java.awt.Dimension(1200, 760));

        txtArea_Editor.setColumns(20);
        txtArea_Editor.setRows(5);
        jScroll_Editor.setViewportView(txtArea_Editor);

        lbl_Escribiendo.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lbl_Escribiendo.setText("Escribiendo en:");

        lbl_Respuesta.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lbl_Respuesta.setText("Esperando respuesta...");

        lbl_Codigo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_Codigo.setText("(Sin Nombre)");

        jButton1.setText("jButton1");

        txtAreaSintactico.setColumns(20);
        txtAreaSintactico.setRows(5);
        jScrollPane1.setViewportView(txtAreaSintactico);

        txtAreaLexico.setEditable(false);
        txtAreaLexico.setColumns(20);
        txtAreaLexico.setRows(5);
        jScroll_Respuesta.setViewportView(txtAreaLexico);

        txtAreaSemantico.setColumns(20);
        txtAreaSemantico.setRows(5);
        jScrollPane2.setViewportView(txtAreaSemantico);

        jLabel1.setText("Lexico:");

        jLabel2.setText("Sintactico:");

        jLabel3.setText("Semantico:");

        jLabel4.setText("Notacion Polaca:");

        txtAreaNotacionPolaca.setColumns(20);
        txtAreaNotacionPolaca.setRows(5);
        jScrollPane3.setViewportView(txtAreaNotacionPolaca);

        javax.swing.GroupLayout paneOutputLayout = new javax.swing.GroupLayout(paneOutput);
        paneOutput.setLayout(paneOutputLayout);
        paneOutputLayout.setHorizontalGroup(
            paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(jScroll_Respuesta)
                    .addGroup(paneOutputLayout.createSequentialGroup()
                        .addGroup(paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneOutputLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(paneOutputLayout.createSequentialGroup()
                        .addGroup(paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneOutputLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneOutputLayout.setVerticalGroup(
            paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOutputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScroll_Respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(45, 45, 45)
                .addGroup(paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(29, 29, 29))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");
        fileMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fileMenu.setMargin(new java.awt.Insets(6, 10, 6, 10));

        openMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Abrir");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Guardar");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Guardar Como ...");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        btnCompilar.setMnemonic('e');
        btnCompilar.setText("Compilar");
        btnCompilar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCompilar.setMargin(new java.awt.Insets(6, 10, 6, 10));
        btnCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompilarMouseClicked(evt);
            }
        });
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        menuBar.add(btnCompilar);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Fases Compilacion");
        helpMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        helpMenu.setMargin(new java.awt.Insets(6, 10, 6, 10));

        jm_Lexico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jm_Lexico.setMnemonic('c');
        jm_Lexico.setText("Léxico");
        jm_Lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_LexicoActionPerformed(evt);
            }
        });
        helpMenu.add(jm_Lexico);

        jm_Sintactico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jm_Sintactico.setMnemonic('a');
        jm_Sintactico.setText("Sintactico");
        jm_Sintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_SintacticoActionPerformed(evt);
            }
        });
        helpMenu.add(jm_Sintactico);

        jm_CodInter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jm_CodInter.setMnemonic('a');
        jm_CodInter.setText("Código intermedio");
        helpMenu.add(jm_CodInter);

        jm_Optimizacion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jm_Optimizacion1.setMnemonic('a');
        jm_Optimizacion1.setText("Optimización");
        helpMenu.add(jm_Optimizacion1);

        jm_Semantico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jm_Semantico.setMnemonic('a');
        jm_Semantico.setText("Semantico");
        jm_Semantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_SemanticoActionPerformed(evt);
            }
        });
        helpMenu.add(jm_Semantico);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScroll_Editor, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Escribiendo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Codigo)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Respuesta)
                    .addComponent(paneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Respuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Escribiendo)
                            .addComponent(lbl_Codigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScroll_Editor)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        seleccionarCodigo = new JFileChooser();
        seleccionarCodigo.showOpenDialog(null);
        if (seleccionarCodigo.getSelectedFile() != null) {
            selectedFile = seleccionarCodigo.getSelectedFile();
            System.out.println("Archivo Seleccionado " + selectedFile.getName());
            System.out.println("Path Actual " + seleccionarCodigo.getCurrentDirectory());

            String contenido = "";
            try {
                FileReader fr = new FileReader(selectedFile);
                BufferedReader br = new BufferedReader(fr);
                String txt;
                while ((txt = br.readLine()) != null) {
                    contenido = contenido + txt + "\n";
                }
            } catch (Exception ex) {
                //Logger.getLogger(ManejadorDeArchivos.class.getName()).log(Level.SEVERE, null, ex);

            }
            txtArea_Editor.setText(contenido);
            lbl_Codigo.setForeground(Color.blue);
            lbl_Codigo.setText(selectedFile.getName());
        }

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        // TODO add your handling code here:
        guardarComo();
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jm_LexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_LexicoActionPerformed
        // TODO add your handling code here:
        if (seleccionarCodigo.getCurrentDirectory() == null) {
            JOptionPane.showMessageDialog(null, "No hay ningún codigo seleccionado");
        } else {
            String ruta = String.valueOf(seleccionarCodigo.getCurrentDirectory()) + "/" + selectedFile.getName();
            System.out.println(ruta);
            try {
                an.AnalizarCodigo(new FileReader(ruta));
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo");
            }

        }
    }//GEN-LAST:event_jm_LexicoActionPerformed

    private void jm_SintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_SintacticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_SintacticoActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnCompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompilarMouseClicked
        // TODO add your handling code here:
        logsAcumulatorInstance.getInstance().resetLogs();
        typeTableInstance.getInstance().clearTable();
        logsAcumulatorInstance.getInstance().reestablecerNp();
        analisis();
    }//GEN-LAST:event_btnCompilarMouseClicked

    private void jm_SemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_SemanticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_SemanticoActionPerformed

    public void setTxtAreaLexico(String texto) {
        txtAreaLexico.setText(texto);
    }

    public void setTxtAreaSintactico(String texto) {
        txtAreaSintactico.setText(texto);
    }

    public void setTxtAreaSemantico(String texto) {
        txtAreaSemantico.setText(texto);
    }
    
    public void setTxtAreaNotacionPolaca(String texto) {
        txtAreaNotacionPolaca.setText(texto);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCompilar;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScroll_Editor;
    private javax.swing.JScrollPane jScroll_Respuesta;
    private javax.swing.JMenuItem jm_CodInter;
    private javax.swing.JMenuItem jm_Lexico;
    private javax.swing.JMenuItem jm_Optimizacion1;
    private javax.swing.JMenuItem jm_Semantico;
    private javax.swing.JMenuItem jm_Sintactico;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_Escribiendo;
    private javax.swing.JLabel lbl_Respuesta;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel paneOutput;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextArea txtAreaLexico;
    private javax.swing.JTextArea txtAreaNotacionPolaca;
    private javax.swing.JTextArea txtAreaSemantico;
    private javax.swing.JTextArea txtAreaSintactico;
    private javax.swing.JTextArea txtArea_Editor;
    // End of variables declaration//GEN-END:variables

    public void analisis() {
        try {
            File file = crearArchivoConTexto(txtArea_Editor.getText());
            an.AnalizarCodigo(new FileReader(file));
//            txtAreaLexico.setText(an.respuestaLexico);
//            if(an.respuestaSintactico.equals("")){
//                txtAreaSintactico.setText("Sin errores sintacticos");
//            }else{
//                txtAreaSintactico.setText(an.respuestaSintactico);
//            }
//            
//            txtAreaSemantico.setText(an.respuestaSemantico);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error de analisis: " + ex);
        }
    }

    public void analisisSintactico() {

    }

    public void analisisSemantico() {
//        TokenAsignaciones sem = new TokenAsignaciones();
//        sem.checkAsing(TokenIzq, TokenAsig)
    }

    public File crearArchivoConTexto(String texto) {

        try {
            File file = new File("tmp/tmp.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
            return file;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al escribir en archivo TMP");
            return null;
        }

    }

    public void guardarComo() {
        try {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(null);
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            selectedFile = fc.getSelectedFile();
            if (selectedFile == null) {
                return;
            }
            guardar();
        } catch (HeadlessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en Guardar Como: " + ex);
        }
    }

    public void guardar() {
        if (selectedFile != null) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(selectedFile));
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error en Guardar: " + ex);
            }
        } else {
            guardarComo();
        }
    }

}
