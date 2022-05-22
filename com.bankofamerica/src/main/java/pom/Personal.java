package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Personal extends SystemBar {

    @FindBy(id = "//*[@id='NAV_PERSONAL']")
    public WebElement personalButton;

    @FindBy(xpath = "//a[@id='navChecking']")
    public WebElement checkingButton;

    @FindBy(id = "//*[@id=\"navCheckingOnlineBanking\"]")
    public WebElement onlineBankingLink;

    public void clickPersonalButton(){
        clickOnElement(personalButton);
    }
    public void clickCheckingButton(){
        clickOnElement(checkingButton);
    }
    public MobileAndOnlineBanking clickOnlineBankingLink(){
        clickOnElement(onlineBankingLink);
        return new MobileAndOnlineBanking();
    }

    public Personal(){
        PageFactory.initElements(driver, this);
    }
}
