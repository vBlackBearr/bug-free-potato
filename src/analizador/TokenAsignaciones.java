package analizador;

import Analizador.Token;
import java.io.PrintStream;
import java.util.Hashtable;
import java.lang.String;
import java.util.ArrayList;

public class TokenAsignaciones extends Error {

    public TokenAsignaciones() {

    }
    //Variable para validar asignaciones a caracteres(ichr)
    public int segunda = 0;
    //Tabla que almacenara los tokens declarados
    private Hashtable tabla = new Hashtable();

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
        ArrayList<Integer> IDs = new ArrayList();

        //identificadores de un valor entero (variable o dato)
        IDs.add(17);//variable entero
        IDs.add(78);//dato entreo
        enteroComp = new objTipoDatoCompatible(IDs);
        enteroComp.addCompatible(17);//se agrega compatibilidad con una variable tipo entero
        enteroComp.addCompatible(78);//se agrega compatibildad con un dato tipo entero

        //identificadores de un valor flotante (variable o dato)
        IDs.add(18);
        IDs.add(79);
        flotanteComp = new objTipoDatoCompatible(IDs);
        flotanteComp.addCompatible(18);
        flotanteComp.addCompatible(79);

        IDs.add(15);
        IDs.add(81);
        stringComp = new objTipoDatoCompatible(IDs);
        stringComp.addCompatible(15);
        stringComp.addCompatible(81);

        IDs.add(16);
        IDs.add(82);
        charComp = new objTipoDatoCompatible(IDs);
        charComp.addCompatible(16);
        charComp.addCompatible(82);

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
        /* De la tabla obtenemos el tipo de dato del identificador  
                            asi como, si el token enviado es diferente a algun tipo que no se declara como los numeros(78), los decimales(79),
                            caracteres(81) y cadenas(82)
                            entonces tipoIdent1 = tipo_de_dato, ya que TokenAsig es un dato*/
        if (TokenIzq.kind != 78 && TokenIzq.kind != 79) {
            try {
                //Si el TokenIzq.image existe dentro de la tabla de tokens, entonces tipoIdent1 toma el tipo de dato con el que TokenIzq.image fue declarado
                tipoIdent1 = (Integer) tabla.get(TokenIzq.image);
            } catch (Exception e) {
                //Si TokenIzq.image no se encuentra en la tabla en la cual se agregan los tokens, el token no ha sido declarado, y se manda un error
                return "Error: El identificador " + TokenIzq.image + " No ha sido declarado \r\nLinea: " + TokenIzq.beginLine;
            }
        } else {
            tipoIdent1 = 0;
        }

        //TokenAsig.kind != 78 && TokenAsig.kind != 79 && TokenAsig.kind != 82 && TokenAsig.kind != 81
        if (TokenAsig.kind == 49) {
            /*Si el tipo de dato que se esta asignando, es algun identificador(kind == 49) 
			se obtiene su tipo de la tabla de tokens para poder hacer las comparaciones*/
            try {
                tipoIdent2 = (Integer) tabla.get(TokenAsig.image);
            } catch (Exception e) {
                //si el identificador no existe manda el error
                return "Error: El identificador " + TokenAsig.image + " No ha sido declarado \r\nLinea: " + TokenIzq.beginLine;
            }
        } //Si el dato es entero(78) o decimal(79) o caracter(82) o cadena(81)
        //tipoIdent2 = tipo_del_dato
        else if (TokenAsig.kind == 78 || TokenAsig.kind == 79 || TokenAsig.kind == 82 || TokenAsig.kind == 81) {
            tipoIdent2 = TokenAsig.kind;
        } else //Si no, se inicializa en algun valor "sin significado(con respecto a los tokens)", para que la variable este inicializada y no marque error al comparar
        {
            tipoIdent2 = 0;
        }

        if (tipoIdent1 == 17) //Int
        {
            //Si la lista de enteros(intComp) contiene el valor de tipoIdent2, entonces es compatible y se puede hacer la asignacion
            if (enteroComp.getTiposCompatibles().contains(tipoIdent2)) {
                return " ";
            } else //Si el tipo de dato no es compatible manda el error
            {
                return "Error: No se puede convertir " + TokenAsig.image + " a Entero \r\nLinea: " + TokenIzq.beginLine;
            }
        } else if (tipoIdent1 == 18) //double
        {
            if (flotanteComp.getTiposCompatibles().contains(tipoIdent2)) {
                return " ";
            } else {
                return "Error: No se puede convertir " + TokenAsig.image + " a Decimal \r\nLinea: " + TokenIzq.beginLine;
            }
        } else if (tipoIdent1 == 15) //char
        {
            /*variable segunda: cuenta cuantos datos se van a asignar al caracter: 
				si a el caracter se le asigna mas de un dato (ej: 'a' + 'b') marca error 
				NOTA: no se utiliza un booleano ya que entraria en asignaciones pares o impares*/
            segunda++;
            if (segunda < 2) {
                if (charComp.getTiposCompatibles().contains(tipoIdent2)) {
                    return " ";
                } else {
                    return "Error: No se puede convertir " + TokenAsig.image + " a Caracter \r\nLinea: " + TokenIzq.beginLine;
                }
            } else //Si se esta asignando mas de un caracter manda el error 			
            {
                return "Error: No se puede asignar mas de un valor a un caracter \r\nLinea: " + TokenIzq.beginLine;
            }

        } else if (tipoIdent1 == 16) //string
        {
            if (stringComp.getTiposCompatibles().contains(tipoIdent2)) {
                return " ";
            } else {
                return "Error: No se puede convertir " + TokenAsig.image + " a Cadena \r\nLinea: " + TokenIzq.beginLine;
            }
        } else {
            return "El Identificador " + TokenIzq.image + " no ha sido declarado" + " Linea: " + TokenIzq.beginLine;
        }
    }

    /*Metodo que verifica si un identificador ha sido declarado, 
		ej cuando se declaran las asignaciones: i++, i--)*/
    public String checkVariable(Token checkTok) {
        try {
            //Intenta obtener el token a verificar(checkTok) de la tabla de los tokens
            int tipoIdent1 = (Integer) tabla.get(checkTok.image);
            return " ";
        } catch (Exception e) {
            //Si no lo puede obtener, manda el error
            return "Error: El identificador " + checkTok.image + " No ha sido declarado \r\nLinea: " + checkTok.beginLine;
        }
    }

}
