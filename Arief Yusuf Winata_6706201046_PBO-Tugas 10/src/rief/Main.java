package rief;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> Customer = new ArrayList<>();
        ArrayList<Driver> Driver = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean nChoice = true;

        int choice, jenis, noCustomer, noDriver;
        double saldo, jumlahSaldo;
        String nik, nama, noTelpon, jenisKendaraan, noPlate;

        //Dummy Data
        Customer customer1 = new Customer(20000, "67062012224", "Arief", "0831234131");
        Driver driver1 = new Driver(50000, "6706201838", "Arief", "084324233", "BK1004", "Motor");
        Customer.add(customer1);
        Driver.add(driver1);

        do {
            System.out.print("""
                    1. Mendaftarkan Pengguna Baru
                    2. Lihat Daftar Pengguna
                    3. Top Up Saldo Pengguna
                    4. Transaksi Jasa Antar
                    5. Keluar
                    Masukan pilihan: """);
            choice = in.nextInt() ;
            if(choice == 1) {
                System.out.println("Mendaftarkan Pengguna Baru");
                System.out.print("1. Driver \n2. Customer \nPilih : ");
                jenis = in.nextInt();
                if(jenis == 1) {
                    System.out.print("NIK = ");
                    nik = in.next();
                    System.out.print("Nama = ");
                    nama = in.next();
                    System.out.print("No Telpon = ");
                    noTelpon = in.next();
                    System.out.print("Saldo = ");
                    saldo = in.nextDouble();
                    Customer customer = new Customer(saldo, nama, nik, noTelpon);
                    Customer.add(customer);
                    System.out.println(" ");
                }else if(jenis == 2) {
                    System.out.print("NIK = ");
                    nik = in.next();
                    System.out.print("Nama = ");
                    nama = in.next();
                    System.out.print("No Telpon = ");
                    noTelpon = in.next();
                    System.out.print("Jenis Kendaraan = ");
                    jenisKendaraan = in.next();
                    System.out.print("Nomor Plate = ");
                    noPlate = in.next();
                    System.out.print("Saldo = ");
                    saldo = in.nextDouble();
                    Driver driver = new Driver(saldo, nik, nama, noTelpon, noPlate, jenisKendaraan);
                    Driver.add(driver);
                    System.out.println(" ");
                } else {
                    System.out.println("Tipe Tidak Ada");
                }
            }else  if (choice == 2) {
                System.out.println("Lihat Daftar Pengguna");
                System.out.print("1. Driver \n2. Customer \nPilih : ");
                jenis = in.nextInt();
                if (jenis == 1) {
                    for (int i = 0; i < Driver.size(); i++) {
                        System.out.println("No: " + (i + 1));
                        Driver.get(i).infoMember();
                    }
                    System.out.println(" ");
                } else if (jenis == 2) {
                    for (int i = 0; i < Customer.size(); i++) {
                        System.out.println("No: " + (i + 1));
                        Customer.get(i).infoMember();
                    }
                    System.out.println(" ");
                } else {
                    System.out.println("Tipe Tidak Ada");
                }
            } else if(choice == 3) {
                System.out.println("Top Up Saldo Pengguna");
                System.out.print("No Customer : ");
                noCustomer = in.nextInt();
                System.out.print("No Driver : ");
                noDriver = in.nextInt();
                System.out.print("Jumlah saldo yang akan di Topup: ");
                jumlahSaldo = in.nextDouble();
                Customer customer = Customer.get(noCustomer - 1);
                Driver driver = Driver.get(noDriver - 1);
                customer.topUpSaldo(driver, jumlahSaldo);
                System.out.println(" ");
            } else if(choice == 4) {
                System.out.println("Transaksi Jasa Antar");
                System.out.print("No Customer: ");
                noCustomer = in.nextInt();
                System.out.print("No Driver: ");
                noDriver = in.nextInt();
                System.out.print("Masukkan saldo : ");
                jumlahSaldo = in.nextDouble();
                Driver driver = Driver.get(noDriver - 1);
                Customer customer = Customer.get(noCustomer - 1);
                driver.transaksiJasaAntar(customer, jumlahSaldo);
                System.out.println(" ");
            } else if(choice == 5) {
                System.out.println("Terimakasih!");
                nChoice = false;
            } else {
                System.out.println("Tidak ada pilihan yang sesuai");
                nChoice = false;
                break;
            }
        } while (nChoice);
    }
}