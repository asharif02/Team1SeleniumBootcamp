package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults extends SystemBar {

    @FindBy(xpath = "//*[@id='Tab-tab-0']//div[2]/div[1]/div/div[2]/p")
    public WebElement iphonePromotionMessage;

    public void iphonePromotionMessage(){
        clickOnElement(iphonePromotionMessage);
            }

    public SearchResults(){
        PageFactory.initElements(driver, this);
    }
}
