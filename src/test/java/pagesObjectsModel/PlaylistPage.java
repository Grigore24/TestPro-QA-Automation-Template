package pagesObjectsModel;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PlaylistPage extends BasePage {
    public PlaylistPage(WebDriver givendriver) {
        super(givendriver);
    }
    /////// LOCATORS /////////
    By locatorNewPlayListNameInput = By.cssSelector("#songResultsWrapper > header  input[type=text]");
    By locatorPlusButton = By.cssSelector("[title ='Create a new playlist']");
    By locatorNewPlayListOption = By.cssSelector("[data-testid ='playlist-context-menu-create-simple']");
    By locatorInputPlayListName = By.cssSelector("[name='name']");
    By locatorPlayListHeader = By.cssSelector("#playlistWrapper h1");
    By locatorDeletePlayListButton = By.cssSelector("[title='Delete this playlist']");
    By locatorListOfPlaylists = By.cssSelector("#playlists a");
    By locatorDoubleClickChosePlaylist = By.cssSelector(".playlist:nth-child(3)");
    By locatorPlaylistInputField = By.cssSelector("input[name='name']");
    By locatorPlaylistElement = By.cssSelector(".playlist:nth-child(3)>a");
    ////// METHODS ///////////
    public String generateRandomPlaylistName(){
        Faker faker = new Faker(new Locale("en-US"));
        String newName = faker.address().cityName();
        return newName;
    }
    public void sentNewPlaylistName(String playlistName) {
        WebElement newPlaylistNameInput = waitUntilClickable(locatorNewPlayListNameInput);
        newPlaylistNameInput.click();
        newPlaylistNameInput.clear();
        newPlaylistNameInput.sendKeys(playlistName);

        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
    }
    public void createNewPlayListNamePlusButton(String playlist) {
        WebElement plusButton = waitUntilClickable(locatorPlusButton);
        plusButton.click();
        WebElement newPlaylistOption = waitUntilClickable(locatorNewPlayListOption);
        newPlaylistOption.click();
        WebElement inputPlayListName = waitUntilClickable(locatorInputPlayListName);
        inputPlayListName.click();
        inputPlayListName.clear();

        inputPlayListName.sendKeys(playlist);
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
    }
    public String getHeaderName(){
        WebElement playListHeader = waitUntilVisible(locatorPlayListHeader);
        String headerName = playListHeader.getText();
        return headerName;
    }
    public void clickDeletePlaylistButton() {
        WebElement deletePlaylistButton = waitUntilClickable(locatorDeletePlayListButton);
        deletePlaylistButton.click();
    }
    public List<String> getPlaylistNames() {
        List<WebElement> playlists = driver.findElements(locatorListOfPlaylists);
        // get playlist names from playlist elements
        List<String> playlistNames = new ArrayList<>();

        for (int i = 0; i < playlists.size(); i++) {
            String playlistName = playlists.get(i).getText();
            playlistNames.add(playlistName);
        }
        System.out.println(playlistNames);
        return playlistNames;
    }
    //METHODS renamePlaylist
    public void doubleClickChoosePlaylist() {
        WebElement playlistElement = presenceOfElementLocated(locatorDoubleClickChosePlaylist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlistElement).
                perform();
    }
    public void enterPlaylistName(String name) {
        WebElement playlistInputField = driver.findElement(locatorPlaylistInputField);
        playlistInputField.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), name);
        playlistInputField.sendKeys(Keys.ENTER);
    }
    public String getPlaylistNameText() {
        WebElement playlistElement = wait.until(ExpectedConditions.
                visibilityOfElementLocated(locatorPlaylistElement));
        String name = playlistElement.getText();
        return name;
    }
    public String getNewName(){
        String newName = getPlaylistNameText();
        return newName;
    }
    // Test countSongsInPlaylist
    public void choosePlaylistByName(String playlistName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), '"+playlistName+"')]"))).click();
    }
}
