package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBookingVacation extends BaseTest {

//    @Test
//    public void testBookCustomVacation() {
//
//        // TBD
//
//    }

    // region Travel to Any Place in the World

//    @BeforeTest(alwaysRun = true)
//    public void refresh() {
//        Homepage homepage = new Homepage();
//        homepage.refreshPage();
//    }

    @Test(enabled = false)
    public void testTripToNYC() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("NYC");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(0);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToMexico() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Mexico");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(1);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToSouthAfrica() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("South Africa");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(2);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToIstanbul() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Istanbul");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(3);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToIndonesia() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Indonesia");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(4);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToJapan() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Japan");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(5);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToThailand() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Thailand");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(6);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToRome() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Rome");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(7);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToSpain() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Spain");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(8);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToLondon() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("London");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(9);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToTurkey() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Turkey");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(10);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToItaly() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Italy");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(11);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToPortugal() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Portugal");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(12);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToMorocco() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("Morocco");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(13);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testTripToFrance() {
        // Navigation
        Homepage homepage = new Homepage();

        homepage.selectRandomDestinationResultItem("France");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        System.out.println(actualResult);
        String expectedResult = excel.readStringList("myTrips").get(14);
        System.out.println(expectedResult);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    //endregion

}
