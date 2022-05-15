package accessories_page;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AccessoriesPage;
import pom.PhoneAccessories;
import pom.TabletAccessories;
import shared.Homepage;

public class TestAccessories extends Homepage {

    @Test
    public void testSearchForPhoneCases() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Cases");
        PhoneAccessories phoneAccessories = new PhoneAccessories();
        phoneAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.caseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.caseSearchConfirmation), excel.readStringList("Accessories").get(0));
    }

    @Test
    public void testSearchForPhoneScreenProtectors() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Screen Protectors");
        PhoneAccessories phoneAccessories = new PhoneAccessories();
        phoneAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.screenProtectorSearchConfirmation));
        Assert.assertEquals(getElementText(ap.screenProtectorSearchConfirmation),
                excel.readStringList("Accessories").get(1));
    }

    @Test
    public void testSearchForTabletCases() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("Cases");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.tabletCaseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.tabletCaseSearchConfirmation),
                excel.readStringList("Accessories").get(2));
    }

    @Test
    public void testSearchForPhoneMagSafe() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("MagSafe");
        PhoneAccessories phoneAccessories = new PhoneAccessories();
        phoneAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.caseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.caseSearchConfirmation), excel.readStringList("Accessories").get(0));
    }

    @Test
    public void testSearchForTabletScreenProtectors() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("Screen Protectors");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.screenProtectorSearchConfirmation));
        Assert.assertEquals(getElementText(ap.screenProtectorSearchConfirmation),
                excel.readStringList("Accessories").get(1));
    }

    @Test
    public void testSearchForTabletMagSafe() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("MagSafe");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.caseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.caseSearchConfirmation), excel.readStringList("Accessories").get(0));
    }

    @Test
    public void testSearchForTabletKeyboards() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("Keyboards");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.tabletAccessoriesSearchConfirmation));
        Assert.assertEquals(getElementText(ap.tabletAccessoriesSearchConfirmation),
                excel.readStringList("Accessories").get(3));
    }

    @Test
    public void testSearchForTabletVerizonCases() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("Verizon Cases");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.caseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.caseSearchConfirmation),
                excel.readStringList("Accessories").get(0));
    }

    @Test
    public void testSearchForPhoneVerizonCases() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Verizon Cases");
        PhoneAccessories phoneAccessories = new PhoneAccessories();
        phoneAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.caseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.caseSearchConfirmation), excel.readStringList("Accessories").get(0));
    }

    @Test
    public void testSearchForPhoneCaseBundles() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Case Bundles");
        PhoneAccessories phoneAccessories = new PhoneAccessories();
        phoneAccessories.findCheapestPrice();

        Assert.assertTrue(isElementVisible(ap.caseBundleConfirmation));
        Assert.assertEquals(getElementText(ap.caseBundleConfirmation), excel.readStringList("Accessories").get(4));
    }
}