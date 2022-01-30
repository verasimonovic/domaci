package _2022_01_18_Youtube_domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");

        WebElement textBox = driver.findElement(By.cssSelector("input"));

        textBox.sendKeys("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        Thread.sleep(2000);
        textBox.sendKeys(ENTER);
        Thread.sleep(2000);

        WebElement play = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div.e4xoPb > div.o0igqc > div:nth-child(1) > div > div > div > div > a > div.tHQl7d > div.lSegpf.tNxQIb.ynAwRc"));
        play.click();

    }
}
