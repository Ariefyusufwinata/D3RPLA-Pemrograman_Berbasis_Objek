package rief.bagian2;

import java.util.Scanner;
import java.util.ArrayList;

public class ShowRoomJaya {
    private static final ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String merk, tahun;
        int jumlah, stok;
        double harga;
        boolean nChoice = true;

        //Gudang
        arrMobil.add(new Mobil("Avanza", "2018", 15000000, 5));

        do{
            try {
                System.out.print("""
                                              
                                              
                        =====================
                        || Show Room Jaya  ||
                        =====================
                        1. Tambah Mobil
                        2. Beli Mobil
                        3. Lihat Stok
                        4. Keluar
                        """);
                System.out.print("Pilih : ");
                int pilih = in.nextInt();

                if (pilih == 1) {
                    try {
                        System.out.println("\n1. Tambah Mobil");
                        System.out.print("Merk\t\t\t: ");
                        merk = in.next();
                        System.out.print("Tahun Keluaran  : ");
                        tahun = in.next();
                        System.out.print("Harga\t\t\t: ");
                        harga = in.nextDouble();
                        System.out.print("Stok\t\t\t: ");
                        stok = in.nextInt();
                        tambahMobil(merk, tahun, harga, stok);
                    }catch (Exception error){
                        System.out.println("Perhatikan Inputan Anda!");
                        nChoice = false;
                    }
                } else if (pilih == 2) {
                    try {
                        System.out.println("\n2. Beli Mobil");
                        System.out.print("Merk\t\t\t: ");
                        merk = in.next();
                        System.out.print("Tahun\t\t\t: ");
                        tahun = in.next();
                        System.out.print("Jumlah\t\t\t: ");
                        jumlah = in.nextInt();
                        beliMobil(merk, tahun, jumlah);
                    } catch (Exception error){
                        System.out.println("Perhatikan Inputan Anda!");
                        nChoice = false;
                    }
                } else if (pilih == 3) {
                    System.out.println("\n3. Lihat Stok");
                    System.out.println("Informasi Mobil");
                    viewStok();
                } else if (pilih == 4) {
                    System.out.println("\n4. Keluar");
                    nChoice = false;
                } else {
                    System.out.println("Pilihan tidak ada!");
                    nChoice = false;
                }
            }catch (Exception error){
                System.out.println("Inputan harus angka!");
                nChoice = false;
            }
        }while(nChoice);
    }

    public static void tambahMobil(String merk, String tahunKeluaran, double harga, int stok){
        arrMobil.add(new Mobil(merk, tahunKeluaran, harga, stok));
        System.out.println("Mobil ditambahkan!");
    }

    public static void beliMobil(String merk, String tahun, int jumlah) {
        Mobil tempGudang = null;
        boolean cek = true;

        //Cek Mobil Digudang
        for (Mobil mobil : arrMobil) {
            if (mobil.getMerk().equalsIgnoreCase(merk)) {
                tempGudang = mobil;
                cek = false;
            }
        }

        //Cek Kondisi Gudang
        if (cek) {
            System.out.println("merk tidak ditemukan.");
        } else {
            if (tempGudang.getTahunKeluaran().equals(tahun)) {
                if (tempGudang.getStok() >= jumlah) {
                    if (jumlah == 1){
                        tempGudang.setStok(tempGudang.getStok() - jumlah);
                        System.out.println("\n============== Slip Pembelian ==============");
                        System.out.println("Pembelian tanpa diskon");
                        System.out.println("Merk\t\t\t: " + tempGudang.getMerk());
                        System.out.printf("Harga Satuan\t: %.2f%n", tempGudang.getHarga());
                        System.out.println("Tahun Keluaran\t: " + tempGudang.getTahunKeluaran());
                        System.out.println("Jumlah Beli\t\t: " + jumlah);
                        System.out.printf("Total Bayar\t\t: %.2f%n", tempGudang.getHarga());
                    } else if(jumlah == 2) {
                        double diskon = 10.0;
                        tempGudang.setStok(tempGudang.getStok() - jumlah);
                        double totalDiskon = (tempGudang.getHarga() * diskon) / 100;
                        double totalBayar = tempGudang.getHarga() - totalDiskon;
                        System.out.println("\n============== Slip Pembelian ==============");
                        System.out.println("Diskon yang didapatkan sebesar 10%");
                        System.out.println("Merk\t\t\t: " + tempGudang.getMerk());
                        System.out.printf("Harga Satuan\t: %.2f%n", tempGudang.getHarga());
                        System.out.println("Tahun Keluaran\t: " + tempGudang.getTahunKeluaran());
                        System.out.println("Jumlah Beli\t\t: " + jumlah);
                        System.out.printf("Total Diskon\t: %.2f%n", totalDiskon);
                        System.out.printf("Total Bayar\t\t: %.2f%n", totalBayar);
                    } else if (jumlah > 2) {
                        double diskon = 20.0;
                        tempGudang.setStok(tempGudang.getStok() - jumlah);
                        double totalDiskon = (tempGudang.getHarga() * diskon) / 100;
                        double totalBayar = tempGudang.getHarga() - totalDiskon;
                        System.out.println("\n============== Slip Pembelian ==============");
                        System.out.println("Diskon yang didapatkan sebesar 20%");
                        System.out.println("Merk\t\t\t: " + tempGudang.getMerk());
                        System.out.printf("Harga Satuan\t: %.2f%n", tempGudang.getHarga());
                        System.out.println("Tahun Keluaran\t: " + tempGudang.getTahunKeluaran());
                        System.out.println("Jumlah Beli\t\t: " + jumlah);
                        System.out.printf("Total Diskon\t: %.2f%n", totalDiskon);
                        System.out.printf("Total Bayar\t\t: %.2f%n", totalBayar);
                    } else {
                        System.out.println("\nGak Beli Gak Masalah Kok, Liat-liat aja dulu mari!");
                    }
                } else {
                    System.out.println("\nMaaf, Jumlah Stok Tidak Mencukupi");
                }
            } else {
                System.out.println("\nTahun keluaran mobil tidak ada");
            }
        }
    }

    public static void viewStok(){
        for (Mobil mobil : arrMobil){
            mobil.displayInfo();
        }
    }
}

