package app.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import app.shared.Homepage;

public class AsiaMarket extends Homepage {

    public AsiaMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectAsiaMarket(){
        clickOnElement(asiaMarket);
    }
    public void navigateAsiaMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}