import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
        String url = "https://qa.koel.app/";
        //step 1 - enter Email
        enterEmail(email);
        //step 2 - enter Password
        enterPassword(password);
        //step 3 - Click on Login Button
        clickLoginButton();
        //step 4 - Assert
        Thread.sleep(3000);
        Assert.assertEquals(getLoginURL(), url);
    }
    @Test
    public void loginEmptyPasswordTest() {
        String url = "https://qa.koel.app/";
        //step 1 - Open URL
        openUrl();
        //step 2 - Enter Email
        enterEmail("grigore.crepciuc@testpro.io");
        //step 3 - Enter Password
        enterPassword("");
        //step 4 - Assert
        Assert.assertEquals(getLoginURL(), url);
    }

    @Test
    public void loginSuccessTest() {

        //step 1 - Log in
        logIn("grigore.crepciuc@testpro.io","te$t$tudent22");

        //step 2 - Find Avatar on Mane Page and Assert
        Assert.assertTrue(isAvatarDisplayed());
    }

    @Test
    public void loginInvalidEmailValidPassword() {
        //step 1 - Enter Email
        enterEmail("pgrigore.crepciuc@testpro.io");
        //step 2 - Enter Password
        enterPassword("te$t$tudent22");
        //step 3 - Click on Login Button
        clickLoginButton();
        //step 5 - Assert
        Assert.assertTrue(isLoginButtonDisplayed());
    }

    //Methods

    public boolean isAvatarDisplayed() {
        WebElement avatar = waitUntilClickable(By.cssSelector(".avatar"));
        return avatar.isDisplayed();
    }
    public boolean isLoginButtonDisplayed() {
        WebElement loginButton = waitUntilClickable(By.cssSelector("[type='submit"));
        return loginButton.isDisplayed();
    }
    public String getLoginURL(){
        String newURL = driver.getCurrentUrl();
        return newURL;
    }

}
