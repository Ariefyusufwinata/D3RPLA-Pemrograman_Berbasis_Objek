package rief.bagian2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double alas, tinggi, sisi;

        System.out.println("\n================================");
        System.out.println("||  Bangun Datar Lingkaran :  ||");
        System.out.println("================================\n");

        boolean nChoice = true;

            do {
                try {
                System.out.print(
                        """
                                Silahkan Pilih :
                                1. Mencari Alas dan Tinggi
                                2. Mencari Alas dan Sisi
                                3. Keluar Dari Program
                                Masukkan pilihan Anda :\s"""
                );
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.println("\n1. Mencari Alas dan Tinggi");
                    try {
                        System.out.print("Masukkan Alas (cm): ");
                        alas = in.nextDouble();
                        System.out.print("Masukkan Tinggi (cm): ");
                        tinggi = in.nextDouble();
                        Segitiga segitiga = new Segitiga(alas, tinggi);
                        System.out.println("Luas bangun segitiga = " + segitiga.luas() + "cm²");
                        System.out.println("Keliling bangun segitiga = " + segitiga.keliling()  + "cm²" + "\n");
                    } catch (Exception error) {
                        System.out.println("Hanya menerima inputan bertipe angka!");
                    }
                } else if (choice == 2) {
                    System.out.println("\n2. Mencari Alas dan Sisi");
                    try {
                        System.out.print("Masukkan Alas (cm): ");
                        alas = in.nextDouble();
                        System.out.print("Masukkan Sisi (cm): ");
                        sisi = in.nextDouble();
                        Segitiga segitiga = new Segitiga(alas, sisi);
                        System.out.println("Luas bangun segitiga = " + segitiga.luas());
                        System.out.println("Keliling bangun segitiga = " + segitiga.keliling() + "\n");
                    } catch (Exception error) {
                        System.out.println("Hanya menerima inputan bertipe angka!");
                    }
                } else if (choice == 3) {
                    System.out.println("Selesai, Terimakasih 😁");
                    nChoice = false;
                } else {
                    System.out.println("Pilihan tidak ada, program dihentikan.");
                    nChoice = false;
                }
            }catch (Exception error){
                System.out.println("Inputan anda tidak valid!");
                nChoice = false;
            }
        } while (nChoice);
    }
}

// Diketahui 1  a = 20, t = 16
// Diketahui 2  a = 2, s = 4