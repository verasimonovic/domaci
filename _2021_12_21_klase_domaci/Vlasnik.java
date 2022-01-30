package _2021_12_21_klase_domaci;

public class Vlasnik {
    private String ime;
    private String prezime;

    public Vlasnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Vlasnik automobila je: ");
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        return sb.toString();
    }
}
