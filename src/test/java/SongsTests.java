import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SongsTests extends BaseTest {

    @Test
    public void addSongsToPlaylist() {
        String text = "Dark Days";
        String playlistName = generateRandomPlaylistName();

        //step 1 - Log In
        logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");

        //step 2 - Find search input
        searchForSong(text);

        //step 3 - Click on VIEW ALL Button
        clickOnViewAllButton();

        //step 4 - Click on the song in results
        findSongInResults();

        //step 5 - Click on ADD TO Button
        clickAddToButton();

        //step 6 - Click on New Playlist Name Input
        sentNewPlaylistName(playlistName);

        //step 7 - Assert is banner displayed and text Equals
        Assert.assertTrue(isPlaylistSuccessBannerDisplayed());

        //step 8 - songText Assert
        Assert.assertEquals(text,getSongName());
    }

    @Test
    public void playSong() {
        //step 1  - Log in
        logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");

        //step 2 - Find Play button and hover on it and click
        hoverClickPlayButton();

        //step 3 find pause button and assert
        Assert.assertTrue(isPauseButtonDisplayed());

        //step 4 find equalizer and assert
        Assert.assertTrue(isEqualizerDisplayed());
    }
    @Test
    public void checkVisibilityTest() {
        logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");
        WebElement title = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("title")));
        String text = title.getText();
        System.out.println(text);
        System.out.println("Is element invisible? === " + wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("title"))));
        //WebElement title2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("title")));  // should fail
    }

    //Methods addSongsToPlaylist test
    //searchForSong(); I moved to BaseTest

    private void clickOnViewAllButton() {
        WebElement viewAllButton = waitUntilClickable(By.cssSelector("button[data-test='view-all-songs-btn']"));
        viewAllButton.click();
    }

    private void findSongInResults() {
        List<WebElement> songInResults = driver.findElements(By.cssSelector(".search-results .song-item .title"));
        songInResults.get(0).click();
    }

    private void clickAddToButton() {
        WebElement addToButton = waitUntilVisible(By.cssSelector(".btn-add-to"));
        addToButton.click();
    }

    private void sentNewPlaylistName(String playlistName) {
        WebElement newPlaylistNameInput = waitUntilClickable(By.cssSelector("#songResultsWrapper > header  input[type=text]"));
        newPlaylistNameInput.click();
        newPlaylistNameInput.clear();
        newPlaylistNameInput.sendKeys(playlistName);

        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
    }
    public boolean isPlaylistSuccessBannerDisplayed(){
        WebElement newPlaylistSuccessBanner = waitUntilVisible(By.cssSelector("div[class='success show']"));
        return newPlaylistSuccessBanner.isDisplayed();
    }
    public String getSongName(){
        WebElement songName = waitUntilVisible(By.cssSelector("#playlistWrapper .song-item .title"));
        String songText = songName.getText();
        return songText;
    }

    //Methods playSong test

    private void hoverClickPlayButton() {
        WebElement buttonPlayOrResume = presenceOfElementLocated(By.cssSelector("[title='Play or resume']"));
        new Actions(driver)
                .moveToElement(buttonPlayOrResume)
                .perform();
        buttonPlayOrResume.click();
    }
    public boolean isPauseButtonDisplayed(){
        WebElement pauseBtn = waitUntilVisible(By.cssSelector("[data-testid='pause-btn']"));
        return pauseBtn.isDisplayed();
    }
    public boolean isEqualizerDisplayed(){
        WebElement equalizer = waitUntilVisible(By.cssSelector("[alt='Sound bars']"));
        return equalizer.isDisplayed();
    }
}
