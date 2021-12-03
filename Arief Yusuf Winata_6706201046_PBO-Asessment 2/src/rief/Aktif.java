package rief;

public class Aktif extends Keanggotaan {
    protected final int tahunMasuk;
    protected final String divisi;

    public Aktif(String nama, String divisi, long noTelepon, String akunInstagram, int tahunMasuk) {
        super(nama, noTelepon, akunInstagram);
        super.status = "Aktif";
        this.tahunMasuk = tahunMasuk;
        this.divisi = divisi;
    }

    public void display(){
        super.display();
        System.out.println("Divisi\t\t\t : " + this.divisi);
        System.out.println("Tahun Masuk\t\t : " + this.tahunMasuk);
    }
}
