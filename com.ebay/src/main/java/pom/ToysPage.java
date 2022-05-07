package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class ToysPage extends SystemBar {

    public static final String url = "https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497";

    @FindBy(xpath = "//div[@id='gh-sbc-o']//ul//a[@href='https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497']")
    public WebElement ToysButton;

    public ToysPage(){
        PageFactory.initElements(driver, this);
    }
//    public void clickToysButton() {
//        clickOnElement(toysButton);
//    }
    }