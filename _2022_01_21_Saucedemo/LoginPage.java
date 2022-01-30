package _2022_01_21_Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() { return driver.findElement(By.id("login-button")); }

    public WebElement getErrorMessage() {
        return driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"));
    }

//-------------------------------------

    public void insertUsername(String username) {
        this.getUsername().clear();
        this.getUsername().sendKeys(username);
    }

    public void insertPassword(String password) {
        this.getPassword().clear();
        this.getPassword().sendKeys(password);
    }

    public void clickLogin() {
        this.getLoginButton().click();
    }

    public String getErrorText() {
        return this.getErrorMessage().getText();
    }
}



