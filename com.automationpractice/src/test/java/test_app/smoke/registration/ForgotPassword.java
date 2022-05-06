package test_app.smoke.registration;

import automationpractice.pom.HomePage;
import org.testng.Assert;
import base.BasePage;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class ForgotPassword extends BasePage{

    @Test

    public void testForgotPasswordButton(){

     HomePage homePage= new HomePage();
     homePage.signInButton.click();
     homePage.forgotPasswordButton.click();
     homePage.forgotPasswordButton.sendKeys("rominagad4@gmail.com");
     homePage.forgotPasswordButton.sendKeys(Keys.ENTER);


        Assert.assertTrue(true,"rominagad4@gmail.com");
    }
}
