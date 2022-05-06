package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//div[@id='tabContentId0']//input[@id='search-box-input']")
    public WebElement searchBoxInputField;

    @FindBy(xpath = "//div[@id='tabContentId0']//button[@data-rf-test-name='searchButton']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@data-rf-test-name='expanded-results']")
    public WebElement expandedResults;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public ListingPage navigateToAnyUSHomeListing(String location) {
        clickSearchBoxInputField();
        enterLocationName(location);
        webDriverWait.until(ExpectedConditions.visibilityOf(expandedResults));
        clickSearchButton();

        return new ListingPage();
    }

    public void clickSearchBoxInputField() {
        clickOnElement(searchBoxInputField);
    }

    public void enterLocationName(String location) {
        sendKeysToElement(searchBoxInputField, location);
    }

    public void clickSearchButton() {
        clickOnElement(searchButton);
    }
}
