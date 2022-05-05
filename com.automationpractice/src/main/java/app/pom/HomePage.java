package app.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //Test #1
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement forgotPasswordButton;

    public void testForgotPasswordButton(String item) {
        sendKeysToElement(forgotPasswordButton, item);
    }

    //Test #2

    //@FindBy(xpath = "//a[@class='login']")
    //public WebElement signInButton;
    //@FindBy(xpath = "//div[@id='contact-link']")
    public WebElement contactUsButton;


    public void testContactUsButton(String item) {
        sendKeysToElement(contactUsButton, item);
    }
    //Test case #2

    @FindBy(xpath = "//button[@class='btn btn-default button-search']")
    public WebElement searchButton;

    public void testSearchButton(String item) { sendKeysToElement(searchButton,item);}
}

