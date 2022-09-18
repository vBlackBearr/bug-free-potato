/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author Luisp
 */
public class GramaticaConstantsNames implements GramaticaConstantsTypeName{
    
    
    
    public String getNameFromToken(int TokenKind){
        for (int i = 0; i < AllTypes.length; i++) {
            namenumobj obj = AllTypes[i];
            if (obj.token == TokenKind){
                return obj.name;
            }
        }
        return "null";
               
    }
}
