package analizador;

import Analizador.Token;
import java.io.PrintStream;
import java.util.Hashtable;
import java.lang.String;
import java.util.ArrayList;
//import analizador.GramaticaConstants;

public class TokenAsignaciones extends Error {

    public TokenAsignaciones() {

    }
    //Variable para validar asignaciones a caracteres(ichr)
    public int segunda = 0;
    //Tabla que almacenara los tokens declarados
    private Hashtable tabla = new Hashtable();

    ArrayList<objTipoDatoCompatible> tiposVariablesComp;
    objTipoDatoCompatible enteroComp;
    objTipoDatoCompatible flotanteComp;
    objTipoDatoCompatible stringComp;
    objTipoDatoCompatible charComp;

    ArrayList<Integer> tiposDeDatos = new ArrayList<>();

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
        IDs.add(17);//variable entero
        IDs.add(78);//dato entreo
        enteroComp = new objTipoDatoCompatible(IDs);
        enteroComp.addCompatible(17);//se agrega compatibilidad con una variable tipo entero
        enteroComp.addCompatible(78);//se agrega compatibildad con un dato tipo entero
        tiposVariablesComp.add(enteroComp);

        //identificadores de un valor flotante (variable o dato)
        IDs.add(18);
        IDs.add(79);
        flotanteComp = new objTipoDatoCompatible(IDs);
        flotanteComp.addCompatible(18);
        flotanteComp.addCompatible(79);
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

        tiposDeDatos.add(GramaticaConstants.ENTERO);
        tiposDeDatos.add(GramaticaConstants.FLOTANTEDOUBLE);
        tiposDeDatos.add(GramaticaConstants.CARACTER);
        tiposDeDatos.add(GramaticaConstants.CADENA);

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
        //variables en las cuales se almacenara el tipo de dato del identificador y de las asignaciones (ejemplo: n1(tipoIdent1) = 2(tipoIdent2) + 3(tipoIdent2))
        int tipoIdent1;
        int tipoIdent2;

        if (!tiposDeDatos.contains(TokenIzq.kind)) {
            if (!checkVariable(TokenIzq)) {
                return "Error: El identificador " + TokenIzq.image + " No ha sido declarado \r\nLinea: " + TokenIzq.beginLine;
            }
        }

        if (!tiposDeDatos.contains(TokenAsig.kind)) {
            if (!checkVariable(TokenAsig)) {
                return "Error: El identificador " + TokenIzq.image + " No ha sido declarado \r\nLinea: " + TokenIzq.beginLine;
            }
        }

        objTipoDatoCompatible tipo = null;
        for (objTipoDatoCompatible var : tiposVariablesComp) {
            for(Integer ID: var.getIDs()){
                if(ID.equals(TokenIzq.kind)){
                    tipo = var;
                    break;
                }
            }
            if (tipo != null){
                break;
            }
        }
        if(tipo == null){
            return "Error: Problema con el identificador " + TokenIzq.image + "\r\nLinea: " + TokenIzq.beginLine;
        }
        
        if(!tipo.getTiposCompatibles().contains(TokenAsig.kind)){
            return "Error: No se puede convertir " + TokenAsig.image + " a Entero \r\nLinea: " + TokenIzq.beginLine;
        }
        
        

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
        {
            return null;
        }

    }

    /*Metodo que verifica si un identificador ha sido declarado, 
		ej cuando se declaran las asignaciones: i++, i--)*/
    public boolean checkVariable(Token checkTok) {
        try {
            tabla.get(checkTok.image);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
