package seleniumtest.uberDuckTest.Page;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtest.utils.WebDriverFactory;

public class BasicsPage {

    public BasicsPage() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(WebDriverFactory.getInstance().getDriver()), this);
    }

    @FindBy(id = "user-account-dropdown")
    public static WebElement profile;

    @FindBy(xpath = "//a[@href=\"/account/manage\"]")
    public static WebElement manageAccDropdownItem;
}
