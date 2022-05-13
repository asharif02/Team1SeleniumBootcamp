package test_app.smoke;

import app.pom.HomePage;
import app.pom.Login;
import app.pom.config.Config;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {

    @Test
    public void testValidLogin() {
        HomePage homepage = new HomePage();
        Login login = homepage.clickLoginButton();
        login.emailInputBox.sendKeys("malik123@gmail.com");
        login.passwordInputBox.sendKeys("malik123");

        String ExpectedText = "Welcome to your account. Here you can manage all of your personal information and orders.";
        Assert.assertEquals(ExpectedText,"Welcome to your account. Here you can manage all of your personal information and orders.");


    }

}
