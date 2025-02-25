import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PlayListTests extends BaseTest {

    @Test
    public void deletePlaylist() throws InterruptedException {
        String playlist = generateRandomPlaylistName();
        //create Playlist
        //step 1 - Log in
        logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");

        //step 2 - click on Plus Button
        clickOnPlusButton();

        //step 3 - click on New Playlist Option
        clickOnNewPlaylistOption();

        //step4 click on the playList name input and send  new playlist name
        inputSendPlayListName(playlist);

        //open Playlist
        //step 5 - find Playlist Header and assert
        Assert.assertEquals(getHeaderName(), playlist);

        //delete Playlist
        //step 6 - click delete Playlist Button
        clickDeletePlaylistButton();
        //Step 7 - Succes banner exist
        // verify banner
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success")));
//        Thread.sleep(2000);
//        WebElement playlistDeleteSuccesBunner = driver.findElement(By.cssSelector("success"));
//        String textDeleteSuccesBunner = playlistDeleteSuccesBunner.getText();
//        Assert.assertEquals(playlist,textDeleteSuccesBunner);

        // Step 8 - refresh page
        refreshPage();
        //step 9 - get all playlist elements
        // get all playlist elements
        List<WebElement> playlists = driver.findElements(By.cssSelector("#playlists a"));
        System.out.println(playlists);
        // get playlist names from playlist elements
        List<String> playlistNames = new ArrayList<>();

        for (int i = 0; i < playlists.size(); i++) {
            String playlistName = playlists.get(i).getText();
            playlistNames.add(playlistName);
        }
        System.out.println(playlistNames);
        // assert playlist was deleted
        Assert.assertFalse(playlistNames.contains(playlist));
    }

    private void clickOnPlusButton() {
        WebElement plusButton = waitUntilClickable(By.cssSelector("[title ='Create a new playlist']"));
        plusButton.click();
    }

    private void clickOnNewPlaylistOption() {
        WebElement newPlaylistOption = waitUntilClickable(By.cssSelector("[data-testid ='playlist-context-menu-create-simple']"));
        newPlaylistOption.click();
    }

    private void inputSendPlayListName(String playlist) {
        WebElement inputPlayListName = waitUntilClickable(By.cssSelector("[name='name']"));
        inputPlayListName.click();
        inputPlayListName.clear();
        inputPlayListName.sendKeys(playlist);
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
    }

    public String getHeaderName(){
        WebElement playListHeader = waitUntilVisible(By.cssSelector("#playlistWrapper h1"));
        String headerName = playListHeader.getText();
        return headerName;
    }

    private void clickDeletePlaylistButton() {
        WebElement deletePlaylistButton = waitUntilClickable(By.cssSelector("[title='Delete this playlist']"));
        deletePlaylistButton.click();
    }
    //Methods deletePlaylist

}
