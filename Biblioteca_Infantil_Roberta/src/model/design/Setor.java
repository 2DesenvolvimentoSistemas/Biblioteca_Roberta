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
    INFANTO_JUVENIL (1, "IJ", "Infanto Juvenil"),
    FICCAO (2, "FCC", "Ficção"),
    DESENVOLVIMENTO_DE_COLECOES (3, "DC", "Desenvolvimento de Coleções");
    
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
