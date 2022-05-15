package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.Homepage;

public class ContactUs extends Homepage {

    @FindBy(xpath = "//a[@id='feedback']")
    public WebElement shareFeedback;

    @FindBy(xpath = "//a[@id='vid_6195405600001_playVideo']")
    public WebElement playPauseClientCareVideo;

    @FindBy(xpath = "//a[@id='vid_6195405600001_showCaptions']")
    public WebElement enableDisableSubtitles;

    @FindBy(xpath = "//a[@id='vid_6195405600001_enterFullScreen']")
    public WebElement enableFullScreen;

    @FindBy(xpath = "//a[@id='vid_6195405600001_exitFullScreen']")
    public WebElement disableFullScreen;

    public ContactUs(){
        PageFactory.initElements(driver, this);
    }
    public void clickShareFeedback(){
        clickOnElement(shareFeedback);
    }
    public void clickPlayPauseForClientCareVideo(){
        clickOnElement(playPauseClientCareVideo);
    }
    public void enableDisableSubtitles(){
        clickOnElement(enableDisableSubtitles);
    }
    public void enableFullScreen(){
        clickOnElement(enableFullScreen);
    }
    public void disableFullScreen(){
        clickOnElement(disableFullScreen);
    }
    public void playVideoForAmountOfSeconds(String seconds) {
        fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format("//div[@class='range-slider spa-cinema-ctrl spa-cinema-ctrl--timeline noUi-target noUi-ltr noUi-horizontal']//div[@aria-valuenow='%s']", seconds))));
    }
    public void progressSlider(int progress) {
        if (progress >= 0 && progress <= 100) {
            WebElement slider = driver.findElement(By.xpath("//div[@class='noUi-connect']"));
            WebElement output = driver.findElement(By.xpath("//div[@class='noUi-origin']"));
            Actions act = new Actions(driver);
            act.clickAndHold(slider).build().perform();
            act.moveByOffset(-1, 0).build().perform();
            act.release(slider).build().perform();
        }
    }
}