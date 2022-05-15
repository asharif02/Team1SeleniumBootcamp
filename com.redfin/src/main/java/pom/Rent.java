package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Rent extends SystemBar {

    @FindBy(xpath = "//*[@id='content']//div[10]//section//div[2]//div//div[1]//div[2]//a//h3")
    public WebElement stayUpToDate;

    public void clickStayUpToDate(){
        clickOnElement(stayUpToDate);
    }
    public Rent(){
        PageFactory.initElements(driver, this);
    }
}
