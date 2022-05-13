package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//*[@href='https://www.marketwatch.com/latest-news?mod=top_nav']")
    public WebElement latestButton;

    @FindBy(xpath = "//*[@id='nav__menu']//li[@class='menu__item'][1]")
    public WebElement watchlistButton;

    @FindBy(xpath = "//*[@href='https://www.marketwatch.com/markets?mod=top_nav']")
    public WebElement marketsButton;

    @FindBy(xpath = "//*[@href='https://www.marketwatch.com/investing?mod=top_nav']")
    public WebElement investingButton;

    @FindBy(xpath = "//*[@href='https://www.marketwatch.com/personal-finance?mod=top_nav']")
    public WebElement personalFinanceButton;

    @FindBy(id = "//*[@id='cXLinkIdl34h97eoyp6a5l9v']")
    public WebElement oneDollarForFourWeeksButton;




    public void clickOneDollarForFourWeeksButton(){
        safeClickOnElement(oneDollarForFourWeeksButton);
    }
    public SystemBar(){
        PageFactory.initElements(driver, this);
    }
}
