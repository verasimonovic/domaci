package _2021_12_21_klase_domaci;

/**
 * 1) Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
 * pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom)
 * i da li je iz Srbije odgovorite preko booleana. Sve potrebno za glumca i glumicu da budu dva ispisa (edited)
 */
public class Glumac {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean porekloIzSrbije;

    public Glumac(String ime, String prezime, char pol, int godine, double ocena, boolean porekloIzSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.porekloIzSrbije = porekloIzSrbije;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public char getPol() {
        return pol;
    }

    public int getGodine() {
        return godine;
    }

    public double getOcena() {
        return ocena;
    }

    public boolean isPorekloIzSrbije() {
        return porekloIzSrbije;
    }

    public String toString() {
        String poreklo;
        if (porekloIzSrbije == true) {
            poreklo = "iz Srbije";
        } else {
            poreklo = "nije iz Srbije";
        }
        StringBuilder sb = new StringBuilder("Glumac: ");
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(", pol ");
        sb.append(pol);
        sb.append(", godine ");
        sb.append(godine);
        sb.append(", ocena ");
        sb.append(ocena);
        sb.append(", ");
        sb.append(poreklo);
        return sb.toString();
    }
}
