
package lenguajee;

import Analizador.Gramatica;
import Analizador.GramaticaTokenManager;
import Analizador.ParseException;
import Analizador.SimpleCharStream;
import Analizador.Token;
import Analizador.TokenMgrError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author serch
 */
public class LenguajeE {

    private static File archivoPrueba;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Gramatica parser = new Gramatica(new BufferedReader(new FileReader("./prueba2.txt")));
            parser.Inicio();
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            Logger.getLogger(LenguajeE.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            System.err.println(e.getMessage());
        }
        
    }
}
