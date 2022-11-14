/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author TeamPotato:)
 */
public class objRelacionDatoVar {
    private String ID;
    private Object Dato;
    private boolean isUsed;

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

    /**
     * @return the isUsed
     */
    public boolean isIsUsed() {
        return isUsed;
    }

    /**
     * @param isUsed the isUsed to set
     */
    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
}
