package test_app.smoke;

import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;

public class TestSoccerTeams extends BaseTest {

    @Test
    public void testNavigatingToLiverpool()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.clickLiverpool();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(0));

    }

    @Test
    public void testNavigatingToManCity()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.ManCity.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(1));


    }

    @Test
    public void testNavigatingToManUnited()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.ManUnited.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(2));


    }

    @Test
    public void testNavigatingToNewcastleUnited()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.NewcastleUnited.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(3));


    }

    @Test
    public void testNavigatingToNorwichCity()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.NorwichCity.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(4));


    }

    @Test
    public void testNavigatingToSouthampton()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.Southampton.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(5));


    }

    @Test
    public void testNavigatingToSpurs()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.spurs.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(6));


    }

    @Test
    public void testNavigatingToWatford()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.watford.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(7));


    }

    @Test
    public void testNavigatingToWolves()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.wolves.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(8));


    }

    @Test
    public void testNavigatingToLeicesterCity()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.leicesterCity.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(9));


    }

    @Test
    public void testNavigatingToLeedsUnited()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.leedsUnited.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(10));


    }

    @Test
    public void testNavigatingToBrentFord()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.BrentFordClub.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(11));


    }

    @Test
    public void testNavigatingToChelsea(){
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.chelsea.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(12));


    }

    @Test
    public void testNavigatingToAstonVilla(){
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.AstonVilla.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(13));


    }

    @Test
    public void testNavigatingToArsenalFc()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.arsenal.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(14));


    }

    @Test
    public void testNavigatingToBurnleyFc()  {
        HomePage homePage = new HomePage();
        homePage.clickSoccerTab();
        homePage.clickTeamsButton();
        homePage.Burnley.click();

        Assert.assertTrue(isElementVisible(homePage.teamPage));
        Assert.assertEquals(getElementText(homePage.teamPage), excel.readStringList("EspnSheet").get(15));


    }

}
