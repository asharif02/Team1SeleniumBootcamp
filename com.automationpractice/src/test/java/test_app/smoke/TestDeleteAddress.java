package test_app.smoke;

import app.pom.HomePage;
import app.pom.Login;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestDeleteAddress extends BaseTest {

    @Test
    public void testDeleteAddress()  {

        HomePage homepage = new HomePage();
        Login login = homepage.clickLoginButton();
        login.emailInputBox.sendKeys("malik123@gmail.com");
        login.passwordInputBox.sendKeys("malik123");
        login.TermsAndConditions.click();

        String ExpectedText = "TERMS AND CONDITIONS OF USE";
        Assert.assertEquals(ExpectedText,"TERMS AND CONDITIONS OF USE");

    }

    }
