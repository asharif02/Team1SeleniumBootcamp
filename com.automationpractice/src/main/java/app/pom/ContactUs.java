package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs extends SystemBar {

    @FindBy(xpath = "//select[@name='id_contact']")
    public WebElement selectDepartment;

    @FindBy(xpath = "//input[@data-validate='isEmail']")
    public WebElement inputEmailAddress;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement messageField;

    @FindBy(xpath = "//button[@id='submitMessage']")
    public WebElement sendButton;


    public ContactUs() {
        PageFactory.initElements(driver, this);
    }
    public void departmentSelection(int index){
        selectFromDropdownByIndex(selectDepartment, index);
    }
    public void inputEmailAddress(String email) {
        sendKeysToElement(inputEmailAddress, email);
    }
    public void inputMessage(String message){
        sendKeysToElement(messageField, message);
    }
    public void clickSendButton(){
        clickOnElement(sendButton);
    }
}
