package test_app.smoke;

import app.pom.AccessoriesPage;
import app.pom.Homepage;
import app.pom.charging.AdaptersCables;
import app.pom.charging.Batteries;
import app.pom.charging.CarChargersMounts;
import app.pom.charging.Chargers;
import app.pom.phone_accessories.PhoneCases;
import base_test.BaseTest;
import org.testng.annotations.Test;

public class TestChargingAccessories extends BaseTest {

    // region Verizon Charging Accessories
    @Test
    public void testFindLowestCharger() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickChargingAccessoriesColumnCategory("charger");
        Chargers chargers = new Chargers();
        chargers.findLowestPrice();
    }

    @Test
    public void testFindHighestCharger() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickChargingAccessoriesColumnCategory("charger");
        Chargers chargers = new Chargers();
        chargers.findHighestPrice();
    }

    @Test
    public void testFindLowestCarChargerMounts() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickChargingAccessoriesColumnCategory("car charger");
        CarChargersMounts ccm = new CarChargersMounts();
        ccm.findLowestPrice();
    }

    @Test
    public void testFindHighestCarChargerMounts() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickChargingAccessoriesColumnCategory("car charger");
        CarChargersMounts ccm = new CarChargersMounts();
        ccm.findHighestPrice();
    }

    @Test
    public void testFindLowestBatteries() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickChargingAccessoriesColumnCategory("batteries");
        Batteries batteries = new Batteries();
        batteries.findLowestPrice();
    }

    @Test
    public void testFindHighestBatteries() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickChargingAccessoriesColumnCategory("batteries");
        Batteries batteries = new Batteries();
        batteries.findHighestPrice();
    }

    @Test
    public void testFindLowestAdapterCable() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickChargingAccessoriesColumnCategory("adapters");
        AdaptersCables adaptersCables = new AdaptersCables();
        adaptersCables.findLowestPrice();
    }

    @Test
    public void testFindHighestAdapterCable() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickChargingAccessoriesColumnCategory("adapters");
        AdaptersCables adaptersCables = new AdaptersCables();
        adaptersCables.findHighestPrice();
    }
    //endregion

}
