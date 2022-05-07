package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BasePage.driver;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//ul[@class='gnav20-footer-list']//a[contains(text(), 'Accessories')]")
    public WebElement accessoriesLink;

    public void clickAccessoriesLink(){
        clickOnElement(accessoriesLink);
    }

    public Homepage(){
        PageFactory.initElements(driver, this);
    }

}