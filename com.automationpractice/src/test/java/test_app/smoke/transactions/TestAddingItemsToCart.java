package test_app.smoke.transactions;

import app.pom.Catalog;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestAddingItemsToCart extends TestBasePage {
    @Test
    public void testIncreasingQuantityWithIcon(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.clickPlusIcon();
        catalog.selectSize(0);
        catalog.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(catalog.addedToCartConfirmation));
        Assert.assertEquals(getElementText(catalog.addedToCartConfirmation), excel.readStringList("AddingToCart").get(0));
    }
    @Test
    public void testIncreasingQuantityWithInputtingQuantity(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.setProductQuantity(2);
        catalog.selectSize(0);
        catalog.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(catalog.addedToCartConfirmation));
        Assert.assertEquals(getElementText(catalog.addedToCartConfirmation), excel.readStringList("AddingToCart").get(0));
    }
    @Test
    public void testSelectingColorOption(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.selectTShirtBlueOption();
        catalog.selectSize(0);
        catalog.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(catalog.addedToCartConfirmation));
        Assert.assertEquals(getElementText(catalog.addedToCartConfirmation), excel.readStringList("AddingToCart").get(0));
    }

}