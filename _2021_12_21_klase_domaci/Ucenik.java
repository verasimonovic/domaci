package _2021_12_21_klase_domaci;

import java.util.ArrayList;

/**
 * Napisati klasu Ucenik koja ima sledeca polja:
 * - String ime
 * - String prezime
 * - ArrayList ocene
 * Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime, a ocene postavlja na praznu listu.
 * Napisati gettere i settere za sva polja.
 * Napisati toString() metod:
 * {ime} i {prezime} ima ocene:
 * {ocene}
 * Napisati metod proske koji racuna prosek Ucenika.
 * <p>
 * {ImeN} {PrezimeN}
 */
public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    public double prosekMetoda(){

        int suma =0;
        for(int i = 0; i < ocene.size(); i++){
            suma = suma + ocene.get(i);
        }
        double prosek = ((double) suma)/ ocene.size();
        return prosek;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" ima ocene: ");
        sb.append(ocene);
        return sb.toString();
    }
}