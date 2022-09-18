package analizador;

import Analizador.Token;
import java.io.PrintStream;
import java.util.Hashtable;
import java.lang.String;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objects.GramaticaConstantsNames;
import Analizador.GramaticaConstants;

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


    //Listas que guardaran los tipos compatibles de las variables
//    private ArrayList<Integer> enteroComp = new ArrayList();
//    private ArrayList<Integer> flotanteComp = new ArrayList();
//    private ArrayList<Integer> stringComp = new ArrayList();
//    private ArrayList<Integer> charComp = new ArrayList();
    public void InsertarSimbolo(Token identificador, int tipo) {
        //En este metodo se agrega a la tabla de tokens el identificador que esta siendo declarado junto con su tipo de dato
        tabla.put(identificador.image, tipo);
    }

    public void SetTables() {
        /*En este metodo se inicializan las tablas, las cuales almacenaran los tipo de datos compatibles con:		
		 entero = intComp
		 decimal = flotanteComp
		 cadena = stringComp
		 caracter = charComp
         */

        tiposVariablesComp = new ArrayList<>();

        ArrayList<Integer> IDs = new ArrayList();

        //identificadores de un valor entero (variable o dato)
        IDs.add(GramaticaConstants.INT);//variable entero
        IDs.add(GramaticaConstants.ENTERO);//dato entreo
        enteroComp = new objTipoDatoCompatible(IDs);
        enteroComp.addCompatible(GramaticaConstants.INT);//se agrega compatibilidad con una variable tipo entero
        enteroComp.addCompatible(GramaticaConstants.ENTERO);//se agrega compatibildad con un dato tipo entero
        tiposVariablesComp.add(enteroComp);

        //identificadores de un valor flotante (variable o dato)
        IDs.add(GramaticaConstants.FLOAT);
        IDs.add(GramaticaConstants.FLOTANTEDOUBLE);
        flotanteComp = new objTipoDatoCompatible(IDs);
        flotanteComp.addCompatible(GramaticaConstants.INT);
        flotanteComp.addCompatible(GramaticaConstants.ENTERO);
        flotanteComp.addCompatible(GramaticaConstants.FLOAT);
        flotanteComp.addCompatible(GramaticaConstants.FLOTANTEDOUBLE);
        tiposVariablesComp.add(flotanteComp);

        IDs.add(15);
        IDs.add(81);
        stringComp = new objTipoDatoCompatible(IDs);
        stringComp.addCompatible(15);
        stringComp.addCompatible(81);
        tiposVariablesComp.add(stringComp);

        IDs.add(16);
        IDs.add(82);
        charComp = new objTipoDatoCompatible(IDs);
        charComp.addCompatible(16);
        charComp.addCompatible(82);
        tiposVariablesComp.add(charComp);


//        enteroComp.add(17);//variable tipo entero
//        enteroComp.add(78);//dato entero
//
//        flotanteComp.add(17);//variable tipo entero
//        flotanteComp.add(18);//variable tipo flotante
//        flotanteComp.add(78);//dato entero
//        flotanteComp.add(79);//dato flotante
//
//        charComp.add(15);//vaiable tipo caracter
//        charComp.add(81);//dato caracter
//
//        stringComp.add(16);//variable tipo cadena
//        stringComp.add(82);//dato cadena
    }

    public String checkAsing(Token TokenIzq, Token TokenAsig) {
//        JOptionPane.showMessageDialog(null, TokenIzq.image + " " + TokenIzq.kind + "    " + TokenAsig.image + " " + TokenAsig.kind);
        int tipoVar1 = 0;
        int tipoVar2 = 0;
        
//        JOptionPane.showMessageDialog(null, TokenIzq.image + " - " + TokenIzq.kind + "  |  " + TokenAsig.image + " - " + TokenAsig.kind);
        if (TokenIzq.kind == GramaticaConstants.VAR) {
            if (!checkVariable(TokenIzq)) {
                return "Error: El identificador " + TokenIzq.image + " No ha sido declarado \r\nLinea: " + TokenIzq.beginLine;
            }else{
                tipoVar1 = getTipoVariable(TokenIzq);
//                JOptionPane.showMessageDialog(null,tipoVar1);
            }
                
        }else{
            tipoVar1 = TokenIzq.kind;
        }

        if (TokenAsig.kind == GramaticaConstants.VAR) {
            if (!checkVariable(TokenAsig)) {
                return "Error: El identificador " + TokenIzq.image + " No ha sido declarado \r\nLinea: " + TokenIzq.beginLine;
            }else{
                tipoVar2 = getTipoVariable(TokenAsig);
            }
        }else{
            tipoVar2 = TokenAsig.kind;
        }

        objTipoDatoCompatible tipo = null;
        for (objTipoDatoCompatible var : tiposVariablesComp) {
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
        return "Sin errores semanticos";
        //        int ENTERO = GramaticaConstants.ENTERO;
        //        if () {
        //            
        //        }
        //        if (tipoIdent1 == 17) {
        //
        //            if (enteroComp.getTiposCompatibles().contains(tipoIdent2)) {
        //                return " ";
        //            } else {
        //                return "Error: No se puede convertir " + TokenAsig.image + " a Entero \r\nLinea: " + TokenIzq.beginLine;
        //            }
        //        } else if (tipoIdent1 == 18) {
        //            if (flotanteComp.getTiposCompatibles().contains(tipoIdent2)) {
        //                return " ";
        //            } else {
        //                return "Error: No se puede convertir " + TokenAsig.image + " a Decimal \r\nLinea: " + TokenIzq.beginLine;
        //            }
        //        } else if (tipoIdent1 == 15) //char
        //        {
        //            /*variable segunda: cuenta cuantos datos se van a asignar al caracter: 
        //				si a el caracter se le asigna mas de un dato (ej: 'a' + 'b') marca error 
        //				NOTA: no se utiliza un booleano ya que entraria en asignaciones pares o impares*/
        //            segunda++;
        //            if (segunda < 2) {
        //                if (charComp.getTiposCompatibles().contains(tipoIdent2)) {
        //                    return " ";
        //                } else {
        //                    return "Error: No se puede convertir " + TokenAsig.image + " a Caracter \r\nLinea: " + TokenIzq.beginLine;
        //                }
        //            } else //Si se esta asignando mas de un caracter manda el error 			
        //            {
        //                return "Error: No se puede asignar mas de un valor a un caracter \r\nLinea: " + TokenIzq.beginLine;
        //            }
        //
        //        } else if (tipoIdent1 == 16) //string
        //        {
        //            if (stringComp.getTiposCompatibles().contains(tipoIdent2)) {
        //                return " ";
        //            } else {
        //                return "Error: No se puede convertir " + TokenAsig.image + " a Cadena \r\nLinea: " + TokenIzq.beginLine;
        //            }
        //        } else {
        //            return "El Identificador " + TokenIzq.image + " no ha sido declarado" + " Linea: " + TokenIzq.beginLine;
        //        }

    }

    /*Metodo que verifica si un identificador ha sido declarado, 
		ej cuando se declaran las asignaciones: i++, i--)*/
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
    
    public int getTipoVariable(Token token){
        try {
            int kind = (Integer) tabla.get(token.image);
            return kind;
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "fsdsvvse");
            return 0;
        }
    }

}
