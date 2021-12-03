package rief;

public class Alumni extends Keanggotaan {
    protected final int tahunMasuk;
    protected String jabatanTerakhir;

    public Alumni(String nama, String jabatanTerakhir, long noTelepon, String akunInstagram, int tahunMasuk) {
        super(nama, noTelepon, akunInstagram);
        super.status = "Alumni";
        this.tahunMasuk = tahunMasuk;
        this.jabatanTerakhir = jabatanTerakhir;
    }

    public void display(){
        super.display();
        System.out.println("Tahun Masuk\t\t : " + this.tahunMasuk);
        System.out.println("Jabatan Terakhir : " + this.jabatanTerakhir);
    }
}
