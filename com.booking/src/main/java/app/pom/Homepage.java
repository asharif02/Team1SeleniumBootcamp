package app.pom;

import app.shared.SystemBar;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homepage extends SystemBar {

    @FindBy (xpath = "//div[@data-ats='44']//li[@data-bui-ref='carousel-item']//h3[@class='bui-card__title']")
    public List<WebElement> propertyTypesList;

    @FindBy(xpath = "//input[@id='ss']")
    public WebElement inputSearchField;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchField(String location) {
        sendKeysToElement(inputSearchField, location);
    }
}
