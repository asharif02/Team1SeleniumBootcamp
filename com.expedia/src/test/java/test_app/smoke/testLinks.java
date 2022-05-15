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
}
