package app.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ModelPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='Shop Inventory']//span[contains(text(), 'Shop Inventory')]")
    public WebElement shopInventoryButton;

    @FindBy(xpath = "//div[@id='animation-container-4635cb6f-762b-4af0-96e7-7314af92630c']")
    public WebElement modelTextAnimation;

    public ModelPage() {
        PageFactory.initElements(driver, this);
    }

    public void waitForShopInventoryButton() {
//        webDriverWait.until(ExpectedConditions.visibilityOf(shopInventoryButton));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(shopInventoryButton));
    }

    public void waitForModelNameAnimation() {
        webDriverWait.until(ExpectedConditions.visibilityOf(modelTextAnimation));
    }
}
