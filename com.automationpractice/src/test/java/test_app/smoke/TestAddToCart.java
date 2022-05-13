package test_app.smoke;

import app.pom.HomePage;
import app.pom.Login;
import base_test.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestAddToCart extends BaseTest {

    @Test
    public void testAddToCart()  {
        HomePage homepage = new HomePage();
        Login login = homepage.clickLoginButton();
        login.emailInputBox.sendKeys("malik123@gmail.com");
        login.passwordInputBox.sendKeys("malik123");

        login.searchBar2.sendKeys("dresses");
        login.searchBar2.sendKeys(Keys.ENTER);

        login.itemHover.click();
        login.addToCart.click();

        Assert.assertTrue(true, "Product successfully added to your shopping cart");
    }
}
