import base.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;

public class testShopByCategory extends BasePage {

    @Test
    public void testVerifyShopByCategoryMenu(WebElement shopByCategoryDropdownMenu){
        HomePage homePage = new HomePage();
        homePage.clickShopByCategoryDropDownButton();

        Assert.assertTrue(isElementVisible(shopByCategoryDropdownMenu));
        System.out.println("Shop by category menu is visible - Assertion passed");
    }

}
