package smoke;

import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;

public class TestShoppingCartAlert extends BasePage {

    @Test
    public void testProcessShoppingCart() {
        Homepage homepage = new Homepage();
        homepage.clickCartButton();

        String expectedText = excel.readStringList("ShoppingCart").get(0).trim();
        String actualText = driver.findElement(By.xpath("//*[@class='alert alert-warning']")).getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }
}
