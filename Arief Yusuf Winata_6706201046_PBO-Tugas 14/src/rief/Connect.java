/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rief;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author winat
 */
public class Connect {
    private static Connection connection;
    private static Statement statement;
    
    public static void open(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_tugas14","root","");
            statement = connection.createStatement();
            System.out.println("Success Connected " + connection);
        } catch(SQLException ex){
            System.out.println("Failed Connection " + ex.getMessage());
        }
    }
  
    public static boolean query(String query){
        try {
            open();
            
            return statement.execute(query);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
             
        }
        return false;
    }
    
    
    public static ResultSet get(String query){
        try {
            open();
            
            ResultSet data = statement.executeQuery(query);
            return data;
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    
    public static String set(String query){
        try {
            open();
            
            statement.executeUpdate(query);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return "";
    }
    
    public static void close(){
        try{
            connection.close();
            statement.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}

