package _2021_12_03_petlje;

/*
 *Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
 * Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1. Dakle, npr:
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 * 3! = 3 * 2 * 1 = 6
 */

import java.util.Scanner;

public class Petlje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo pozitivan broj");
        int n = sc.nextInt();

        int faktorijel = 1;
        for (int i = n; i >= 1; i--) {
            faktorijel = faktorijel * i;
        }
        System.out.println("Faktorijel broja " + n + " je: " + faktorijel);

    }
}
