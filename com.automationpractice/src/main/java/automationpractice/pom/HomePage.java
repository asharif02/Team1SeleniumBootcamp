package automationpractice.pom;

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

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton1;

    @FindBy(xpath = "//div[@id='contact-link']")
    public WebElement contactUsButton;


    public void setContactUsButton(String item) {
        sendKeysToElement(contactUsButton, item);
    }
    //Test case #2

    @FindBy(xpath = "//button[@class='btn btn-default button-search']")
    public WebElement searchButton;

    public void setSearchButton(String item) { sendKeysToElement(searchButton,item);}

    //Test case #3

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton2;

    public void setSignInButton2(String item){ sendKeysToElement(signInButton2,item);}



}

