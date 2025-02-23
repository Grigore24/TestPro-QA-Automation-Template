import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest{
    String name = generateRandomName();
    @Test
    public void changeProfileName(){
        //step 1 - Open URL
        openUrl();

        //step 2 - Log In
        logIn("grigore.crepciuc@testpro.io","te$t$tudent22");

        //step 3 -Open profile
        clickOnAvatar();

        //step 4 -Type Password
        typeCurrentProfilePassword();

        //step 5 - Type new Name
        //Example String name = "Name" + getTimeStamp();
        typeProfileName();

        //step 6 - Type Email
        typeProfileEmail();

        //step 7 Click Save
        clickOnProfileSaveButton();

        //step 8 Assert profile name is new
        compareProfileNames();
    }

    //Methods

    private void clickOnAvatar() {
        WebElement avatar = driver.findElement(By.cssSelector("[class = 'avatar']"));
        avatar.click();
    }
    private void typeCurrentProfilePassword() {
        WebElement currentPasswordInput = driver.findElement(By.cssSelector("#inputProfileCurrentPassword"));
        currentPasswordInput.click();
        currentPasswordInput.clear();
        currentPasswordInput.sendKeys("te$t$tudent22");
    }
    private void typeProfileName() {
        System.out.println(name);
        WebElement profileNameInput = driver.findElement(By.cssSelector("#inputProfileName"));
        profileNameInput.click();
        profileNameInput.clear();
        profileNameInput.sendKeys(name);
    }
    private void typeProfileEmail() {
        WebElement currentEmailInput = driver.findElement(By.id("inputProfileEmail"));
        currentEmailInput.click();
        currentEmailInput.clear();
        currentEmailInput.sendKeys("grigore.crepciuc@testpro.io");
    }
    private void clickOnProfileSaveButton() {
        WebElement saveButton = driver.findElement(By.cssSelector("[class='btn-submit']"));
        saveButton.click();
    }
    private void compareProfileNames() {
        driver.navigate().refresh();

        WebElement profileNameText = driver.findElement(By.cssSelector("[class = 'view-profile']>span"));
        String newName = profileNameText.getText();
        Assert.assertEquals(newName,name);

    }


}
