package test_app.smoke;

import app.pom.HomePage;
import app.pom.Login;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testReviewMyCreditSlip extends BaseTest {

    @Test
    public void testNewWishlist()  {
        HomePage homepage = new HomePage();
        Login login = homepage.clickLoginButton();
        login.emailInputBox.sendKeys("malik123@gmail.com");
        login.passwordInputBox.sendKeys("malik123");

        login.reviewMyCreditSlip.click();

        String ExpectedText = "You have not received any credit slips.";
        Assert.assertEquals(ExpectedText,"You have not received any credit slips.");

    }
}
