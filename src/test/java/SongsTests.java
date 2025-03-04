import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesObjectsModel.HomePage;
import pagesObjectsModel.LoginPage;
import pagesObjectsModel.PlaylistPage;
import pagesObjectsModel.SongsPage;

import java.util.List;

public class SongsTests extends BaseTest {

    @Test
    public void addSongsToPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        SongsPage songsPage = new SongsPage(driver);
        HomePage homePage = new HomePage(driver);
        String text = "Dark Days";
        String playlistName = playlistPage.generateRandomPlaylistName();
        //step 1 - Log In
        loginPage.logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");

        //step 2 - Find search input
        songsPage.searchForSong(text);

        //step 3 - Click on VIEW ALL Button
        songsPage.clickOnViewAllButton();

        //step 4 - Click on the song in results
        songsPage.findSongInResults();

        //step 5 - Click on ADD TO Button
        songsPage.clickAddToButton();

        //step 6 - Click on New Playlist Name Input
        playlistPage.sentNewPlaylistName(playlistName);

        //step 7 - Assert is banner displayed and text Equals
        Assert.assertTrue(homePage.isPlaylistSuccessBannerDisplayed());

        //step 8 - songText Assert
        Assert.assertEquals(text,songsPage.getSongName());
    }

    @Test
    public void playSong() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        //step 1  - Log in
        loginPage.logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");

        //step 2 - Find Play button and hover on it and click
        homePage.hoverClickPlayButton();

        //step 3 find pause button and assert
        Assert.assertTrue(homePage.isPauseButtonDisplayed());

        //step 4 find equalizer and assert
        Assert.assertTrue(homePage.isEqualizerDisplayed());
    }
//    @Test
//    public void checkVisibilityTest() {
//        LoginPage loginPage = new LoginPage(driver);
//        //step 1
//        loginPage.logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");
//        //step 2
//        WebElement title = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("title")));
//        String text = title.getText();
//        System.out.println(text);
//        System.out.println("Is element invisible? === " + wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("title"))));
//        //WebElement title2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("title")));  // should fail
//    }
}
