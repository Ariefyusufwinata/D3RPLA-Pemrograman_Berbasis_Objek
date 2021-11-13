package rief;

public class Main {
    public static void main(String[] args) {

        Departemen dp = new Departemen("D3RPLA");
        dp.addKaryawan(new Karyawan("Arief", 2));
        dp.addKaryawan(new Tetap("Yazid", 8, 5));
        dp.addKaryawan(new Kontrak("Wanda", 9, 8));
        dp.addKaryawan(new Tetap("Poncoe", 10, 12));

        dp.displayAll();
        dp.displayKontrak();
        dp.displayTetap();
    }
}

/*
NOTE :
tuDas  = Tunjangan Dasar
gasDas = Gaji Dasar
*/