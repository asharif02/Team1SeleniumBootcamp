package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class ContactUsPage extends SystemBar {

    @FindBy(xpath = "//*[@id='uniform-id_contact']//span")
    public WebElement subjectHeadingComboBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddressInputField;

    @FindBy(xpath = "//select[@name='id_order']")
    public WebElement orderReferenceNumberField;

    @FindBy(xpath = "//*[@class='action']")
    public WebElement chooseFileButton;

    @FindBy(id = "//*[@id='message']")
    public WebElement textArea;

    @FindBy(id = "//*[@id='submitMessage']")
    private WebElement sendButton;

    @FindBy(id = "//*[@id='center_column']//p")
    public WebElement customerServiceContactUsValidationMessage;

    public void selectSubjectHeadingByVisibleText(String text){
        selectFromDropdownByVisibleText(subjectHeadingComboBox, text);
    }

    public void inputEmailAddress(String emailAddress) {
        sendKeysToElement(emailAddressInputField, emailAddress);
    }

    public void inputOrderReference(String orderReference) {
        sendKeysToElement(orderReferenceNumberField, orderReference);
    }

    public void clickToUploadFile(){
        String path = "\\Users\\zohralamrani\\IdeaProjects\\Team1SeleniumBootcamp\\com.automationpractice\\src\\test\\resources\\Test_Data.xlsx";
        sendKeysToElement(chooseFileButton, path);
    }
    public void inputMessage(String message) {
        sendKeysToElement(textArea, message);
    }

    public void clickSendButton(){
        clickOnElement(sendButton);
    }

    public String getValidationMessage(){
        return getTrimmedElementText(customerServiceContactUsValidationMessage);
    }
    public ContactUsPage(){
        PageFactory.initElements(driver, this);
    }
}
