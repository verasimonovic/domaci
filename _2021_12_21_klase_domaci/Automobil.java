package _2021_12_21_klase_domaci;

import java.util.ArrayList;

/**
 * vozilo  - Napisati klasu Automobil. Automobil ima
 * 1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
 * 2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
 * 3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
 * Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku.
 * Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
 * Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
 */

public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;
    private ArrayList<Vlasnik> vlasnici;

    public Automobil(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnici = new ArrayList<>(4);
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public ArrayList<Vlasnik> getVlasnici() {
        return vlasnici;
    }

    public void dodajVlasnika(Vlasnik v) {
        vlasnici.add(v);
    }

    public void ukloniVlasnika(Vlasnik v) {
        vlasnici.remove(v);
    }


}
