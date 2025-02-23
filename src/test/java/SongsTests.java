import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SongsTests extends BaseTest {

    @Test
    public void addSongsToPlaylist() {
        String text = "Dark Days";
        //step 1 - Open URL
        openUrl();

        //step 2 - Log In
        logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");

        //step 3 - Find search input
        WebElement searchInput = driver.findElement(By.cssSelector("#searchForm>input"));
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(text);

        //step 4 - Click on VIEW ALL Button
        WebElement viewAllButton = driver.findElement(By.cssSelector("button[data-test='view-all-songs-btn']"));
        viewAllButton.click();

        //step 5 - Click on the song in results
        List<WebElement> songInResults = driver.findElements(By.cssSelector(".search-results .song-item .title"));
        songInResults.get(0).click();

        //step 6 - Click on ADD TO Button
        WebElement addToButton = driver.findElement(By.cssSelector(".btn-add-to"));
        addToButton.click();

        //step 7 - Click on New Playlist Name Input
        String name = generateRandomPlaylistName();
        WebElement newPlaylistNameInput = driver.findElement(By.cssSelector("#songResultsWrapper > header  input[type=text]"));
        newPlaylistNameInput.click();
        newPlaylistNameInput.clear();
        newPlaylistNameInput.sendKeys(name);

        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();

        //step 8 - Assert is banner displayed and text Equals
        WebElement newPlaylistSuccessBanner = driver.findElement(By.cssSelector("div[class='success show']"));
        Assert.assertTrue(newPlaylistSuccessBanner.isDisplayed());

        WebElement songName = driver.findElement(By.cssSelector("#playlistWrapper .song-item .title"));
        String songText = songName.getText();
        Assert.assertEquals(songText,text);


    }
}
