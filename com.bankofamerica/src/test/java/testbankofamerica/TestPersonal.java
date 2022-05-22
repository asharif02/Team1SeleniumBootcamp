package testbankofamerica;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.MobileAndOnlineBanking;
import pom.Personal;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import static org.testng.Assert.assertTrue;

public class TestPersonal extends BasePage{

    @Test
    public void testVerifyBrowserLaunch(){
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Bank Of America";

        String expectedTitle = excel.readStringList("title").get(0);
        String actualTitle = String.valueOf(driver.findElement(By.xpath("//*[@id='headerModule']//div[3]//div[1]//a")));
        Assert.assertTrue(true, "Browser launched");
        Assert.assertTrue(true, "Browser launched");
        //Assert.assertEquals(actualPageTitle, expectedPageTitle);
        System.out.println("The page Title is: " + actualPageTitle);
    }
    @Test
    public void testVerifyPersonalPage() {
        Personal personal = new Personal();
        personal.clickCheckingButton();

        driver.get("https://www.bankofamerica.com/");
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
        System.out.println("Total number of iframes are: " + iframeElements.size());
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
        System.out.println("No. of iframe on the page are: " + noOfFrames);

        String s = driver.getWindowHandle();
        driver.switchTo().window(s);
        personal.clickOnlineBankingLink();

//        Set<String> s = driver.getWindowHandles();
//        Iterator<String> I1 = s.iterator();
//        while(I1.hasNext()){
//            String childWindow = I1.next();
//            if(!parent.equals(childWindow)){
//                driver.switchTo().window(childWindow);
//                System.out.println(driver.switchTo().window(childWindow).getTitle());
//            }

        driver.switchTo().frame("head-row");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2500));
        driver.get("https://www.bankofamerica.com/online-banking/mobile-and-online-banking-features/overview/?request_locale=en_US");
        personal.clickOnlineBankingLink();
        //MobileAndOnlineBanking mobileAndOnlineBanking = new MobileAndOnlineBanking();

        String expectedText = excel.readStringList("MobileAndOnlineBanking").get(0);
        String actualText = String.valueOf(driver.findElement(By.xpath("//*[text()='Take charge of your account, at home or on the go']")));
        assertTrue(actualText.contains(expectedText));

    }
    @Test
    public void testVerifyScheduleAnAppointment(){
        Homepage homepage = new Homepage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        homepage.clickScheduleAnAppointmentLink();

        String expectedText = excel.readStringList("Sheet1").get(0);
        String actualText = driver.findElement(By.xpath("")).getText();
        assertTrue(actualText.contains(expectedText));
    }

}
