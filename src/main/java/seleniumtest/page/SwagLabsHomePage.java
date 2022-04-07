package seleniumtest.page;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtest.utils.WebDriverFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(WebDriverFactory.getInstance().getDriver()), this);
    }


    @FindBy (xpath = "//input[@id=\"user-name\"]")
    public static WebElement username;

    @FindBy (xpath = "//input[@id=\"password\"]")
    public static WebElement password;


}
