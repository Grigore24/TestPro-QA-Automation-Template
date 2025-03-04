import org.testng.Assert;
import org.testng.annotations.Test;
import pagesObjectsModel.BasePage;
import pagesObjectsModel.HomePage;
import pagesObjectsModel.LoginPage;
import pagesObjectsModel.ProfilePage;

public class ProfileTests extends BaseTest{
    @Test
    public void changeProfileName(){
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        String name = basePage.generateRandomName();

        //step 1 - Log In
        loginPage.logIn("grigore.crepciuc@testpro.io","te$t$tudent22");

        //step 2 -Open profile
        homePage.clickOnAvatar();

        //step 3 -Type Password
        profilePage.typeCurrentProfilePassword();

        //step 4 - Type new Name
        //Example String name = "Name" + getTimeStamp();
        profilePage.typeProfileName(name);

        //step 5 - Type Email
        profilePage.typeProfileEmail();

        //step 6 Click Save
        profilePage.clickOnProfileSaveButton();

        //step 7 Refresh Page
        basePage.refreshPage();

        //step 8 Assert profile name is new
        Assert.assertEquals(name,profilePage.getNewProfileName());
    }
}
