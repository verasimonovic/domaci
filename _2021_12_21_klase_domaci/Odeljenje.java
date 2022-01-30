package _2021_12_21_klase_domaci;

import java.util.ArrayList;

/**
 * Napisati klasu Odeljenje koja ima sledeca polja:
 * - String oznaka
 * - ArrayList dnevnik
 * <p>
 * Napisati 2 konstruktora, opet na isti nacin.
 * Napisati gettere i settere za sva polja.
 * Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
 * Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
 * Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
 * Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
 * Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
 * Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
 * Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
 * Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
 * Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
 * Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
 * - "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
 * - "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
 * - "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
 * - "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
 * - "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu
 * Napisati metod izlistajDnevnik() koja vraca String oblika:
 * {ime} i {prezime} ima ocene:
 * {ocene}
 * za sve ucenike.
 * Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
 * - "Veliko odeljenje"; ako ima vise od 25 ucenika
 * - "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
 * - "Malo odeljenje"; ako ima ucenika manje od 15
 * Napisati toString() metod:
 * {Oznaka} odeljenja ima djake:
 * {Ime1} {Prezime1}
 * {Ime2} {Prezime2}
 * .
 * .
 * .
 * {ImeN} {PrezimeN}
 */
public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        this.dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj) {
        this.dnevnik.add(redniBroj, u);
    }

    public void pogledajOcene(Ucenik u) {
        ArrayList<Integer> ocene = u.getOcene();
        System.out.println(ocene);
    }

    public void pogledajOcene(int i) {
        Ucenik u = this.dnevnik.get(i);
        ArrayList<Integer> ocene = u.getOcene();
        System.out.println(ocene);
    }

    public double prosecnaOcena(Ucenik u) {
        ArrayList<Integer> ocene = u.getOcene();
        double suma = 0;
        for (int i = 0; i < ocene.size(); i++) {
            suma = suma + ocene.get(i);
        }
        double prosek = suma / ocene.size();
        return prosek;
    }

    public double prosecnaOcena(int i) {
        Ucenik u = this.dnevnik.get(i);
        ArrayList<Integer> ocene = u.getOcene();
        double suma = 0;
        for (int j = 0; j < ocene.size(); j++) {
            suma = suma + ocene.get(j);
        }
        double prosek = suma / ocene.size();
        return prosek;
    }

    public double prosecnaOcenaOdeljenja() {
        double prosek;
        if (dnevnik.size() == 0) {
            prosek = 0;
        } else {
            double suma = 0;
            for (int i = 0; i < dnevnik.size(); i++) {
                suma = suma + this.prosecnaOcena(i);
            }
            prosek = suma / dnevnik.size();
        }
        return prosek;
    }

    public void opisnaOcena(Ucenik u) {
        ArrayList<Integer> ocene = u.getOcene();
        boolean ucenikImaBarJednuJedinicu = false;
        for (int i = 0; i < ocene.size(); i++) {
            if (ocene.get(i) == 1) {
                ucenikImaBarJednuJedinicu = true;
                break;
            }
        }

        if (ucenikImaBarJednuJedinicu == true) {
            System.out.println("Nedovoljan");
        } else {
            double prosek = this.prosecnaOcena(u);
            if (prosek >= 4.5) {
                System.out.println("Odlican");
            } else if (prosek >= 3.5 && prosek < 4.5) {
                System.out.println("Vrlo dobar");
            } else if (prosek >= 2.5 && prosek < 3.5) {
                System.out.println("Dobar");
            } else if (prosek >= 1.5 && prosek < 2.5) {
                System.out.println("Dovoljan");
            }
        }
    }

    public String izlistajDnevnik() {
        Ucenik u;
        String rezultat = "";
        for (int i = 0; i < dnevnik.size(); i++) {
            u = this.dnevnik.get(i);
            rezultat = rezultat + u.getIme() + " " + u.getPrezime() + " ima ocene: \n";
            rezultat = rezultat + u.getOcene() + '\n';
        }
        return rezultat;
    }

    public String velicinaOdeljenja() {
        String velicinaOdeljenja = "";

        for (int i = 0; i < dnevnik.size(); i++) {
            if (dnevnik.size() > 25) {
                velicinaOdeljenja = "Veliko odeljenje";
            } else if (dnevnik.size() > 15 && dnevnik.size() < 25) {
                velicinaOdeljenja = "Srednje odeljenje";
            } else if (dnevnik.size() < 15) {
                velicinaOdeljenja = "Malo odeljenje";
            }
        }
        return velicinaOdeljenja;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenje ima djake:\n");
        Ucenik u;
        for (int i = 0; i < dnevnik.size(); i++) {
            u = dnevnik.get(i);
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append('\n');
        }
        return sb.toString();
    }
}
