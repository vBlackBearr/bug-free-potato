/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

//import Conversor.Conversor;
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

    private logsAcumulatorInstance() {
        conversion = new Conversion();
//        addSintacticLog("No hay errores!")
    }

    Conversion conversion;

    private String lexicLogs = "";

    private String sintacticLogs = "";

    private String semanticLogs = "";

    private String expresionInfija = "";

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

    public void addlexicLog(String log) {
        if (!"".equals(log)) {
            setLexicLogs(getLexicLogs() + log + "\n");
            guiInstance.setTxtAreaLexico(lexicLogs);
        }

    }

    public void addSintacticLog(String log) {
        if (!"".equals(log)) {
            setSintacticLogs(getSintacticLogs() + log + "\n");
            guiInstance.setTxtAreaSintactico(sintacticLogs);
        }
    }

    public void addSemanticLog(String log) {
        if (!"".equals(log)) {
            setSemanticLogs(getSemanticLogs() + log + "\n");
            guiInstance.setTxtAreaSemantico(semanticLogs);
        }

    }

    public void addComponenteExpresionInfija(String log) {
        if (!"".equals(log) && !log.contains("\"")) {
            
            NotacionPolaca np = new NotacionPolaca();
            String operacion = np.notacionPolaca(log, "variables");
//            System.out.println(operacion);
            notacionPolacaLogs += operacion + "\n\n";
            guiInstance.setTxtAreaNotacionPolaca(notacionPolacaLogs);
        }

    }

    public void resetLogs() {
        setLexicLogs("");
        setSintacticLogs("");
        setSemanticLogs("");
        guiInstance.setTxtAreaLexico(lexicLogs);
        guiInstance.setTxtAreaSintactico(sintacticLogs);
        guiInstance.setTxtAreaSemantico(semanticLogs);
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
}
