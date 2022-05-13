package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomeSearchInCities extends BaseTest {

    @Test
    public void testHomeResultsInDallas() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Dallas");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(7);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInMiami() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Miami");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(8);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInFairfax() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Fairfax");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(9);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInSanDiego() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("San Diego");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(10);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInLasVegas() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Las Vegas");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(11);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInOrlando() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Orlando");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(12);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInSanFrancisco() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("San Francisco");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(13);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInSanAntonio() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("San Antonio");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(14);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInAlbuquerque() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Albuquerque");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(15);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInNewOrleans() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("New Orleans");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(16);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInBoston() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Boston");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(17);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInWilmington() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Wilmington");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(18);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInMemphis() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Memphis");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(19);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInChicago() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Chicago");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(20);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInSeattle() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Seattle");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(21);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInTampa() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Tampa");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(22);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInProvo() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Provo");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(23);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInDenver() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Denver");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(24);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInOrem() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Orem");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(25);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInPhoenix() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Phoenix");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(26);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInNashville() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Nashville");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(27);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInAtlanta() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Atlanta");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(28);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInBoise() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Boise");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(29);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

}
