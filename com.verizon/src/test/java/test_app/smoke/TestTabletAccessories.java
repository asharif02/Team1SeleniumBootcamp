package test_app.smoke;

import app.pom.AccessoriesPage;
import app.pom.Homepage;
import app.pom.phone_accessories.PhoneCases;
import app.pom.tablet_accessories.TabletCases;
import app.pom.tablet_accessories.TabletKeyboards;
import app.pom.tablet_accessories.TabletMagSafe;
import app.pom.tablet_accessories.TabletScreenProtectors;
import base_test.BaseTest;
import org.testng.annotations.Test;

public class TestTabletAccessories extends BaseTest {

    // region Verizon Tablet Accessories
    @Test
    public void testFindLowestTabletCase() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("cases");
        TabletCases tabletCases = new TabletCases();
        tabletCases.findLowestPrice();
    }

    @Test
    public void testFindHighestTabletCase() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("cases");
        TabletCases tabletCases = new TabletCases();
        tabletCases.findHighestPrice();
    }

    @Test
    public void testFindLowestTabletScreenProtector() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("screen protectors");
        TabletScreenProtectors tsp = new TabletScreenProtectors();
        tsp.findLowestPrice();
    }

    @Test
    public void testFindHighestTabletScreenProtector() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("screen protectors");
        TabletScreenProtectors tsp = new TabletScreenProtectors();
        tsp.findHighestPrice();
    }

    @Test
    public void testFindLowestTabletMagSafe() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("magsafe");
        TabletMagSafe tmf = new TabletMagSafe();
        tmf.findLowestPrice();
    }

    @Test
    public void testFindHighestTabletMagSafe() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("magsafe");
        TabletMagSafe tmf = new TabletMagSafe();
        tmf.findHighestPrice();
    }

    @Test
    public void testFindLowestTabletKeyboard() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("keyboard");
        TabletKeyboards tabletKeyboards = new TabletKeyboards();
        tabletKeyboards.findLowestPrice();
    }

    @Test
    public void testFindHighestTabletKeyboard() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("keyboards");
        TabletKeyboards tabletKeyboards = new TabletKeyboards();
        tabletKeyboards.findHighestPrice();
    }
    // endregion

}
