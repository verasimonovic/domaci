package _2021_12_21_klase_domaci;

public class Voznja {
    public static void main(String[] args) {

        Vlasnik vlasnik1 = new Vlasnik("Vera", "Simonovic");
        Vlasnik vlasnik2 = new Vlasnik("Veljko", "Simonovic");

        Automobil automobil = new Automobil("vw", "id4", 123);

        automobil.dodajVlasnika(vlasnik1);
        automobil.dodajVlasnika(vlasnik2);

        System.out.println("Automobil, marka: " + automobil.getMarka() + ", model: " + automobil.getModel() + ", serijski broj: " + automobil.getSerijskiBroj());

        Vlasnik vlasnik3 = new Vlasnik("Mladen", "Bolic");
        Vlasnik vlasnik4 = new Vlasnik("Sasa", "Bolic");

        Automobil ferari = new Automobil("ferari", "testarossa", 456);

        ferari.dodajVlasnika(vlasnik3);
        ferari.dodajVlasnika(vlasnik4);

        System.out.println("Automobil, marka: " + ferari.getMarka()
                + ", model: " + ferari.getModel()
                + ", serijski broj: " + ferari.getSerijskiBroj()
                + ", vlasnici: " + ferari.getVlasnici());

        ferari.ukloniVlasnika(vlasnik4);

        System.out.println("Automobil, marka: " + ferari.getMarka()
                + ", model: " + ferari.getModel()
                + ", serijski broj: " + ferari.getSerijskiBroj()
                + ", vlasnici: " + ferari.getVlasnici());

    }
}
