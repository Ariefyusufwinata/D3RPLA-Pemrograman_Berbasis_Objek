/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rief;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author winat
 */
public class Service{
    public static void getData() {
        int row = Main.table.getRowCount();
        for (int i = 0; i < row; i++){
            Main.model.removeRow(0);
        }
        try {    
            ResultSet rs = Connect.get("SELECT * FROM `pelanggan` ORDER BY `pelanggan`.`id_member` ASC");
            while(rs.next()){
                String[] data = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                Main.model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void getData(String search) {
        int row = Main.table.getRowCount();
        for (int a = 0; a<row; a++){
            Main.model.removeRow(0);
        }
        try {    
            ResultSet rs = Connect.get("SELECT * FROM `pelanggan` WHERE nama = '" + search +"' ORDER BY `pelanggan`.`id_member` ASC;");
            while(rs.next()){
                String[] data = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                Main.model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insert(Member member) {
        try {
            String query = "INSERT INTO `pelanggan` (`id_member`, `nama`, `tahun`, `kategori`)"
                    + " VALUES ('" + member.getIdMember()+"', '" + member.getNama()+"', " + member.getTahun()+ ", '" + member.getKategori() +"')";
            boolean check = Connect.query(query);
            if (check) {
                JOptionPane.showMessageDialog(null, "Failed Added Member, Query" + check, "Failed", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Success Added Member", "Succes", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Management Error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }        
    }
    
    public static void delete(String id){
        try {
            String query = "DELETE FROM `pelanggan` WHERE id_member ='"+ id +"'";
            boolean check = Connect.query(query);
            if (check) {
                JOptionPane.showMessageDialog(null, "Failed Delete Member, Query" + check, "Failed", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Success Delete Member", "Succes", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Management Error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }        
        Connect.close();
    }
}