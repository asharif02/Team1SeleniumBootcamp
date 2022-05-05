package app.shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//a[@title='Buy Menu']")
    public WebElement buyMenuDropDown;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public void hoverOverBuyMenu() {
        hoverOverElement(buyMenuDropDown);
    }
}
