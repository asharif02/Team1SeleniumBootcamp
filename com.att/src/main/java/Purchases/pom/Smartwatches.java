package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Smartwatches extends SystemBar {

    @FindBy(xpath = "//*[@id='__next']//div[2]//div[2]//div[4]//div[1]//div[1]//div[1]/button")
    WebElement filterAndSortButton;

    @FindBy(xpath = "//*[@id='filterSort']//div[1]//div[2]//div[2]//ul//li[1]")
    WebElement appleButton;

    @FindBy(xpath = "//*[@id='filterSort']//div[1]//div[3]//div[2]//ul//li[1]")
    WebElement newButton;

    @FindBy(xpath = "//*[@id='__next']//div[2]//div[2]//div[4]//div[1]//div[4]/button")
    WebElement applyAndCloseButton;

    public void clickFilterAndSortButton(){
        clickOnElement(filterAndSortButton);
    }

    public void clickAppleButton(){
        clickOnElement(appleButton);
    }

    public void clickNewButton(){
        clickOnElement(newButton);
    }

    public void clickApplyAndCloseButton(){
        clickOnElement(applyAndCloseButton);
    }

    public Smartwatches(){
        PageFactory.initElements(driver, this);
    }
}
