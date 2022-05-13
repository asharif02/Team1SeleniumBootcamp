package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.Personal;

public class SystemBar extends BasePage {

    @FindBy(id = "//*[@id='NAV_BUSINESS_ADVANTAGE']")
    public WebElement smallBusinessButton;

    public void clickSmallBusinessButton(){
        clickOnElement(smallBusinessButton);
    }


     public SystemBar(){
         PageFactory.initElements(driver, this);
     }
}
