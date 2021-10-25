package rief.bagian1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n==============================");
        System.out.println("|| Bangun Datar Lingkaran : ||");
        System.out.println("==============================");

        //Jejari Lingkaran 7
        System.out.println("Lingkaran dengan jejari = 7");
        System.out.print("a. Luas : ");
        Lingkaran.luas(7);
        System.out.print("b. Keliling : ");
        Lingkaran.keliling(7);
        System.out.println();

        //Jejari Lingkaran 5.5
        System.out.println("Lingkaran dengan jejari = 5.5");
        System.out.print("a. Luas : ");
        Lingkaran.luas(5.5d);
        System.out.print("b. Keliling : ");
        Lingkaran.keliling(5.5d);
        System.out.println();

        //Jejari Lingkaran 20.4
        System.out.println("Lingkaran dengan jejari = 20.4");
        System.out.print("a. Luas : ");
        Lingkaran.luas(20.4f);
        System.out.print("b. Keliling : ");
        Lingkaran.keliling(20.4f);
    }
}
