package test_app.devices_page;

import app.pom.DevicesPage;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDevices extends BaseTest {


        @Test
    public void testChatWIthUs(){
        DevicesPage devicesPage = new DevicesPage();
        devicesPage.clickDeviceButton.click();

        devicesPage.clickTheChatWithUsButton();

        //Assert

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


