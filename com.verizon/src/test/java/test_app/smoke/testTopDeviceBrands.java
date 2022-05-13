package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testTopDeviceBrands extends BaseTest {

    @Test
    public void testClickOnGoogleButton(){
        Homepage homepage = new Homepage();
        homepage.clickOnGoogleButton.click();

        String ExpectedText = "Ask Google for more.";
        Assert.assertEquals(ExpectedText,"Ask Google for more.");
    }

    @Test
    public void testNavigatingToAmazon5gInternet(){
        Homepage homepage = new Homepage();
        homepage.clickOnAmazonButton.click();
        homepage.clickOn5gHomeInternet.click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.verizon.com/wireless-devices/amazon/" );
    }

    @Test
    public void testBuyingMotorolaEdgePhone(){
        Homepage homepage = new Homepage();
        homepage.clickOnMotorolaButton.click();
        homepage.navigatingToBuyingMotorolaEdgePhone();

        String ExpectedText = excel.readStringList("Sheet1").get(0);
        String ActualText = driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[4]/div/div[2]/div[1]/h1")).getText();
        Assert.assertTrue(ActualText.contains(ExpectedText));
    }

    @Test
    public void testAddingPhoneToWishlist() {
         Homepage homepage = new Homepage();
         homepage.clickOnMotorolaButton.click();
         homepage.navigatingToBuyingMotorolaEdgePhone();
         homepage.exitEmailSignUpPopup();
         homepage.AddingToWishlist();

         String ExpectedText = "Sign in";
         Assert.assertEquals(ExpectedText,"Sign in");
    }

    @Test
    public void testWatchMotorolaPhoneVideo()  {
        Homepage homepage = new Homepage();
        homepage.clickOnMotorolaButton.click();
        homepage.navigatingToBuyingMotorolaEdgePhone();
        homepage.exitEmailSignUpPopup();
        homepage.clickOnWatchVideo();
        homepage.clickPlayVideoButton();

        String ExpectedText = "Get Ready For the motorola edge+ 5G UW v";
        Assert.assertEquals(ExpectedText,"Get Ready For the motorola edge+ 5G UW v");
    }

}
