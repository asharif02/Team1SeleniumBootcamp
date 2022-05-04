package app.pom;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.*;

public class Homepage extends BasePage {

    @FindBy(xpath = "//div[@id='location-field-destination-menu']")
    public WebElement destinationMenuField;

    @FindBy(xpath = "//input[@id='location-field-destination']")
    public WebElement destinationInputField;

    @FindBy(xpath = "//ul[@data-stid='location-field-destination-results']//li[@class='uitk-typeahead-result-item has-subtext']")
    public List<WebElement> destinationResultItems;

    @FindBy(xpath = "//ul[@data-stid='location-field-destination-results']//li[@class='uitk-typeahead-result-item has-subtext']")
    public WebElement resultItems;

    @FindBy(xpath = "//div[@class='uitk-typeahead-result-title-label truncate']")
    public WebElement exploreTrendingDestinations;

    @FindBy(xpath = "//button[@id='d1-btn']")
    public WebElement checkInButton;

    @FindBy(xpath = "//button[@id='d2-btn']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//div[@class='uitk-date-picker date-picker-menu']")
    public WebElement datePickerMenu;

//    @FindBy(xpath = "//table[@class='uitk-date-picker-weeks']//td[@class='uitk-date-picker-day-number']")
    @FindBy(xpath = "(//div[@data-stid='date-picker-month'])[1]//@data-day")
    public List<WebElement> daysInCurrentMonth;

//    @FindBy(xpath = "//div[@data-stid='date-picker-month']//@data-day")
//    @FindBy(xpath = "//div[@data-stid='date-picker-month']//button[@type='button']")
    @FindBy(xpath = "//div[@data-stid='date-picker-month']//button")
    public List<WebElement> allAvailableTravelDays;

    @FindBy(xpath = "//div[@data-stid='date-picker-month']//h2[@class='uitk-date-picker-month-name uitk-type-medium']")
    public List<WebElement> monthTableName;

    @FindBy(xpath = "//button[@data-stid='apply-date-picker']")
    public WebElement applyDatePicker;

    @FindBy(xpath = "//button[@data-testid='submit-button']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[@class='uitk-pill uitk-pill-removable uitk-pill-content']")
    public WebElement filterButton;

    @FindBy(xpath = "//section[@data-stid='mapClickButton']")
    public WebElement viewInAMapButton;

    @FindBy(xpath = "//h2[@class='uitk-toolbar-title truncate']")
    public WebElement mapHeaderText;

    @FindBy(xpath = "//h1")
    public WebElement accessDenied;

    @FindBy(xpath = "(//button[@class='uitk-date-picker-day selected edge'])[1]")
    public WebElement firstSelectedDayButtonEdge;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void selectRandomDestinationResultItem(String destination) {
        clickGoingToLocationField();
        sendKeysToElement(destinationInputField, destination);

        webDriverWait.until(ExpectedConditions.invisibilityOf(exploreTrendingDestinations));
        webDriverWait.until(ExpectedConditions.visibilityOf(resultItems));

        List<WebElement> results = destinationResultItems;
        int maxResults = results.size();

        Random random = new Random();
        int randomResult = random.nextInt(maxResults);
        results.get(randomResult).click();
    }

    public void selectCurrentCheckInDate() {
        clickCheckInButton();
        webDriverWait.until(ExpectedConditions.visibilityOf(datePickerMenu));

        try {
            WebElement desiredCheckInDay = getVisibleElement(By.xpath
                    (String.format("(//div[@data-stid='date-picker-month'])[1]//button[@data-day=\"%s\"]",
                            getCurrentDay())));
            clickOnElement(desiredCheckInDay);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void selectCheckOutDateWithinTwoWeeks() {
        webDriverWait.until(ExpectedConditions.visibilityOf(firstSelectedDayButtonEdge));

        ArrayList<WebElement> twoWeeks = new ArrayList<>();

        int count = 1;
        for(WebElement days : allAvailableTravelDays) {
            count++;
            if(count <= 14) {
                twoWeeks.add(days);
            } else {
                break;
            }
        }

        int maxVacation = twoWeeks.size();

        Random random = new Random();
        int randomDay = random.nextInt(maxVacation);
        twoWeeks.get(randomDay).click();

    }

    public void applyChanges() {
        clickApplyDatePickerButton();
        clickSubmitButton();
        webDriverWait.until(ExpectedConditions.visibilityOf(viewInAMapButton));
        clickViewInAMapButton();
        webDriverWait.until(ExpectedConditions.visibilityOf(mapHeaderText));
    }

    public void dealWithAccessDenied() {
        fluentWait.until(ExpectedConditions.visibilityOf(accessDenied));

        if(driver.getTitle().contains("Access Denied")) {
            driver.navigate().refresh();
        }

//        if (driver.findElement(By.xpath("//h1")) == accessDenied) {
//            driver.navigate().refresh();
//        }

    }

    public String getCurrentDay() {
        Calendar today = Calendar.getInstance();
        String day = today.get(Calendar.DAY_OF_MONTH)+"";
        System.out.println(day);
        return day;
    }

    public String getCurrentMonth() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleformat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss");

        simpleformat = new SimpleDateFormat("MMMM");
        String strMonth= simpleformat.format(new Date());
        System.out.println(strMonth);
        return strMonth;
    }

    public void clickGoingToLocationField() {
        clickOnElement(destinationMenuField);
    }

    public void clickCheckInButton() {
        clickOnElement(checkInButton);
    }

    public void clickCheckOutButton() {
        clickOnElement(checkOutButton);
    }

    public void clickApplyDatePickerButton() {
        clickOnElement(applyDatePicker);
    }

    public void clickSubmitButton() {
        clickOnElement(submitButton);
    }

    public void clickViewInAMapButton() {
        clickOnElement(viewInAMapButton);
    }

}
