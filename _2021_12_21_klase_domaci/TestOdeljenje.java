package _2021_12_21_klase_domaci;

import java.util.ArrayList;

public class TestOdeljenje {
    public static void main(String[] args) {
        Odeljenje odeljenje = new Odeljenje("I3");

        Ucenik ivica = new Ucenik("Ivica", "Kostelic");
        Ucenik janica = new Ucenik("Janica", "Kostelic");

        ArrayList<Integer> ivicineOcene = new ArrayList<>();
        ivicineOcene.add(5);
        ivicineOcene.add(4);
        ivicineOcene.add(1);

        ivica.setPrezime("Kralj");
        ivica.setOcene(ivicineOcene);
        ivica.setPrezime("Kostelic");

        ArrayList<Integer> janicineOcene = new ArrayList<>();
        janicineOcene.add(5);
        janicineOcene.add(5);
        janicineOcene.add(5);

        janica.setOcene(janicineOcene);

        odeljenje.upisiUcenika(ivica);
        odeljenje.upisiUcenika(janica);

        odeljenje.pogledajOcene(ivica);
        odeljenje.pogledajOcene(janica);

        double ivicaProsek = odeljenje.prosecnaOcena(ivica);
        System.out.println(ivicaProsek);
        double janicaProsek = odeljenje.prosecnaOcena(janica);
        System.out.println(janicaProsek);

        double ivicinProsekPozivanjemDrugeMetode = odeljenje.prosecnaOcena(0);
        System.out.println(ivicinProsekPozivanjemDrugeMetode);

        System.out.println("Prosek odeljenja je: " + odeljenje.prosecnaOcenaOdeljenja());

        odeljenje.prosecnaOcenaOdeljenja();

        odeljenje.opisnaOcena(ivica);
        odeljenje.opisnaOcena(janica);

        String rezultat = odeljenje.izlistajDnevnik();
        System.out.println(rezultat);

        String velicinaOdeljenja = odeljenje.velicinaOdeljenja();
        System.out.println(velicinaOdeljenja);

        System.out.println(odeljenje);

    }
}
