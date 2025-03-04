package pagesObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SongsPage extends BasePage{
    public SongsPage(WebDriver givendriver) {
        super(givendriver);
    }
    /////// LOCATORS ///////
    By locatorSearchInput = By.cssSelector("#searchForm>input");
    By locatorClickOnViewAllButton = By.cssSelector("button[data-test='view-all-songs-btn']");
    By locatorSongInResults = By.cssSelector(".search-results .song-item .title");
    By locatorAddToButton = By.cssSelector(".btn-add-to");
    By locatorSongName = By.cssSelector("#playlistWrapper .song-item .title");
    By locatorFindSongHeader = By.cssSelector("strong");
    By locatorGoToAllSongs = By.cssSelector(".songs");
    By locatorFindFirstSong = By.cssSelector(".song-item");
    By locatorPlayButton = By.cssSelector(".playback");
    By locatorGetSongSize = By.cssSelector("#playlistWrapper .song-item");
    /////// METHODS //////
    public void searchForSong(String text) {
        WebElement searchInput = waitUntilClickable(locatorSearchInput);
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(text);
    }
    //Methods addSongsToPlaylist test
    //searchForSong(); I moved to BaseTest

    public void clickOnViewAllButton() {
        WebElement viewAllButton = waitUntilClickable(locatorClickOnViewAllButton);
        viewAllButton.click();
    }

    public void findSongInResults() {
        List<WebElement> songInResults = driver.findElements(locatorSongInResults);
        songInResults.get(0).click();
    }

    public void clickAddToButton() {
        WebElement addToButton = waitUntilVisible(locatorAddToButton);
        addToButton.click();
    }
    public String getSongName(){
        WebElement songName = waitUntilVisible(locatorSongName);
        String songText = songName.getText();
        return songText;
    }
    //Method from CSVDataProviders test
    public String findHeader() {
        WebElement header = driver.findElement(locatorFindSongHeader);
        return header.getText();
    }
    //METHODS playSongFromListTest

    public void goToAllSongs() {
        wait.until(ExpectedConditions.elementToBeClickable(locatorGoToAllSongs)).click();
    }

    public void rightClickOnFirstSong() {
        WebElement firstSong = driver.findElement(locatorFindFirstSong);
        Actions actions = new Actions(driver);
        actions.contextClick(firstSong).perform();
    }
    public void clickPlayBtn() {
        WebElement playBtn = driver.findElement(locatorPlayButton);
        playBtn.click();
    }
    //////
    public int getSongsSize(){
        List<WebElement> songs = driver.findElements(locatorGetSongSize);
        int number = songs.size();
        return songs.size();
    }
}
