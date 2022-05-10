package pom;

import app.pom.ContactUs;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import utils.GenerateData;

public class TestContactUs extends TestBasePage {
    @Test
    public void testContactCustomerService(){
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactButton();
        contactUs.departmentSelection(1);
        String emailAddress = GenerateData.email();
        contactUs.inputEmailAddress(emailAddress);
        contactUs.inputMessage("This is a test");
        contactUs.clickSendButton();

        Assert.assertTrue(isElementVisible(contactUs.messageSentConfirmation));
    }
    @Test
    public void testContactWebmaster(){
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactButton();
        contactUs.departmentSelection(2);
        String emailAddress = GenerateData.email();
        contactUs.inputEmailAddress(emailAddress);
        contactUs.inputMessage("This is a test");
        contactUs.clickSendButton();

        Assert.assertTrue(isElementVisible(contactUs.messageSentConfirmation));
    }
    @Test
    public void testRegisterForNewsletter(){
        Homepage homepage = new Homepage();
        String email = GenerateData.email();
        homepage.newsletterEmailInput(email);
        homepage.clickNewsletterSubmitButton();

        Assert.assertTrue(isElementVisible(homepage.newsletterRegistrationConfirmation));
    }
}