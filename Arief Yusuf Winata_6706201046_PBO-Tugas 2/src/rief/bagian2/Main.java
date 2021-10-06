package rief.bagian2;

public class Main {
    public static void main(String[] args) {
        MortalKombat pemainSatu = new MortalKombat("Raiden", 10, 20);
        MortalKombat pemainDua = new MortalKombat("Sub-Zero", 5, 25);

        pemainDua.kick(pemainSatu);
        for (int i = 0; i < 3; i++) {
            pemainDua.hit( pemainSatu);
        }
        pemainSatu.kick(pemainDua);
        for (int i = 0; i < 4; i++) {
            pemainSatu.kick(pemainDua);
        }

        if (pemainSatu.getnyawaTersisa() == pemainDua.getnyawaTersisa()) {
            System.out.println("Duel Draw");
        } else if (pemainSatu.getnyawaTersisa() > pemainDua.getnyawaTersisa()) {
            System.out.println(pemainSatu.getName() + " Menang!" + " ,Sisa Nyawa " + pemainSatu.getnyawaTersisa());
        } else {
            System.out.println(pemainDua.getName() + " Menang!" + " ,Sisa Nyawa " + pemainDua.getnyawaTersisa());
        }
    }
}
