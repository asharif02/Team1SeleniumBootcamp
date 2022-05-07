package test_app.smoke;

import app.pom.AccessoriesPage;
import app.pom.Homepage;
import app.pom.phone_accessories.PhoneCases;
import app.pom.tablet_accessories.TabletCases;
import app.pom.tablet_accessories.TabletMagSafe;
import app.pom.tablet_accessories.TabletScreenProtectors;
import base_test.BaseTest;
import org.testng.annotations.Test;

public class TestTabletAccessories extends BaseTest {

    @Test
    public void testFindLowestTabletCase() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("cases");
        TabletCases tabletCases = new TabletCases();
        tabletCases.findLowestPrice();
    }

    @Test
    public void testFindHighestTabletCase() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("cases");
        TabletCases tabletCases = new TabletCases();
        tabletCases.findHighestPrice();
    }

    @Test
    public void testFindLowestTabletScreenProtector() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("screen protectors");
        TabletScreenProtectors tsp = new TabletScreenProtectors();
        tsp.findLowestPrice();
    }

    @Test
    public void testFindHighestTabletScreenProtector() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("screen protectors");
        TabletScreenProtectors tsp = new TabletScreenProtectors();
        tsp.findHighestPrice();
    }

    @Test
    public void testFindLowestTabletMagSafe() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("magsafe");
        TabletMagSafe tmf = new TabletMagSafe();
        tmf.findLowestPrice();
    }

    @Test
    public void testFindHighestTabletMagSafe() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("magsafe");
        TabletMagSafe tmf = new TabletMagSafe();
        tmf.findHighestPrice();
    }


}
