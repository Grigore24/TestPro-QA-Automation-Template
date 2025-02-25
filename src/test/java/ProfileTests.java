import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest{
    @Test
    public void changeProfileName(){
        String name = generateRandomName();

        //step 1 - Log In
        logIn("grigore.crepciuc@testpro.io","te$t$tudent22");

        //step 2 -Open profile
        clickOnAvatar();

        //step 3 -Type Password
        typeCurrentProfilePassword();

        //step 4 - Type new Name
        //Example String name = "Name" + getTimeStamp();
        typeProfileName(name);

        //step 5 - Type Email
        typeProfileEmail();

        //step 6 Click Save
        clickOnProfileSaveButton();

        //step 7 Refresh Page
        refreshPage();

        //step 8 Assert profile name is new
        Assert.assertEquals(name,getNewProfileName());
    }

    //Methods

    private void clickOnAvatar() {
        WebElement avatar = waitUntilClickable(By.cssSelector("[class = 'avatar']"));
        avatar.click();
    }
    private void typeCurrentProfilePassword() {
        WebElement currentPasswordInput = waitUntilClickable(By.cssSelector("#inputProfileCurrentPassword"));
        currentPasswordInput.click();
        currentPasswordInput.clear();
        currentPasswordInput.sendKeys("te$t$tudent22");
    }
    private void typeProfileName(String name) {
        System.out.println(name);
        WebElement profileNameInput = waitUntilClickable(By.cssSelector("#inputProfileName"));
        profileNameInput.click();
        profileNameInput.clear();
        profileNameInput.sendKeys(name);
    }
    private void typeProfileEmail() {
        WebElement currentEmailInput = waitUntilClickable(By.id("inputProfileEmail"));
        currentEmailInput.click();
        currentEmailInput.clear();
        currentEmailInput.sendKeys("grigore.crepciuc@testpro.io");
    }
    private void clickOnProfileSaveButton() {
        WebElement saveButton = waitUntilVisible(By.cssSelector("[class='btn-submit']"));
        saveButton.click();
    }
    public String getNewProfileName(){
        WebElement profileNameText = waitUntilClickable(By.cssSelector("[class = 'view-profile']>span"));
        String newName = profileNameText.getText();
        return newName;
    }
}
