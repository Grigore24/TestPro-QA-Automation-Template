package pagesObjectsModel;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public BasePage(WebDriver givendriver) {
        driver = givendriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions (driver);
    }
    ////// LOCATORS //////
    By locatorSuccessBunner = By.cssSelector(".success");

    ////////////// METHODS ///////////
    public String generateRandomName(){
        Faker faker = new Faker(new Locale("en-US"));
        String newName = faker.name().firstName();
        return newName;
    }
    public void refreshPage() {
        driver.navigate().refresh();
    }
    public WebElement waitUntilClickable(By element){
        return new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.elementToBeClickable(element));
    }
    public WebElement waitUntilVisible(By element){
        return new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public WebElement presenceOfElementLocated(By element){
        return new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.presenceOfElementLocated(element));
    }
    public boolean isSuccessBannerDisplayed(){
        return driver.findElement(locatorSuccessBunner).isDisplayed();
    }
}
