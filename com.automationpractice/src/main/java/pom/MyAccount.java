package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class MyAccount extends SystemBar {

    @FindBy(id = "//*[@id='search_query_top']")
    public WebElement searchInputField;

    @FindBy(xpath = "//*[@name='submit_search']")
    public WebElement searchButton;

    public void EnterSearchTerm(String searchTerm){
        sendKeysToElement(searchInputField, searchTerm);
    }
    public void clickSearchButton(){
        safeClickOnElement(searchButton);
    }

    public MyAccount(){
       PageFactory.initElements(driver, this);
    }

}
