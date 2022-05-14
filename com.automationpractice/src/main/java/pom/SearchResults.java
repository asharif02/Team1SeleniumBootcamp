package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class SearchResults extends SystemBar {

    @FindBy(xpath = "//*[@id='center_column']//ul//li[1]//div[1]//a[1]//img")
    public WebElement printedSummerDressLink;

    @FindBy(xpath = "//*[@id='color_11']")
    public WebElement blackColorBox;

    public void clickPrintedSummerDressLink(){
        safeClickOnElement(printedSummerDressLink);
    }
    public void clickQuantityPlusIcon(){
        safeClickOnElement(blackColorBox);
    }

    public SearchResults(){
        PageFactory.initElements(driver, this);
    }
}
