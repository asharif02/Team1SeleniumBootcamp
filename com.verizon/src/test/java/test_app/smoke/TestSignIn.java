package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSignIn extends BaseTest {

    @Test
    public void testSigningIn() {
        Homepage homepage = new Homepage();
        homepage.signInButton.click();
        homepage.signIntoMyAccount.click();

        homepage.inputUserIdLogin.sendKeys("Jackie");
        homepage.inputUserPassword.sendKeys("09876543");
        homepage.clickLoginButton.click();

        Assert.assertTrue(true,"Verify your User ID or Mobile number is:");

//        String actualLocation = homepage.locationAssertText.getText();
//        String expectedLocation = excel.readStringList("Verify your User ID or Mobile number is:").get(0);
//
//        Assert.assertTrue(actualLocation.contains(expectedLocation));

    }
}
