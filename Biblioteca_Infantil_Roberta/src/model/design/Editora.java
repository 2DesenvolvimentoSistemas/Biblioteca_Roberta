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
public class Editora extends Livro{
    
    //atributos
    private int isbn;
    
    public void imprimirDados (){
        System.out.println("ISBN.................... " + this.isbn);
    }

        public Editora(int isbn) {
        this.isbn = isbn;
    }

    public Editora() {
    }
        
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public void imprimirLivro() {
        super.imprimirLivro(); //To change body of generated methods, choose Tools | Templates.
        this.imprimirDados();
    }
    
    

    
    
}

