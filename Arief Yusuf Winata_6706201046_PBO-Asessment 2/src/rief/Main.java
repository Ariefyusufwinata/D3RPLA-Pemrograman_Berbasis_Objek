package rief;

import java.util.*;

public class Main extends Function {

    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);

        dummyAnggota();

        boolean nChoice = true;

        System.out.print("Username : ");
        String authUser  = in.nextLine();
        System.out.print("Password : ");
        String authPas = in.nextLine();

        if(authUser.equals("admin") && authPas.equals("admin")){
            System.out.println("Halo, Admin");
            System.out.println("=+=+=+= Selamat Datang Di ReaserchLAB =+=+=+=");
            do {
                System.out.print("""
                        
                        1. Lihat Anggota
                        2. Tambah Anggota
                        3. Hapus Data
                        4. Keluar
                        """);
                System.out.print("Pilih : ");
                choice = in.nextInt();
                if(choice == 1) {
                    dispData();
                } else if(choice == 2) {
                    addAnggota();
                } else if(choice == 3){
                    deleteData();
                } else if(choice == 4) {
                    closeApp();
                    nChoice = false;
                } else{
                    System.out.println("Input tidak ada");
                    nChoice = false;
                }
            } while (nChoice);
        } else {
            System.out.println("Gagal Login");
        }
    }
}
/**        
String authUser = "admin";
String authPas = "admin";

___Login___
user = admin
password = admin
**/        
