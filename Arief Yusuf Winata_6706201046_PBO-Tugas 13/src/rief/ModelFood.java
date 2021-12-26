/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rief;

/**
 *
 * @author winat
 */
public class ModelFood {
    private String nama, jenis;
    private int rating, kalori;
    
    public ModelFood(String nama, String jenis, int rating, int kalori){
        this.nama = nama;
        this.jenis = jenis;
        this.rating = rating;
        this.kalori = kalori;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public int getRating(){
        return rating;
    }
    
    public int getKalori(){
        return kalori;
    }
}
