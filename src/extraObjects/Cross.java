/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

import GUI.GUI;
import java.awt.GridBagConstraints;
import java.io.Console;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author TeamPotato:)
 */
public class Cross extends JPanel {

    private JLabel L;
    private JButton B;
    private int size = 10;
    private GUI gui;

    public Cross(String title, GUI gui) {
        this.gui = gui;
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        L = new JLabel(title + " ");
        B = new JButton();
        B.setPreferredSize(new java.awt.Dimension(10, 10));
        B.setIcon(getImage());
        B.addActionListener(e -> gui.getTabbedPane().removeTabAt(gui.getTabbedPane().indexOfTab(title)));
        add(L, gbc);
        gbc.gridx++;
        gbc.weightx = 0;
        add(B, gbc);
    }

    private ImageIcon getImage() {
        java.awt.Image IMG = null;
        try {
            IMG = new ImageIcon(getClass().getResource("/img/cross.png")).getImage();
            IMG = IMG.getScaledInstance(size, size, java.awt.Image.SCALE_SMOOTH);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ImageIcon(IMG);
    }
}
