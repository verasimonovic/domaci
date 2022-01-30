package _2021_12_03_petlje;

import java.util.Scanner;

/*
 * Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz"
 * ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5.
 */
public class Petlje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti pozitivan ceo broj");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println(i + ":FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ":Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ":Buzz");
            } else {
                System.out.println(i + ":");
            }
        }
    }
}
