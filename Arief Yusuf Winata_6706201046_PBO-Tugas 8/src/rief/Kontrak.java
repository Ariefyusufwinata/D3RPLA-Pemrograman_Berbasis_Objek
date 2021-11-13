package rief;

public class Kontrak extends Karyawan{
    private int waktu;

    public Kontrak(String nama, double gasDas, int waktu) {
        super(nama, gasDas);
        this.waktu = waktu;
        super.id = 2;
    }

    public void display(){
        super.display();
        System.out.println("Waktu\t\t\t: " + this.waktu);
    }

}
