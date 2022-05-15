package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//*[@id='XMLID_2_']")
    public WebElement trendingVideoPlayButton;

    @FindBy(xpath = "//table[@class='table table--primary align--right']")
    public WebElement baseTable;

    @FindBy(xpath = "//section[1]//div[2]//div[1]//tbody//tr[1]//td[2]/a")
    public WebElement dowTableCell;

    public void clickTrendingVideoPlayButton(){
        safeClickOnElement(trendingVideoPlayButton);
    }
    public void getDowTableCell(){
        getClickableElement((By) dowTableCell);
    }

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
