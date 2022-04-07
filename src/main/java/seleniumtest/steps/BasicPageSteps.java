package seleniumtest.uberDuckTest.steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import seleniumtest.uberDuckTest.Page.BasicsPage;
import seleniumtest.utils.DriverUtils;

public class BasicPageSteps {
    private static final WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(), 2);
    BasicsPage basicsPage = new BasicsPage();

    @Given("^We check if text in '(.+?)' is equal to '(.+?)'$")
    public void checkText(String check,String text ) {
        switch (check){
            case "Username":
                wait.until(ExpectedConditions.visibilityOf(basicsPage.profile));
                Assert.assertEquals(basicsPage.profile.getText(),text);
                break;
        }

    }


    @Given("^We click '(.+?)' Button on Basics Page$")
    public void clickOnButton(String text){
        switch (text){
            case "Account":
                wait.until(ExpectedConditions.visibilityOf(basicsPage.profile));
                basicsPage.profile.click();
                break;
            case "Manage":
                wait.until(ExpectedConditions.visibilityOf(basicsPage.manageAccDropdownItem));
                basicsPage.manageAccDropdownItem.click();

        }
    }

}
