/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraObjects;

import GUI.GUI;
import javax.swing.JOptionPane;

/**
 *
 * @author Luisp
 */
public class logsAcumulatorInstance {

    private GUI guiInstance;
    
    private static logsAcumulatorInstance INSTANCE = null;
    
    private logsAcumulatorInstance(){}
    
    private String lexicLogs = "";

    private String sintacticLogs = "";

    private String semanticLogs = "";

    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new logsAcumulatorInstance();
        }
    }
    
    public static logsAcumulatorInstance getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }
    
    
    public void addlexicLog(String log) {
        setLexicLogs(getLexicLogs() + "\n" + log);
        guiInstance.setTxtAreaLexico(lexicLogs);
    }
    
    public void addSintacticLog(String log) {
        setSintacticLogs(getSintacticLogs() + "\n" + log);
        guiInstance.setTxtAreaSintactico(sintacticLogs);
    }
    
    public void addSemanticLog(String log) {
        setSemanticLogs(getSemanticLogs() + "\n" + log);
        guiInstance.setTxtAreaSemantico(semanticLogs);
    }

    public void resetLogs(){
        setLexicLogs("");
        setSintacticLogs("");
        setSemanticLogs("");
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
