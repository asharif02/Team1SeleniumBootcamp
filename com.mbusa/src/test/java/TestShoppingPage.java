import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.ShoppingPage;
import shared.Homepage;
import shared.MercedesNavigationPage;

public class TestShoppingPage extends BasePage {

    @Test
    public void testOneCompareVehicles(){
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Shopping");
        ShoppingPage shoppingPage = mercedesNavigationPage.navigateShoppingOptions("Compare Vehicles");
        shoppingPage.clickToAddVehiclesToCompare();
        shoppingPage.vehiclesToCompare("A 220 Sedan");
        shoppingPage.clickCompareButton();

        Assert.assertTrue(isElementVisible(shoppingPage.compareVehicleConfirmation));
        Assert.assertEquals(getElementText(shoppingPage.compareVehicleConfirmation),
                excel.readStringList("Shopping").get(0));
    }

    @Test
    public void testTwoCompareVehicles(){
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Shopping");
        ShoppingPage shoppingPage = mercedesNavigationPage.navigateShoppingOptions("Compare Vehicles");
        shoppingPage.clickToAddVehiclesToCompare();
        shoppingPage.vehiclesToCompare("A 220 Sedan");
        shoppingPage.vehiclesToCompare("AMG C 43 Cabriolet");
        shoppingPage.clickCompareButton();

        Assert.assertTrue(isElementVisible(shoppingPage.compareVehicleConfirmation));
        Assert.assertEquals(getElementText(shoppingPage.compareVehicleConfirmation),
                excel.readStringList("Shopping").get(0));
    }

    @Test
    public void testThreeCompareVehicles(){
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Shopping");
        ShoppingPage shoppingPage = mercedesNavigationPage.navigateShoppingOptions("Compare Vehicles");
        shoppingPage.clickToAddVehiclesToCompare();
        shoppingPage.vehiclesToCompare("AMG E 53 Coupe");
        shoppingPage.vehiclesToCompare("AMG E 53 Cabriolet");
        shoppingPage.vehiclesToCompare("E 450 Coupe");
        shoppingPage.clickCompareButton();

        Assert.assertTrue(isElementVisible(shoppingPage.compareVehicleConfirmation));
        Assert.assertEquals(getElementText(shoppingPage.compareVehicleConfirmation),
                excel.readStringList("Shopping").get(0));
    }
}