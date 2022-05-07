import base.BasePage;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.ToysPage;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testBabyToys extends BasePage {

    @Test
    public void testNavigateToToysPage() throws InterruptedException {
        HomePage homepage = new HomePage();
        ToysPage toysPage = homepage.clickToysButton();
        toysPage.clickToysButton();
        toysPage.ToysButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        //Thread.sleep(2000);
    }

}

// @Test
//      public void verifyHomepageTitle() {
//          String expectedTitle = "Welcome: Mercury Tours";
//          String actualTitle = driver.getTitle();
//          Assert.assertEquals(actualTitle, expectedTitle);