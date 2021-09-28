package rief.soal1;

public class Main {

    public static void main(String[] args) {

        // Objek dengan 2 parameter
        Barang barang1 = new Barang("BRG-0001", "Tas Gucci");
        barang1.setHarga(1200);
        Barang barang2 = new Barang("BRG-0002", "Printer Epson L355");
        barang2.setHarga(200);

        //Objek dengan 3 parameter
        Barang barang3 = new Barang("BRG-0003", "Koper", 150);
        Barang barang4 = new Barang("BRG-0004", "Helm",  20);

        System.out.println("idProduk = " + barang1.getIdProduk() + ", nama = " + barang1.getNama() + ", harga = $" + barang1.getHarga());
        System.out.println("idProduk = " + barang2.getIdProduk() + ", nama = " + barang2.getNama() + ", harga = $" + barang2.getHarga());
        System.out.println("idProduk = " + barang3.getIdProduk() + ", nama = " + barang3.getNama() + ", harga = $" + barang3.getHarga());
        System.out.println("idProduk = " + barang4.getIdProduk() + ", nama = " + barang4.getNama() + ", harga = $" + barang4.getHarga());

        //Get Total harga
        double totalHarga = barang1.getHarga() + barang3.getHarga() + barang4.getHarga();
        System.out.print("Total harga dari BRG-001, BRG-003, dan BRG-004 : $");
        System.out.println(totalHarga);

    }
}
