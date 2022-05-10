package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement tShirtOption;

    @FindBy(xpath = "//a[@title='Women']")
    public WebElement womenOption;

    @FindBy(xpath = "//a[@class='account']")
    public WebElement accountButton;

    @FindBy(id = "search_query_top")
    public WebElement searchBar;

    @FindBy(xpath = "//a[@title='Contact Us']")
    public WebElement contactButton;

    @FindBy(xpath = "//input[@id='newsletter-input']")
    public WebElement newsletterRegistrationEmailInput;

    @FindBy(xpath = "//button[@name='submitNewsletter']")
    public WebElement newsletterSubmitButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public Catalog selectTShirtOption() {
        clickOnElement(tShirtOption);

        return new Catalog();
    }
    public Catalog clickWomenOption(){
        clickOnElement(womenOption);

        return new Catalog();
    }
    public Catalog searchBar(String keys){
        sendKeysToElement(searchBar, keys);

        return new Catalog();
    }
    public ContactUs clickContactButton() {
        safeClickOnElement(contactButton);

        return new ContactUs();
    }
    public void newsletterEmailInput(String email){sendKeysToElement(newsletterRegistrationEmailInput, email);}
    public void clickNewsletterSubmitButton(){clickOnElement(newsletterSubmitButton);}
}