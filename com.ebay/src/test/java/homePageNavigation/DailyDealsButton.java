package homePageNavigation;

import ebay.pom.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import base.BasePage;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class DailyDealsButton extends BasePage {

    @Test

    public void testDailyDealsButton(){

        HomePage homePage= new HomePage();
        homePage.ebayDailyDealsButton.click();
        homePage.ebayDailyDealsButton.sendKeys("Deals");
        homePage.ebayDailyDealsButton.sendKeys(Keys.ENTER);


        String actualtext = driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/deals'])[2]")).getText();
        String expectedtext = "Deals";
        Assert.assertEquals(actualtext,expectedtext);

    }
}
