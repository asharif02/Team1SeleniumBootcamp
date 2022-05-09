package app.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class DesignPage extends BasePage {

    @FindBy(xpath = "//a[@analytics-event='byo-vehicle-selector.byo-design.build-recommended.button']")
    public WebElement recommendedBuild;

//    @FindBy(xpath = "//a[@class='cta-button theme-core byo-core-type variant-tile-cta cta-1']")
    @FindBy(xpath = "//div[@class='variant-pricing']/a[@class='cta-button theme-core byo-core-type variant-tile-cta cta-1']")
    public List<WebElement> designButton;

    @FindBy(xpath = "//div[@class='variant-pricing']/a[@class='cta-button theme-core byo-core-type variant-tile-cta cta-1']")
    public WebElement hoverDesignButton;

    public void waitForElement() {
        webDriverWait.until(ExpectedConditions.visibilityOf(recommendedBuild));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(recommendedBuild));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(hoverDesignButton));
    }

    public DesignStudio selectRandomDesignButton() {
        waitForElement();
        List<WebElement> button = designButton;
        int maxButton = button.size();

        Random random = new Random();
        int randomButton = random.nextInt(maxButton);
        hoverOverDesignButton();
        button.get(randomButton).click();

        return new DesignStudio();

    }

    public void buildMSeries() {
        webDriverWait.until(ExpectedConditions.visibilityOf(recommendedBuild));
    }

    public void hoverOverDesignButton() {
        hoverOverElement(hoverDesignButton);
    }

    public DesignPage() {
        PageFactory.initElements(driver, this);
    }
}
