package Purchases.shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath =  "//*[@id=\'z1-globe-md\']")
    public WebElement homePageButton;

    @FindBy(xpath =  "//span[@class='ge5p_hamburger_bar']")
    public WebElement menuButton;

    public void clickHomePageButton(){
        safeClickOnElement(homePageButton);
    }


    public SystemBar(){
        PageFactory.initElements(driver, this);
    }

}
