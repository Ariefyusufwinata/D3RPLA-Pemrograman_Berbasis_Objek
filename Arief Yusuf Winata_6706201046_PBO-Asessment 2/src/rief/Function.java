package rief;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Function {
    private final static Scanner in = new Scanner(System.in);
    private final static ArrayList<Keanggotaan> listAnggota = new ArrayList<>();

    public static void dummyAnggota(){
        Keanggotaan anggota = new Aktif("Arief Yusuf Winata", "Android", +62442321, "@rief", 2020);
        listAnggota.add(anggota);
        Keanggotaan anggota2 = new Aktif("Ma'isy Yazid", "Web", +63223, "@haloyazid",2020);
        listAnggota.add(anggota2);
        Keanggotaan anggota3 = new Aktif("Wanda Aprianingrum", "UI UX", +623123, "@wanda",2020);
        listAnggota.add(anggota3);

        Keanggotaan anggota4 = new Alumni("Bang Andre", "Mentor Mobile Dev", +6284123, "@andre", 2019);
        listAnggota.add(anggota4);
        Keanggotaan anggota5 = new Alumni("Bang Alif", "Mentor Web Dev", +623312, "@putra",2019);
        listAnggota.add(anggota5);
    }

    public static void addAnggota(){
        String nama, divisi, akunInstagram;
        int noTelepon, tahunMasuk;

        System.out.println("""
                
                1. Aktif
                2. Alumni
                3. Keluar""");
        System.out.print("Pilih : ");
        String cekStatus = in.next();

        if(cekStatus.equalsIgnoreCase("Aktif") || cekStatus.equals("1")){
            System.out.println(" ");
            System.out.print("Nama : ");
            nama = in.next();
            System.out.print("Divisi : ");
            divisi = in.next();
            System.out.print("No Telepon : ");
            noTelepon = in.nextInt();
            System.out.print("Akun Instagram : ");
            akunInstagram = in.next();
            System.out.print("Tahun Masuk : ");
            tahunMasuk = in.nextInt();
            Keanggotaan anggota = new Aktif(nama, divisi, noTelepon, akunInstagram,  tahunMasuk);
            listAnggota.add(anggota);
            System.out.println(" ");
        } else if(cekStatus.equalsIgnoreCase("Alumni") || cekStatus.equals("2")){
            System.out.println(" ");
            System.out.print("Nama : ");
            nama = in.next();
            System.out.print("Divisi : ");
            divisi = in.next();
            System.out.print("No Telepon : ");
            noTelepon = in.nextInt();
            System.out.print("Akun Instagram : ");
            akunInstagram = in.next();
            System.out.print("Tahun Masuk : ");
            tahunMasuk = in.nextInt();
            Keanggotaan anggota = new Alumni(nama, divisi, noTelepon, akunInstagram,  tahunMasuk);
            listAnggota.add(anggota);
            System.out.println(" ");
        } else if(cekStatus.equalsIgnoreCase("Keluar") || cekStatus.equals("3")){
            System.out.println("Keluar");
        } else {
            System.out.println("Input tidak ada");
        }
    }

    public static void deleteData(){
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();
        System.out.print("Masukkan Tahun : ");
        String akun = in.nextLine();
        for (int i = 0; i < listAnggota.size(); i++) {
            if(listAnggota.get(i).nama.equalsIgnoreCase(nama) && listAnggota.get(i).akunInstagram.equalsIgnoreCase(akun)){
                listAnggota.get(i).display();
                listAnggota.remove(listAnggota.get(i));
                System.out.println(" ");
            }
        }
    }

    public static void dispData(){
        System.out.println("""
                
                1. Aktif
                2. Alumni
                3. Keseluruhan Data
                4. Keluar""");
        System.out.print("Pilih : ");
        String cekStatus = in.nextLine();

        if(cekStatus.equalsIgnoreCase("Aktif") || cekStatus.equalsIgnoreCase("1")){
            System.out.println(" ");
            for (int i = 0; i < listAnggota.size(); i++) {
                if(listAnggota.get(i).status.equalsIgnoreCase("Aktif")){
                    System.out.println("No : " + (i + 1));
                    listAnggota.get(i).display();
                    System.out.println(" ");
                }
            }
        } else if(cekStatus.equalsIgnoreCase("Alumni") || cekStatus.equalsIgnoreCase("2")){
            System.out.println(" ");
            for (int i = 0; i < listAnggota.size(); i++) {
                if(listAnggota.get(i).status.equalsIgnoreCase("Alumni")){
                    System.out.println("No : " + (i + 1));
                    listAnggota.get(i).display();
                    System.out.println(" ");
                }
            }
        } else if (cekStatus.equalsIgnoreCase("Keseluruhan Data") || cekStatus.equalsIgnoreCase("3")){
            System.out.println(" ");
            for (int i = 0; i < listAnggota.size(); i++) {
                System.out.println("No : " + (i + 1));
                listAnggota.get(i).display();
                System.out.println(" ");
            }
        } else if(cekStatus.equalsIgnoreCase("Keluar") || cekStatus.equals("4")){
            System.out.println("Keluar");
        } else {
            System.out.println("Input tidak ada");
        }
    }

    public static void closeApp(){
        System.out.println("Terimakasih, guys");
    }

}