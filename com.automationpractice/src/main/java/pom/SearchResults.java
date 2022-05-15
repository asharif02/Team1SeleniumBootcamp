package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class SearchResults extends SystemBar {

    @FindBy(xpath = "//*[@id='center_column']//ul//li[1]//div[2]//h5")
    public WebElement printedSummerDressLink;

    @FindBy(xpath = "//*[@id='color_11']")
    public WebElement blackColorBox;

    @FindBy(id = "p[id='add_to_cart']")
    public WebElement addToCartButton;

    public void clickPrintedSummerDressLink(){
        safeClickOnElement(printedSummerDressLink);
    }
    public void clickQuantityPlusIcon(){
        safeClickOnElement(blackColorBox);
    }
    public void clickAddToCartButton(){
        safeClickOnElement(addToCartButton);
    }

    public SearchResults(){
        PageFactory.initElements(driver, this);
    }
}
