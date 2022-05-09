import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.HomePage;
import pom.ToysPage;


import javax.sound.midi.ShortMessage;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testBabyToys extends BasePage {

    @Test
    public void testNavigateToToysPage() {
        HomePage homepage = new HomePage();
        homepage.clickToysButton();
        homepage.clickBabyToysLink();
        homepage.clickBlocksAndShapeSortersLink();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

    }
    @Test
      public void verifyCustomerServiceMessage() {
        HomePage homePage = new HomePage();
        homePage.clickHelpAndContactButton();

        String expectedTitle = "How can we help you today?";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);

        String actualMessage = String.valueOf(driver.findElement(By.xpath("//h1[@class='h2']")));
        System.out.println("Actual Promo Message: " + actualMessage);
        String expectedMessage = "How can we help you today?";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualMessage, expectedMessage);
        System.out.println("Assert Passed");
    }
}