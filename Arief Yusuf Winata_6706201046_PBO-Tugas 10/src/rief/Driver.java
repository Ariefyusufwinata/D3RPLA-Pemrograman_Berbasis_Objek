package rief;

public class Driver extends Pengguna{
    private String noPlate, jenisKendaraan;

    public Driver(double saldo, String nikPengguna, String namaPengguna, String noTeleponPengguna, String noPlatePengguna, String jenisKendaraan) {
        super(saldo, nikPengguna, namaPengguna, noTeleponPengguna);
        this.noPlate = noPlatePengguna;
        this.jenisKendaraan = jenisKendaraan;
    }

    public void transaksiJasaAntar(Customer customer, double jumlahBiaya) {
        if (customer.getSaldo() < jumlahBiaya){
            System.out.println("Saldo Anda Tidak Cukup");
        } else {
            this.setSaldo(this.getSaldo() + jumlahBiaya);
            customer.setSaldo(customer.getSaldo() - jumlahBiaya);
            System.out.println("Berhasil melakukan transaksi");
        }
    }

    @Override
    public void infoMember() {
        super.infoMember();
        System.out.println("No Plate  : " + noPlate);
        System.out.println("Kendaraan : " + jenisKendaraan);
    }
}