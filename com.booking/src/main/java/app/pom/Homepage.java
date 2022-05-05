package app.pom;

import app.shared.SystemBar;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Homepage extends SystemBar {

//    @FindBy(xpath = "//div[@data-ats='44']//li[@data-bui-ref='carousel-item']//h3[@class='bui-card__title']")
//    @FindBy(xpath = "//div[@data-ats='44']//li[@data-bui-ref='carousel-item']//h3[@class='bui-card__title']/a")
//    @FindBy(xpath = "//div[@data-ats='44']//li[@class='bui-carousel__item']")
//    @FindBy(xpath = "//div[@data-ats='44']//li[@class='bui-carousel__item']//h3[@class='bui-card__title']")
    @FindBy(xpath = "//div[@id='basiclayout']//div[@data-ats='44']//li[@data-bui-ref='carousel-item']")
    public List<WebElement> propertyTypesList;

//    @FindBy(xpath = "//div[@data-ats='44']//li[@data-bui-ref='carousel-item']//h3[@class='bui-card__title']/a")
//    public WebElement propertyTypesHeaderText;

    @FindBy(xpath = "(//div[@data-ats='44']//li[@data-bui-ref='carousel-item']//div[@class='bui-card__content']//p)[1]")
    public WebElement firstCarouselItemSubTitle;

    @FindBy(xpath = "//div[@data-ats='44']//h2")
    public WebElement browseByPropertyTypeText;

    @FindBy(xpath = "//div[@id='dealsCampaign_getaway']")
    public WebElement dealsCampaignAd;

    @FindBy(xpath = "//input[@id='ss']")
    public WebElement inputSearchField;

    @FindBy(xpath = "//div[@data-ats='44']//button[@data-bui-ref='carousel-next']")
    public WebElement carouselNextButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToAnyPropertyType(String propertyType) throws InterruptedException {
        Homepage homepage = new Homepage();
        scrollUntilFirstCarouselItemSubTitleIsVisible();
        fluentWait.until(ExpectedConditions.elementToBeClickable(browseByPropertyTypeText));

        List<WebElement> propertyTypes = propertyTypesList;

        Actions actions = new Actions(driver);

        try {
            for (WebElement property : propertyTypes) {
                if (property.getAttribute("innerHTML").toLowerCase().contains(propertyType)) {
                    actions.moveToElement(property).click().build().perform();
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//                webDriverWait.until(ExpectedConditions.elementToBeSelected(property));

//                property.click();
//                hoverOverElement(property);
//                jsDriver.executeScript("arguments[0].click()", property);
//                clickOnElement(property);
                }
            }

        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        }

//        try {
//            for (WebElement property : propertyTypes) {
//                if (property.getAttribute("innerHTML").toLowerCase().contains(propertyType)) {
//                    clickOnElement(property);
//                }
//            }
//        } catch (ElementClickInterceptedException | MoveTargetOutOfBoundsException e) {
//            e.printStackTrace();
//        }

    }

    public void sendKeysToSearchField(String location) {
        sendKeysToElement(inputSearchField, location);
    }

    public void scrollUntilFirstCarouselItemSubTitleIsVisible() {
        jsScrollUntilElementVisible(browseByPropertyTypeText);
    }

    public void clickCarouselNextButton() {
        carouselNextButton.click();
//        clickOnElement(carouselNextButton);
    }

    public void hoverOverCarouselNextButton() {
        hoverOverElement(carouselNextButton);
    }
}
