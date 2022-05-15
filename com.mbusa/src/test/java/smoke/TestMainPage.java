package smoke;

import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;

public class TestMainPage extends BaseTest {

    @Test
    public void navigatingToVehiclesDropDown(){
        HomePage homePage = new HomePage();
        homePage.clickVehiclesTab();

        Assert.assertTrue(isElementVisible(homePage.vehiclesTab));
        Assert.assertEquals(getElementText(homePage.vehiclesTab), excel.readStringList("MBusaSheet").get(0));
    }

    @Test
    public void navigatingToShoppingMenu(){
        HomePage homePage = new HomePage();
        homePage.clickShoppingTab();

        Assert.assertTrue(isElementVisible(homePage.shoppingTab));
        Assert.assertEquals(getElementText(homePage.shoppingTab), excel.readStringList("MBusaSheet").get(1));
    }

    @Test
    public void navigatingToInventoryTabLink(){
        HomePage homePage = new HomePage();
        homePage.clickInventoryTab();

        Assert.assertTrue(isElementVisible(homePage.inventoryTab));
        Assert.assertEquals(getElementText(homePage.inventoryTab), excel.readStringList("MBusaSheet").get(2));
    }

    @Test
    public void navigatingToExploreEQS(){
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
}
