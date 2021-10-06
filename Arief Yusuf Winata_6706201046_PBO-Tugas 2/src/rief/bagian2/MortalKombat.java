package rief.bagian2;

public class MortalKombat {
    private String nama;
    private int hitPoint, kickPoint, nyawaTersisa;

    public MortalKombat(String nama, int hitPoint, int kickPoint) {
        this.nyawaTersisa = 100;
        this.nama = nama;
        this.hitPoint = hitPoint;
        this.kickPoint = kickPoint;
    }

    public void hit(MortalKombat pemain) {
        System.out.println(this.getName() + " memukul " + pemain.getName());
        pemain.nyawaTersisa = pemain.getnyawaTersisa() - this.hitPoint;
        System.out.println("Sisa nyawa " + pemain.getName() + ": " + pemain.getnyawaTersisa());
        System.out.println();
    }

    public void kick(MortalKombat pemain) {
        System.out.println(this.getName() + " menendang " + pemain.getName());
        pemain.nyawaTersisa = pemain.getnyawaTersisa() - this.kickPoint;
        System.out.println("Sisa nyawa " + pemain.getName() + ": " + pemain.getnyawaTersisa());
        System.out.println();
    }

    public int getnyawaTersisa() {
        return this.nyawaTersisa;
    }

    public String getName() {
        return this.nama;
    }
}

