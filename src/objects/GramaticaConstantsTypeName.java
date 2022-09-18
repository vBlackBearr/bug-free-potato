/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package objects;

import Analizador.GramaticaConstants;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Luisp
 */
public interface GramaticaConstantsTypeName {

    final namenumobj ENTERO = new namenumobj(GramaticaConstants.ENTERO, "ENTERO");
    final namenumobj FLOTANTEDOUBLE = new namenumobj(GramaticaConstants.FLOTANTEDOUBLE, "FLOTANTEDOUBLE");
    final namenumobj CARACTER = new namenumobj(GramaticaConstants.CARACTER, "CARACTER");
    final namenumobj CADENA = new namenumobj(GramaticaConstants.CADENA, "CADENA");
    final namenumobj BOOLEAN = new namenumobj(GramaticaConstants.BOOLEAN, "BOOLEAN");

    final namenumobj[] AllTypes = {ENTERO, FLOTANTEDOUBLE, CARACTER, CADENA, BOOLEAN};
    
    
}
