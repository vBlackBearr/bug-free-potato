/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.HeadlessException;
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
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JTabbedPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author TeamPotato:)
 */
public class GUI extends javax.swing.JFrame {
    
    public String muestraLexicos = "";
    private final String URLFILEVENTANAS = "dataFiles/cache/openedWindows.tmp";
    private final String URLFILETMPEJECUTION = "dataFiles/tmp/tmp.tmp";

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
        logsAcumulatorInstance.getInstance().setGuiInstance(this);
        //Poner en modo pantalla completa
//        this.setExtendedState(MAXIMIZED_BOTH);
        NumeroLinea num = new NumeroLinea(txtCodigoOptimizado);
        jScrollPane_CodOp.setRowHeaderView(num);
        abrirArchivosEnCache();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Respuestas = new javax.swing.JPanel();
        lbl_Respuesta = new javax.swing.JLabel();
        txtTiempoEjecucion = new javax.swing.JLabel();
        jScrollPane_CodOp = new javax.swing.JScrollPane();
        txtCodigoOptimizado = new javax.swing.JTextArea();
        jScrollPane_Semantico = new javax.swing.JScrollPane();
        txtAreaSemantico = new javax.swing.JTextArea();
        jScrollPane_NotPol = new javax.swing.JScrollPane();
        txtAreaNotacionPolaca = new javax.swing.JTextArea();
        jScroll_Lexico = new javax.swing.JScrollPane();
        txtAreaLexico = new javax.swing.JTextArea();
        jScrollPane_Sintactico = new javax.swing.JScrollPane();
        txtAreaSintactico = new javax.swing.JTextArea();
        tabbedPane = new javax.swing.JTabbedPane();
        respuesta_NotPol = new javax.swing.JLabel();
        respuesta_Semantico = new javax.swing.JLabel();
        respuesta_Sintactico = new javax.swing.JLabel();
        respuesta_Lexico = new javax.swing.JLabel();
        respuesta_CodOp = new javax.swing.JLabel();
        respuesta_Lexico1 = new javax.swing.JLabel();
        respuesta_Sintactico1 = new javax.swing.JLabel();
        lblNuevoArchivo = new javax.swing.JLabel();
        lblAbrir = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();
        lblPotato = new javax.swing.JLabel();
        etiqueta_Fondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        btnCompilar = new javax.swing.JMenu();
        btnCompilar1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Potato: Equipo python");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 204, 204));
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1416, 701));
        setSize(new java.awt.Dimension(1710, 845));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Respuestas.setBackground(new java.awt.Color(255, 255, 255));
        panel_Respuestas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 3, true));

        lbl_Respuesta.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lbl_Respuesta.setText("Tiempo de ejecución: ");

        txtTiempoEjecucion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTiempoEjecucion.setText("Esperando ejecución...");

        javax.swing.GroupLayout panel_RespuestasLayout = new javax.swing.GroupLayout(panel_Respuestas);
        panel_Respuestas.setLayout(panel_RespuestasLayout);
        panel_RespuestasLayout.setHorizontalGroup(
            panel_RespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RespuestasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Respuesta)
                .addGap(2, 2, 2)
                .addComponent(txtTiempoEjecucion)
                .addGap(116, 116, 116))
        );
        panel_RespuestasLayout.setVerticalGroup(
            panel_RespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RespuestasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_RespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Respuesta)
                    .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(panel_Respuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 330, 40));

        jScrollPane_CodOp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));

        txtCodigoOptimizado.setEditable(false);
        txtCodigoOptimizado.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoOptimizado.setColumns(20);
        txtCodigoOptimizado.setRows(5);
        jScrollPane_CodOp.setViewportView(txtCodigoOptimizado);

        getContentPane().add(jScrollPane_CodOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, 290, 240));

        jScrollPane_Semantico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 255), 3));

        txtAreaSemantico.setEditable(false);
        txtAreaSemantico.setColumns(20);
        txtAreaSemantico.setRows(5);
        jScrollPane_Semantico.setViewportView(txtAreaSemantico);

        getContentPane().add(jScrollPane_Semantico, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 320, 150));

        jScrollPane_NotPol.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));

        txtAreaNotacionPolaca.setEditable(false);
        txtAreaNotacionPolaca.setColumns(20);
        txtAreaNotacionPolaca.setRows(5);
        jScrollPane_NotPol.setViewportView(txtAreaNotacionPolaca);

        getContentPane().add(jScrollPane_NotPol, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 110, -1, 190));

        jScroll_Lexico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtAreaLexico.setColumns(20);
        txtAreaLexico.setRows(5);
        jScroll_Lexico.setViewportView(txtAreaLexico);

        getContentPane().add(jScroll_Lexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 320, 140));

        jScrollPane_Sintactico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        txtAreaSintactico.setEditable(false);
        txtAreaSintactico.setColumns(20);
        txtAreaSintactico.setRows(5);
        jScrollPane_Sintactico.setViewportView(txtAreaSintactico);

        getContentPane().add(jScrollPane_Sintactico, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 320, 130));

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabbedPane.setName(""); // NOI18N
        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 640, 510));

        respuesta_NotPol.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        respuesta_NotPol.setForeground(new java.awt.Color(255, 255, 0));
        respuesta_NotPol.setText("Notacion Polaca:");
        getContentPane().add(respuesta_NotPol, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, 200, -1));

        respuesta_Semantico.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        respuesta_Semantico.setForeground(new java.awt.Color(255, 0, 255));
        respuesta_Semantico.setText("Semantico:");
        getContentPane().add(respuesta_Semantico, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 150, 21));

        respuesta_Sintactico.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        respuesta_Sintactico.setForeground(new java.awt.Color(255, 0, 0));
        respuesta_Sintactico.setText("Sintactico:");
        getContentPane().add(respuesta_Sintactico, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 150, -1));

        respuesta_Lexico.setBackground(new java.awt.Color(153, 153, 255));
        respuesta_Lexico.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        respuesta_Lexico.setText("Lexico:");
        getContentPane().add(respuesta_Lexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 90, -1));

        respuesta_CodOp.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        respuesta_CodOp.setForeground(new java.awt.Color(255, 153, 0));
        respuesta_CodOp.setText("Codigo Optimizado:");
        getContentPane().add(respuesta_CodOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 320, 240, -1));

        respuesta_Lexico1.setBackground(new java.awt.Color(153, 153, 255));
        respuesta_Lexico1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        respuesta_Lexico1.setForeground(new java.awt.Color(153, 153, 255));
        respuesta_Lexico1.setText("Lexico:");
        getContentPane().add(respuesta_Lexico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

        respuesta_Sintactico1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        respuesta_Sintactico1.setForeground(new java.awt.Color(255, 0, 0));
        respuesta_Sintactico1.setText("Sintactico:");
        getContentPane().add(respuesta_Sintactico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 150, -1));

        lblNuevoArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1969648.png"))); // NOI18N
        lblNuevoArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNuevoArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoArchivoMouseClicked(evt);
            }
        });
        getContentPane().add(lblNuevoArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        lblAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_abrir2.png"))); // NOI18N
        lblAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAbrirMouseClicked(evt);
            }
        });
        getContentPane().add(lblAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 70));

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icono-guardar2.png"))); // NOI18N
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 50));

        lblPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play2.png"))); // NOI18N
        lblPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayMouseClicked(evt);
            }
        });
        getContentPane().add(lblPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 50, 50));

        lblPotato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Patata.png"))); // NOI18N
        getContentPane().add(lblPotato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 0, 140, 110));

        etiqueta_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/fondo.png"))); // NOI18N
        getContentPane().add(etiqueta_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuBar.setBackground(new java.awt.Color(0, 0, 255));
        menuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuBar.setBorderPainted(false);

        fileMenu.setBackground(new java.awt.Color(204, 204, 204));
        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");
        fileMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fileMenu.setMargin(new java.awt.Insets(6, 10, 6, 10));

        newMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newMenuItem.setMnemonic('o');
        newMenuItem.setText("Nuevo");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newMenuItem);

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompilarMouseEntered(evt);
            }
        });
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        menuBar.add(btnCompilar);

        btnCompilar1.setMnemonic('e');
        btnCompilar1.setText("Optimizar");
        btnCompilar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCompilar1.setMargin(new java.awt.Insets(6, 10, 6, 10));
        btnCompilar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompilar1MouseClicked(evt);
            }
        });
        btnCompilar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilar1ActionPerformed(evt);
            }
        });
        menuBar.add(btnCompilar1);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        abrirArchivo();
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

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnCompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompilarMouseClicked
        // TODO add your handling code here:
        compilar();
    }//GEN-LAST:event_btnCompilarMouseClicked

    private void btnCompilar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompilar1MouseClicked
        // TODO add your handling code here:
        String text = getTextFromSelectedTab();
        txtCodigoOptimizado.setText(Optimizador.Optimizar(text));
    }//GEN-LAST:event_btnCompilar1MouseClicked

    private void btnCompilar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompilar1ActionPerformed

    private void btnCompilarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompilarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompilarMouseEntered

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        guardarVentanasAbiertas();
    }//GEN-LAST:event_formWindowClosing

    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed
        // TODO add your handling code here:
        nuevaPestaña();
    }//GEN-LAST:event_newMenuItemActionPerformed

    private void lblNuevoArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoArchivoMouseClicked
        // TODO add your handling code here:
        nuevaPestaña();
    }//GEN-LAST:event_lblNuevoArchivoMouseClicked

    private void lblAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbrirMouseClicked
        // TODO add your handling code here:
        abrirArchivo();
    }//GEN-LAST:event_lblAbrirMouseClicked

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayMouseClicked
        // TODO add your handling code here:
        compilar();
    }//GEN-LAST:event_lblPlayMouseClicked

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
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCompilar;
    private javax.swing.JMenu btnCompilar1;
    private javax.swing.JLabel etiqueta_Fondo;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane jScrollPane_CodOp;
    private javax.swing.JScrollPane jScrollPane_NotPol;
    private javax.swing.JScrollPane jScrollPane_Semantico;
    private javax.swing.JScrollPane jScrollPane_Sintactico;
    private javax.swing.JScrollPane jScroll_Lexico;
    private javax.swing.JLabel lblAbrir;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblNuevoArchivo;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblPotato;
    private javax.swing.JLabel lbl_Respuesta;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel panel_Respuestas;
    private javax.swing.JLabel respuesta_CodOp;
    private javax.swing.JLabel respuesta_Lexico;
    private javax.swing.JLabel respuesta_Lexico1;
    private javax.swing.JLabel respuesta_NotPol;
    private javax.swing.JLabel respuesta_Semantico;
    private javax.swing.JLabel respuesta_Sintactico;
    private javax.swing.JLabel respuesta_Sintactico1;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextArea txtAreaLexico;
    private javax.swing.JTextArea txtAreaNotacionPolaca;
    private javax.swing.JTextArea txtAreaSemantico;
    private javax.swing.JTextArea txtAreaSintactico;
    private javax.swing.JTextArea txtCodigoOptimizado;
    private javax.swing.JLabel txtTiempoEjecucion;
    // End of variables declaration//GEN-END:variables

    private void analisis() {
        try {
            File file = crearArchivoConTexto(getTextFromSelectedTab());
            Optimizar();
            long inicioEjecucion = System.currentTimeMillis();
            Gramatica parser = new Gramatica(new BufferedReader(new FileReader(file)));
            parser.Inicio();
            long finEjecucion = System.currentTimeMillis();
            txtTiempoEjecucion.setText(((double) (finEjecucion - inicioEjecucion) / 1000) + " segundos");

            //Poner los logs de compilacion en sus respectivos textArea's
            logsAcumulatorInstance ins = logsAcumulatorInstance.getInstance();
            setTxtAreaLexico(ins.getLexicLogs());
            setTxtAreaSintactico(ins.getSintacticLogs());
            setTxtAreaSemantico(ins.getSemanticLogs());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error de analisis: " + ex);
        } catch (ParseException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private File crearArchivoConTexto(String texto) {

        try {
            File file = new File(URLFILETMPEJECUTION);
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

    private void guardarComo() {
        try {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(null);
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            textEditorPane pane = (textEditorPane) (tabbedPane.getSelectedComponent());
            pane.file = fc.getSelectedFile();
            if (pane.file == null) {
                return;
            }
            tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), pane.file.getName());
            tabbedPane.repaint();
            guardar();
        } catch (HeadlessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en Guardar Como: " + ex);
        }
    }

    private void guardar() {
        textEditorPane pane = (textEditorPane) (tabbedPane.getSelectedComponent());
        File file = pane.file;
        if (file != null) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write(pane.getTextArea());
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error en Guardar: " + ex);
            }
        } else {
            guardarComo();
        }
    }

    private void abrirArchivosEnCache() {

        try {
            File file = new File(URLFILEVENTANAS);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            ArrayList<String> lineas = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                lineas.add(line);
            }
            for (String linea : lineas) {
                nuevaPestaña(linea);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void guardarVentanasAbiertas() {
        try {
            File file = new File(URLFILEVENTANAS);
            FileWriter fw = new FileWriter(file);
            String files = "";
            for (int i = 0; i < tabbedPane.getTabCount(); i++) {
                textEditorPane pane = (textEditorPane) tabbedPane.getComponentAt(i);
                if (pane.file != null) {
                    files += pane.file.getAbsolutePath() + "\n";
                }
            }
            fw.write(files);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error: " + ex);
        }
    }

    private String getText(String ruta) {
        String contenido = "";
        try {
            File file = new File(ruta);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String txt;
            while ((txt = br.readLine()) != null) {
                contenido = contenido + txt + "\n";
            }
            return contenido;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String getText(File file) {
        String contenido = "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String txt;
            while ((txt = br.readLine()) != null) {
                contenido = contenido + txt + "\n";
            }
            return contenido;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String getArchiveNameFromUbication(String ruta) {
        File file = new File(ruta);
        return file.getName();
    }

    private textEditorPane nuevaPestaña() {
        String nombre = "Nuevo Archivo";
        textEditorPane pane = new textEditorPane(nombre, null);
        int cont = 1;
        while (existArchivo(nombre)) {
            String[] split = nombre.split(cont + "");
            nombre = split[0];
            cont++;
            nombre += cont;
        }
        pane.name = nombre;
        tabbedPane.addTab(nombre, pane);
        int i = tabbedPane.indexOfTab(nombre);
        tabbedPane.setTabComponentAt(i, new Cross(tabbedPane.getTitleAt(i), this)); //agrega titulo y boton X.
        return pane;
    }

    private textEditorPane nuevaPestaña(String ruta) {
        textEditorPane pane = new textEditorPane();
        File file = pane.file = new File(ruta);
        if (file.exists()) {
            pane.setTextArea(getText(file));
            tabbedPane.addTab(file.getName(), pane);
            int i = tabbedPane.indexOfTab(file.getName());
            tabbedPane.setTabComponentAt(i, new Cross(tabbedPane.getTitleAt(i), this));
        }

        return pane;
    }

    private textEditorPane nuevaPestaña(File file) {
        String codigo = getText(file);
        textEditorPane pane = new textEditorPane();
        pane.file = file;
        pane.setTextArea(codigo);
        tabbedPane.addTab(file.getName(), pane);
        int i = tabbedPane.indexOfTab(file.getName());
        tabbedPane.setTabComponentAt(i, new Cross(tabbedPane.getTitleAt(i), this));
        return pane;
    }

    private String getTextFromSelectedTab() {
        textEditorPane pane = (textEditorPane) tabbedPane.getSelectedComponent();
        return pane.getTextArea();
    }

    private void setTextToSelectedTab(String text) {
        textEditorPane pane = (textEditorPane) tabbedPane.getSelectedComponent();
        pane.setTextArea(text);
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    private String getFileNameFromSelectedTab() {
        textEditorPane pane = (textEditorPane) tabbedPane.getSelectedComponent();
        if (pane.file != null) {
            return pane.file.getName();
        }
        if (pane.name != null) {
            return pane.name;
        }
        return "";
    }

    private boolean existArchivo(String nombre) {
        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
            textEditorPane pane = (textEditorPane) tabbedPane.getComponentAt(i);
            if (pane.name != null && pane.name.equals(nombre)) {
                return true;
            }
            if (pane.file != null && pane.file.getName().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    private void Optimizar() {
        String text = getTextFromSelectedTab();
        String textOpti = Optimizador.Optimizar(text);
        txtCodigoOptimizado.setText(textOpti);
        try {
            ManejadorDeArchivo.generarArchivo(textOpti, "output/Optimized_" + getFileNameFromSelectedTab());
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("img/Patata.png"));
        return retValue;
    }

    private void abrirArchivo() {
        JFileChooser codigo;
        codigo = new JFileChooser();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos Potato .ptt","ptt");
        codigo.setFileFilter(filter);
        codigo.setCurrentDirectory(new File("ejemplos"));
        codigo.showOpenDialog(null);
        if (codigo.getSelectedFile() != null) {
            File file = codigo.getSelectedFile();
            nuevaPestaña(file);
        }
    }

    private void compilar() {
        logsAcumulatorInstance.getInstance().resetLogs();
        typeTableInstance.getInstance().clearTable();
        logsAcumulatorInstance.getInstance().reestablecerNp();

        analisis();
        if (txtAreaSintactico.getText().equals("")) {
            txtAreaSintactico.setText("Sin Errores Sintacticos");
        }
        if (txtAreaSemantico.getText().equals("")) {
            txtAreaSemantico.setText("Sin Errores Semanticos");
        }
    }
}
