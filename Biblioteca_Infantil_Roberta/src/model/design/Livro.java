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
public class Livro {

    public Livro(String nomeLivro, String acabamento, double preco) {
        this.nomeLivro = nomeLivro;
        this.acabamento = acabamento;
        this.preco = preco;
    }

    public Livro(String nomeLivro, String acabamento, int codLivro, double preco) {
        this.nomeLivro = nomeLivro;
        this.acabamento = acabamento;
        this.codLivro = codLivro;
        this.preco = preco;
    }

    public Livro(String nomeLivro, String acabamento, int codLivro, Setor setor, double preco) {
        this.nomeLivro = nomeLivro;
        this.acabamento = acabamento;
        this.codLivro = codLivro;
        this.setor = setor;
        this.preco = preco;
    }
    
    
    
    public Livro() {
        this.setNomeLivro("Livro não informado.");
    }
    
    
    
    //atributos
    private String nomeLivro;
    private String acabamento; //brochura, aspiral ou coisa que o valha
    private int codLivro;
    private Setor setor;
    private double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    //metodo
    public void imprimirLivro (){
        System.out.println("Nome do livro.................... " +this.getNomeLivro());
        System.out.println("Acabamento.................... " +this.getAcabamento());
        System.out.println("Cód do livro.................... "+this.getCodLivro());
        System.out.println("Setor...................." + this.getSetor().getSetor());
        System.out.printf("Preço.................... R$ %.2f\n" ,this.getPreco());
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAcabamento() {
        return acabamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }
    
        public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Setor getSetor() {
        return setor;
    }


    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }
}

