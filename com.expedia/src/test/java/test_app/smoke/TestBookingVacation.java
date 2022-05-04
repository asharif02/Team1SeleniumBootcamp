package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBookingVacation extends BaseTest {

//    @Test
//    public void testBookCustomVacation() {
//
//        // TBD
//
//    }

    // region Travel to Any Place in the World
    @Test
    public void testTripToNYC() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        // Access Denied
//        homepage.dealWithAccessDenied();

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
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Mexico");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(1);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToSouthAfrica() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("South Africa");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(2);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToIstabul() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Istanbul");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(3);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToIndonesia() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Indonesia");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(4);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToJapan() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Japan");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(5);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToThailand() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Thailand");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(6);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToRome() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Rome");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(7);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToSpain() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Spain");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(8);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToLondon() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("London");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(9);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToTurkey() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Turkey");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(10);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToItaly() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Italy");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(11);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToPortugal() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Portugal");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(12);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToHawaii() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Hawaii");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(13);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToFrance() {
        // Navigation
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("France");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        // Assertion
        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("myTrips").get(14);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    //endregion

}
