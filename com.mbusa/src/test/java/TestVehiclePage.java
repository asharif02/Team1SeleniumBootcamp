import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.VehiclePage;
import shared.Homepage;
import shared.MercedesNavigationPage;

import java.time.Duration;

public class TestVehiclePage extends BasePage {

    @Test
    public void testMercedesAMGEngineView() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Vehicles");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        VehiclePage vehiclePage = mercedesNavigationPage.navigateVehicleOptions("Mercedes-AMG");
        vehiclePage.clickVideoControl();
        vehiclePage.navigateMedia("03.");

        Assert.assertTrue(isElementVisible(vehiclePage.amgEngineViewConfirmation));
        Assert.assertEquals(getElementText(vehiclePage.amgEngineViewConfirmation), excel.readStringList("AMG").get(0));
    }

    @Test
    public void testMercedesAMGPerformanceView() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Vehicles");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        VehiclePage vehiclePage = mercedesNavigationPage.navigateVehicleOptions("Mercedes-AMG");
        vehiclePage.clickVideoControl();
        vehiclePage.navigateMedia("04.");
        vehiclePage.clickExplorePerformance();
        vehiclePage.clickExplorePerformance();
        vehiclePage.clickExplorePerformance();

        Assert.assertTrue(isElementVisible(vehiclePage.amgPerformanceViewConfirmation));
        Assert.assertEquals(getElementText(vehiclePage.amgPerformanceViewConfirmation), excel.readStringList("AMG").get(1));
    }

    @Test
    public void testRotatingAnimation() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Vehicles");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        VehiclePage vehiclePage = mercedesNavigationPage.navigateVehicleOptions("Mercedes-AMG");
        vehiclePage.clickVideoControl();
        vehiclePage.navigateMedia("05.");
        vehiclePage.waitToLoad();
        vehiclePage.rotateCanvas(200);
        vehiclePage.rotateCanvas(200);
        vehiclePage.rotateCanvas(200);
        vehiclePage.rotateCanvas(200);

        Assert.assertTrue(isElementVisible(vehiclePage.amgDesignViewConfirmation));
        Assert.assertEquals(getElementText(vehiclePage.amgDesignViewConfirmation), excel.readStringList("AMG").get(2));
    }
}