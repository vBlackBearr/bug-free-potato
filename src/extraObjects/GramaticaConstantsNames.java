/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

import Analizador.GramaticaConstants;
import javax.swing.JOptionPane;

/**
 *
 * @author TeamPotato:)
 */
public class GramaticaConstantsNames implements GramaticaConstantsTypeName {

    public String getNameFromToken(int TokenKind) {
        for (namenumobj obj : AllTypes) {
            if (obj.token == TokenKind) {
                return obj.name;
            }
        }
        return "null";

    }
}
