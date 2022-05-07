package app.shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import app.pom.AsiaMarket;
import app.pom.EuropeMarket;
import app.pom.FXMarket;
import app.pom.UnitedStatesMarket;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='https://www.marketwatch.com/markets/us']")
    public WebElement usMarket;

    @FindBy(xpath = "//a[@href='https://www.marketwatch.com/markets/europe-middle-east']")
    public WebElement europeMarket;

    @FindBy(xpath = "//a[@href='https://www.marketwatch.com/markets/asia']")
    public WebElement asiaMarket;

    @FindBy(xpath = "//a[@href='https://www.marketwatch.com/investing/currencies']")
    public WebElement fxMarket;

    @FindBy(xpath = "//button[@class='close-btn']")
    public WebElement popUP;

    @FindBy(xpath = "//h1[@class='company__name']")
    public WebElement dataSelectionConfirmation;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public UnitedStatesMarket closePopUpToViewUSMarket() {
        clickOnElement(popUP);

        return new UnitedStatesMarket();
    }
    public EuropeMarket closePopUpToViewEuropeMarket(){
        clickOnElement(popUP);

        return new EuropeMarket();
    }
    public AsiaMarket closePopUpToViewAsiaMarket(){
        clickOnElement(popUP);

        return new AsiaMarket();
    }
    public FXMarket closePopUpToViewFXMarket(){
        clickOnElement(popUP);

        return new FXMarket();
    }

}
