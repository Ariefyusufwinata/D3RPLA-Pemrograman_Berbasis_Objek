/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rief;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author winat
 */
public class Food{
    public static ArrayList<ModelFood> view() {
        ArrayList<ModelFood> listFood = new ArrayList<>();
        int row = FormData.table.getRowCount();
        for (int i = 0; i < row; i++){
            FormData.model.removeRow(0);
        }
        try {    
            ResultSet rs = ConnectionService.get("SELECT * FROM `listFood` ORDER BY `listfood`.`nama` ASC");
            while(rs.next()){
                String[] data = {rs.getString(1), rs.getString(3), rs.getString(2), rs.getString(4)};
                FormData.model.addRow(data);
                
                listFood.add(new ModelFood(
                        rs.getString("nama"),
                        rs.getString("jenis"),
                        rs.getInt("rating"),
                        rs.getInt("kalori")
                ));
            }
            return listFood;
        } catch (SQLException ex) {
            Logger.getLogger(FormData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static ArrayList<ModelFood> view(String search) {
        ArrayList<ModelFood> listFood = new ArrayList<>();
        int row = FormData.table.getRowCount();
        for (int a = 0; a<row; a++){
            FormData.model.removeRow(0);
        }
        try {    
            ResultSet rs = ConnectionService.get("SELECT * FROM `listfood` WHERE nama = '" + search +"' ORDER BY `listfood`.`nama` ASC;");
            while(rs.next()){
                String[] data = {rs.getString(1), rs.getString(3), rs.getString(2), rs.getString(4)};
                FormData.model.addRow(data);
                
                listFood.add(new ModelFood(
                        rs.getString("nama"),
                        rs.getString("jenis"),
                        rs.getInt("rating"),
                        rs.getInt("kalori")
                ));
            }
            return listFood;
        } catch (SQLException ex) {
            Logger.getLogger(FormData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void insert(ModelFood food) {
        try {
            String query = "INSERT INTO `listFood` (`nama`, `jenis`, `rating`, `kalori`)"
                    + " VALUES ('" + food.getNama() +"', '" + food.getJenis() +"', " + food.getRating() + ", " + food.getKalori() +")";
            boolean check = ConnectionService.query(query);
            if (check) {
                JOptionPane.showMessageDialog(null, "Failed Added Food, Query" + check, "Failed", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Success Added Food", "Succes", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Management Error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }        
    }
    
    public static void delete(){
        try {
            String query = "DELETE FROM `listfood` WHERE nama ='"+ FormData.edtHapus.getText() +"'";
            boolean check = ConnectionService.query(query);
            if (check) {
                JOptionPane.showMessageDialog(null, "Failed Delete Food, Query" + check, "Failed", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Success Delete Food", "Succes", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Management Error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }        
        ConnectionService.close();
    }
}
