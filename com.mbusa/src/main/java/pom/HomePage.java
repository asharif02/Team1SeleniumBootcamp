package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

import javax.naming.directory.SearchResult;
import javax.xml.xpath.XPath;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//a[@href='/en/home']")
    public WebElement mbHomePageLogo;

    @FindBy(xpath = "//div[1]//header//div[2]/ul[1]/li[1]/button")
    public WebElement vehiclesButton;

    @FindBy(xpath = "//button[@ class=\'global-header__menu-l1-list-button global-header__menu-l1-list-button--search icon-mb icon-search\']")
    public WebElement searchButton;

    @FindBy(xpath = "//main[@id='content']//input[@class='form__input-field form__input-field--can-reset']")
    public WebElement searchInputField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement innerSearchButton;

    public HomePage clickMbHomePageLogo(){
        clickOnElement(mbHomePageLogo);
        return new HomePage();
    }
    public Vehicles clickVehiclesButton(){
        clickOnElement(vehiclesButton);
        return new Vehicles();
    }
    public void clickSearchInputField(){
        clickOnElement(searchInputField);
    }
    public void clickInnerSearchButton(){
        clickOnElement(innerSearchButton);
    }
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

//    public SearchResult searchInputField() {
//
//    }
}
