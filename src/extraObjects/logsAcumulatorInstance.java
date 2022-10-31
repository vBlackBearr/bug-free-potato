/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

//import Conversor.Conversor;
import Analizador.GramaticaConstants;
import GUI.GUI;
import Notaciones.Conversion;
import Notaciones.NotacionPolaca;
import javax.swing.JOptionPane;

/**
 *
 * @author TeamPotato:)
 */
public class logsAcumulatorInstance {

    private GUI guiInstance;

    private static logsAcumulatorInstance INSTANCE = null;

    public static NotacionPolaca np = new NotacionPolaca();

    private logsAcumulatorInstance() {
    }

    private String lexicLogs = "";

    private String sintacticLogs = "";

    private String semanticLogs = "";

    private String notacionPolacaLogs = "";

    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new logsAcumulatorInstance();
        }
    }

    public static logsAcumulatorInstance getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }

    public void reestablecerNp() {
        np = new NotacionPolaca();
    }

    public void addlexicLog(String log) {
        if (!"".equals(log)) {
            setLexicLogs(getLexicLogs() + log + "\n");
            getGuiInstance().setTxtAreaLexico(lexicLogs);
        }

    }

    public void addSintacticLog(String log) {
        if (!"".equals(log)) {
            setSintacticLogs(getSintacticLogs() + log + "\n");
            getGuiInstance().setTxtAreaSintactico(sintacticLogs);
        }
    }

    public void addSemanticLog(String log) {
        if (!"".equals(log)) {
            setSemanticLogs(getSemanticLogs() + log + "\n");
            getGuiInstance().setTxtAreaSemantico(semanticLogs);
        }

    }

    public void addComponenteExpresionInfija(String log) {

        if (!"".equals(log) && !log.contains("\"") && !log.contains("\'")) {
            String[] op = log.split("=");

            int type = 0;
            Integer a;
            if ((a = typeTableInstance.getInstance().getType(op[0])) != null) {
                type = a;
            }

            if (type == GramaticaConstants.INT || type == GramaticaConstants.FLOAT || type == GramaticaConstants.DOUBLE) {
                if (containsOperador(op[1])) {
                    String operacion = np.notacionPolaca(log);
                    setNotacionPolacaLogs(getNotacionPolacaLogs() + operacion + "\n\n");
                    getGuiInstance().setTxtAreaNotacionPolaca(getNotacionPolacaLogs());
                } else {
                    np.insertarValorAVar(log);
                }
            } else {
//                np.insertarValorAVar(log);
            }
        } else {
//            np.insertarValorAVar(log);
        }
    }

    public void resetLogs() {
        setLexicLogs("");
        setSintacticLogs("");
        setSemanticLogs("");
        setNotacionPolacaLogs("");
        getGuiInstance().setTxtAreaLexico(lexicLogs);
        getGuiInstance().setTxtAreaSintactico(sintacticLogs);
        getGuiInstance().setTxtAreaSemantico(semanticLogs);
        getGuiInstance().setTxtAreaNotacionPolaca(semanticLogs);
    }

    /**
     * @return the lexicLogs
     */
    public String getLexicLogs() {
        return lexicLogs;
    }

    /**
     * @param lexicLogs the lexicLogs to set
     */
    public void setLexicLogs(String lexicLogs) {
        this.lexicLogs = lexicLogs;
    }

    /**
     * @return the sintacticLogs
     */
    public String getSintacticLogs() {
        return sintacticLogs;
    }

    /**
     * @param sintacticLogs the sintacticLogs to set
     */
    public void setSintacticLogs(String sintacticLogs) {
        this.sintacticLogs = sintacticLogs;
    }

    /**
     * @return the semanticLogs
     */
    public String getSemanticLogs() {
        return semanticLogs;
    }

    /**
     * @param semanticLogs the semanticLogs to set
     */
    public void setSemanticLogs(String semanticLogs) {
        this.semanticLogs = semanticLogs;
    }

    /**
     * @return the guiInstance
     */
    public GUI getGuiInstance() {
        return guiInstance;
    }

    /**
     * @param guiInstance the guiInstance to set
     */
    public void setGuiInstance(GUI guiInstance) {
        this.guiInstance = guiInstance;
    }

    /**
     * @return the notacionPolacaLogs
     */
    public String getNotacionPolacaLogs() {
        return notacionPolacaLogs;
    }

    /**
     * @param notacionPolacaLogs the notacionPolacaLogs to set
     */
    public void setNotacionPolacaLogs(String notacionPolacaLogs) {
        this.notacionPolacaLogs = notacionPolacaLogs;
    }

    private boolean containsOperador(String cadena) {
        if (cadena.contains("(")) {
            return true;
        }
        if (cadena.contains(")")) {
            return true;
        }
        if (cadena.contains("+")) {
            return true;
        }
        if (cadena.contains("-")) {
            return true;
        }
        if (cadena.contains("*")) {
            return true;
        }
        if (cadena.contains("/")) {
            return true;
        }
        if (cadena.contains("^")) {
            return true;
        }
        return false;
    }
}
