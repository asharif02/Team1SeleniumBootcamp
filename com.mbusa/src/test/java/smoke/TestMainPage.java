package smoke;

import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;

public class TestMainPage extends BaseTest {

    @Test
    public void navigatingToVehiclesDropDown() {
        HomePage homePage = new HomePage();
        homePage.clickVehiclesTab();

        Assert.assertTrue(isElementVisible(homePage.vehiclesTab));
        Assert.assertEquals(getElementText(homePage.vehiclesTab), excel.readStringList("MBusaSheet").get(0));
    }

    @Test
    public void navigatingToShoppingMenu() {
        HomePage homePage = new HomePage();
        homePage.clickShoppingTab();

        Assert.assertTrue(isElementVisible(homePage.shoppingTab));
        Assert.assertEquals(getElementText(homePage.shoppingTab), excel.readStringList("MBusaSheet").get(1));
    }

    @Test
    public void navigatingToInventoryTabLink() {
        HomePage homePage = new HomePage();
        homePage.clickInventoryTab();

        Assert.assertTrue(isElementVisible(homePage.inventoryTab));
        Assert.assertEquals(getElementText(homePage.inventoryTab), excel.readStringList("MBusaSheet").get(2));
    }

    @Test
    public void navigatingToExploreEQS() {
        HomePage homePage = new HomePage();
        homePage.exploreEQS.click();

        Assert.assertTrue(isElementVisible(homePage.buildYourOwn));
        Assert.assertEquals(getElementText(homePage.buildYourOwn), excel.readStringList("MBusaSheet").get(3));
    }

    @Test
    public void navigatingToViewInventorySearch() {
        HomePage homePage = new HomePage();
        homePage.exploreEQS.click();
        homePage.viewInventory.click();
        driver.navigate().to("https://www.mbusa.com/en/inventory");

        Assert.assertTrue(isElementVisible(homePage.findNewInventoryText));
        Assert.assertEquals(getElementText(homePage.findNewInventoryText), excel.readStringList("MBusaSheet").get(4));
    }

    @Test
    public void navigatingToSuvSection() {
        HomePage homePage = new HomePage();
        homePage.exploreEQS.click();
        homePage.viewInventory.click();
        driver.navigate().to("https://www.mbusa.com/en/inventory");
        homePage.suvSection.click();

        Assert.assertTrue(isElementVisible(homePage.mbSuvTest));
        Assert.assertEquals(getElementText(homePage.mbSuvTest), excel.readStringList("MBusaSheet").get(5));

    }

    @Test
    public void navigatingToAboutUs() {
        HomePage homePage = new HomePage();
        homePage.aboutUs.click();

        Assert.assertTrue(isElementVisible(homePage.quickFactsText));
        Assert.assertEquals(getElementText(homePage.quickFactsText), excel.readStringList("MBusaSheet").get(6));
    }

    @Test
    public void navigatingToAMGWebsite() {
        HomePage homePage = new HomePage();
        homePage.linkToAMG.click();

        String ExpectedText = "Inventory";
        Assert.assertEquals(ExpectedText, "Inventory");

    }

    @Test
    public void navigatingToBlueTecUpdate() {
        HomePage homePage = new HomePage();
        homePage.blueTecUpdate.click();
        driver.navigate().to("https://bluetecupdate.mbusa.com/home");

        Assert.assertTrue(isElementVisible(homePage.blueTecUpdateText));
        Assert.assertEquals(getElementText(homePage.blueTecUpdateText), excel.readStringList("MBusaSheet").get(7));
    }

    @Test
    public void navigatingToScheduleService() {
        HomePage homePage = new HomePage();
        homePage.scheduleService.click();

        String ExpectedText = "Inventory";
        Assert.assertEquals(ExpectedText, "Inventory");

    }

    @Test
    public void navigatingToApplyForFinancing() {
        HomePage homePage = new HomePage();
        homePage.applyForFinancing.click();


        Assert.assertTrue(isElementVisible(homePage.financingTextLoc));
        Assert.assertEquals(getElementText(homePage.financingTextLoc), excel.readStringList("MBusaSheet").get(8));
    }

    @Test
    public void navigatingToElectricVehicles() {
        HomePage homePage = new HomePage();
        homePage.electricMB.click();

        String ExpectedText = "Electric";
        Assert.assertEquals(ExpectedText, "Electric");

    }


}