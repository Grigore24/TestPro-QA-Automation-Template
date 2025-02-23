import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
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
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public void loginSuccessTest() throws InterruptedException {
        //step 1 - Open URL
        openUrl();
        //step 2 - Enter Email
        enterEmail("grigore.crepciuc@testpro.io");
        //step 3 - Enter Password
        enterPassword("te$t$tudent22");
        //step 4 - Click on Login Button
        clickLoginButton();
        //step 5 - Find Avatar on Mane Page
        WebElement avatar = driver.findElement((By.cssSelector(".avatar")));
        Thread.sleep(5000);
        //step 6 - Assert
        Assert.assertTrue(avatar.isDisplayed());
    }

    @Test
    public void loginInvalidEmailValidPassword() {
        //step 1 - Open URL
        openUrl();
        //step 2 - Enter Email
        enterEmail("pgrigore.crepciuc@testpro.io");
        //step 3 - Enter Password
        enterPassword("te$t$tudent22");
        //step 4 - Click on Login Button
        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit"));
        loginButton.click();
        //step 5 - Assert
        Assert.assertTrue(loginButton.isDisplayed());
    }

}
