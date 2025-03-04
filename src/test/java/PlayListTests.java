import org.testng.Assert;
import org.testng.annotations.Test;
import pagesObjectsModel.BasePage;
import pagesObjectsModel.LoginPage;
import pagesObjectsModel.PlaylistPage;

import java.util.List;

public class PlayListTests extends BaseTest {

    @Test
    public void deletePlaylist() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        BasePage basePage = new BasePage(driver);
        String playlist = playlistPage.generateRandomPlaylistName();
        //create Playlist
        //step 1 - Log in
        loginPage.logIn("grigore.crepciuc@testpro.io", "te$t$tudent22");

        //step2 click on the playList name input and send  new playlist name
        playlistPage.createNewPlayListNamePlusButton(playlist);

        //step 3 - find Playlist Header and assert
        Assert.assertEquals(playlistPage.getHeaderName(), playlist);

        //step 4 - click delete Playlist Button
        playlistPage.clickDeletePlaylistButton();

        //Step 5 - Succes banner exist
        Assert.assertTrue(basePage.isSuccessBannerDisplayed());

        // Step 6 - refresh page
        basePage.refreshPage();

        //step 7 - get all playlist elements
        List<String> playlistNames = playlistPage.getPlaylistNames();

        // step- 8 assert playlist was deleted
        Assert.assertFalse(playlistNames.contains(playlist));
    }
}
