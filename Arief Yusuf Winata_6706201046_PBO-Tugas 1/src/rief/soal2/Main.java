package rief.soal2;

public class Main {

    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        System.out.println("Judul = " + buku1.getJudul() + ", Pengarang = " + buku1.getPengarang() + ", Harga = "  + buku1.getHarga());
        System.out.println("Judul = " + buku2.getJudul() + ", Pengarang = " + buku2.getPengarang() + ", Harga = "  + buku2.getHarga());
    }
}
