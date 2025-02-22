import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test
    public void loginEmptyEmailPassword() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);

        WebElement emailInput = driver.findElement(By.cssSelector("[type='email']"));
        emailInput.click();
        emailInput.clear();


        WebElement passwordInput = driver.findElement(By.cssSelector("[type = 'password']"));
        passwordInput.click();
        passwordInput.clear();

        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit"));
        loginButton.click();


        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }

    @Test
    public void loginSuccessTest() throws InterruptedException {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);
        WebElement emailInput = driver.findElement(By.cssSelector("[type='email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("grigore.crepciuc@testpro.io");

        WebElement passwordInput = driver.findElement(By.cssSelector("[type = 'password']"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("te$t$tudent22");

        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit"));
        loginButton.click();
        WebElement avatar = driver.findElement((By.cssSelector(".avatar")));
        Thread.sleep(5000);
        Assert.assertTrue(avatar.isDisplayed());
        driver.quit();
    }
    @Test
    public void loginInvalidEmailValidPassword() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);
        WebElement emailInput = driver.findElement(By.cssSelector("[type='email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("pgrigore.crepciuc@testpro.io");

        WebElement passwordInput = driver.findElement(By.cssSelector("[type = 'password']"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("te$t$tudent22");

        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit"));
        loginButton.click();

        Assert.assertTrue(loginButton.isDisplayed());
        driver.quit();
    }
}
