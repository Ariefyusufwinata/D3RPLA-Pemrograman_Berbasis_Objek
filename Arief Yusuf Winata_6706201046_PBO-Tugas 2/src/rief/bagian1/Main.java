package rief.bagian1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Buku> daftarBuku = new ArrayList<>();
    static int isbn;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        boolean nChoice = true;

        //dummy add
        Buku daftar1 = new Buku(
                1,
                "Jika Kita Tak Pernah Jatuh Cinta",
                "Alvi Syahrin",
                2019,
                91500,
                10F);

        Buku daftar2 = new Buku(
                2,
                "Jika Kita Tak Pernah Jadi Apa-apa",
                "Alvi Syahrin",
                2020,
                915500,
                9.5F);
        daftarBuku.add(daftar1);
        daftarBuku.add(daftar2);

        while (nChoice) {

            System.out.print(
                    """
                            1. Lihat Buku
                            2. Cari Buku
                            3. Tambah Buku
                            4. Edit Buku
                            5. Hapus Buku
                            6. Keluar Dari Program
                            Masukkan pilihan Anda :\s"""
            );
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("\n1. Lihat Buku");
                lihatBuku();
                System.out.println(" ");
            } else if (choice == 2) {
                System.out.println("\n2. Cari Buku");
                cariBuku();
                System.out.println(" ");
            } else if (choice == 3) {
                System.out.println("\n3. Tambah Buku");
                tambahBuku();
                System.out.println(" ");
            } else if (choice == 4) {
                System.out.println("\n4. Edit Buku");
                editBuku();
                System.out.println(" ");
            } else if (choice == 5) {
                System.out.println("\n5. Hapus Buku");
                hapusBuku();
                System.out.println(" ");
            } else if (choice == 6){
                System.out.println("Selesai, Terimakasih 😁");
                nChoice = false;
            } else {
                System.out.println("Pilihan tidak ada, program dihentikan.");
                nChoice = false;
            }

        }

    }

    private static void lihatBuku(){
        for (Buku dbuku : daftarBuku){
            System.out.print(dbuku.toString());
        }
        System.out.println("\nItu aja isinya sih kayaknya 😊\n");
    }

    private static void tambahBuku(){
        Scanner in = new Scanner(System.in);

        System.out.print("ISBN : ");
        int isbn = in.nextInt();
        System.out.print("Judul Buku :  ");
        String judulBuku = in.next();
        System.out.print("Pengarang : ");
        String pengarang = in.next();
        System.out.print("Tahun : ");
        int tahun = in.nextInt();
        System.out.print("Harga : ");
        int harga = in.nextInt();
        System.out.print("Rating : ");
        float rating = in.nextFloat();

        daftarBuku.add(new Buku(isbn, judulBuku, pengarang, tahun, harga, rating));
    }

    private static void editBuku(){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan ISBN : ");
        isbn = in.nextInt();
        for (Buku dbuku : daftarBuku) {
            if (dbuku.getIsbn() == isbn) {
                System.out.print("Judul Buku : ");
                dbuku.setJudul(in.next());
                System.out.print("Pengarang : ");
                dbuku.setPengarang(in.next());
                System.out.print("Tahun");
                dbuku.setTahun(in.nextInt());
                System.out.print("Harga : ");
                dbuku.setHarga(in.nextInt());
                System.out.print("Rating : ");
                dbuku.setRating(in.nextFloat());
            }
        }
    }

    private static void hapusBuku(){
        Scanner in = new Scanner(System.in);
        System.out.print("IBSN buku : ");
        isbn = in.nextInt();
        for (Buku dbuku : daftarBuku){
            if(dbuku.getIsbn() == isbn){
                try {
                    daftarBuku.remove(dbuku);
                } catch (Exception error) {
                    System.out.println("Error");
                }
            }
        }
    }

    private static void cariBuku(){
        Scanner in = new Scanner(System.in);
        System.out.print("IBSN buku : ");
        isbn = in.nextInt();
        for (Buku dbuku : daftarBuku){
            if(dbuku.getIsbn() == isbn){
                try {
                    System.out.println(dbuku);
                } catch (Exception error) {
                    System.out.println("Error");
                }
            }
        }
    }
}