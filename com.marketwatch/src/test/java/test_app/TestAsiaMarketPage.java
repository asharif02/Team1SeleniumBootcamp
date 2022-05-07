package test_app;

import base.BasePage;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import app.pom.AsiaMarket;
import app.shared.Homepage;

public class TestAsiaMarketPage extends BaseTest {

    // region 6 test cases
    @Test
    public void testAsiaDowRates() {
        Homepage homepage = new Homepage();
        AsiaMarket asiaMarket = homepage.closePopUpToViewAsiaMarket();
        asiaMarket.selectAsiaMarket();
        asiaMarket.navigateAsiaMarket("Asia Dow");

        Assert.assertTrue(isElementVisible(asiaMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(asiaMarket.dataSelectionConfirmation),
                excel.readStringList("AsiaMarket").get(0));
    }

    @Test
    public void testNikkei225Rates() {
        Homepage homepage = new Homepage();
        AsiaMarket asiaMarket = homepage.closePopUpToViewAsiaMarket();
        asiaMarket.selectAsiaMarket();
        asiaMarket.navigateAsiaMarket("Nikkei 225");

        Assert.assertTrue(isElementVisible(asiaMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(asiaMarket.dataSelectionConfirmation),
                excel.readStringList("AsiaMarket").get(1));
    }

    @Test
    public void testHangSengRates() {
        Homepage homepage = new Homepage();
        AsiaMarket asiaMarket = homepage.closePopUpToViewAsiaMarket();
        asiaMarket.selectAsiaMarket();
        asiaMarket.navigateAsiaMarket("Hang Seng");

        Assert.assertTrue(isElementVisible(asiaMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(asiaMarket.dataSelectionConfirmation),
                excel.readStringList("AsiaMarket").get(2));
    }

    @Test
    public void testShanghaiRates() {
        Homepage homepage = new Homepage();
        AsiaMarket asiaMarket = homepage.closePopUpToViewAsiaMarket();
        asiaMarket.selectAsiaMarket();
        asiaMarket.navigateAsiaMarket("Shanghai");

        Assert.assertTrue(isElementVisible(asiaMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(asiaMarket.dataSelectionConfirmation),
                excel.readStringList("AsiaMarket").get(3));
    }

    @Test
    public void testSensexRates() {
        Homepage homepage = new Homepage();
        AsiaMarket asiaMarket = homepage.closePopUpToViewAsiaMarket();
        asiaMarket.selectAsiaMarket();
        asiaMarket.navigateAsiaMarket("Sensex");

        Assert.assertTrue(isElementVisible(asiaMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(asiaMarket.dataSelectionConfirmation),
                excel.readStringList("AsiaMarket").get(4));
    }

    @Test
    public void testSingaporeRates() {
        Homepage homepage = new Homepage();
        AsiaMarket asiaMarket = homepage.closePopUpToViewAsiaMarket();
        asiaMarket.selectAsiaMarket();
        asiaMarket.navigateAsiaMarket("Singapore");

        Assert.assertTrue(isElementVisible(asiaMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(asiaMarket.dataSelectionConfirmation),
                excel.readStringList("AsiaMarket").get(5));
    }
    // endregion
}