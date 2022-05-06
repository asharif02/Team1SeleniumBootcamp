package app.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage (){ PageFactory.initElements(driver, this);}

   @FindBy (xpath = "//a[@href='https://www.ebay.com/deals']")
   public WebElement ebayDailyDealsButton;



}



///a[@href='https://www.ebay.com/deals']