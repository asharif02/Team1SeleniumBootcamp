package Purchases.shared;

import Purchases.pom.Homepage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//*[@id='z1-globe']")
    WebElement attLogo;

    @FindBy(xpath =  "//*[@id=\'z1-globe-md\']")
    public WebElement homePageButton;

    @FindBy(xpath =  "//span[@class='ge5p_hamburger_bar']")
    public WebElement menuButton;

    public void clickHomePageButton(){
        safeClickOnElement(homePageButton);
    }

    public Homepage clickAttLogo(){
        clickOnElement(attLogo);
        return new Homepage();
    }

    public SystemBar(){
        PageFactory.initElements(driver, this);
    }
}
