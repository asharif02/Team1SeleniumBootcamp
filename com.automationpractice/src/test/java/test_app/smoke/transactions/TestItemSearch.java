package test_app.smoke.transactions;

import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestItemSearch extends TestBasePage {

    @Test
    public void testSearchValidClothingItem() {
        Homepage homepage = new Homepage();

        String searchTerm = homepage.inputSearchTerm("dresses");
        homepage.clickSearchSubmitButton();

        String actualSearchTerm = homepage.actualSearchTerm.getText().replace("\"", "");
        System.out.println(actualSearchTerm);

        Assert.assertTrue(searchTerm.equalsIgnoreCase(actualSearchTerm));
    }

    @Test
    public void testSearchInvalidClothingItem() {
        Homepage homepage = new Homepage();

        String searchTerm = homepage.inputSearchTerm("jackets");
        homepage.clickSearchSubmitButton();

        Assert.assertTrue(isElementVisible(homepage.noResultsFoundAlertWarning));
    }
}
