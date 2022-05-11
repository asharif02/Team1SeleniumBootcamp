package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.HomePage;
import pom.Vehicles;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//a[@href='/en/home']")
    public WebElement mbHomePageLogo;

    @FindBy(xpath = "//li[@ class='global-header__menu-l1-list-item global-header__menu-l1-list-item--open']")
    public WebElement vehiclesButton;

    @FindBy(xpath = "//button[@ class=\'global-header__menu-l1-list-button global-header__menu-l1-list-button--search icon-mb icon-search\']")
    public WebElement searchButton;

    @FindBy(xpath = "//main[@id='content']//input[@class='form__input-field form__input-field--can-reset']")
    public WebElement searchInputField;

    public HomePage clickMbHomePageLogo(){
        clickOnElement(mbHomePageLogo);
        return new HomePage();
    }
    public Vehicles clickVehiclesButton(){
        clickOnElement(vehiclesButton);
        return new Vehicles();
    }
    public void clickSearchButton(){
        clickOnElement(searchButton);
    }
    public void clickSearchInputField(){
        clickOnElement(searchInputField);
    }
    public SystemBar(){
        PageFactory.initElements(driver, this);

    }
}
