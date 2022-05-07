package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//div[@id='movie_player']")
    public WebElement moviePlayer;

    @FindBy(xpath = "//a[@data-sessionlink='feature=player-title']")
    public WebElement videoTitle;

//    @FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button']")
    @FindBy(xpath = "//div[@id='movie_player']//button[@aria-label='Play']")
    public WebElement playButton;

    @FindBy(xpath = "//*[text()='A one-stop shop for your finances.']")
    public WebElement aOneStopShopForYourFinancesText;

    @FindBy(xpath = "//a[@class='ytp-impression-link']")
    public WebElement watchOnYouTubeLink;

    @FindBy(xpath = "//div[@id='movie_player']//div[@class='html5-video-container']")
    public WebElement videoContainer;

    @FindBy(xpath = "//iframe[@src='https://www.youtube.com/embed/T6nDrDecra4']")
    public WebElement videoIFrame;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void playWithSoFiVideo() throws InterruptedException {
        scrollToTextNextToMoviePlayer();
        clickPlayButton();
    }

    public void jsClickVideoPlayButton(WebElement element) {
        jsDriver.executeScript("document.getElementById('movie_player').play()");
    }

    public void clickPlayButton() {
        safeClickOnElement(playButton);
    }

    public void scrollToVideoTitle() {
        jsScrollUntilElementVisible(videoTitle);
    }

    public void hoverOverMoviePlayer() {
        hoverOverElement(moviePlayer);
    }

    public void scrollToTextNextToMoviePlayer() {
        jsScrollUntilElementVisible(aOneStopShopForYourFinancesText);
    }

    public void switchToIFrame() {
        switchToFrameByElement(videoIFrame);
    }
}
