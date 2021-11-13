package rief;

public class Karyawan {
    protected String nama;
    protected double gasDas;
    protected  int id;

    public Karyawan(String nama, double gasDas){
        this.gasDas = gasDas;
        this.nama = nama;
        this.id = id;
    }

    public void display(){
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Gaji Dasar\t\t: " +  this.gasDas);
    }
}
