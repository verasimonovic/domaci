package _2021_11_30_grananja;

/*
 * Grananja1: Napisati program koji proverava da li je uneti broj paran.
 * Ukoliko jeste, program treba da ispise poruku: Broj je paran!
 * Ukoliko nije, program treba da ispise poruku: Broj je neparan!
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Grananja1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Unesite celi broj: ");
        int a = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("Broj je paran!");
        } else {
            System.out.println("Broj je neparan!");
        }
    }
}
