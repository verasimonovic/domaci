package _2021_12_03_aritmeticke_operacije;

        /*Aritmeticke opracije
        Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima
        zbir, razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim
        tim redom.*/

import java.util.Scanner;

public class AritmetickeOperacije1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj");
        int a = sc.nextInt();

        System.out.println("Unesite jos jedan ceo broj");
        int b = sc.nextInt();

        int c = a + b;
        System.out.println("Zbir ova dva broja je " + c);

        int d = a - b;
        System.out.println("Razlika ova dva broja je " + d);

        int e = a * b;
        System.out.println("Proizvod ova dva broja je " + e);

        float f = a * 1.0f / b;
        System.out.println("Kolicnik ova dva broja je " + f);

        int g = a % b;
        System.out.println("Ostatak pri deljenju prvog broja drugim " + g);


    }


}
