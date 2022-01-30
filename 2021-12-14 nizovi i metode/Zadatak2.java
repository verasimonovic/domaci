package _2021_12_14_nizovi_i_metode;

import java.util.Scanner;

/*
 * 29. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki treci element u obrnutom redosledu.
 */
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko zelite da unesete brojeva?");
        int n = sc.nextInt();

        int[] brojevi = new int[n];
        for (int i = 0; i < brojevi.length; i++) {
            System.out.print("Unesite broj: ");
            int broj = sc.nextInt();
            brojevi[i] = broj;
        }
        Zadatak2.ispisiSvakiTreci(brojevi);
    }

    public static void ispisiSvakiTreci(int[] brojevi) {
        for (int i = brojevi.length - 1; i >= 0; i = i - 3) {
            System.out.println(brojevi[i]);
        }
    }
}
