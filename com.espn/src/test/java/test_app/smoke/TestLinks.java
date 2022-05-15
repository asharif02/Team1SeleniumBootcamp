package test_app.smoke;

import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;

public class TestLinks extends BaseTest {

    @Test
    public void testListenRadio() {
        HomePage homePage = new HomePage();
        homePage.listenRadioButton.click();

        String ExpectedText = "Listen Live";
        Assert.assertEquals(ExpectedText, "Listen Live");

    }

    @Test
    public void testWatchEspn() {
        HomePage homePage = new HomePage();
        homePage.watchEspn.click();

        String ExpectedText = "WATCH";
        Assert.assertEquals(ExpectedText, "WATCH");

    }
}
