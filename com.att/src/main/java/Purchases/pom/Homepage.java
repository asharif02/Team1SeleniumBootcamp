package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//*[@id='z1-globe']")
    WebElement attLogo;

    @FindBy(xpath = "//li[@id='HEADBAND01']")
    WebElement phonesAndDevicesButton;

    @FindBy(xpath = "//a[@aria-controls='Categories-tab-3']")
    public WebElement smartwatchesButton;

    @FindBy(xpath = "//a[@id='z1-pullMenu-open']")
    public WebElement attMenuDropdown;

    @FindBy(xpath = "//input[@id='z1-searchfield']")
    public WebElement searchInputField;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }

    public PhonesAndDevices clickPhonesAndDevicesButton(){
    clickOnElement(phonesAndDevicesButton);
    return new PhonesAndDevices();

    }
    public Smartwatches clickSmartwatchesButton(){
        clickOnElement(smartwatchesButton);
        return new Smartwatches();
    }
    public Homepage clickAttLogo(){
        clickOnElement(attLogo);
        return new Homepage();
    }
    public void clickAttMenuDropdown(){
        clickOnElement(attMenuDropdown);
    }
    public void clickSearchInputField(){
        clickOnElement(searchInputField);
    }
}
