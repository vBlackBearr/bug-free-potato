/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

/**
 *
 * @author TeamPotato:)
 */
public class objRelacionDatoVar {
    private String ID;
    private Object Dato;

    public objRelacionDatoVar(String id, Object dato){
        this.ID = id;
        this.Dato = dato;
    }
    
    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the Dato
     */
    public Object getDato() {
        return Dato;
    }

    /**
     * @param Dato the Dato to set
     */
    public void setDato(Object Dato) {
        this.Dato = Dato;
    }
}
