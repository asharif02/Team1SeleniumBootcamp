package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//li[@class='sports menu-soccer']")
    public WebElement soccerButton;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+soccer_soccerteams']")
    public WebElement teamsButton;



    //EPL teams region
    @FindBy (xpath = "//img[@title='Liverpool']")
    public WebElement Liverpool;

    @FindBy (xpath = "//img[@title='Manchester City']")
    public WebElement ManCity;

    @FindBy (xpath = "//img[@title='Manchester United']")
    public WebElement ManUnited;

    @FindBy (xpath = "//img[@title='Newcastle United']")
    public WebElement NewcastleUnited;

    @FindBy (xpath = "//img[@title='Norwich City']")
    public WebElement NorwichCity;

    @FindBy (xpath = "//img[@title='Southampton']")
    public WebElement Southampton;

    @FindBy (xpath = "//img[@title='Tottenham Hotspur']")
    public WebElement spurs;

    @FindBy (xpath = "//img[@title='Watford']")
    public WebElement watford;

    @FindBy (xpath = "//img[@title='Wolverhampton Wanderers']")
    public WebElement wolves;

    @FindBy (xpath = "//img[@title='Leicester City']")
    public WebElement leicesterCity;

    @FindBy (xpath = "//img[@title='Leeds United']")
    public WebElement leedsUnited;

    @FindBy (xpath = "//img[@title='Brentford']")
    public WebElement BrentFordClub;

    @FindBy (xpath = "//img[@title='Chelsea']")
    public WebElement chelsea;

    @FindBy (xpath = "//*[@id=\"fittPageContainer\"]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div/div[5]/div/section/a/img")
    public WebElement Burnley;

    @FindBy (xpath = "//img[@title='Aston Villa']")
    public WebElement AstonVilla;

    @FindBy (xpath = "//img[@title='Arsenal']")
    public WebElement arsenal;
//EndRegion

    @FindBy(xpath = "//h1[@class='ClubhouseHeader__Name ttu flex items-start n2']")
    public WebElement teamPage;


    public void clickSoccerTab(){clickOnElement(soccerButton);}

    public void clickTeamsButton(){clickOnElement(teamsButton);}

    public void clickLiverpool(){clickOnElement(Liverpool);}

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

}
