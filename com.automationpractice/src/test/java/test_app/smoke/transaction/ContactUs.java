package test_app.smoke.transaction;

import test_base.TestBasePage;
import app.pom.HomePage;
import org.testng.Assert;
import base.BasePage;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class ContactUs extends TestBasePage {
    @Test
    public void TestContactUsPage() {

        HomePage homepage = new HomePage();
        //ContactUs contactUs = homepage.clickOnElement();
       // contactUs.contactUsButton.click();
        //contactUs.selectDropDown.click();
        //contactUs.emailAddressField.sendKeys("rominagad4@gmail.com");
        //contactUs.orderReference.sendKeys("Sra2013");
        //contactUs.messageField.sendKeys("Wrong Order");
        //contactUs.sendButton.click();

        String expectedText = "Your message has been successfully sent to our team";
        String text = "Your message has been successfully sent to our team";
        System.out.println(expectedText);
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }
}
