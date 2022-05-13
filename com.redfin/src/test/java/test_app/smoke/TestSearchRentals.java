package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSearchRentals extends BaseTest {

    @Test
    public void testSearchingForRentals()  {
        Homepage homepage = new Homepage();
        homepage.searchingForRentals.sendKeys("22033");
//
//        String ExpectedText = excel.readStringList("Redfin").get(6);
//        String ActualText = driver.findElement(By.xpath("//*[@id='results-display']//div[1]//div/h1\n")).getText();
//        Assert.assertTrue(ActualText.contains(ExpectedText));

    }
}
