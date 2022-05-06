package test_app.smoke;

import app.pom.Homepage;
import app.pom.ListingPage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchForListing extends BaseTest {

    @Test
    public void testFindHomeAnywhereInTheUS() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("los angeles");
        Thread.sleep(3000);
    }

    @Test
    public void testFindHomeInAustin() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("austin");
        ListingPage listingPage = new ListingPage();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(0);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInTampa() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("tampa");
        ListingPage listingPage = new ListingPage();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(1);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInNewYork() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("new york");
        ListingPage listingPage = new ListingPage();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(2);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
}
