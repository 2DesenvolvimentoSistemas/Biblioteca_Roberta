/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Editora;
import model.design.Livro;
import model.design.Setor;

/**
 *
 * @author Professor
 */
public class TesteLivro {
    public static void main(String[] args) {
        //criacao e instancia do objeto
        Livro livro = new Livro();
        
        //construcao do objeto
        livro.setNomeLivro("O Pequeno Príncipe");
        livro.setAcabamento("Brochura");
        livro.setCodLivro(123);
        livro.setSetor(Setor.INFANTO_JUVENIL); 
        livro.setPreco(21.90);
        
        //imprimindo produto
        System.out.println("\n\t\t\t -- LIVRO UM: -- \n");
        livro.imprimirLivro();
        
        //outro objeto
        Livro outroLivro = new Livro("O Jardim Secreto","Brochura",1234, Setor.FICCAO, 30.10);
        
        //imprimindo outro produto
        System.out.println("\n\t\t\t -- LIVRO DOIS -- \n");
        outroLivro.imprimirLivro();
        
        //criacao e instancia do objeto Editora
        Editora editora = new Editora();
        
        //construcao do objeto Editora
        editora.setNomeLivro("Coraline");
        editora.setAcabamento("Brochura");
        editora.setCodLivro(12345);
        editora.setPreco(39.92);
        editora.setSetor(Setor.DESENVOLVIMENTO_DE_COLECOES); // Desenvolvimento de Coleções - responsável pelo acervo da biblioteca, pelo desenvolvimento da coleção de documentos
        editora.setIsbn(978877845);
        
        //imprimindo o objeto Editora
        System.out.println("\n\t\t\t -- DADOS DE IDENTIFICAÇÃO -- \n");
        //editora.imprimirDados();
        editora.imprimirLivro();
    }
    
}