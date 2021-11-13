package rief;

public class Tetap extends Karyawan{
    private double tuDas;

    public Tetap(String nama, double gasDas, double tuDas) {
        super(nama, gasDas);
        this.tuDas = tuDas;
        super.id = 1;
    }

    public void display(){
        super.display();
        System.out.println("Tujangan Dasar\t: " + this.tuDas);
    }

}
