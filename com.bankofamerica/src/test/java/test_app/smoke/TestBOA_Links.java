package test_app.smoke;

import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;

import java.time.Duration;

public class TestBOA_Links extends BaseTest {

    @Test
    public void testCheckingLink(){
        HomePage homePage = new HomePage();
        homePage.clickCheckingButton();

        String actualLocation = homePage.checkingButton.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(0);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testSavingsLink(){
        HomePage homePage = new HomePage();
        homePage.clickSavingsButton();

        String actualLocation = homePage.savingsButton.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(1);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testCreditCardsLink(){
        HomePage homePage = new HomePage();
        homePage.clickCreditCardsButton();

        String actualLocation = homePage.creditCardsButton.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(2);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHomeLoansLink(){
        HomePage homePage = new HomePage();
        homePage.clickHomeLoansButton();

        String actualLocation = homePage.homeLoansButton.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(3);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testAutoLoansLink(){
        HomePage homePage = new HomePage();
        homePage.clickAutoLoansButton();

        String actualLocation = homePage.autoLoans.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(4);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testInvestingLink(){
        HomePage homePage = new HomePage();
        homePage.clickInvestingButton();

        String actualLocation = homePage.investingButton.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(5);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testBetterMoneyHabitsLink(){
        HomePage homePage = new HomePage();
        homePage.clickBetterMoneyHabitsButton();

        String actualLocation = homePage.betterMoneyHabitsButton.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(6);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testNavigatingToBOAHelpMenu(){
        HomePage homePage = new HomePage();
        homePage.clickOnHelpButton();


        String ExpectedText = "Select Your State";
        Assert.assertEquals(ExpectedText,"Select Your State");

    }

    @Test
    public void testFindAtmLocations(){
        HomePage homePage = new HomePage();
        homePage.findClosestAtmButton.click();

        String actualLocation = homePage.AtmAssert.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(7);

        Assert.assertTrue(actualLocation.contains(expectedLocation));

    }

    @Test
    public void testOpenAnAccount(){
        HomePage homePage = new HomePage();
        homePage.openingAnAccount();

        String actualLocation = homePage.accountOpen.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(8);

        Assert.assertTrue(actualLocation.contains(expectedLocation));

    }


    @Test
    public void testNavigatingToCreditCardsSection() {
        HomePage homePage = new HomePage();
        homePage.openingAnAccount();
        homePage.navigateToGettingStartedWithCreditCards();

        String actualLocation = homePage.creditCardHeading.getText();
        String expectedLocation = excel.readStringList("BOA_sheet").get(9);

        Assert.assertTrue(actualLocation.contains(expectedLocation));

    }

}
