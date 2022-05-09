package app.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class DesignStudio extends BasePage {

    @FindBy(xpath = "//button[@class='inventory-zip-entry__close-icon']")
    public WebElement popUp;

    @FindBy(xpath = "//figure[@class='byo-rail-option-selector__thumb']")
    public List<WebElement> colorList;

    @FindBy(xpath = "//figure[@class='byo-rail-option-selector__thumb']")
    public WebElement colorButton;

    @FindBy(xpath = "//a[@class='button-next byo-core-type label-1 theme-core']")
    public WebElement nextButton;

    public void selectRandomDesignOptions() {
        closePopUp();
        selectRandomColor();
        clickNextButton();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(colorButton));
        selectRandomColor();
        clickNextButton();
    }

    public void selectRandomColor() {
        List<WebElement> colors = colorList;
        int maxColors = colors.size();

        Random random = new Random();
        int randomColor = random.nextInt(maxColors);
        colors.get(randomColor).click();

    }

    public void closePopUp() {
        clickOnElement(popUp);
    }

    public void clickNextButton() {
        clickOnElement(nextButton);
    }

    public DesignStudio() {
        PageFactory.initElements(driver, this);
    }
}
