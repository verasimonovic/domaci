package _2021_11_30_sintaksa;

import java.util.Scanner;

/*
 * Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
 * tako sto se ivice prostorije ucitavaju preko konzole.
 * (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
 */
public class Sintaksa1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Unesite sirinu prostorije: ");
        float a = in.nextFloat();

        System.out.print("Unesite duzinu prostorije: ");
        float b = in.nextFloat();

        System.out.print("Unesite visinu prostorije: ");
        float c = in.nextFloat();

        float result = 2 * a * c + 2 * b * c + a * b;

        System.out.println("Povrsina prostorije za krecenje je: " + result);
    }
}
