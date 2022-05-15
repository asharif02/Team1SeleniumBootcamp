package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.Homepage;

public class WealthManagementPage extends Homepage {

    @FindBy(xpath = "//input[@id='firstname-0']")
    public WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='lastname-0']")
    public WebElement inputLastName;

    @FindBy(xpath = "//input[@id='emailaddress-0']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@id='confirmemailaddress-0']")
    public WebElement confirmEmail;

    @FindBy(xpath = "//input[@id='businessphone-0']")
    public WebElement inputPhoneNumber;

    @FindBy(xpath = "//input[@id='zipcode-0']")
    public WebElement inputZipCode;

    @FindBy(xpath = "//select[@id='portfoliosize']")
    public WebElement portfolioSize;

    @FindBy(xpath = "//button[@title='Get Started']")
    public WebElement getStarted;

    public WealthManagementPage(){
        PageFactory.initElements(driver, this);
    }
    public void keyFirstName(String name){
        sendKeysToElement(inputFirstName, name);
    }
    public void keyLastName(String name){
        sendKeysToElement(inputLastName, name);
    }
    public void keyEmail(String email){
        sendKeysToElement(inputEmail, email);
    }
    public void confirmEmail(String email){
        sendKeysToElement(confirmEmail, email);
    }
    public void keyPhoneNumber(String phoneNumber){
        sendKeysToElement(inputPhoneNumber, phoneNumber);
    }
    public void keyZipCode(String zipCode){
        sendKeysToElement(inputZipCode, zipCode);
    }
    public void selectPortfolioSize(int option){
        selectFromDropdownByIndex(portfolioSize, option);
    }
    public void clickGetStarted(){
        clickOnElement(getStarted);
    }
}