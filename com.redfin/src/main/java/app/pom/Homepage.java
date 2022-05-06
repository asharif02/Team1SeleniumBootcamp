package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//div[@data-rf-test-name='dialogGutsNode']//h3[@aria-label='Did You Mean']")
    public WebElement didYouMeanModalWindow;

    @FindBy(xpath = "(//div[@class='expanded-row-content']//div[@tabindex='0'])[1]")
    public WebElement firstItemModalWindow;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public ListingPage navigateToAnyUSHomeListing(String location) {
        clickSearchBoxInputField();
        enterLocationName(location);
        webDriverWait.until(ExpectedConditions.visibilityOf(expandedResults));
        clickSearchButton();

        fluentWait.until(ExpectedConditions.visibilityOf(didYouMeanModalWindow));

        boolean modalWindow = driver.findElement(By.xpath("//div[@data-rf-test-name='dialogGutsNode']//h3[@aria-label='Did You Mean']")).isDisplayed();

        if (modalWindow) {
            clickFirstItemInModalWindow();
        }

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

    public void clickFirstItemInModalWindow() {
        clickOnElement(firstItemModalWindow);
    }
}
