package seleniumtest.uberDuckTest.Page;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtest.utils.WebDriverFactory;

public class AccountDetailsPage {
    public AccountDetailsPage() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(WebDriverFactory.getInstance().getDriver()), this);
    }
    @FindBy(xpath = "//a[text()=\"Change Username\"]")
    public static WebElement changeUsernameButton;

    @FindBy(xpath = "//input[@placeholder=\"Choose a username\"]")
    public static WebElement enterUsernameField;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    public static WebElement saveButton;



}
