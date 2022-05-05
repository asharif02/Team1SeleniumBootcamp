package test_app.smoke.registration;

import app.pom.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import base.BasePage;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import org.openqa.selenium.Keys;

public class navigateSignInButton extends TestBasePage {

    @Test

    public void testNavigationOfSignInButton(){

        HomePage homePage = new HomePage();
        homePage.signInButton2.click();
        homePage.signInButton2.sendKeys("ALREADY REGISTERED?");
        homePage.signInButton2.sendKeys(Keys.ENTER);

        String actualtext =driver.findElement(By.xpath("(//h3[@class='page-subheading'])[2]")).getText();
        String expectedtext ="ALREADY REGISTERED?";
        Assert.assertEquals(actualtext,expectedtext);




    }
}
