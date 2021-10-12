package rief;

public class Main {

    public static void main(String[] args) {
        int nomorUrut;

        //Daftar Jurusan
        Jurusan jurusan1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan jurusan2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        //Daftar Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa mahasiswa2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa mahasiswa3 = new Mahasiswa("6703", "Agus");
        Mahasiswa mahasiswa4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa mahasiswa5 = new Mahasiswa("6302", "Siska");
        Mahasiswa mahasiswa6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa mahasiswa7 = new Mahasiswa("6304", "Rahmat");

        //Menambahkan Mahasiswa Ke Jurusan 1
        jurusan1.addMhs(mahasiswa1);
        jurusan1.addMhs(mahasiswa2);
        jurusan1.addMhs(mahasiswa3);
        System.out.println(
                "Kode: " + jurusan1.getKode() + "\n" +
                        "Nama: " + jurusan1.getNama() + "\n" +
                        "Daftar Mahasiswa: "
        );
        nomorUrut = 0;
        for (Mahasiswa m : jurusan1.getMhs()){
            nomorUrut++;
            System.out.println("    " + nomorUrut + ". " + m.getNim() + " - " + m.getNama());
        }

        //Menambahkan Mahasiwa Ke Jurusan 2
        jurusan2.addMhs(mahasiswa4);
        jurusan2.addMhs(mahasiswa5);
        jurusan2.addMhs(mahasiswa6);
        jurusan2.addMhs(mahasiswa7);
        System.out.println(
                "\nKode: " + jurusan2.getKode() + "\n" +
                        "Nama: " + jurusan2.getNama() + "\n" +
                        "Daftar Mahasiswa: "
        );
        nomorUrut = 0;
        for (Mahasiswa m : jurusan2.getMhs()){
            nomorUrut++;
            System.out.println("    " + nomorUrut + ". " + m.getNim() + " - " + m.getNama());
        }
    }
}
