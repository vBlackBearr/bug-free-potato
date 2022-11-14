/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GUI;


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author TeamPotato:)
 */
public interface GramaticaConstantsTypeName {

    namenumobj INT = new namenumobj(GramaticaConstants.INT, "ENTERO");
    namenumobj FLOAT = new namenumobj(GramaticaConstants.FLOAT, "FLOTANTE");
    namenumobj CHAR = new namenumobj(GramaticaConstants.CHAR, "CARACTER");
    namenumobj STRING = new namenumobj(GramaticaConstants.STRING, "CADENA");

    namenumobj ENTERO = new namenumobj(GramaticaConstants.ENTERO, "ENTERO");
    namenumobj FLOTANTEDOUBLE = new namenumobj(GramaticaConstants.FLOTANTEDOUBLE, "FLOTANTEDOUBLE");
    namenumobj CARACTER = new namenumobj(GramaticaConstants.CARACTER, "CARACTER");
    namenumobj CADENA = new namenumobj(GramaticaConstants.CADENA, "CADENA");
    namenumobj BOOLEAN = new namenumobj(GramaticaConstants.BOOLEAN, "BOOLEAN");

    namenumobj[] AllTypes = {ENTERO, FLOTANTEDOUBLE, CARACTER, CADENA, BOOLEAN, INT, FLOAT, CHAR, STRING};

}
