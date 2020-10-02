/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author Professor
 */
public enum Setor {
    
    //lista enumerada
    INFANTIL (1, "INFT", "Infantil"),
    FICÇÃO (2, "FCC", "Ficção"),
    FÁBULA (3, "FBL", "Fabula"),
    CONTO (4, "CNT", "Conto"),
    APÓLOGO (5, "APLG", "Apólogo"),
    CRÔNICA (6, "CNC", "Crônica"),
    LENDA (7, "LD", "Lenda"),
    MITO (8, "MT", "Mito"),
    NOVELA (9, "NVLA", "Novela"),
    FANTASIA (10, "FNTS", "Fantasia");

    
    //atributos da lista
    private int codSetor;
    private String siglaSetor;
    private String setor;
    
    //getters

    /**
     * @return the codSetor
     */
    public int getCodSetor() {
        return codSetor;
    }

    /**
     * @return the siglaSetor
     */
    public String getSiglaSetor() {
        return siglaSetor;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }
    
    //construtor completo

    private Setor(int codSetor, String siglaSetor, String setor) {
        this.codSetor = codSetor;
        this.siglaSetor = siglaSetor;
        this.setor = setor;
    }
    
    
    
}
