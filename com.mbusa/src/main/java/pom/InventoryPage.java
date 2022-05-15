package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.MercedesNavigationPage;

public class InventoryPage extends MercedesNavigationPage {

    @FindBy(xpath = "//*[@id=\"inventory-container\"]//div[1]//div[1]/div/input")
    public WebElement newInventorySearch;

    @FindBy(xpath = "//button[@class='button button_primary button--wide dealer-selector-location-search__button']")
    public WebElement newInventorySearchButton;

    public InventoryPage(){
        PageFactory.initElements(driver, this);
    }

    public void enterZipCode(String zipcode){
        sendKeysToElement(newInventorySearch, zipcode);
    }

    public void submitSearch(){
        clickOnElement(newInventorySearchButton);
    }

    public void selectLineUpVehicle(String type){
        driver.findElement(By.xpath(String.format("//ul[@class='slider__list-container']//span[contains(text(),'%s')]",
                type))).click();
    }

    public void selectBenefitsOptions(String options){
        driver.findElement(By.xpath(String.format("//ul[@class='sticky-nav__items-list']//a" +
                "//span[contains(text(),'%s')]", options))).click();
    }
}