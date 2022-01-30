package _2021_12_14_nizovi_i_metode;

import java.util.Scanner;

/*
 * 27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
 * Primer: [1, 2, 3, 4, 5] -> 1 3 5
 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko zelite da unesete brojeva?");
        int n = sc.nextInt();

        int[] brojevi = new int[n];
        int broj;
        for (int i = 0; i < brojevi.length; i++) {
            System.out.print("Unesite broj: ");
            broj = sc.nextInt();
            brojevi[i] = broj;
        }

        for (int i = 0; i < brojevi.length; i = i + 2) {
            System.out.println(brojevi[i]);
        }
    }
}

