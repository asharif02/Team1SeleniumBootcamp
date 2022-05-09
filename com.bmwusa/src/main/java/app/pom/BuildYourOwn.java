package app.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class BuildYourOwn extends BasePage {

    @FindBy(xpath = "//button[@analytics-event='byo-vehicle-selector.vehicle-selector.select-a-series.button']")
    public WebElement selectASeriesButton;

    @FindBy(xpath = "(//ul[@class='router-links']//button)[17]")
    public WebElement bmwMSeriesButton;

    @FindBy(xpath = "//ul[@class='router-links']//button")
    public List<WebElement> listOfModelSeries;

    @FindBy(xpath = "//img[@alt='M3 Sedan']")
    public WebElement m3SedanImage;

    @FindBy(xpath = "//a[@title='M3 Sedan']")
    public WebElement m3SelectButton;

    @FindBy(xpath = "//a[@class='cta-button theme-core byo-core-type series-tile__select cta-1']")
    public List<WebElement> seriesList;

    public DesignPage selectARandomModelSeries() {
        webDriverWait.until(ExpectedConditions.visibilityOf(selectASeriesButton));

        List<WebElement> series = seriesList;
        int maxSeries = series.size();

        Random random = new Random();
        int randomSeries = random.nextInt(maxSeries);
        series.get(randomSeries).click();

        return new DesignPage();
    }

    public DesignPage selectMSeries() {
        clickBMWMSeriesButton();
        webDriverWait.until(ExpectedConditions.visibilityOf(m3SedanImage));
        webDriverWait.until(ExpectedConditions.visibilityOf(m3SelectButton));
        clickSelectM3Button();

        return new DesignPage();

    }

    public void clickSelectM3Button() {
        clickOnElement(m3SelectButton);
    }

    public void clickBMWMSeriesButton() {
        clickOnElement(bmwMSeriesButton);
    }

    public void clickSelectASeriesButton() {
        clickOnElement(selectASeriesButton);
    }

    public BuildYourOwn() {
        PageFactory.initElements(driver, this);
    }
}
