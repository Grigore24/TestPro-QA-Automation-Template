package pagesObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver givendriver) {
        super(givendriver);
    }
    //////// LOCATORS LoginPage ////////////

    By emailField = By.cssSelector("[type='email']");
    By passwordField = By.cssSelector("[type = 'password']");
    By submitLoginButton = By.cssSelector("[type='submit");

    /////////// METHODS LoginPage ///////////
    public void enterEmail(String email) {
        WebElement emailInput = waitUntilClickable(emailField);
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
    }
    public void enterPassword(String password){
        WebElement passwordInput = waitUntilClickable(passwordField);
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        WebElement loginButton = waitUntilClickable(submitLoginButton);
        loginButton.click();
    }
    public void logIn(String email,String password){
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
    public String getLoginURL(){
        String newURL = driver.getCurrentUrl();
        return newURL;
    }
    public boolean isLoginButtonDisplayed() {
        WebElement loginButton = waitUntilClickable(submitLoginButton);
        return loginButton.isDisplayed();
    }
}
