package pagesObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage extends BasePage{
    public ProfilePage(WebDriver givendriver) {
        super(givendriver);
    }
    ////// LOCATORS /////
    By locatorCurrentPasswordInput = By.cssSelector("#inputProfileCurrentPassword");
    By locatorProfileNameInput = By.cssSelector("#inputProfileName");
    By locatorCurrentEmailInput = By.id("inputProfileEmail");
    By locatorProfileSaveButton = By.cssSelector("[class='btn-submit']");
    By locatorProfileNameText = By.cssSelector("[class = 'view-profile']>span");
    ///// METHODS //////
    public void typeCurrentProfilePassword() {
        WebElement currentPasswordInput = waitUntilClickable(locatorCurrentPasswordInput);
        currentPasswordInput.click();
        currentPasswordInput.clear();
        currentPasswordInput.sendKeys("te$t$tudent22");
    }
    public void typeProfileName(String name) {
        System.out.println(name);
        WebElement profileNameInput = waitUntilClickable(locatorProfileNameInput);
        profileNameInput.click();
        profileNameInput.clear();
        profileNameInput.sendKeys(name);
    }
    public void typeProfileEmail() {
        WebElement currentEmailInput = waitUntilClickable(locatorCurrentEmailInput);
        currentEmailInput.click();
        currentEmailInput.clear();
        currentEmailInput.sendKeys("grigore.crepciuc@testpro.io");
    }
    public void clickOnProfileSaveButton() {
        WebElement saveButton = waitUntilVisible(locatorProfileSaveButton);
        saveButton.click();
    }
    public String getNewProfileName(){
        WebElement profileNameText = waitUntilClickable(locatorProfileNameText);
        String newName = profileNameText.getText();
        return newName;
    }
}
