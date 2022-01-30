package _2021_11_30_grananja;

import java.util.Scanner;

/*
 * Grananja3: Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana
 * (Vodite racuna o prestupnoj godini!)
 */

public class Grananja3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Unesite godinu: ");
        int godina = in.nextInt();

        System.out.print("Unesite mesec: ");
        int mesec = in.nextInt();

        if (mesec == 1) {
            System.out.println("Broj dana u mesecu je 31");
        } else if (mesec == 2) {
            if((godina % 4 == 0) && (godina % 100 != 0) || (godina % 400 == 0)) {
                System.out.println("Broj dana u mesecu je 29");
            } else {
                System.out.println("Broj dana u mesecu je 28");
            }
        } else if (mesec == 3) {
            System.out.println("Broj dana u mesecu je 31");
        } else if (mesec == 4) {
            System.out.println("Broj dana u mesecu je 30");
        } else if (mesec == 5) {
            System.out.println("Broj dana u mesecu je 31");
        } else if (mesec == 6) {
            System.out.println("Broj dana u mesecu je 30");
        } else if (mesec == 7) {
            System.out.println("Broj dana u mesecu je 31");
        } else if (mesec == 8) {
            System.out.println("Broj dana u mesecu je 31");
        } else if (mesec == 9) {
            System.out.println("Broj dana u mesecu je 30");
        } else if (mesec == 10) {
            System.out.println("Broj dana u mesecu je 31");
        } else if (mesec == 11) {
            System.out.println("Broj dana u mesecu je 30");
        } else if (mesec == 12) {
            System.out.println("Broj dana u mesecu je 31");
        }
    }
}
