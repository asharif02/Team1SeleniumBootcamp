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

    @Test
    public void testHomeResultsInDestin() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Destin");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(30);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInFortLauderdale() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Fort Lauderdale");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(31);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }


    @Test
    public void testHomeResultsInJacksonville() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Jacksonville");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(32);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInFortMyers() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Fort Myers");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(33);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInCharleston() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Charleston");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(34);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInMyrtleBeach() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Myrtle Beach");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(35);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInAsheville() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Asheville");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(36);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInDurham() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Durham");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(37);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInRaleigh() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Raleigh");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(38);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInCharlotte() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Charlotte");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(39);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInLouisville() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Louisville");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(40);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInPortland() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Portland");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(41);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInSacramento() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Sacramento");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(42);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInBaltimore() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Baltimore");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(43);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInMilwaukee() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Milwaukee");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(44);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInDetroit() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Detroit");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(45);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeResultsInMinneapolis() {
        Homepage homepage = new Homepage();
        homepage.searchHomesInCities("Minneapolis");
        homepage.waitForSearchResultContainer();

        String actualLocation = homepage.tag_TextPlaceHolder.getText();
        String expectedLocation = excel.readStringList("Redfin").get(46);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
}
