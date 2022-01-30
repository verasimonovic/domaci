package _2021_11_30_grananja;

import java.util.Scanner;

/*
 * Grananja2: Napisati program koji ce racunati povrsinu okrecene prostorije,
 * tako sto se ivice prostorije ucitavaju preko konzole.
 * (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
 * Koristiti grananja kako bismo se ogradili od nemogucih izracunavanja povrsina
 * (kakvi celi brojevi moraju da budu visina, sirina i duzina?)
 */
public class Grananja2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Unesite sirinu prostorije: ");
        float a = in.nextFloat();

        if (a < 1) {
            System.out.println("Sirina prostorije ne sme da bude manja od 1m");
        } else {
            System.out.print("Unesite duzinu prostorije: ");
            float b = in.nextFloat();

            if (b < 1) {
                System.out.println("Duzina prostorije ne sme da bude manja od 1m");
            } else {
                System.out.print("Unesite visinu prostorije: ");
                float c = in.nextFloat();

                if (c < 1) {
                    System.out.println("Visina prostorije ne sme da bude manja od 1m");
                } else {
                    float result = 2 * a * c + 2 * b * c + a * b;
                    System.out.println("Povrsina prostorije za krecenje je: " + result);
                }
            }
        }
    }
}
