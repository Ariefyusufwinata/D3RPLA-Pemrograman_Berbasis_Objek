package rief;

public class Pengguna {
    private  double saldoPengguna;
    private String nikPengguna, namaPengguna, noTlpPengguna;

    public Pengguna(double saldoPengguna, String nikPengguna, String namaPengguna, String noTlpPengguna) {
        this.saldoPengguna = saldoPengguna;
        this.nikPengguna = nikPengguna;
        this.namaPengguna = namaPengguna;
        this.noTlpPengguna = noTlpPengguna;
    }

    public double getSaldo() {
        return saldoPengguna;
    }

    public void setSaldo(double saldo) {
        this.saldoPengguna = saldo;
    }

    //Override Method
    public void infoMember() {
        System.out.println("NIK\t\t\t\t: " + nikPengguna);
        System.out.println("Nama\t\t\t: " + namaPengguna);
        System.out.println("No Telp\t\t\t: " + noTlpPengguna);
        System.out.println("Saldo\t\t\t: Rp." + saldoPengguna);
    }
}