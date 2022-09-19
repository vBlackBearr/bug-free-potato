/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

import java.util.Hashtable;

/**
 *
 * @author Luisp
 */
public class typeTableInstance {

    private static typeTableInstance INSTANCE = null;

    private Hashtable<String, Integer> tabla = new Hashtable();

    private typeTableInstance() {
    }

    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new typeTableInstance();
        }
    }

    public static typeTableInstance getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }

    /**
     * @return the tabla
     */
    public Hashtable<String, Integer> getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(Hashtable<String, Integer> tabla) {
        this.tabla = tabla;
    }
    
    public void put(String image, int kind){
        tabla.put(image, kind);
    }
    
    
    public Integer get(String image){
        return tabla.get(image);
    }
    
    public void clearTable(){
        tabla = new Hashtable();
    }
}
