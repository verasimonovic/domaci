package _2021_12_17_metode_domaci;
/*
 * 42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
 */

public class ProveraImena {
    public static void main(String[] args) {
        String[] niz = {"Ivana", "Slavica", "Veljko", "Milica", "Mladen", "Dobrila"};
        boolean imaImena = proveraMetoda(niz);
        if (imaImena) {
            System.out.println("U nizu postoji trazeno ime");
        } else {
            System.out.println("U nizu nema trazenog imena");
        }
    }

    public static boolean proveraMetoda(String[] niz) {
        boolean imaImena = false;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equals("Marija") || niz[i].equals("Petar")) {
                imaImena = true;
            } else if (!niz[i].equals("Marija") && !niz[i].equals("Petar")) {
                imaImena = false;
            }
        }
        return imaImena;
    }
}

