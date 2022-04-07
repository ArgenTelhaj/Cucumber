package seleniumtest.uberDuckTest.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import seleniumtest.page.NopHomePage;
import seleniumtest.steps.HomePageSteps;
import seleniumtest.uberDuckTest.Page.UberDuckHomePage;
import seleniumtest.utils.DriverUtils;
import seleniumtest.utils.WebDriverFactory;

import java.util.ArrayList;
import java.util.List;

public class UberDuckHomePageSteps {
    UberDuckHomePage uberDuckHomePage = new UberDuckHomePage();
    private static final WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(), 2);




    @Given("the home page '(.+?)' is open")
    public void openWebSite(String url) {
        WebDriverFactory.getInstance().getDriver().navigate().to(url);

    }

    @Given("^We click '(.+?)' Button$")
    public void clickButton(String text) {
        switch (text){
            case "Login":
                wait.until(ExpectedConditions.visibilityOf(uberDuckHomePage.SignInButton));

                uberDuckHomePage.SignInButton.click();
                break;
            case "Sign In":
                wait.until(ExpectedConditions.visibilityOf(uberDuckHomePage.SignInFormButton));
                uberDuckHomePage.SignInFormButton.click();
                break;
            case "Create":
                wait.until(ExpectedConditions.visibilityOf(uberDuckHomePage.createButton));
                uberDuckHomePage.createButton.click();
                break;
            case "Text To Speech":
                wait.until(ExpectedConditions.visibilityOf(uberDuckHomePage.createDropdowns.get(1)));
                uberDuckHomePage.createDropdowns.get(1).click();

        }

    }
    @Given("^we check if the page '(.+?)' is correct$")
    public void checkUrl(String text) {
        Assert.assertEquals(DriverUtils.getDriver().getCurrentUrl(),text);
    }

    @Given("^we type '(.+?)' on the '(.+?)' field$")
    public void typeOnField(String text ,String field) {
        switch (field){
            case "Email":
                wait.until(ExpectedConditions.visibilityOf(uberDuckHomePage.email));
                UberDuckHomePage.email.sendKeys(text);
                break;
                case "Password":
                    wait.until(ExpectedConditions.visibilityOf(uberDuckHomePage.password));
                    UberDuckHomePage.password.sendKeys(text);
                    break;

        }

    }
    @Given("^We check for the items to be displayed on the '(.+?)' menu$")
    public void checkForDisplayItems(String text, DataTable dataTable){

        switch (text){
            case "Create":
                List<String> expectedResults = dataTable.asList(String.class);


                wait.until(ExpectedConditions.visibilityOfAllElements(uberDuckHomePage.createDropdowns));
                List<WebElement> list = uberDuckHomePage.createDropdowns;
                for (int i = 0; i < expectedResults.size(); i++) {
                    Assert.assertEquals(expectedResults.get(i), list.get(i).getText());
                }

                org.junit.Assert.assertEquals(expectedResults.size(), list.size());

                break;
        }

    }

}
