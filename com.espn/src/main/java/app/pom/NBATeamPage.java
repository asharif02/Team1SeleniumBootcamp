package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NBATeamPage extends SystemBar {

    @FindBy(xpath = "//div[@id='fittPageContainer']//span[@class='flex flex-wrap']")
    public WebElement nbaTeamName;

    public NBATeamPage() {
        PageFactory.initElements(driver, this);
    }

}
