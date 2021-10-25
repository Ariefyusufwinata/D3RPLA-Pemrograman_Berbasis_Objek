package rief.bagian1;

public class Lingkaran {
    private static final double PHI1 = 3.142857142857143; // Hasil Bagi 22/7 --> Sifatnya Khusus
    private static final double PHI2 = 3.14;

    public static void luas(int r){
        double diameter = Math.pow(r, 2);
        System.out.println(PHI1 * diameter);
    }

    public static void keliling(int r){
        System.out.println(2 * PHI1 * r);
    }

    public static void luas(double r){
        double diameter = Math.pow(r, 2);
        System.out.println(PHI2 * diameter);
    }

    public static void keliling(double r){
        System.out.println(2 * PHI2 * r);
    }

    public static void luas(float diameter){
        System.out.printf("%.3f\n", PHI2 * diameter);
    }

    public static void keliling(float diameter){
        double r = Math.sqrt(diameter); // 4.516635874025077
        System.out.printf("%.3f\n", 2 * PHI2 * r);
    }
}