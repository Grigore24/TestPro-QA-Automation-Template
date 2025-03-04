import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pagesObjectsModel.HomePage;
import pagesObjectsModel.LoginPage;
import pagesObjectsModel.PlaylistPage;
import pagesObjectsModel.SongsPage;

import java.util.Collections;
import java.util.List;

public class ActionsTests extends BaseTest {
    @Test
    public void playSongTest() {
        // hover over in clickPlayBtn
        //step 1 - Log in
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        // step -1 Log in
        loginPage.logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");

        //step 2 - click On footer Play button
        homePage.clickFooterPlayBtn();
        // step 3 - Assert
        Assert.assertTrue(homePage.pauseBtnExists());

        // Comparing numbers of elements example
        List<WebElement> songs = driver.findElements(By.cssSelector("[data-test='song-card']"));

        int songsNumberBefore = songs.size();
        System.out.println(songsNumberBefore);
        // Just an example: here we would add or delete an element but we didn't
        int songsNumberAfter = songs.size();
        System.out.println(songsNumberAfter);

        // Soft assert example
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(songsNumberBefore == songsNumberAfter,
                "=== Songs number before should be equal songs number after ===");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://qa.koel.app/#!/queue");
        https://qa.koel.app/#!/home
        System.out.println("Hello world");
        softAssert.assertAll();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void renamePlaylist() throws InterruptedException {
        // double click
        String playlistName = "Summer songs";
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        //strp - 1 Log in
        loginPage.logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");
        Thread.sleep(2000);
        //step - 2 DoubleClick on Playlist
        playlistPage.doubleClickChoosePlaylist();
        //step - 3 Enter Playlist name
        playlistPage.enterPlaylistName(playlistName);
        //steo - 4 get New name
        playlistPage.getNewName();
        // Assert
        Assert.assertEquals(playlistName, playlistPage.getNewName(), "=== PlaylistNames expected to be equals ===");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void playSongFromListTest() {
        LoginPage loginPage = new LoginPage(driver);
        SongsPage songsPage = new SongsPage(driver);
        HomePage homePage = new HomePage(driver);
        // step - 1 Log in
        loginPage.logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");
        // step 2 - go to all Songs
        songsPage.goToAllSongs();
        // step - 3 right click on first song
        songsPage.rightClickOnFirstSong();
        // step - 4 click play button
        songsPage.clickPlayBtn();
        // step 5- Assert
        Assert.assertTrue(homePage.isEqualizerDisplayed());
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void countSongsInPlaylist() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        SongsPage songsPage = new SongsPage(driver);
        //step -1 Log in
        loginPage.logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");
        //step -2 Choose Playlist by name
        Thread.sleep(2000);
        playlistPage.choosePlaylistByName("Lebanon");
        //WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(4)")));
       // playlist.click();

        Assert.assertEquals(songsPage.getSongsSize(), 2); // can fail, depends on current number. This is just an example
    }
}