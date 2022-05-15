package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Homepage extends SystemBar {

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='header-content']//header[2]//div[2]//div[1]//div//div//a//span[2]")
    public WebElement customerServicePhoneNumber;

    @FindBy(xpath = "//div[@class='menuItemClickable verticallyCenterFlexContent menuItemAlign clickable withHoverShim'][1]")
    public WebElement buyHoverOverDropdownMenu;

    @FindBy(xpath = "//*[@id='header-content']//header[2]//div[2]//a[1]")
    public WebElement rentButton;

    public void clickCustomerServicePhoneNumber(){
        clickOnElement(customerServicePhoneNumber);
    }
    public void clickBuyHoverOverDropdownMenu(){
        safeClickOnElement(buyHoverOverDropdownMenu);
    }
    public void clickRenButton(){
        clickOnElement(rentButton);
    }
}
