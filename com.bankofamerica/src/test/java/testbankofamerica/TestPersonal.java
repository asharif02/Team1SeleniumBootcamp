package testbankofamerica;

import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.MobileAndOnlineBanking;
import pom.Personal;

import java.time.Duration;

public class TestPersonal extends BasePage{

    @Test
    public void testVerifyBrowserLaunch(){
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Bank Of America";
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        System.out.println("The page Title is: " + actualPageTitle);
    }
    @Test
    public void testVerifyPersonalPage(){
        Personal personal = new Personal();
        personal.clickCheckingButton();
        driver.switchTo().frame("head-row");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2500));
        driver.get("https://www.bankofamerica.com/online-banking/mobile-and-online-banking-features/overview/?request_locale=en_US");
        personal.clickOnlineBankingLink();
        //MobileAndOnlineBanking mobileAndOnlineBanking = new MobileAndOnlineBanking();

        String expectedText = excel.readStringList("MobileAndOnlineBanking").get(0);
        String actualText = String.valueOf(driver.findElement(By.xpath("//*[text()='Take charge of your account, at home or on the go']")));
        Assert.assertTrue(actualText.contains(expectedText));


    }
    @Test
    public void testVerifyScheduleAnAppointment(){
        Homepage homepage = new Homepage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        //homepage.clickScheduleAnAppointmentLink();
        homepage.clickSecurityAndHelpLink();

        String expectedText = excel.readStringList("Sheet1").get(0);
        String actualText = driver.findElement(By.xpath("")).getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

}
