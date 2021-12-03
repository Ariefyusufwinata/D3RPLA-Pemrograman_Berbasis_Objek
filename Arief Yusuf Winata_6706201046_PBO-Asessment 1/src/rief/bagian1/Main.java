package rief.bagian1;

public class Main {

    public static void main(String[] args) {

        //Asuransi && Dropship
        MarketPlace transAnsDrop = new MarketPlace(
                1,
                "NOOO1",
                "JNE",
                21000,
                "Dropship1",
                "Surabaya",
                "Bejo",
                "Dayeukolot",
                400000,
                true,
                true
        );
        transAnsDrop.displayData();


        //Asuransi
        MarketPlace transAns = new MarketPlace(
          2,
          "NOOO3",
          "J&T",
          16000,
          "Eiger",
          "Bandung Kopo",
          "Tini",
          "Dayeuhkolot",
          40000,
          true
        );
        transAns.displayData();

        // Normal
        MarketPlace transNormal = new MarketPlace(
                3,
                "NOOO4",
                "Pos Indonesia",
                23000,
                "Eiger",
                "Bandung Kopo",
                "Bambang",
                "Dayeuhkolot");
        transNormal.displayData();

        //Dropship
        MarketPlace transDrop = new MarketPlace(
          4,
          "NOOO2",
          "siCepat",
          24000,
          "Dropship2",
          "Pontianak",
          "Joko",
          "Dayeuhkolot",
          true
        );
        transDrop.displayData();

        //Asuransi > 2000
        MarketPlace transAnsUp = new MarketPlace(
                5,
                "NOOO5",
                "SiKilat",
                22000,
                "Arief",
                "Bandung",
                "Nero",
                "Dayeuhkolot",
                2000,
                true
        );
        transAnsUp.displayData();
    }
}
