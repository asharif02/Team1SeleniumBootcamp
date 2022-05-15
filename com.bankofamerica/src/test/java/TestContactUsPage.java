import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.ContactUs;
import shared.Homepage;

public class TestContactUsPage extends BasePage {
    @Test
    public void testMakingClientsOurPriorityVideo() throws InterruptedException {
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactUs();
        contactUs.clickShareFeedback();
        contactUs.clickPlayPauseForClientCareVideo();
        contactUs.enableFullScreen();
        contactUs.playVideoForAmountOfSeconds("10");
        contactUs.enableDisableSubtitles();
        contactUs.playVideoForAmountOfSeconds("30");
        contactUs.progressSlider(10);
        contactUs.disableFullScreen();

        Assert.assertTrue(isElementVisible(contactUs.makingClientsPriorityConfirmation));
        Assert.assertEquals(getElementText(contactUs.makingClientsPriorityConfirmation),
                excel.readStringList("ContactUs").get(0));
    }
}