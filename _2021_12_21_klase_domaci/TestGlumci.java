package _2021_12_21_klase_domaci;

public class TestGlumci {
    public static void main(String[] args) {
        Glumac glumac1 = new Glumac("Majkl", "Fasbender",'m', 47, 9.9, false);
        Glumac glumac2 = new Glumac("Anica", "Dobra", 'z', 52, 9.1, true);

        System.out.println(glumac1);
        System.out.println(glumac2);
    }
}
