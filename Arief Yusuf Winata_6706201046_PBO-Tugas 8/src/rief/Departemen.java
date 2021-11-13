package rief;

public class Departemen {
    private final String nama;
    private Karyawan[] kar = new Karyawan[5];
    private int index = 0;

    public Departemen(String nama) {
        this.nama = nama;
    }

    public void addKaryawan(Karyawan karyawan) {
        if (this.index < kar.length) {
            kar[this.index] = karyawan;
            this.index++;
        } else {
            System.out.println("Tidak Ada Lowongan Lagi!");
        }
    }

    public void displayAll() {
        System.out.println("Daftar Karyawan  " + this.nama  + " : ");
        System.out.println("========================");
        displayKaryawan();
        System.out.println("========================");
        displayTetap();
        System.out.println("========================");
        displayKontrak();
        System.out.println("========================");
    }

    public void displayKaryawan(){
        System.out.println("Karyawan Departemen \n");
        for (Karyawan karyawan : kar) {
            if (karyawan != null) {
                if (karyawan.id != 1 && karyawan.id != 2) {
                    karyawan.display();
                    System.out.println();
                }
            } else {
                return;
            }
        }
    }

    public void displayKontrak() {
        System.out.println("Karyawan Kontrak\n");
        for (Karyawan karyawan : kar) {
            if (karyawan != null) {
                if (karyawan.id == 2) {
                    karyawan.display();
                    System.out.println();
                }
            } else {
                return;
            }
        }
    }

    public void displayTetap() {
        System.out.println("Karyawan Tetap\n");
        for (Karyawan karyawan : kar) {
            if (karyawan != null) {
                if (karyawan.id == 1) {
                    karyawan.display();
                    System.out.println();
                }
            } else {
                return;
            }
        }
    }

}
