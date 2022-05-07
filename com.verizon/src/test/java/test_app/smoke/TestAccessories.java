package test_app.smoke;

import app.pom.AccessoriesPage;
import app.pom.Homepage;
import app.pom.phone_accessories.CaseBundles;
import app.pom.phone_accessories.PhoneCases;
import org.testng.annotations.Test;
import base_test.BaseTest;

public class TestAccessories extends BaseTest {

    @Test
    public void testPhoneCasesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("cases");
        PhoneCases phoneCases = new PhoneCases();
        phoneCases.findCheapestPrice();
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
}