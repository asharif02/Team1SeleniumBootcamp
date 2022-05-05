package app.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement forgotPasswordButton;

    public void setForgotPasswordButton(String item) {
        sendKeysToElement(forgotPasswordButton, item);
    }
}
