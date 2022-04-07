package seleniumtest.uberDuckTest.steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumtest.uberDuckTest.Page.TextToSpeechPage;
import seleniumtest.utils.DriverUtils;
import seleniumtest.utils.WebDriverFactory;

public class TextToSpeechSteps {
    TextToSpeechPage textToSpeechPage= new TextToSpeechPage();
    private static final WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(), 15);

    @Given("^We select '(.+?)' from '(.+?)'$")
    public void selectFromWhere(String text,String field) {
        switch (field){
            case "Voice Selection":
                textToSpeechPage.voiceOriginDropdown.click();
                textToSpeechPage.disneyOption.click();
                break;
            case "Character":
                textToSpeechPage.voiceOption.click();
                textToSpeechPage.goofyVoiceOption.click();
                break;
        }

    }
    @Given("^We type '(.+?)' in the '(.+?)' input field from text to speech page$")
    public void typeOnField(String text, String field)  {
        switch (field){
            case "Synthesize text":
                wait.until(ExpectedConditions.visibilityOf(textToSpeechPage.synthesizeText));
                textToSpeechPage.synthesizeText.sendKeys(text);
                break;
        }

    }

    @Given("^We click '(.+?)' Button from text to speech page$")
    public void clickButton(String button) {

            switch (button){
                case "Synthesize":
                    wait.until(ExpectedConditions.visibilityOf(textToSpeechPage.synthesizeButton));

                    textToSpeechPage.synthesizeButton.getText();

                    textToSpeechPage.synthesizeButton.click();

                    break;
                case "Play":
                    int check = textToSpeechPage.audioClips.size();
                    if(check ==0){
                        wait.until(ExpectedConditions.visibilityOf(textToSpeechPage.audioClip));
                    }else{
                            wait.until(ExpectedConditions.visibilityOf(textToSpeechPage.audioClips.get(check+1)));

                        }

                    wait.until(ExpectedConditions.visibilityOf(textToSpeechPage.playButtons.get(0)));
                    textToSpeechPage.playButtons.get(0).click();
                    break;
            }
    }


}
