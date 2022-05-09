package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//div[@id='movie_player']")
    public WebElement moviePlayer;

    @FindBy(xpath = "//a[@data-sessionlink='feature=player-title']")
    public WebElement videoTitle;

//    @FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button']")
//    @FindBy(xpath = "//div[@id='movie_player']//button[@aria-label='Play']")
    @FindBy(xpath = "//button[@aria-label='Play']")
    public WebElement playButton;

    @FindBy(xpath = "//*[text()='A one-stop shop for your finances.']")
    public WebElement aOneStopShopForYourFinancesText;

    @FindBy(xpath = "//a[@class='ytp-impression-link']")
    public WebElement watchOnYouTubeLink;

//    @FindBy(xpath = "//div[@id='movie_player']//div[@class='html5-video-container']")
    @FindBy(xpath = "//div[@id='ytp-caption-window-container']")
    public WebElement videoContainer;

//    @FindBy(xpath = "//iframe[@src='https://www.youtube.com/embed/T6nDrDecra4']")
    @FindBy(xpath = "//iframe[contains(@src,'https://www.youtube.com')]")
    public WebElement sofiVideoIFrameOnHomepage;

//    @FindBy(xpath = "//div[@class='ytp-progress-bar-container']//div[@aria-valuenow='%s']")
    @FindBy(xpath = "//div[@class='ytp-progress-bar']")
    public WebElement ytProgressBar;

    @FindBy(xpath = "//div[@class='ytp-progress-bar-container']//@aria-valuenow")
    public List<WebElement> valueOfProgressBar;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void playSoFiVideoOnHomepage() {
        scrollToTextNextToMoviePlayer();
        fluentWait.until(ExpectedConditions.visibilityOf(sofiVideoIFrameOnHomepage));
        switchToVideoIFrameOnSoFiHomepage();
        clickPlayButton();
    }

    public void playVideoForSpecificAmountOfSeconds(String seconds) {
        fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                String.format("//div[@class='ytp-progress-bar-container']//div[@aria-valuenow=\"%s\"]", seconds))));

//        fluentWait.until(ExpectedConditions.invisibilityOfAllElements(valueOfProgressBar));

    }

    public void scrollToTextNextToMoviePlayer() {
        jsScrollUntilElementVisible(aOneStopShopForYourFinancesText);
    }

    public void switchToVideoIFrameOnSoFiHomepage() {
        switchToFrameByElement(sofiVideoIFrameOnHomepage);
    }

    public void clickPlayButton() {
        clickOnElement(playButton);
    }

    public void scrollToVideoTitle() {
        jsScrollUntilElementVisible(videoTitle);
    }

    public void hoverOverMoviePlayer() {
        hoverOverElement(moviePlayer);
    }

    public void hoverOverVideoContainer() {
        Actions ac = new Actions(driver);
        ac.moveToElement(videoContainer, 50, 0);
//        hoverOverElement(videoContainer,);
    }

    public void jsClickVideoPlayButton(WebElement element) {
        jsDriver.executeScript("document.getElementById('movie_player').play()");
    }
}
