package shared;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//span[@class='chapter-engine__eyebrow']")
    public WebElement amgEngineViewConfirmation;

    @FindBy(xpath = "//div[@class='specialty-carousel__counter']")
    public WebElement amgPerformanceViewConfirmation;

    @FindBy(xpath = "//h3[@class='chapter-design__heading animation-element']")
    public WebElement amgDesignViewConfirmation;

    @FindBy(xpath = "//h1[@class='title-hero__title']")
    public WebElement compareVehicleConfirmation;

    @FindBy(xpath = "//h1[@class='inventory-search-header__heading']")
    public WebElement inventorySearchConfirmation;

    @FindBy(xpath = "//h1[@class='title-hero__title']")
    public WebElement lineupConfirmation;

    @FindBy(xpath = "//div[@id='certification']//header/h2")
    public WebElement benefitsCertificationConfirmation;

    @FindBy(xpath = "//div[@id='warranty']//header/h2")
    public WebElement benefitsWarrantyConfirmation;

    @FindBy(xpath = "//div[@id='byd']//header/h2")
    public WebElement benefitsBuildYourDealConfirmation;

    @FindBy(xpath = "//div[@id='benifits']//header/h2")
    public WebElement benefitsSpecialOffersConfirmation;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public MercedesNavigationPage navigateMenu(String option){
        driver.findElement(By.xpath(String.format("//nav[@class=\"global-header__menu-l1 global-header__menu-l1--" +
                        "closed\"]//li[@class=\"global-header__menu-l1-list-item\"]//button[contains(text(),'%s')]",
                option))).click();
        return new MercedesNavigationPage();
    }
}