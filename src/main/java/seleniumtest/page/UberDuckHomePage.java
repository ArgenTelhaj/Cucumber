package seleniumtest.uberDuckTest.Page;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtest.utils.WebDriverFactory;

import java.util.List;

public class UberDuckHomePage {

    public UberDuckHomePage() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(WebDriverFactory.getInstance().getDriver()), this);
    }

    @FindBy(xpath = "//a[text() = \"Sign in\"]")
    public static WebElement SignInButton;

    @FindBy(xpath = "//input[@id = \"email\"]")
    public static WebElement email;

    @FindBy(xpath = "//input[@id = \"pw\"]")
    public static WebElement password;

    @FindBy(xpath = "//button[text()=\"Sign in\"]")
    public static WebElement SignInFormButton;

    @FindBy(xpath = "//div[@class=\"TopNav_navDropdownNoCaret__C5Vhw nav-item dropdown\"]//a[text()= \" Create\"]")
    public static WebElement createButton;

    @FindBy(xpath = "//div[@class=\"dropdown-menu show\"]//a")
    public static List<WebElement> createDropdowns;
}
