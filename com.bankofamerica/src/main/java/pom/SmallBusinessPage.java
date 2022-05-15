package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.Homepage;

public class SmallBusinessPage extends Homepage {

    @FindBy(xpath = "//a[@id='navSBResources']")
    public WebElement smallBusinessResources;

    @FindBy(xpath = "//a[@id='btnSBResources']")
    public WebElement visitSmallBusinessResources;

    @FindBy(xpath = "//h1[@class='site-header__page-header site-header__page-header--centered']")
    public WebElement smallBusinessResourcesPageHeader;

    public SmallBusinessPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickSmallBusinessResources(){
        clickOnElement(smallBusinessResources);
    }
    public void clickVisitSmallBusinessResources(){
        clickOnElement(visitSmallBusinessResources);
    }
    public void navigateSmallBusinessResourceOptions(String options){
        driver.findElement(By.xpath(String.format("//ul[@role='tablist']//button[contains(text(),'%s')]",
                options))).click();
    }
    public void navigateSubMenu(String options){
        driver.findElement(By.xpath(String.format("//ul[@class='header-nav__nav-drawer-list']" +
                "//a[contains(text(),'%s')]", options))).click();
    }
    public void waitForPageToLoad(){
        webDriverWait.until(ExpectedConditions.visibilityOf(smallBusinessResourcesPageHeader));
    }
}