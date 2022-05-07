package app.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import app.shared.Homepage;

public class EuropeMarket extends Homepage {


    public EuropeMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectEuropeMarket(){
        clickOnElement(europeMarket);
    }
    public void navigateEuropeMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}
