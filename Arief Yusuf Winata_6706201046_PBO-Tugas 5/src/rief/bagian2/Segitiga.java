package rief.bagian2;

public class Segitiga {
    private double alas, tinggi;
    private float sisi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = (float) Math.sqrt(Math.pow(alas/2, 2) * Math.pow(tinggi, 2)); // 1/2 * A * T ==> Mencari sisi
    }

    public Segitiga(double alas, float sisi) {
        this.alas = alas;
        this.sisi = sisi;
        this.tinggi = Math.sqrt(Math.pow(sisi, 2) - Math.pow(alas/2, 2)); // sisi - 1/2 * alas ==> Mencari tinggi
    }

    public double luas(){
        return (this.alas * this.tinggi) / 2;
    }

    public double keliling(){
        return this.alas + (2 * this.sisi);
    }

}
