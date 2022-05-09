package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLocatingStores extends BaseTest {

    @Test
    public void testLocatingStores() {
        Homepage homepage = new Homepage();
        homepage.clickStoreButton();
        homepage.enteringZipcode.sendKeys("22033");

        String ExpectedText = "Russell Cellular Fair Oaks Mall";
        Assert.assertEquals(ExpectedText,"Russell Cellular Fair Oaks Mall");

    }

    @Test
    public void testWyomingStores(){
        Homepage homepage = new Homepage();
        homepage.clickStoreButton();
        homepage.selectingWyomingStores();
        homepage.clickTheViewStoresButton();

        String ExpectedText = "Wyoming Verizon Store Locations";
        Assert.assertEquals(ExpectedText,"Wyoming Verizon Store Locations");
    }



}
