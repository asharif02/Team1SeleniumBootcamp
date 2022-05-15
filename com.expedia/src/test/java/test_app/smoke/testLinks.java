package test_app.smoke;

import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;

public class testLinks extends BaseTest {

    @Test
    public void testListYourProperty(){
        HomePage homePage = new HomePage();
        homePage.clickListYourProperty.click();

        String ExpectedText = "What would you like to list?";
        Assert.assertEquals(ExpectedText,"What would you like to list?");

    }

    @Test
    public void testExpediaSupport(){
        HomePage homePage = new HomePage();
        homePage.clickExpediaSupportLink.click();
//        driver.navigate().to("https://www.expedia.com/service/");

        String actualLocation = homePage.supportAssert.getText();
        String expectedLocation = excel.readStringList("ExpediaSheet").get(0);
        Assert.assertTrue(actualLocation.contains(expectedLocation));

    }

    @Test
    public void testTripTab(){
        HomePage homePage = new HomePage();
        homePage.tripsTabButton.click();

        String actualLocation = homePage.tripsTabLocation.getText();
        String expectedLocation = excel.readStringList("ExpediaSheet").get(8);
        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFlightCancel() {
        HomePage homePage = new HomePage();
        homePage.cancelYourFlight.click();

        String ExpectedText = "Change of plans? No problem.";
        Assert.assertEquals(ExpectedText, "Change of plans? No problem.");

    }

    @Test
    public void testJobs() {
        HomePage homePage = new HomePage();
        homePage.jobsLink.click();

        String ExpectedText = "CAREERS";
        Assert.assertEquals(ExpectedText, "CAREERS");

    }

    @Test
    public void testNewsRoom() {
        HomePage homePage = new HomePage();
        homePage.newsRoomLink.click();

        String ExpectedText = "Newsroom";
        Assert.assertEquals(ExpectedText, "Newsroom");

    }

    @Test
    public void testAdvertisingLink() {
        HomePage homePage = new HomePage();
        homePage.advertisingLink.click();

        String ExpectedText = "Advertising Solutions";
        Assert.assertEquals(ExpectedText, "Advertising Solutions");

    }




}
