import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesObjectsModel.HomePage;
import pagesObjectsModel.LoginPage;

public class LoginTests extends BaseTest {
    @DataProvider(name="IncorrectLoginProviders")
    public static Object[][] getDataFromDataProviders(){
        return new Object[][]{
                {"notExisting@email.com", "NotExistingPassword"},
                {"grigore.crepciuc@testpro.io", ""},
                {"", ""},
        };
    }

    @Test(dataProvider = "IncorrectLoginProviders")
    public void negativeLoginTests(String email, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = "https://qa.koel.app/";
        //step 1 - enter Email
        loginPage.enterEmail(email);
        //step 2 - enter Password
        loginPage.enterPassword(password);
        //step 3 - Click on Login Button
        loginPage.clickLoginButton();
        //step 4 - Assert
        Thread.sleep(3000);
        Assert.assertEquals(loginPage.getLoginURL(), url);
    }
    @Test
    public void loginEmptyPasswordTest() {
        LoginPage loginPage = new LoginPage(driver);
        //step 1 - Enter Email
        loginPage.enterEmail("grigore.crepciuc@testpro.io");
        //step 2 - Enter Password
        loginPage.enterPassword("");
        //step 3 - Assert
        Assert.assertEquals(loginPage.getLoginURL(), url);
    }

    @Test
    public void loginSuccessTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        //step 1 - Log in
        loginPage.logIn("grigore.crepciuc@testpro.io","te$t$tudent22");

        //step 2 - Find Avatar on Mane Page and Assert
        Assert.assertTrue(homePage.isAvatarDisplayed());
    }

    @Test
    public void loginInvalidEmailValidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        //step 1 - Enter Email
        loginPage.enterEmail("pgrigore.crepciuc@testpro.io");
        //step 2 - Enter Password
        loginPage.enterPassword("te$t$tudent22");
        //step 3 - Click on Login Button
        loginPage.clickLoginButton();
        //step 5 - Assert
        Assert.assertTrue(loginPage.isLoginButtonDisplayed());
    }
}
