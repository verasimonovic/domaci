package _2021_12_27_domaci;

/**
 * Array liste
 * Kreirajte array listu nekog vaseg interesovanje (npr sport)
 * -u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
 * -iz liste dohvatite 3. element liste i ispisite
 * -promenite naziv prvog elementa
 * -uklonite 5. element
 * -ispisite velicinu vase liste
 * -pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste
 */

import java.util.ArrayList;

public class MojSport {
    public static void main(String[] args) {
        ArrayList<String> sportovi = new ArrayList<String>();
        sportovi.add("trcanje");
        sportovi.add("plivanje");
        sportovi.add("skijanje");
        sportovi.add("biciklizam");
        sportovi.add("planinarenje");

        System.out.println(sportovi.get(2));

        sportovi.set(0, "odbojka");
        sportovi.remove(4);
        System.out.println(sportovi.size());

        //prvi nacin
        for (int i = 0; i < sportovi.size(); i++) {
            System.out.println(sportovi.get(i));
        }

        //drugi nacin
        for (String sport : sportovi) {
            System.out.println(sport);
        }
    }
}
