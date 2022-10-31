/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author TeamPotato:)
 */
public class typeTableInstance {

    private static typeTableInstance INSTANCE = null;

    private Hashtable<String, Integer> tabla = new Hashtable();

    private ArrayList<objRelacionDatoVar> tablaValores = new ArrayList<>();

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

    public void put(String image, int kind) {
        tabla.put(image, kind);
    }

    public Integer getType(String image) {
        try {
            int a = tabla.get(image);
            return a;

        } catch (Exception e) {
            return null;
        }

    }

//    public Object getValue(String image) {
//        return tablaValores.get(image);
//    }
    public void clearTable() {
        tabla = new Hashtable();
    }

    public boolean checkVariable(String var) {
        try {
            int kind = (Integer) tabla.get(var);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int getTipoVariable(String var) {
        try {
            int kind = (Integer) tabla.get(var);
            return kind;
        } catch (Exception e) {
            return 0;
        }
    }

    public void setValorVar(String img, Object obj) {
        if (checkVariable(img)) {
            if (existInTablaValores(img)) {
                objRelacionDatoVar ss = getFromTablaValores(img);
                ss.setDato(obj);
            } else {
                tablaValores.add(new objRelacionDatoVar(img, obj));
            }
        }
    }

    private boolean existInTablaValores(String ID) {
        for (objRelacionDatoVar ss : tablaValores) {
            if (ss.getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }

    public objRelacionDatoVar getFromTablaValores(String ID) {
        for (objRelacionDatoVar ss : tablaValores) {
            if (ss.getID().equals(ID)) {
                return ss;
            }
        }
        return null;
    }
}
