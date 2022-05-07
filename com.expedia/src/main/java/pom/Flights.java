package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SystemBar;
import javax.lang.model.util.Elements;
import java.util.List;
import static java.awt.SystemColor.text;

public class Flights extends SystemBar {

    @FindBy(xpath = "//button[@aria-label='Leaving from']")
    public WebElement leavingFromButton;

    @FindBy(xpath = "@FindBy(xpath = \"//button[@aria-label='Leaving from']\")\n" +
            "    public WebElement leavingFromButton;")
    public WebElement goingToButton;

    @FindBy(xpath = "//input[@id='location-field-leg1-origin']")
    public WebElement whereAreYouLeavingFromInputField;

    @FindBy(xpath = "//input[@data-stid='location-field-leg1-destination-menu-input']")
    public WebElement goingToInputField;

    @FindBy(xpath = "//ul[@data-stid='location-field-leg1-origin-results']")
    WebElement airportSearchResultList;
    public Flights() {
        PageFactory.initElements(driver, this);
    }

    public void clickLeavingFromButton() {
        safeClickOnElement(leavingFromButton);
    }
    public void clickGoingToButton() {
        safeClickOnElement(goingToButton);
    }
    public void sendTextToWhereAreYouLeavingFromInputField(String text) {
        sendKeysToElement(whereAreYouLeavingFromInputField, text);
        //driver.findElements(By.xpath(""));
    }
    public void sendTextToGoingToInputField(String text){
        sendKeysToElement(goingToInputField, text);
    }
    //    public List<WebElement> getAirportSearchList(){
//        List <WebElement> airports = driver.findElements(By.xpath("//li[@class='uitk-typeahead-result-item has-subtext']"));
//    }
    public void selectAirportFormSearchListByIndex(int index) {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElements(airportSearchResultList));
        List<WebElement> airportListSelection = driver.findElements(By.xpath("//ul[@data-stid='location-field-leg1-origin-results']"));
        //webDriverWait.until(ExpectedConditions.visibilityOfAllElements(airportListSelection));
        for(WebElement element : airportListSelection)
            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        int length = airportListSelection.size();
        if ((index >= 0) && (index <= length)) {
            WebElement airportResultList = driver.findElement((By.xpath(String.format("//ul[@data-stid='location-field-leg1-origin-results']/li[%s]", index + 1))));
            clickOnElement(airportResultList);
        }
    }
}

    //ul[@data-stid='location-field-leg1-destination-results']/li[1] ---> Destination xpath