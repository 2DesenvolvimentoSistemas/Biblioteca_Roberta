/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class Conexao {
    //atributos de conexão
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/BibliotecaInfantil?zeroDateTimeBehavior=convertToNull";
    private static String USR = "Roberta";
    private static String PSW = "Um2três4cinco!"; //"12345"; // //no linux no windows
    
    //metodos de conexao
    public static Connection getConnection (){
    try{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USR, PSW);
       } catch (ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, "Erro banana " + e.getMessage());
        return null;
       }
    }
    
    public static void closeConnection (Connection con){
    try{
        if (con != null)
            con.close();
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
    }
    
    
    }
    
    public static void closeConnection (Connection con, PreparedStatement stmt){
        closeConnection(con);
        try{
        if (stmt != null)
            stmt.close();
        }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Erro"+e.getMessage());
        }
    }
    
    public static void closeConnection (Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
        try{
        if (rs != null)
            rs.close();
        }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Erro" + e.getMessage());
        }
    }
}