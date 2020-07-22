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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.design.Livro;

/**
 *
 * @author Professor
 */
public class LivroDao { //Renomeei a classe...
    //atributos dao
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    //metodo crude create
    public void create (Livro l){
    
        try{
            //estabelecendo a conexão com bd
            con = Conexao.getConnection();
        
            //código sql a ser executado
            stmt = con.prepareStatement("INSERT INTO Livro (NomeLivro, Acabamento, CodLivro, Preco)VALUES(?, ?, ?, ?)");
        
            //atribuicao de valor aos parametros
            stmt.setString(1, l.getNomeLivro());
            stmt.setString(2, l.getAcabamento());
            stmt.setInt(3, l.getCodLivro());
            stmt.setDouble(4, l.getPreco());
        
            //execusao do codigo
            stmt.executeUpdate();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    } //fim do create
    
    //read
    public List <Livro> read (){
    //lista de produtos
    List <Livro> livros = new ArrayList<>();
    
    try{
        //estabelecendo conexão
        con = Conexao.getConnection();
        
        //codigo sql
        //Corrigi um detalhe bobo aqui...
        stmt = con.prepareStatement("SELECT NomeLivro, Acabamento, CodLivro, Preco FROM Livro");
        
        //executando a consulta
        rs = stmt.executeQuery();
        
        while (rs.next()){
            livros.add(
                new Livro(
                        rs.getString("NomeLivro"),
                        rs.getString("Acabamento"),
                        rs.getInt("CodLivro"),
                        rs.getDouble("Preco")
                )
            );
        }
        return livros;
        
    }catch (SQLException e){
    JOptionPane.showMessageDialog(null,"Erro!" + e.getMessage());
    }finally{
    Conexao.closeConnection(con, stmt, rs);
    }
      return null;
    }
    
    //update do crud
    public void update (Livro l){
        try{
        //estabelecendo conexao
        con = Conexao.getConnection();
        
        //cod sql para update
        stmt = con.prepareStatement("UPDATE NomeLivro" +
                                    "SET Acabamento = ?," +
                                    "CodLivro = ?" +
                                    "WHERE Preco = ?");
        
        //definicao dos parametros
        stmt.setString(1, l.getNomeLivro());
        stmt.setString(2, l.getAcabamento());
        stmt.setInt(3, l.getCodLivro());
        stmt.setDouble(4, l.getPreco());
        
        //atualizando os dados na tabela
        stmt.executeUpdate();
        
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage());
    }finally {
    Conexao.closeConnection(con, stmt);
    }
    
    }
}
