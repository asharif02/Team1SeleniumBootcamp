package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//*[@href='http://automationpractice.com/index.php?controller=order']/b")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@title='Log in to your customer account']")
    public WebElement signInButton;

    @FindBy(id = "//div[@class='form-group form-error']//input[@class='is_required validate account_input form-control']")
    public WebElement emailAddressInputField;

    @FindBy(id = "//input[@id='passwd']")
    public WebElement passwordInputField;

    @FindBy(id = "//button[@id='SubmitLogin']")
    public WebElement submitLogInButton;

    @FindBy(id = "id='contact-link'")
    public WebElement contactUsButton;

    public void clickSignInButton(){
        safeClickOnElement(signInButton);
    }
    public void enterEmailAddress(String emailAddress){
        sendKeysToElement(emailAddressInputField, emailAddress);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordInputField, password);
    }
    public MyAccount clickSubmitLogInButton(){
        safeClickOnElement(submitLogInButton);
        return new MyAccount();
    }
    public void clickCartButton(){
        safeClickOnElement(cartButton);
    }
    public ContactUsPage clickContactUsButton(){
        clickOnElement(contactUsButton);
        return new ContactUsPage();
    }
    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
