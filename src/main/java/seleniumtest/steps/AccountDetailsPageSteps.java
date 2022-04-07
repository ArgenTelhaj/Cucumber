package seleniumtest.uberDuckTest.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import seleniumtest.uberDuckTest.Page.AccountDetailsPage;
import seleniumtest.utils.DriverUtils;

public class AccountDetailsPageSteps {

    AccountDetailsPage accountDetailsPage = new AccountDetailsPage();
    private static final WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(), 2);


    @Given("^We click '(.+?)' on the Profile Page$")
    public void checkText(String check) {
        switch (check){
            case "Change Username":
                wait.until(ExpectedConditions.visibilityOf(accountDetailsPage.changeUsernameButton));
                accountDetailsPage.changeUsernameButton.click();
                break;
            case "Save":
                wait.until(ExpectedConditions.visibilityOf(accountDetailsPage.saveButton));
                accountDetailsPage.saveButton.click();
        }

    }

    @And("^We enter '(.+?)' on the '(.+?)' Field on the Profile Page$")
    public void enterTextOnField(String text, String field) {
        switch (field){
            case "Username":
                wait.until(ExpectedConditions.visibilityOf(accountDetailsPage.enterUsernameField));
                accountDetailsPage.enterUsernameField.clear();
                accountDetailsPage.enterUsernameField.sendKeys(text);
                break;
        }
    }
}
