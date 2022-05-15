package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.MercedesNavigationPage;

public class VehiclePage extends MercedesNavigationPage {

    @FindBy(xpath = "//button[@class='html5-video-control__button animation-element']")
    public WebElement videoControl;

    @FindBy(xpath = "//button[@class='specialty-carousel__button specialty-carousel__button--next']")
    public WebElement explorePerformance;

    @FindBy(xpath = "//button[@class='link chapter-design__section-toggle-button']")
    public WebElement interiorOption;

    public VehiclePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickVideoControl(){
        clickOnElement(videoControl);
    }

    public void navigateMedia(String options){
        driver.findElement(By.xpath(String.format("//div[@class=\"waypoint-nav__container sticky-nav__container\"]" +
                "//span[contains(text(),'%s')]", options))).click();
    }

    public void clickExplorePerformance(){clickOnElement(explorePerformance);}

    public void waitToLoad(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(interiorOption));
    }

    public void rotateCanvas(int rotate) {

        WebElement output = driver.findElement(By.xpath("//section[@id='exterior-section']"));
        Actions act = new Actions(driver);
        act.clickAndHold(output).perform();
        act.dragAndDropBy(output, 360, 0).perform();
        act.release(output).perform();

    }
}