package seleniumtest.uberDuckTest.Page;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtest.utils.WebDriverFactory;

import java.util.List;

public class TextToSpeechPage {


    public TextToSpeechPage() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(WebDriverFactory.getInstance().getDriver()), this);
    }



    @FindBy(xpath = "//div[@class=\" css-1hwfws3\"]//div[@class=\" css-1uccc91-singleValue\"]")
    public static WebElement voiceOrigin;
    @FindBy(xpath = "//div[@class=\" css-tlfecz-indicatorContainer\"]")
    public static WebElement voiceOriginDropdown;
    @FindBy(xpath = "//div[@class=\" css-11unzgr\"]//div[text() = \"Disney\"]")
    public static WebElement disneyOption;
    @FindBy(xpath = "//div[@class=\"select-voice__indicators css-1wy0on6\"]")
    public static WebElement voiceOption;
    @FindBy(xpath = "//div[@class=\"select-voice__menu css-1g9elxf-menu\"]//div[text()=\"Goofy\"]")
    public static WebElement goofyVoiceOption;
    @FindBy(id= "synthesizeTextarea")
    public static WebElement synthesizeText;
    @FindBy(xpath= "//button[@class=\"btn btn-primary\"]")
    public static WebElement synthesizeButton;
    @FindBy(xpath= "//div[@class=\"Synthesize_audioClips__aF13s\"]")
    public static List <WebElement> audioClips;
    @FindBy(xpath= "//div[@class=\"Synthesize_audioClips__aF13s\"]")
    public static WebElement audioClip;
    @FindBy(xpath= "//div[@class=\"control-waveform\"]//button[@class=\"AudioPlayer_wavesurferButtons__jyOXd btn btn-primary\"][2]")
    public static List<WebElement> playButtons;

}
