package test_app.devices_page;

import app.pom.DevicesPage;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestDevices extends BaseTest {


        @Test
    public void testChatWIthUs(){
        DevicesPage devicesPage = new DevicesPage();
        devicesPage.clickDeviceButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        devicesPage.clickTheChatWithUsButton();

        //Assert
            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL, "https://www.verizon.com/smartphones/" );

    }

        @Test
    public void testHelpMeChooseButton() {
        DevicesPage devicesPage = new DevicesPage();
        devicesPage.clickDeviceButton.click();
        devicesPage.helpMeChoose();

        String ExpectedText = "Before we get started, are you already with Verizon?";
        Assert.assertEquals(ExpectedText,"Before we get started, are you already with Verizon?");
    }


        @Test
    public void testSelectingApplePhones(){
        DevicesPage devicesPage = new DevicesPage();
        devicesPage.clickDeviceButton.click();
        devicesPage.clickAppleButton.click();

        String ExpectedText = "Home\n" + "Smartphones\n" + "Apple";
        Assert.assertEquals(ExpectedText,"Home\n" + "Smartphones\n" + "Apple");
    }
}


