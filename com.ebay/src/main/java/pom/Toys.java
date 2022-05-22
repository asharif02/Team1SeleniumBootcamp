package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Toys extends SystemBar {

    //public static final String url = "https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497";

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-27[1]-0-toggle-button']")
    public WebElement babyToysLink;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-27[1]-0']//ul//li[3]//a")
    public WebElement blocksAndShapeSortersLink;

    public void clickBabyToysLink(){
        clickOnElement(babyToysLink);
    }

    public void clickBlocksAndShapeSortersLink(){
        clickOnElement(blocksAndShapeSortersLink);
    }

    public Toys(){
        PageFactory.initElements(driver, this);
    }
    }