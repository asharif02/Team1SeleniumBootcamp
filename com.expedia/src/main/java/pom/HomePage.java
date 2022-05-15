package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/a[1]/div")
    public WebElement clickListYourProperty;

    @FindBy (xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]/a[2]/div")
    public WebElement clickExpediaSupportLink;

    @FindBy (xpath = "//*[@id=\"contextual-banner\"]/div/h1")
    public WebElement supportAssert;

    @FindBy(xpath = "//*[@id=\"result-397\"]/article/div[1]")
    public WebElement browseFlightsTopic;

    @FindBy (xpath = "//*[@id=\"result-toggle-397\"]/ul/li[1]/a")
    public WebElement reviewItinerary;

    @FindBy (xpath = "//*[@id=\"result-399\"]/article/div[1]")
    public WebElement browseHotelsTopics;

    @FindBy (xpath = "//*[@id=\"result-toggle-399\"]/ul/li[1]/a")
    public WebElement HotelsDropDown;

    @FindBy (xpath = "//*[@id=\"result-403\"]/article/div[1]")
    public WebElement BundleAndDealsButton;

    @FindBy (xpath = "//*[@id=\"result-toggle-403\"]/ul/li[1]/a")
    public WebElement BundleAndDealsDropDown;

    @FindBy (xpath = "//*[@id=\"result-401\"]/article/div[1]")
    public WebElement browseCarsTopic;

    @FindBy (xpath = "//*[@id=\"result-toggle-401\"]/ul/li[1]/a")
    public WebElement carsTopicDropDown;

    @FindBy (xpath = "//*[@id=\"result-404\"]/article/div[1]")
    public WebElement expediaRewards;

    @FindBy (xpath = "//*[@id=\"result-toggle-404\"]/ul/li[2]/a")
    public WebElement earnAndRewardsAssert;

    @FindBy (xpath = "//*[@id=\"result-402\"]/article/div[1]")
    public WebElement cruiseQuestions;

    @FindBy (xpath = "//*[@id=\"result-toggle-402\"]/ul/li[1]/a")
    public WebElement cruiseDropdown;

    @FindBy (xpath = "//*[@id=\"result-398\"]/article/div[1]")
    public WebElement travelAlerts;

    @FindBy (xpath = "//*[@id=\"result-toggle-398\"]/ul/li/a")
    public WebElement currentAlertsDropDown;

    @FindBy (xpath = "//*[@id=\"global-sites-links\"]/li[18]/a")
    public WebElement indianExpediaButton;

    @FindBy (xpath = "//div[normalize-space()='Trips']")
    public WebElement tripsTabButton;

    @FindBy (xpath = "//h1[@class='uitk-heading-3']")
    public WebElement tripsTabLocation;

    @FindBy (xpath = "//a[normalize-space()='Cancel your flight']")
    public WebElement cancelYourFlight;

    @FindBy (xpath = "//a[normalize-space()='Jobs']")
    public WebElement jobsLink;

    @FindBy (xpath = "//a[normalize-space()='Newsroom']")
    public WebElement newsRoomLink;

    @FindBy (xpath = "//a[normalize-space()='Advertising']")
    public WebElement advertisingLink;





    public HomePage() {
        PageFactory.initElements(driver, this);
    }

}
