package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

import java.time.Duration;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//*[@href='https://secure.web.plus.espn.com/billing/purchase/ESPN_PURCHASE_CMPGN/ESPN_PURCHASE_VOCHR/YESPN?start=login&locale=en_US&om-navmethod=LRailSubscribe']")
    public WebElement subscribeNowButton;

    @FindBy(xpath = "//*[@ class='button button-filter sm dropdown-toggle current-league-name']")
    public WebElement topEventsDropdownMenu;

    @FindBy(xpath = "//*[@id='global-scoreboard']//div/div/div[7]")
    public WebElement topEventsScrollToTheRightButton;

    @FindBy(xpath = "//*[@id=\"global-scoreboard\"]//div/div/div[7]")
    public WebElement getTopEventsScrollToTheRightButtonTwo;

    @FindBy(xpath = "//*[@id=\"leagues\"]//li[11]//div[4]/div[1]/a[1]")
    public WebElement topEventsSummaryButton;

    @FindBy(xpath = "//*[@data-popup-href='/video/clip?id=33901622']")
    public WebElement liveVideoPlayButton;

    @FindBy(xpath = "//*[@class='lightboxTitle']")
    public WebElement chooseProviderButton;

    @FindBy(xpath = "//*[@src='https://a.espncdn.com/espn360/images/affiliates/svg/HULU/HULU-CLR-NEG.svg']")
    public WebElement huluButton;

    public void clickSubscribeNowButton(){
        clickOnElement(subscribeNowButton);
    }
    public void clickTopEventsDropdownMenu(){
        clickOnElement(topEventsDropdownMenu);
    }
    public void clickTopEventsScrollToTheRightButton(){
        clickOnElement(topEventsScrollToTheRightButton);
        for(int i = 0; i<5; i++){
            driver.findElement((By.xpath("//*[@id='global-scoreboard']//div/div/div[7]"))).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        }
    }
    public void clickTopEventsScrollToTheRightButtonTwo(){
        clickOnElement(getTopEventsScrollToTheRightButtonTwo);
    }
    public void clickTopEventsSummaryButton(){
        clickOnElement(topEventsSummaryButton);
    }
    public void clickLiveVideoPlayButton(){
        clickOnElement(liveVideoPlayButton);
    }
    public void clickChooseProviderButton(){
        clickOnElement(chooseProviderButton);
    }
    public void clickHuluButton(){
        clickOnElement(huluButton);
    }
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
}
