package test_app;

import base.BasePage;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import app.pom.FXMarket;
import app.shared.Homepage;

public class TestFXMarketPage extends BaseTest {

    // region 6 test cases
    @Test
    public void testEuroRates() {
        Homepage homepage = new Homepage();
        FXMarket fxMarket = homepage.closePopUpToViewFXMarket();
        fxMarket.selectFXMarket();
        fxMarket.navigateFXMarket("Euro");

        Assert.assertTrue(isElementVisible(fxMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(fxMarket.dataSelectionConfirmation),
                excel.readStringList("FXMarket").get(0));
    }

    @Test
    public void testYenRates() {
        Homepage homepage = new Homepage();
        FXMarket fxMarket = homepage.closePopUpToViewFXMarket();
        fxMarket.selectFXMarket();
        fxMarket.navigateFXMarket("Yen");

        Assert.assertTrue(isElementVisible(fxMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(fxMarket.dataSelectionConfirmation),
                excel.readStringList("FXMarket").get(1));
    }

    @Test
    public void testPoundRates() {
        Homepage homepage = new Homepage();
        FXMarket fxMarket = homepage.closePopUpToViewFXMarket();
        fxMarket.selectFXMarket();
        fxMarket.navigateFXMarket("Pound");

        Assert.assertTrue(isElementVisible(fxMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(fxMarket.dataSelectionConfirmation),
                excel.readStringList("FXMarket").get(2));
    }

    @Test
    public void testAustralianDollarRates() {
        Homepage homepage = new Homepage();
        FXMarket fxMarket = homepage.closePopUpToViewFXMarket();
        fxMarket.selectFXMarket();
        fxMarket.navigateFXMarket("Australia$");

        Assert.assertTrue(isElementVisible(fxMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(fxMarket.dataSelectionConfirmation),
                excel.readStringList("FXMarket").get(3));
    }

    @Test
    public void testDXYIndexRates() {
        Homepage homepage = new Homepage();
        FXMarket fxMarket = homepage.closePopUpToViewFXMarket();
        fxMarket.selectFXMarket();
        fxMarket.navigateFXMarket("DXY Index");

        Assert.assertTrue(isElementVisible(fxMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(fxMarket.dataSelectionConfirmation),
                excel.readStringList("FXMarket").get(4));
    }

    @Test
    public void testWSJDollarIndexRates() {
        Homepage homepage = new Homepage();
        FXMarket fxMarket = homepage.closePopUpToViewFXMarket();
        fxMarket.selectFXMarket();
        fxMarket.navigateFXMarket("WSJ $ Idx");

        Assert.assertTrue(isElementVisible(fxMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(fxMarket.dataSelectionConfirmation),
                excel.readStringList("FXMarket").get(5));
    }
    // endregion
}