package _2022_01_21_Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSauceDemoLogin extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void userOneCanLogIn() {
        String validUsername = "standard_user";
        String validPassword = "secret_sauce";

        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickLogin();

        String loggedInURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, loggedInURL);
    }

    @Test
    public void userLockedOutCannotLogIn() {
        String validUsername = "locked_out_user";
        String validPassword = "secret_sauce";

        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickLogin();

        String loggedInURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";

        Assert.assertEquals(actualURL, loggedInURL);
        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
        Assert.assertEquals(loginPage.getErrorText(), expectedErrorMessage);
    }

    @Test
    public void userProblemSeesWrongProductImage() {
        String validUsername = "problem_user";
        String validPassword = "secret_sauce";

        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickLogin();

        String loggedInURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        WebElement productImage = driver.findElement(By.cssSelector("#item_4_img_link > img"));
        String productImageSrc = productImage.getAttribute("src");
        String expectedProductImageSrc = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";

        Assert.assertEquals(actualURL, loggedInURL);
        Assert.assertEquals(productImageSrc, expectedProductImageSrc);
    }

    @Test
    public void userPerformanceGlitchLoginAfterTimeout() {
        String validUsername = "performance_glitch_user";
        String validPassword = "secret_sauce";

        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickLogin();

        String loggedInURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, loggedInURL);
    }
}
