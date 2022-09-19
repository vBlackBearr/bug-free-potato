package analizador;

import Analizador.Token;
import java.io.PrintStream;
import java.util.Hashtable;
import java.lang.String;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import extraObjects.GramaticaConstantsNames;
import Analizador.GramaticaConstants;
import extraObjects.logsAcumulatorInstance;

public class TokenAsignaciones extends Error {

    public TokenAsignaciones() {

    }
    //Variable para validar asignaciones a caracteres(ichr)
    public int segunda = 0;
    //Tabla que almacenara los tokens declarados
    private Hashtable<String, Integer> tabla = new Hashtable();

    ArrayList<objTipoDatoCompatible> tiposVariablesComp;
    objTipoDatoCompatible enteroComp;
    objTipoDatoCompatible flotanteComp;
    objTipoDatoCompatible stringComp;
    objTipoDatoCompatible charComp;

    public void InsertarSimbolo(Token identificador, int tipo) {
        if (!checkVariable(identificador)) {
            tabla.put(identificador.image, tipo);
        }else{
            logsAcumulatorInstance.getInstance().addSemanticLog("Error: El identificador " + identificador.image + " Ya fue declarado \r\nLinea: " + identificador.beginLine);
        }
    }

    public void SetTables() {

        tiposVariablesComp = new ArrayList<>();

        ArrayList<Integer> IDsEntero = new ArrayList();

        //identificadores de un valor entero (variable o dato)
        IDsEntero.add(GramaticaConstants.INT);//variable entero
        IDsEntero.add(GramaticaConstants.ENTERO);//dato entreo
        enteroComp = new objTipoDatoCompatible(IDsEntero);
        enteroComp.addCompatible(GramaticaConstants.INT);//se agrega compatibilidad con una variable tipo entero
        enteroComp.addCompatible(GramaticaConstants.ENTERO);//se agrega compatibildad con un dato tipo entero
        tiposVariablesComp.add(enteroComp);

        //identificadores de un valor flotante (variable o dato)
        ArrayList<Integer> IDsFlotante = new ArrayList();
        IDsFlotante.add(GramaticaConstants.FLOAT);
        IDsFlotante.add(GramaticaConstants.FLOTANTEDOUBLE);
        flotanteComp = new objTipoDatoCompatible(IDsFlotante);
        flotanteComp.addCompatible(GramaticaConstants.INT);
        flotanteComp.addCompatible(GramaticaConstants.ENTERO);
        flotanteComp.addCompatible(GramaticaConstants.FLOAT);
        flotanteComp.addCompatible(GramaticaConstants.FLOTANTEDOUBLE);
        tiposVariablesComp.add(flotanteComp);

        ArrayList<Integer> IDsString = new ArrayList();
        IDsString.add(GramaticaConstants.STRING);
        IDsString.add(GramaticaConstants.CADENA);
        stringComp = new objTipoDatoCompatible(IDsString);
        stringComp.addCompatible(GramaticaConstants.STRING);
        stringComp.addCompatible(GramaticaConstants.CADENA);
        tiposVariablesComp.add(stringComp);

        ArrayList<Integer> IDsChar = new ArrayList();
        IDsChar.add(GramaticaConstants.CHAR);
        IDsChar.add(GramaticaConstants.CARACTER);
        charComp = new objTipoDatoCompatible(IDsChar);
        charComp.addCompatible(GramaticaConstants.CHAR);
        charComp.addCompatible(GramaticaConstants.CARACTER);
        tiposVariablesComp.add(charComp);
    }

    public String checkAsing(Token TokenIzq, Token TokenAsig) {
//        JOptionPane.showMessageDialog(null, TokenIzq.image + " " + TokenIzq.kind + "    " + TokenAsig.image + " " + TokenAsig.kind);
        int tipoVar1 = 0;
        int tipoVar2 = 0;

//        JOptionPane.showMessageDialog(null, TokenIzq.image + " - " + TokenIzq.kind + "  |  " + TokenAsig.image + " - " + TokenAsig.kind);
        if (TokenIzq.kind == GramaticaConstants.VAR) {
            if (!checkVariable(TokenIzq)) {
                return "Error: El identificador " + TokenIzq.image + " No ha sido declarado \r\nLinea: " + TokenIzq.beginLine;
            } else {
                tipoVar1 = getTipoVariable(TokenIzq);
//                JOptionPane.showMessageDialog(null,tipoVar1);
            }

        } else {
            tipoVar1 = TokenIzq.kind;
        }

        if (TokenAsig.kind == GramaticaConstants.VAR) {
            if (!checkVariable(TokenAsig)) {
                return "Error: El identificador " + TokenIzq.image + " No ha sido declarado \r\nLinea: " + TokenIzq.beginLine;
            } else {
                tipoVar2 = getTipoVariable(TokenAsig);
            }
        } else {
            tipoVar2 = TokenAsig.kind;
        }

        objTipoDatoCompatible tipo = null;
        for (objTipoDatoCompatible var : tiposVariablesComp) {
//            JOptionPane.showMessageDialog(null, var.getIDs() + " : " + var.getTiposCompatibles());
            for (Integer ID : var.getIDs()) {
                if (ID.equals(tipoVar1)) {
                    tipo = var;
                    break;
                }
            }
            if (tipo != null) {
                break;
            }
        }
        if (tipo == null) {
            return "Error: Problema con el identificador " + TokenIzq.image + "\r\nLinea: " + TokenIzq.beginLine;
        }

        GramaticaConstantsNames names = new GramaticaConstantsNames();
//        JOptionPane.showMessageDialog(null, tipoVar1);
        if (!tipo.getTiposCompatibles().contains(tipoVar2)) {
            return "Error: No se puede convertir " + TokenAsig.image + " a " + names.getNameFromToken(tipoVar1) + " \r\nLinea: " + TokenIzq.beginLine;
        }
//        return "Sin errores semanticos";
        return "";
    }

    public boolean checkVariable(Token checkTok) {
        try {
//            JOptionPane.showMessageDialog(null, checkTok.image);

//            JOptionPane.showMessageDialog(null, "Tabla: " + tabla);
            int kind = (Integer) tabla.get(checkTok.image);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int getTipoVariable(Token token) {
        try {
            int kind = (Integer) tabla.get(token.image);
            return kind;
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "fsdsvvse");
            return 0;
        }
    }

}
