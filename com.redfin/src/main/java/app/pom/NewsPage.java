package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends SystemBar {

    @FindBy(xpath = "//a[@href='/news/']")
    public WebElement newsButton;

    @FindBy(xpath = "//a[@href='https://www.redfin.com/news/data-center/']")
    public WebElement dataCenterButton;

    @FindBy(xpath = "//a[@href='https://www.redfin.com/about/data-quality-on-redfin']")
    public WebElement dataQualityLink;

    @FindBy(xpath = "//*[@id=\"input_1_1\"]")
    public WebElement emailSignupPlaceHolder;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBar;

    @FindBy(xpath = "//i[@class='fas fa-search']")
    public WebElement clickSearchButton;

    @FindBy (xpath = "//a[@href='https://www.redfin.com/news/housing-market-news/']")
    public WebElement housingMarketButton;

    @FindBy (xpath = "//*[@id=\"post-80\"]/div/div/div/div/section/div/div/div/div/div/div[4]/div/div/div/article[1]/div[2]/div[2]/h2/a")
    public WebElement housingMarketUpdateLink;

    @FindBy (xpath = "//a[@href='https://www.redfin.com/news/housing-market-news/page/139/']")
    public WebElement newsLinkPage139;

    @FindBy (xpath = "//a[normalize-space()='Median Sale Price']")
    public WebElement medianSalePriceButton;

    @FindBy (xpath = "//a[@href='https://www.redfin.com/news/predictions/']")
    public WebElement housingMarketPredictions;

    @FindBy (xpath = "//a[normalize-space()='Our Mission']")
    public WebElement redfinMissionButton;

    @FindBy (xpath = "//*[@id=\"content\"]/div[8]/div[2]/div[3]/div/div/div/div[2]/ul/li[8]/a")
    public WebElement clickDelawareRealEstateButton;


    public void clickOnRedfinMissionButton(){clickOnElement(redfinMissionButton);}

    public void clickOnHousingMarketPredictionsLink(){clickOnElement(housingMarketPredictions);}

    public void clickMedianSalePriceLink(){
        clickOnElement(medianSalePriceButton);
    }

    public void clickLastNewsPage(){
        clickOnElement(newsLinkPage139);
    }

    public void clickHousingMarketButton(){
        clickOnElement(housingMarketButton);
    }

    public void clickHousingNewsButton() {
        clickOnElement(newsButton);
    }

    public void clickDataCenterButton() {
        clickOnElement(dataCenterButton);
    }

    public void clickRedfinDataQuality() {
        clickOnElement(dataQualityLink);
    }

}
