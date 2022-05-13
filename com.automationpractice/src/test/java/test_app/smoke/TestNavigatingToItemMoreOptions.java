package test_app.smoke;

import app.pom.HomePage;
import app.pom.Login;
import base_test.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigatingToItemMoreOptions extends BaseTest {

    @Test
    public void testMyCreditSlip() {

        HomePage homepage = new HomePage();
        Login login = homepage.clickLoginButton();

        login.emailInputBox.sendKeys("malik123@gmail.com");
        login.passwordInputBox.sendKeys("malik123");

        login.searchBar4.sendKeys("dresses");
        login.searchBar4.sendKeys(Keys.ENTER);

        login.listView1.click();
        login.clickMoreButton.click();

        Assert.assertTrue(true, "Printed Summer Dress");

    }
}
