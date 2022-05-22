package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Homepage extends SystemBar {

    //TC1
    @FindBy(xpath = "//*[@id='z1-globe-md']")
    WebElement attLogo;

    @FindBy(xpath = "//*[@id='HEADBAND06']//div")
    WebElement bundlesButton;

    //TC2
    @FindBy(xpath = "//a[@id='z1-pullMenu-open']")
    public WebElement attMenuDropdown;

    @FindBy(xpath = "//*[@id='tab-desktop-menu']/li[3]/a")
    WebElement internetLink;

    @FindBy(xpath = "//*[@id='tab-desktop-menu']/li[3]/ul/li[5]/a")
    WebElement fiberLink;


    @FindBy(xpath = "//li[@id='HEADBAND01']")
    WebElement phonesAndDevicesButton;

    @FindBy(xpath = "//a[@aria-controls='Categories-tab-3']")
    public WebElement smartwatchesButton;

    @FindBy(xpath = "//input[@id='z1-searchfield']")
    public WebElement searchInputField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

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

    public Bundles clickBundlesButton(){
        clickOnElement(bundlesButton);
        return new Bundles();
    }
    public void clickAttMenuDropdown(){
        clickOnElement(attMenuDropdown);
    }

    public void clickInternetLink(){
        clickOnElement(internetLink);
    }

    public Fiber clickFiberLink(){
        clickOnElement(fiberLink);
        return new Fiber();
    }

    public void clickSearchInputField(){
        clickOnElement(searchInputField);
    }

    public SearchResults clickSearchButton(){
        clickOnElement(searchButton);
        return new SearchResults();
    }
}
