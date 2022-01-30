package _2021_12_21_klase_domaci;

import java.util.ArrayList;

public class TestSportista {
    public static void main(String[] args) {
        Sportista igrac1 = new Sportista("Drazen Dalipagic", "kosarka", "Partizan", 5);
        Sportista igrac2 = new Sportista("Predrag Mijatovic", "fudbal", "Real Madrid", 8);
        Sportista igrac3 = new Sportista("Ivan Miljkovic", "odbojka", "Fenerbahce", 11);


        System.out.println("Sportista 1: "
                + igrac1.getImePrezime() + ", sport: "
                + igrac1.getSport() + ", klub: "
                + igrac1.getKlub() + ", broj: "
                + igrac1.getBroj());

        igrac2.setKlub("Partizan");

        ArrayList<Sportista> sportisti = new ArrayList<>(3);
        sportisti.add(igrac2);
        sportisti.add(igrac3);

        for (int i = 0; i < sportisti.size(); i++){
            System.out.println("Sportista: "
                    + sportisti.get(i).getImePrezime() + ", sport: "
                    + sportisti.get(i).getSport() + ", klub: "
                    + sportisti.get(i).getKlub() + ", broj: "
                    + sportisti.get(i).getBroj());
        }
    }
}
