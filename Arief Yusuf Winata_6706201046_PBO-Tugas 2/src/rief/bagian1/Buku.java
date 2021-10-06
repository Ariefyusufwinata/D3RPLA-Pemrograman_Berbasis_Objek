package rief.bagian1;

public class Buku {
    private final int isbn;
    private String judul, pengarang;
    private int tahun;
    private int harga;
    private float rating;

    public Buku(int isbn, String judul, String pengarang, int tahun, int harga, float rating) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
        this.harga = harga;
        this.rating = rating;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\n" +
                "ISBN = " + isbn + '\n' +
                "Judul = " + judul + '\n' +
                "Pengarang = " + pengarang + '\n' +
                "Tahun = " + tahun + '\n' +
                "Harga = Rp. " + harga + '\n' +
                "Rating = " + rating + "\n";
    }
}