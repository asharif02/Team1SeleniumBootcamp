package app.shared;

import app.pom.Homepage;
import base.BasePage;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//nav[@id='global-nav']//li[@class='sports menu-nba']")
    public WebElement nbaSportsMenu;

//    @FindBy(xpath = "//li[@class='teams nba']//ul//li[@class='team']")
//    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul[2]")
//    @FindBy(xpath = "//li[@class='teams nba']//li[@class='team']//span//span[2]")
//    @FindBy(xpath = "//ul[@class='Nav__Dropdown__Group flex pa3 bg-clr-gray-09 flex-wrap is--3']")
    @FindBy(xpath = "//ul[@class='Nav__Dropdown__Group flex pa3 bg-clr-gray-09 flex-wrap is--3']//ul//li")
    public List<WebElement> NBATeams;

    @FindBy(xpath = "//li[@class='teams nba']//a[@data-teamabbrev='BOS']")
    public WebElement bostonCeltics;

    @FindBy(xpath = "//li[@class='teams nba']//a[@data-teamabbrev='BKN']")
    public WebElement brooklynNets;

    @FindBy(xpath = "//li[@class='Nav__Secondary__Menu__Item flex items-center n7 relative Nav__Secondary__Menu__Item--active']")
    public WebElement teamsDropDownList;

    @FindBy(xpath = "//li[@class='teams nba sub']")
    public WebElement teamsButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public void navigateByNBATeamName(String teamName) {
        Homepage homepage = new Homepage();
        homepage.hoverOverNBASportsMenu();
        homepage.clickTeamsButton();
        homepage.hoverOverNBATeamsDropDown();

        List<WebElement> nbaTeams = NBATeams;
        try {
            for (WebElement teams : nbaTeams) {
                if (teams.getAttribute("innerHTML").contains(teamName)) {
                    teams.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        }

    }

    public void navigateByNBACityName(String cityName) {
        Homepage homepage = new Homepage();
        homepage.hoverOverNBASportsMenu();
        homepage.clickTeamsButton();
        homepage.hoverOverNBATeamsDropDown();

        List<WebElement> nbaTeams = NBATeams;
        try {
            for (WebElement teams : nbaTeams) {
                if (teams.getAttribute("innerHTML").contains(cityName)) {
                    teams.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        }

    }

    public void selectRandomNBATeam() {
        Homepage homepage = new Homepage();
        homepage.hoverOverNBASportsMenu();
        homepage.clickTeamsButton();
        homepage.hoverOverNBATeamsDropDown();

        List<WebElement> nbaTeams = NBATeams;
        int maxTeams = nbaTeams.size();

        Random random = new Random();
        int randomTeam = random.nextInt(maxTeams);

        nbaTeams.get(randomTeam).click();

    }

    public void clickTeamsButton() {
        clickOnElement(teamsButton);
    }

    public void hoverOverNBATeamsDropDown() {
//        webDriverWait.until()
        hoverOverElement(teamsDropDownList);
    }

    public void hoverOverNBASportsMenu() {
        hoverOverElement(nbaSportsMenu);
    }

//    public void selectNBATeam() {
//        clickOnElement(NBATeams);
//    }

    public void clickBostonCelticsTeam() {
        clickOnElement(bostonCeltics);
    }

    public void clickBrooklynNetsTeam() {
        clickOnElement(brooklynNets);
    }

}
