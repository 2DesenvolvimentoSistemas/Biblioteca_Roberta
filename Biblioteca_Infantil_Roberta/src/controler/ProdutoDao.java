/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.design.Livro;

/**
 *
 * @author Professor
 */
public class ProdutoDao {
    //atributos dao
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    //metodo crude create
    public void create (Livro l){
    
        //estabelecendo a conexão com bd
        try{
        con = Conexao.getConnection();
        
        //código sql a ser executado
        stmt = con.prepareStatement("INSERT INTO LIVRO (Nome, Acabamento, Codigo, Preco)VALUES(?,?)");
        
        //atribuicao de valor aos parametros
        stmt.setString(1, l.getNomeLivro());
        stmt.setString(2, l.getAcabamento());
        stmt.setDouble(3, l.getCodLivro());
        stmt.setDouble(4, l.getPreco());
        
        //execusao do codigo
        stmt.executeUpdate();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
        }finally{
        Conexao.closeConnection(con, stmt);
        }
    }
    
}
