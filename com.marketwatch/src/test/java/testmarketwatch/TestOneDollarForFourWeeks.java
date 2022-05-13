package testmarketwatch;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom.Homepage;

import java.time.Duration;

public class TestOneDollarForFourWeeks extends BasePage {

    @Test void testCheckPageTimeLoad(){
        Homepage homepage = new Homepage();
        long start = System.currentTimeMillis();
        WebElement element = driver.findElement(By.xpath("//*[@for='main-menu']"));
        long finish = System.currentTimeMillis();
        long totalTime = finish - start;
        System.out.println("Total time for page load - " + totalTime); //25 millis
    }

    @Test
    public void testVerifyTrendingVideoPlayButton(){
        Homepage homepage = new Homepage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        homepage.clickTrendingVideoPlayButton();
//        homepage.clickOneDollarForFourWeeksButton();
    }
}
    /** Page load takes sometime to load and
     * doesn't display the homepage, error
     * message appears. need to figure out
     * how to handle it or find out what is
     * going on.
     */