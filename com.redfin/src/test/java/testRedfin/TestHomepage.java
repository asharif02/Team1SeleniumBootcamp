package testRedfin;

import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;

public class TestHomepage extends BasePage {

    @Test
    public void testCheckHomeBuyingGuide(){
        Homepage homepage= new Homepage();
        homepage.clickRenButton();

        String expectedText = String.valueOf(excel.readStringList("rent"));
        String actualText = String.valueOf(driver.findElement(By.xpath("//*[@id='content']//div[8]//section//div[2]//h2/span"))).trim();
        Assert.assertTrue(Boolean.parseBoolean(actualText), expectedText);
    }

}
