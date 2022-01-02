/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rief;
/**
 *
 * @author winat
 */
public class Member {
    private String id_member, nama, kategori;
    private int tahun;
    
    public Member (String id_member, String nama, int tahun, String kategori){
        this.id_member = id_member;
        this.nama = nama;
        this.tahun = tahun;
        this.kategori = kategori;
    }
    
    public String getIdMember(){
        return id_member;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getTahun(){
        return tahun;
    }
    
    public String getKategori(){
        return kategori;
    }
}
