package test_app.smoke;

import app.pom.AccessoriesPage;
import app.pom.Homepage;
import app.pom.phone_accessories.CaseBundles;
import app.pom.phone_accessories.MagSafe;
import app.pom.phone_accessories.PhoneCases;
import app.pom.phone_accessories.ScreenProtectors;
import org.testng.annotations.Test;
import base_test.BaseTest;

public class TestPhoneAccessories extends BaseTest {

    // region Verizon Phone Accessories
    @Test
    public void testFindLowestPhoneCase() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("cases");
        PhoneCases phoneCases = new PhoneCases();
        phoneCases.findLowestPrice();
    }

    @Test
    public void testFindHighestPhoneCase() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("cases");
        PhoneCases phoneCases = new PhoneCases();
        phoneCases.findHighestPrice();
    }

    @Test
    public void testFindLowestPhoneCaseBundle() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("case bundles");
        CaseBundles caseBundles = new CaseBundles();
        caseBundles.findLowestPrice();
    }

    @Test
    public void testFindHighestPhoneCaseBundle() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("case bundles");
        CaseBundles caseBundles = new CaseBundles();
        caseBundles.findHighestPrice();
    }

    @Test
    public void testFindLowestScreenProtector() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("screen protectors");
        ScreenProtectors screenProtectors = new ScreenProtectors();
        screenProtectors.findLowestPrice();
    }

    @Test
    public void testFindHighestScreenProtector() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("screen protectors");
        ScreenProtectors screenProtectors = new ScreenProtectors();
        screenProtectors.findHighestPrice();
    }

    @Test
    public void testFindLowestMagSafe() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("magsafe");
        MagSafe magSafe = new MagSafe();
        magSafe.findLowestPrice();
    }

    @Test
    public void testFindHighestMagSafe() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("magsafe");
        MagSafe magSafe = new MagSafe();
        magSafe.findHighestPrice();
    }
    // endregion


}