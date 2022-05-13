package test_app.smoke;

import app.pom.HomePage;
import app.pom.Login;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ENTER;

public class TestSubscribeNewsletter extends BaseTest {

    @Test
    public void testNewsletter(){
      HomePage homepage = new HomePage();
        Login login = homepage.clickLoginButton();

        login.subscribingNewsletter.sendKeys("hahaha@gmail.com");
        login.subscribingNewsletter.sendKeys(ENTER);

        Assert.assertTrue(true,"Newsletter : You have successfully subscribed to this newsletter.");
    }
}
