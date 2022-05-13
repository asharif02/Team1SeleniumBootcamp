package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//*[@id='XMLID_2_']")
    public WebElement trendingVideoPlayButton;


    public void clickTrendingVideoPlayButton(){
        safeClickOnElement(trendingVideoPlayButton);
    }
    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
