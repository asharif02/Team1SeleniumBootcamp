package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.MercedesNavigationPage;

public class ShoppingPage extends MercedesNavigationPage {

    @FindBy(xpath = "//div[@id=\"compare-container\"]/div/div/div[1]/button/div")
    public WebElement addVehiclesToCompare;

    @FindBy(xpath = "//button[@class='button button_primary button--wide']")
    public WebElement compareButton;

    public ShoppingPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickToAddVehiclesToCompare(){
        clickOnElement(addVehiclesToCompare);
    }

    public void vehiclesToCompare(String model){
        driver.findElement(By.xpath(String.format("//div[@class='model-filter__sections']" +
                "//span[contains(text(),'%s')]", model))).click();
    }

    public void clickCompareButton(){
        clickOnElement(compareButton);
    }
}