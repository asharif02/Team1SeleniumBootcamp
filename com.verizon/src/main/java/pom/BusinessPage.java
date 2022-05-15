package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.Homepage;

public class BusinessPage extends Homepage {

    @FindBy(xpath = "//i[@class='onedicon icon-chat u-marginRightSmall font-20 bold']")
    public WebElement chatButton;

    @FindBy(xpath = "//button[@id='gnav20-Shop-L1']")
    public WebElement shopButton;

    public BusinessPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickShopButton(){
        clickOnElement(shopButton);
    }

    public void hoverShopButton(){
        hoverOverElement(shopButton);
    }

    public void selectBrand(String brand){
        driver.findElement(By.xpath(String.format("//div[@class='Tabs Tabs--accentBottom']//a[contains(text(),'%s')]",
                brand))).click();
    }

    public void waitForPageToLoad(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(chatButton));
    }

}