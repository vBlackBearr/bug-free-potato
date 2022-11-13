/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luisp
 */
public class lineaDeclaracion {

    private String type;
    private List<objRelacionDatoVar> vars = new ArrayList<>();
    private int numLinea;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the vars
     */
    public List<objRelacionDatoVar> getVars() {
        return vars;
    }

    /**
     * @param vars the vars to set
     */
    public void setVars(List<objRelacionDatoVar> vars) {
        this.vars = vars;
    }

    public lineaDeclaracion(String type) {
        this.type = type;
    }

    public lineaDeclaracion(String type, objRelacionDatoVar var) {
        this.type = type;
        vars.add(var);
    }

    public lineaDeclaracion(String type, List<objRelacionDatoVar> vars) {
        this.type = type;
        vars.addAll(vars);
    }

    public void addVar(objRelacionDatoVar var) {
        this.getVars().add(var);
    }

    public void addVar(List<objRelacionDatoVar> vars) {
        this.getVars().addAll(vars);
    }

    public String getDeclarationLine() {
        if (!vars.isEmpty()) {
            String var = "";
            var = getVars().get(0).getID();
            if (getVars().get(0).getDato() != null) {
                var += " = " + getVars().get(0).getDato().toString();
            }
            for (int i = 1; i < getVars().size(); i++) {
                var += "," + getVars().get(i).getID();
                if (getVars().get(i).getDato() != null) {
                    var += " = " + getVars().get(i).getDato();
                }
            }
            return getType() + " " + var + ";";
        }
        return "";
    }

    /**
     * @return the numLinea
     */
    public int getNumLinea() {
        return numLinea;
    }

    /**
     * @param numLinea the numLinea to set
     */
    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }
}
