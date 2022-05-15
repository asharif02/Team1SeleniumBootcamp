package pom;


import base.BasePage;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homepage extends BasePage {

    @FindBy(id = "ss")
    public WebElement searchBox;

    @FindBy(xpath = "//ul[@role='listbox']/li")
    public List<WebElement> autoSuggestions;

    @FindBy(xpath = "//ul[@role='listbox']")
    public WebElement autoSuggestionWhole;

    @FindBy(xpath = "//div[@class='bui-calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//td[@class='bui-calendar__date bui-calendar__date--today']")
    public WebElement todaysDate;

    @FindBy(xpath = "(//div[@class='bui-calendar__wrapper'])[1]")
    public WebElement currentMonth;

    @FindBy(xpath = "//td[@class='bui-calendar__date']")
    public List<WebElement> allDaysShown;

    @FindBy(id = "xp__guests__toggle")
    public WebElement guests;

    @FindBy(xpath = "//button[@aria-label='Increase number of Adults']")
    public WebElement plusAdultButton;

    @FindBy(xpath = "//button[@aria-label='Increase number of Rooms']")
    public WebElement plusRoomsButton;

    @FindBy(xpath = "//button[@class='sb-searchbox__button ']")
    public WebElement submit;

    @FindBy(xpath = "//a[@aria-current=\"page\"]//span[@class=\"bui-tab__text\"]")
    public WebElement staysSearchConfirmation;

    @FindBy(xpath = "//div[@class='map_full_overlay__close']")
    public WebElement popUp;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }

    public void closePopUp(){
        clickOnElement(popUp);
    }

    public void clickSubmit(){
        clickOnElement(submit);
    }

    public void addARoom(){
        clickOnElement(plusRoomsButton);
    }

    public void addAnAdult(){
        clickOnElement(plusAdultButton);
    }
    public void selectGuestsBar(){
        clickOnElement(guests);
    }

    public void selectRandomDayWithin30Days(){
        ArrayList<WebElement> next30Days = new ArrayList<>();
        int count = 0;
        for(WebElement element : allDaysShown){
            count++;
            if(count <= 30) {
                next30Days.add(element);
            } else {
                break;
            }
        }

        int min = 0;
        int max = next30Days.size() - 1;
        int randomNumber = (int)(Math.random()*(max-min+1)+min);
        clickOnElement(next30Days.get(randomNumber));
    }

    public void typeInSearchBar(String destination){
        sendKeysToElement(searchBox, destination);
    }

    public void selectTodaysDate(){
        webDriverWait.until(ExpectedConditions.visibilityOf(todaysDate));
        todaysDate.click();
    }

    public void selectRandomAutoSuggestion(){
        int min = 0;
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(autoSuggestionWhole));
        } catch (WebDriverException e){
            e.printStackTrace();
        }
        List<WebElement> results = autoSuggestions;

        int maxResults = results.size();
        Random random = new Random();
        int randomResult = random.nextInt(maxResults);
        results.get(randomResult).click();

    }

}