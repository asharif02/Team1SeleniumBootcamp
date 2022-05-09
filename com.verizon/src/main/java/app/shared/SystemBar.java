package app.shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//*[@id=\"gnav20-sign-id\"]/span/span")
    public WebElement signInButton;

    @FindBy (xpath = "//a[@aria-label='Sign in to My Account']")
    public WebElement signIntoMyAccount;

    public SystemBar() {
        PageFactory.initElements(driver,this);
    }
}
