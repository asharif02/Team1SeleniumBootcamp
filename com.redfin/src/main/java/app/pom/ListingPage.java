package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ListingPage extends SystemBar {

//    @FindBy(xpath = "//div[@data-content='Austin']")
//    @FindBy(xpath = "//div[@data-content=\"%s\"]")
//    @FindBy(xpath = "//form[@class='SearchBoxForm']//div[contains(text(), '%s')]")
    @FindBy(xpath = "//div[@class='Tag__text']")
    public WebElement locationTagText;

    @FindBy(xpath = "//div[@id='MapHomeCard_0']")
    public WebElement firstHomeCardContainer;

    @FindBy(xpath = "//div[@title='Show map']//div[@role='button']")
    public WebElement mapFlyOutButton;

    public ListingPage() {
        PageFactory.initElements(driver, this);
    }

    public void closeMapFlyOutButton() {
//        webDriverWait.until(ExpectedConditions.visibilityOf(mapFlyOutButton));

        boolean mapFlyOutButton = driver.findElement(By.xpath("//div[@title='Show map']//div[@role='button']")).isDisplayed();

        try {
            if (mapFlyOutButton) {
                clickMapFlyOutButton();
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

//        webDriverWait.until(ExpectedConditions.visibilityOf(firstHomeCardContainer));
    }

    public void waitForFirstHomeCard() {
        webDriverWait.until(ExpectedConditions.visibilityOf(firstHomeCardContainer));
    }

    public void getListingLocation(String location) {
        driver.findElement(By.xpath(String.format("//form[@class='SearchBoxForm']//div[contains(text(), '%s')]", location)));
    }

    public void clickMapFlyOutButton() {
        clickOnElement(mapFlyOutButton);
    }
}
