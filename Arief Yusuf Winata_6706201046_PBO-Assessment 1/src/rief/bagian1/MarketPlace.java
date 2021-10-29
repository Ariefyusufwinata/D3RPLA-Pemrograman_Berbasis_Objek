package rief.bagian1;

public class MarketPlace {
    private final String
            noResi,
            namaEkspedisi,
            namaPengirim,
            alamatPengirim,
            namaPenerima,
            alamatPenerima;

    private double biayaPengiriman;
    private double biayaAsuransi;
    private boolean dropship = true, asuransi = true;
    private final int noTransaksi;

    //Cons Normal
    public MarketPlace(
            int noTransaksi,
            String noResi,
            String namaEkspedisi,
            double biayaPengiriman,
            String namaPengirim,
            String alamatPengirim,
            String namaPenerima,
            String alamatPenerima
    ) {

        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.noTransaksi = noTransaksi;
        this.biayaPengiriman = biayaPengiriman;
        this.dropship = false;
        this.asuransi = false;
    }

    //Cons Dropship
    public MarketPlace(
            int noTransaksi,
            String noResi,
            String namaEkspedisi,
            double biayaPengiriman,
            String namaPengirim,
            String alamatPengirim,
            String namaPenerima,
            String alamatPenerima,
            boolean dropship
    ) {
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.biayaPengiriman = biayaPengiriman;
        this.noTransaksi = noTransaksi;
        this.dropship = dropship;
        this.asuransi = false;
    }

    //Cons Asuransi
    public MarketPlace(
            int noTransaksi,
            String noResi,
            String namaEkspedisi,
            double biayaPengiriman,
            String namaPengirim,
            String alamatPengirim,
            String namaPenerima,
            String alamatPenerima,
            double biayaAsuransi,
            boolean asuransi
    ) {
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.biayaPengiriman = biayaPengiriman;
        this.biayaAsuransi = biayaAsuransi;
        this.noTransaksi = noTransaksi;
        this.asuransi = asuransi;
        this.dropship = false;
    }

    //Cons Asuransi + Dropship
    public MarketPlace(
            int noTransaksi,
            String noResi,
            String namaEkspedisi,
            double biayaPengiriman,
            String namaPengirim,
            String alamatPengirim,
            String namaPenerima,
            String alamatPenerima,
            double biayaAsuransi,
            boolean dropship,
            boolean asuransi
    ) {
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.biayaPengiriman = biayaPengiriman;
        this.biayaAsuransi = biayaAsuransi;
        this.noTransaksi = noTransaksi;
        this.dropship = dropship;
        this.asuransi = asuransi;
    }

    public void displayData(){
        if(dropship && asuransi){
            System.out.println(
                    "\nNo Transaksi     : " + noTransaksi +
                    "\nNo Resi          : " + noResi +
                    "\nNama Ekspedesi   : " + namaEkspedisi +
                    "\nOngkos Kirim     : " + biayaPengiriman +
                    "\nNama Pengirim    : " + namaPengirim +
                    "\nAlamat Pengirim  : " + alamatPengirim +
                    "\nNama Penerima    : " + namaPenerima +
                    "\nAlamat Penerima  : " + alamatPenerima +
                    "\nNominal Asuransi : " + biayaAsuransi
            );
        } else if (dropship){
            System.out.println(
                    "\nNo Transaksi     : " + noTransaksi +
                            "\nNo Resi            : " + noResi +
                            "\nNama Ekspedesi     : " + namaEkspedisi +
                            "\nOngkos Kirim       : " + biayaPengiriman +
                            "\nNama Pengirim      : " + namaPengirim +
                            "\nAlamat Pengirim    : " + alamatPengirim +
                            "\nNama Penerima      : " + namaPenerima +
                            "\nAlamat Penerima    : " + alamatPenerima
            );
        } else if (asuransi){
            if (biayaPengiriman > 20000){
                this.biayaPengiriman = biayaPengiriman - 5000;
                System.out.println(
                        "\nNo Transaksi     : " + noTransaksi +
                                "\nNo Resi           : " + noResi +
                                "\nNama Ekspedesi    : " + namaEkspedisi +
                                "\nOngkos Kirim      : " + biayaPengiriman +
                                "\nNama Pengirim     : " + namaPengirim +
                                "\nAlamat Pengirim   : " + alamatPengirim +
                                "\nNama Penerima     : " + namaPenerima +
                                "\nAlamat Penerima   : " + alamatPenerima +
                                "\nNominal Asuransi  : " + biayaAsuransi
                );
            } else {
                System.out.println(
                        "\nNo Transaksi     : " + noTransaksi +
                                "\nNo Resi           : " + noResi +
                                "\nNama Ekspedesi    : " + namaEkspedisi +
                                "\nOngkos Kirim      : " + biayaPengiriman +
                                "\nNama Pengirim     : " + namaPengirim +
                                "\nAlamat Pengirim   : " + alamatPengirim +
                                "\nNama Penerima     : " + namaPenerima +
                                "\nAlamat Penerima   : " + alamatPenerima +
                                "\nNominal Asuransi  : " + biayaAsuransi
                );
            }
        } else{
            System.out.println(
                    "\nNo Transaksi    : " + noTransaksi +
                            "\nNo Resi         : " + noResi +
                            "\nNama Ekspedesi  : " + namaEkspedisi +
                            "\nOngkos Kirim    : " + biayaPengiriman +
                            "\nNama Pengirim   : " + namaPengirim +
                            "\nAlamat Pengirim : " + alamatPengirim +
                            "\nNama Penerima   : " + namaPenerima +
                            "\nAlamat Penerima : " + alamatPenerima
            );
        }
    }

}
