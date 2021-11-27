package rief;

public class Customer extends Pengguna{
    public Customer(double saldo, String nik, String nama, String noTlp) {
        super(saldo, nik, nama, noTlp);
    }

    public void topUpSaldo(Driver driver, double jumlahSaldo) {
        if (driver.getSaldo() < jumlahSaldo) {
            System.out.println("Saldo driver tidak cukup");
        } else {
            this.setSaldo(this.getSaldo() + jumlahSaldo);
            driver.setSaldo(driver.getSaldo() - jumlahSaldo);
            System.out.println("Berhasil melakukan top up");
        }
    }
}
