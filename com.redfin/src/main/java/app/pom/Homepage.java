package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//div[@id='tabContentId0']//input[@id='search-box-input']")
    public WebElement searchBoxInputField;

    @FindBy(xpath = "//div[@id='tabContentId0']//button[@data-rf-test-name='searchButton']")
    public WebElement searchButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public ListingPage navigateToAnyUSHomeListing(String location) {
        navigateToHomeListing(location);
        clickSearchButton();

        return new ListingPage();
    }

    public void navigateToHomeListing(String location) {
        sendKeysToElement(searchBoxInputField, location);
    }

    public void clickSearchButton() {
        clickOnElement(searchButton);
    }
}
