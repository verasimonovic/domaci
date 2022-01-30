package _2021_12_14_nizovi_i_metode;

import java.util.Scanner;

/*
 * 31. Napisati funkciju koja racuna proizvod 3 broja.
 * Hint kako citati ove zadatke:
 * - ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
 * - funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)
 */
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int a = sc.nextInt();
        System.out.println("Unesite drugi broj");
        int b = sc.nextInt();
        System.out.println("Unesite treci broj");
        int c = sc.nextInt();

        int d = Zadatak4.proizvod(a, b, c);
        System.out.println("Proizvod ovih brojeva je: " + d);
    }

    public static int proizvod(int a, int b, int c){
        return a*b*c;
    }
}
