package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.ContactUs;
import pom.SmallBusinessPage;
import pom.WealthManagementPage;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@id='footer_bofa_contactus']")
    public WebElement contactUs;

    @FindBy(xpath = "//div[@class='column-content equalize']//h3")
    public WebElement makingClientsPriorityConfirmation;

    @FindBy(xpath = "//a[@id='NAV_WEALTH_MANAGEMENT']")
    public WebElement wealthManagement;

    @FindBy(xpath = "//a[@id='NAV_BUSINESS_ADVANTAGE']")
    public WebElement smallBusiness;

    @FindBy(xpath = "//p[@class='pdcContactForm--success__title']")
    public WebElement merrillSubmissionConfirmation;

    @FindBy(xpath = "//h1[@class='site-header__page-header']")
    public WebElement smallBusinessResourceSelectionConfirmation;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public ContactUs clickContactUs(){
        clickOnElement(contactUs);

        return new ContactUs();
    }
    public WealthManagementPage clickWealthManagement(){
        clickOnElement(wealthManagement);

        return new WealthManagementPage();
    }
    public SmallBusinessPage clickSmallBusiness(){
        clickOnElement(smallBusiness);

        return new SmallBusinessPage();
    }
}