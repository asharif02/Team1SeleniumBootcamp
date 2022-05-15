import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.InventoryPage;
import shared.Homepage;
import shared.MercedesNavigationPage;
import utils.GenerateData;

import java.time.Duration;

public class TestInventoryPage extends BasePage {

    @Test
    public void testNewInventorySearch(){
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("View New Inventory");
        String zipcode = GenerateData.zipCode();
        inventoryPage.enterZipCode(zipcode);
        inventoryPage.submitSearch();

        Assert.assertTrue(isElementVisible(inventoryPage.inventorySearchConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.inventorySearchConfirmation),
                excel.readStringList("Inventory").get(0));
    }

    @Test
    public void testCPOInventorySearch() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("View CPO Inventory");
        String zipcode = GenerateData.zipCode();
        inventoryPage.enterZipCode(zipcode);
        inventoryPage.submitSearch();

        Assert.assertTrue(isElementVisible(inventoryPage.inventorySearchConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.inventorySearchConfirmation),
                excel.readStringList("Inventory").get(1));
    }

    @Test
    public void testDiscoverSUVLineup() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("Discover the Lineup");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectLineUpVehicle("SUVs");

        Assert.assertTrue(isElementVisible(inventoryPage.lineupConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.lineupConfirmation),
                excel.readStringList("Inventory").get(2));
    }

    @Test
    public void testDiscoverSedansWagonsLineup() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("Discover the Lineup");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectLineUpVehicle("Sedans & Wagons");

        Assert.assertTrue(isElementVisible(inventoryPage.lineupConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.lineupConfirmation),
                excel.readStringList("Inventory").get(2));
    }

    @Test
    public void testDiscoverCoupesLineup() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("Discover the Lineup");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectLineUpVehicle("Coupes");

        Assert.assertTrue(isElementVisible(inventoryPage.lineupConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.lineupConfirmation),
                excel.readStringList("Inventory").get(2));
    }

    @Test
    public void testDiscoverConvertiblesRoadstersLineup() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("Discover the Lineup");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectLineUpVehicle("Convertibles & Roadsters");

        Assert.assertTrue(isElementVisible(inventoryPage.lineupConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.lineupConfirmation),
                excel.readStringList("Inventory").get(2));
    }

    @Test
    public void testDiscoverElectricLineup() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("Discover the Lineup");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectLineUpVehicle("Electric");

        Assert.assertTrue(isElementVisible(inventoryPage.lineupConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.lineupConfirmation),
                excel.readStringList("Inventory").get(2));
    }

    @Test
    public void testSeeCertificationBenefits() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("See The Benefits");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectBenefitsOptions("Certification");

        Assert.assertTrue(isElementVisible(inventoryPage.benefitsCertificationConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.benefitsCertificationConfirmation),
                excel.readStringList("Inventory").get(3));
    }

    @Test
    public void testSeeWarrantyBenefits() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("See The Benefits");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectBenefitsOptions("Warranty");

        Assert.assertTrue(isElementVisible(inventoryPage.benefitsWarrantyConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.benefitsWarrantyConfirmation),
                excel.readStringList("Inventory").get(4));
    }

    @Test
    public void testSeeBuildYourDealBenefits() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("See The Benefits");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectBenefitsOptions("Build Your Deal");

        Assert.assertTrue(isElementVisible(inventoryPage.benefitsBuildYourDealConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.benefitsBuildYourDealConfirmation),
                excel.readStringList("Inventory").get(5));
    }

    @Test
    public void testSeeSpecialOffersBenefits() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Inventory");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        InventoryPage inventoryPage = mercedesNavigationPage.navigateInventoryOptions("See The Benefits");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        inventoryPage.selectBenefitsOptions("Special Offers & More");

        Assert.assertTrue(isElementVisible(inventoryPage.benefitsSpecialOffersConfirmation));
        Assert.assertEquals(getElementText(inventoryPage.benefitsSpecialOffersConfirmation),
                excel.readStringList("Inventory").get(6));
    }
}