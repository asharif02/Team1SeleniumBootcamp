package app.shared;

import app.pom.Login;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//a[@class='login']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id=\"layer_cart\"]/div[1]/div[1]/h2")
    public WebElement addedToCartConfirmation;

    @FindBy(xpath = "//div[@id='enabled_filters']/ul/li")
    public WebElement filterConfirmation;

    @FindBy(xpath = "//span[@class='lighter']")
    public WebElement searchConfirmation;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement messageSentConfirmation;

    @FindBy(xpath = "//div[@class='fancybox-inner']")
    public WebElement locatorConfirmation;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement newsletterRegistrationConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading product-listing']")
    public WebElement specialsConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading']")
    public WebElement wishlistConfirmation;

    @FindBy(xpath = "//h1[@class='page-subheading']")
    public WebElement personalInfoConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading']")
    public WebElement addressConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
    public WebElement creditSlipConfirmation;


    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public Login clickLoginButton() {
        safeClickOnElement(loginButton);

        return new Login();
    }

}