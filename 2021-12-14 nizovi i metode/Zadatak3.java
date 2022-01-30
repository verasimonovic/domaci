package _2021_12_14_nizovi_i_metode;

import java.util.Scanner;

/*
 * 30. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati proizvod elemenata tog niza.
 */
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko zelite da unesete brojeva?");
        int n = sc.nextInt();

        int[] brojevi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = sc.nextInt();
            brojevi[i] = broj;
        }

        int proizvod = 1;
        for (int i = 0; i <= n-1; i++) {
            proizvod = proizvod * brojevi[i];
        }
        System.out.println("Rezultat mnozenja elemenata niza je: " + proizvod);
    }
}

