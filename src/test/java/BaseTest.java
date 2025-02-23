import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.Locale;

public class BaseTest {
    static WebDriver driver;

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setUpBrowser(){
       // Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    public void openUrl() {
        String url = "https://qa.koel.app/";
        driver.get(url);
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(By.cssSelector("[type='email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password){
        WebElement passwordInput = driver.findElement(By.cssSelector("[type = 'password']"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    protected void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit"));
        loginButton.click();
    }
    public void logIn(String email,String password){
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
    public String generateRandomName(){
        Faker faker = new Faker(new Locale("en-US"));
        String newName = faker.name().firstName();
        return newName;
    }
    public String generateRandomPlaylistName(){
        Faker faker = new Faker(new Locale("en-US"));
        String newName = faker.address().cityName();
        return newName;
    }
}