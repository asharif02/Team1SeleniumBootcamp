import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.HomePage;
import pom.Toys;


import java.time.Duration;

public class testBabyToys extends BasePage {

    @Test
    public void testNavigateToToysPage() {
        HomePage homepage = new HomePage();
        homepage.clickToysButton();
        Toys toys = new Toys();
        toys.clickBabyToysLink();
        toys.clickBlocksAndShapeSortersLink();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        String expectedText = excel.readStringList("babyBlocksAndShapeSorters").get(0);
        String actualText = String.valueOf(driver.findElement(By.xpath("//h1[@class='b-pageheader']")));
        Assert.assertTrue(actualText.contains(expectedText));

    }
    @Test
      public void verifyCustomerServiceMessage() {
        HomePage homePage = new HomePage();
        homePage.clickHelpAndContactButton();

        String expectedTitle = "How can we help you today?";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        String actualMessage = String.valueOf(driver.findElement(By.xpath("//h1[@class='h2']")));
        System.out.println("Actual Promo Message: " + actualMessage);
        String expectedMessage = "How can we help you today?";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualMessage, expectedMessage);
        System.out.println("Assert Passed");
    }
}