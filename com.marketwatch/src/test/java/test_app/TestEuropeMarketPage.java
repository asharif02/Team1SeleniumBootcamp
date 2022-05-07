package test_app;

import base.BasePage;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import app.pom.EuropeMarket;
import app.shared.Homepage;

public class TestEuropeMarketPage extends BaseTest {

    // region 6 test cases
    @Test
    public void testFTSE100Rates() {
        Homepage homepage = new Homepage();
        EuropeMarket europeMarket = homepage.closePopUpToViewEuropeMarket();
        europeMarket.selectEuropeMarket();
        europeMarket.navigateEuropeMarket("FTSE 100");

        Assert.assertTrue(isElementVisible(europeMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(europeMarket.dataSelectionConfirmation),
                excel.readStringList("EuropeMarket").get(0));
    }

    @Test
    public void testDAXRates() {
        Homepage homepage = new Homepage();
        EuropeMarket europeMarket = homepage.closePopUpToViewEuropeMarket();
        europeMarket.selectEuropeMarket();
        europeMarket.navigateEuropeMarket("DAX");

        Assert.assertTrue(isElementVisible(europeMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(europeMarket.dataSelectionConfirmation),
                excel.readStringList("EuropeMarket").get(1));
    }

    @Test
    public void testCAC40Rates() {
        Homepage homepage = new Homepage();
        EuropeMarket europeMarket = homepage.closePopUpToViewEuropeMarket();
        europeMarket.selectEuropeMarket();
        europeMarket.navigateEuropeMarket("CAC 40");

        Assert.assertTrue(isElementVisible(europeMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(europeMarket.dataSelectionConfirmation),
                excel.readStringList("EuropeMarket").get(2));
    }

    @Test
    public void testFTSEMIBRates() {
        Homepage homepage = new Homepage();
        EuropeMarket europeMarket = homepage.closePopUpToViewEuropeMarket();
        europeMarket.selectEuropeMarket();
        europeMarket.navigateEuropeMarket("FTSE MIB");

        Assert.assertTrue(isElementVisible(europeMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(europeMarket.dataSelectionConfirmation),
                excel.readStringList("EuropeMarket").get(3));
    }

    @Test
    public void testIBEX35Rates() {
        Homepage homepage = new Homepage();
        EuropeMarket europeMarket = homepage.closePopUpToViewEuropeMarket();
        europeMarket.selectEuropeMarket();
        europeMarket.navigateEuropeMarket("IBEX 35");

        Assert.assertTrue(isElementVisible(europeMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(europeMarket.dataSelectionConfirmation),
                excel.readStringList("EuropeMarket").get(4));
    }

    @Test
    public void testStoxx600Rates() {
        Homepage homepage = new Homepage();
        EuropeMarket europeMarket = homepage.closePopUpToViewEuropeMarket();
        europeMarket.selectEuropeMarket();
        europeMarket.navigateEuropeMarket("Stoxx 600");

        Assert.assertTrue(isElementVisible(europeMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(europeMarket.dataSelectionConfirmation),
                excel.readStringList("EuropeMarket").get(5));
    }
    // endregion
}