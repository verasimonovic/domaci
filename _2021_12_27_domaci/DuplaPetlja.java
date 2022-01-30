package _2021_12_27_domaci;

/**
 * 1.Dupla petlja:
 * U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje
 * (Primer ispisa:
 * Week: 1
 * Day: 1
 * Day: 2
 * Day: 3 //sve do Day: 7
 * Week: 2
 * Day: 1
 * Day: 2
 * Day: 3.......
 * Week: 3
 * Day: 1
 * Day: 2
 * Day: 3......)
 */
public class DuplaPetlja {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Week: " + (i + 1));
            for (int j = 0; j < 7; j++) {
                System.out.println("Day: " + (j + 1));
            }
        }
    }
}
