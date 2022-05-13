package test_app.smoke;

import app.pom.Homepage;
import base.BasePage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogIn extends BaseTest {

    @Test
    public void testLogInFunctionality(){
        Homepage homepage = new Homepage();
        homepage.logIn();

        String ExpectedText = "Join or Sign In";
        Assert.assertEquals(ExpectedText,"Join or Sign In");

    }

    @Test
    public void testSearchAnArea() {
        Homepage homepage = new Homepage();
        homepage.searchInput.sendKeys("Ashburn");

        String ExpectedText = "Ashburn Homes for Sale";
        Assert.assertEquals(ExpectedText,"Ashburn Homes for Sale");
    }
}
