package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//div[@id='fittPageContainer']//span[@class='flex flex-wrap']")
    public WebElement nbaTeamName;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

}
