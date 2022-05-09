package test_app.smoke.media_player;

import app.pom.Homepage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMediaPlayer extends BaseTest {

    // embedded video player located on SoFi Homepage
    @Test
    public void testSoFiMoviePlayer() {
        Homepage homepage = new Homepage();
        homepage.playSoFiVideoOnHomepage();
        homepage.playVideoForSpecificAmountOfSeconds("5");


//        String expectedResult = String.valueOf(driver.findElement(By.xpath("//div[@class='ytp-progress-bar-container']//@aria-valuenow")));
//        System.out.println(expectedResult);
//        String actualResult = excel.readStringList("SoFi").get(0);
//        System.out.println(actualResult);

//        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
