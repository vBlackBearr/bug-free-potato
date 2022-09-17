/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

import java.util.ArrayList;

/**
 *
 * @author Luisp
 */
public class objTipoDatoCompatible {

    private ArrayList<Integer> IDs;
    private ArrayList<Integer> tiposCompatibles = new ArrayList();

    public objTipoDatoCompatible(ArrayList<Integer> IDs) {
        this.IDs = IDs;
    }

    /**
     * @return the ID
     */
    public ArrayList<Integer> getIDs() {
        return IDs;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(ArrayList<Integer> ID) {
        this.IDs = ID;
    }

    /**
     * @return the tiposCompatibles
     */
    public ArrayList<Integer> getTiposCompatibles() {
        return tiposCompatibles;
    }

    /**
     * @param tiposCompatibles the tiposCompatibles to set
     */
    public void setTiposCompatibles(ArrayList<Integer> tiposCompatibles) {
        this.tiposCompatibles = tiposCompatibles;
    }
    
    public void addCompatible(int tipo){
        tiposCompatibles.add(tipo);
    }
}
