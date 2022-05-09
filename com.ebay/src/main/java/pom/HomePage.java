package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//button[@id='gh-shop-a']")
    public WebElement shopByCategoryDropdownButton;

    public void clickShopByCategoryDropDownButton(){
        clickOnElement(shopByCategoryDropdownButton);
    }
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
}
