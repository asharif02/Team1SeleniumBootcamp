package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends SystemBar {

    public static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id=\"block_various_links_footer\"]/ul/li[6]/a")
    public WebElement TermsAndConditions;

    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar;

    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar2;

    @FindBy(xpath = " //*[@id=\"center_column\"]/ul/li[1]\n")
    public WebElement itemHover;

    @FindBy (xpath = "//*[@id='add_to_cart']/button/span[1]")
    public WebElement addToCart;

    @FindBy (xpath = "//*[@id=\"footer\"]/div/section[5]/div/ul/li[2]/a")
    public WebElement reviewMyCreditSlip;

    @FindBy (xpath = "//*[@value='Enter your e-mail']")
    public WebElement subscribingNewsletter;

    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar3;

    @FindBy(xpath = "//*[@class='icon-th-list']")
    public WebElement listView;

    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar4;

    @FindBy(xpath = "//*[@class='icon-th-list']")
    public WebElement listView1;

    @FindBy (xpath = "//*[@class='button lnk_view btn btn-default']")
    public WebElement clickMoreButton;

    @FindBy(id = "email")
    public WebElement registeredEmailAddressInputField;

    @FindBy(id = "passwd")
    public WebElement passwordInputField;

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;


    @FindBy(id = "email_create")
    public WebElement newEmailAddressInputField;

    public MyAccount login(String emailAddress, String password) {
        inputRegisteredEmailAddress(emailAddress);
        inputPassword(password);
        clickSignInButton();

        return new MyAccount();
    }


    public void inputNewEmailAddress(String emailAddress) {
        sendKeysToElement(newEmailAddressInputField, emailAddress);
    }

    public void inputRegisteredEmailAddress(String emailAddress) {
        sendKeysToElement(registeredEmailAddressInputField, emailAddress);
    }

    public void inputPassword(String password) {
        sendKeysToElement(passwordInputField, password);
    }

    public void clickSignInButton() {clickOnElement(signInButton);}

    public Login() {
        PageFactory.initElements(driver, this);
    }
}
