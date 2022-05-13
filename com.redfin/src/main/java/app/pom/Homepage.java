package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends SystemBar {

    @FindBy (xpath = "//button[@data-rf-test-name='SignInLink']")
    public WebElement clickLoginInButton;
//
    @FindBy(xpath = "//div[@id='tabContentId0']//input[@id='search-box-input']")
    public WebElement searchBarInput;

    @FindBy (xpath = "//*[@id=\"search-box-input\"]")
    public WebElement searchInput;

    @FindBy (xpath =  "//span[@class='signInText']")
    public WebElement clickWithGoogleButton;

    @FindBy (xpath = "//*[@id=\"search-box-input\"]")
    public WebElement searchingForRentals;

    //City Listings

    @FindBy(xpath = "//div[@data-rf-test-name='expanded-results']")
    public WebElement expandedResults;
//
    @FindBy(xpath = "//div[@id='tabContentId0']//button[@data-rf-test-name='searchButton']")
    public WebElement HomeSearchButton;
//
    @FindBy(xpath = "//div[@class='Tag__text']")
    public WebElement tag_TextPlaceHolder;
//
    @FindBy(xpath = "//div[@id='MapHomeCard_0']")
    public WebElement searchResultContainer;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }


    public Homepage searchHomesInCities(String city) {
        clickSearchBoxInputField();
        enterCityName(city);
        webDriverWait.until(ExpectedConditions.visibilityOf(expandedResults));
        clickSearchButton();

        return new Homepage();

    }

    public void waitForSearchResultContainer() {
        webDriverWait.until(ExpectedConditions.visibilityOf(searchResultContainer));
    }

    public void clickSearchBoxInputField() {clickOnElement(searchBarInput);}

    public void enterCityName(String city) {sendKeysToElement(searchBarInput, city);}

    public void clickSearchButton() {clickOnElement(HomeSearchButton);}

    public void logIn(){clickOnElement(clickLoginInButton);}


}
