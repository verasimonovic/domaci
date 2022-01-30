package _2022_01_27_domaci;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel tabele koji se zove Brojevi
 * (sami izaberite neke random brojeve). U tabeli svi brojevi se nalaze u prvoj koloni.
 * Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu.
 * Ukupnu sumu na kraju treba ispisati na standardnom izlazu. Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.
 */

public class SumaBrojeva {
    public WebDriver driver;
    public ExcelReader excelReader;

    @BeforeMethod
    public void setUp() throws IOException {
        excelReader = new ExcelReader("C:\\Users\\korisnik\\IdeaProjects\\domaci.xlsx");
    }

    @Test
    public void suma() {
        int suma = 0;
        for (int i = 0; i <= excelReader.getLastRow("Brojevi"); i++) {
            int broj = excelReader.getIntegerData("Brojevi", i, 0);
            suma = suma + broj;
        }
        System.out.println("Zbir unetih brojeva je " + suma);
    }
}
