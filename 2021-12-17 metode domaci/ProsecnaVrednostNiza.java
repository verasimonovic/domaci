package _2021_12_17_metode_domaci;
/*
 * Napisati funkciju koja racuna prosecnu vrednost double[] niza.
 */
public class ProsecnaVrednostNiza {
    public static void main(String[] args) {
        double[] niz = {2.5, 5.7, 14.6, 3.78, 54.2};

        double prosek = prosecnaVrednostNiza(niz);
        System.out.println("Prosecna vrednost niza je " + prosek);
    }
    public static double prosecnaVrednostNiza(double[] niz){
        double suma = 0;
        for (int i = 0; i < niz.length; i++){
            suma = suma + niz[i];
        }
        double prosek = suma / niz.length;
        return prosek;
    }
}
