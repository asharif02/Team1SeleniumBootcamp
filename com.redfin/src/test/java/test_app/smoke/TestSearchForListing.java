package test_app.smoke;

import app.pom.Homepage;
import app.pom.ListingPage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchForListing extends BaseTest {

//    @Test
//    public void testFindHomeAnywhereInTheUS() throws InterruptedException {
//        Homepage homepage = new Homepage();
//        homepage.navigateToAnyUSHomeListing("kansas");
//        Thread.sleep(3000);
//    }

    @Test
    public void testFindHomeInAustin() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("austin");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(0);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInTampa() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("tampa");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(1);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInNewYork() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("new york");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(2);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInMcLeanVA() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("mclean");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(3);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInMinneapolis() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("minneapolis");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(4);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInCincinnati() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("cincinnati");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(5);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInSacramento() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("sacramento");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(6);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInSanFrancisco() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("san francisco");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(7);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInNashville() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("nashville");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(8);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInAtlanta() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("atlanta");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(9);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInBoston() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("boston");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(10);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInPortland() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("portland");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(11);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInHouston() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("houston");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(12);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInDallas() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("dallas");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(13);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInSeattle() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("seattle");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("usaCities").get(14);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
}
