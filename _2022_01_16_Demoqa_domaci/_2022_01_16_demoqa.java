package _2022_01_16_Demoqa_domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _2022_01_16_demoqa {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");

        Cookie kolacicUser = new Cookie("username", "vera.simonovic");
        driver.manage().addCookie(kolacicUser);
        driver.navigate().refresh();

        Cookie kolacicID = new Cookie("userID", "82f6e9cb-a78c-4b8f-9e5b-62f284aa5ff9");
        driver.manage().addCookie(kolacicID);
        driver.navigate().refresh();

        Cookie kolacicExpires = new Cookie("expires", "2022-01-23T16%3A07%3A45.542Z");
        driver.manage().addCookie(kolacicExpires);
        driver.navigate().refresh();

        Cookie kolacicToken = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InZlcmEuc2ltb25vdmljIiwicGFzc3dvcmQiOiJASmFob3JpbmFAODQiLCJpYXQiOjE2NDIzNDkyNjV9.x1r14gSZgxDxIlIBRQ0X4KAJB8l8WBu_LU6TBz_itEw");
        driver.manage().addCookie(kolacicToken);
        driver.navigate().refresh();

        Thread.sleep(2000);

        WebElement logOut = driver.findElement(By.id("submit"));
        logOut.click();

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-primary"));

        Assert.assertTrue(loginButton.isDisplayed());
    }
}



