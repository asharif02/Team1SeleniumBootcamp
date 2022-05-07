package app.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import app.shared.Homepage;

public class FXMarket extends Homepage {

    public FXMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectFXMarket(){
        clickOnElement(fxMarket);
    }
    public void navigateFXMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}
