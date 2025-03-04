package pagesObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
    public HomePage(WebDriver givendriver) {
        super(givendriver);
    }
    //// LOCATORS HomePage//////
    By homeAvatar = By.cssSelector(".avatar");
    By locatorNewPlaylistSuccessBannerDisplayed = By.cssSelector("div[class='success show']");
    By locatorButtonPlayOrResume = By.cssSelector("[title='Play or resume']");
    By locatorPauseButton = By.cssSelector("[data-testid='pause-btn']");
    By locatorEqualizer = By.cssSelector("[alt='Sound bars']");
    By locatorPauseButtonExists = By.cssSelector("[data-testid='pause-btn']");
    //// METHODS HomePage //////
    public boolean isAvatarDisplayed() {
        WebElement avatar = waitUntilClickable(homeAvatar);
        return avatar.isDisplayed();
    }
    public void clickOnAvatar() {
        WebElement avatar = waitUntilClickable(homeAvatar);
        avatar.click();
    }
    public boolean isPlaylistSuccessBannerDisplayed(){
        WebElement newPlaylistSuccessBanner = waitUntilVisible(locatorNewPlaylistSuccessBannerDisplayed);
        return newPlaylistSuccessBanner.isDisplayed();
    }
    //Methods playSong test

    public void hoverClickPlayButton() {
        WebElement buttonPlayOrResume = presenceOfElementLocated(locatorButtonPlayOrResume);
        new Actions(driver)
                .moveToElement(buttonPlayOrResume)
                .perform();
        buttonPlayOrResume.click();
    }
    public boolean isPauseButtonDisplayed(){
        WebElement pauseBtn = waitUntilVisible(locatorPauseButton);
        return pauseBtn.isDisplayed();
    }
    public boolean isEqualizerDisplayed(){
        WebElement equalizer = waitUntilVisible(locatorEqualizer);
        return equalizer.isDisplayed();
    }
    //M E T H O D S playSongTest

    public void clickFooterPlayBtn() {
        Actions action = new Actions(driver);
        WebElement playBtn = driver.findElement(locatorButtonPlayOrResume);
        action
                .moveToElement(playBtn)
                .perform();
        playBtn.click();
    }
    public boolean pauseBtnExists() {
        return driver.findElement(locatorPauseButtonExists).isDisplayed();
    }
}
