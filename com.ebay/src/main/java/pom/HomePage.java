package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//button[@id='gh-shop-a']")
    public WebElement shopByCategoryDropdownButton;

    @FindBy(xpath = "//li[@data-hover-track='p2481888.m1384.l6435']")
    public WebElement toysButton;

    @FindBy(xpath = "//a[@href='https://ocsnext.ebay.com/ocs/home']")
    public WebElement helpAndContactLink;

    public boolean clickShopByCategoryDropDownButton(){
        clickOnElement(shopByCategoryDropdownButton);
        return DropdownMenu();
    }
    private boolean DropdownMenu() {
        return true;
    }

    public Toys clickToysButton(){
        clickOnElement(toysButton);
        return  new Toys();
    }

    public void clickHelpAndContactButton(){
        clickOnElement(helpAndContactLink);
    }

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
}
