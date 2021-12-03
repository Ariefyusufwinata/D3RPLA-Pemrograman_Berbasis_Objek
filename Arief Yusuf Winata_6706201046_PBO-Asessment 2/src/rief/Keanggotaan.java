package rief;

public class Keanggotaan {
    protected String nama, akunInstagram, status;
    protected long noTelepon;

    public Keanggotaan(String nama, long noTelepon, String akunInstagram) {
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.akunInstagram = akunInstagram;
    }
    public void display(){
        System.out.println("Nama\t\t\t : " + nama);
        System.out.println("No Telepon\t\t : " + noTelepon);
        System.out.println("Akun Instagram\t : " + akunInstagram);
        System.out.println("Status\t\t\t : " + status);
    }

    public String getStatus() {
        return status;
    }
}
