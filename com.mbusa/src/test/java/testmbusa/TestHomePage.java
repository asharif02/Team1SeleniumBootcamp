package testmbusa;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.Vehicles;

import java.time.Duration;

public class TestHomePage extends BasePage {

    @Test
    public void testVerifyMbHomePageLogoFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickMbHomePageLogo();

//        Assert.assertTrue(isElementVisible(mbHomePageLogo().mbHomePageLogo));
//        System.out.println("MB Home Page Loge is functioning - Assertion passed");

        String expectedText = excel.readStringList("Sheet1").get(1);
        String actualText = driver.findElement(By.xpath("//main[1]/div[8]/section[1]/div[2]/section[1]/h3[1]")).getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }
    private HomePage mbHomePageLogo() {
        return new HomePage();
    }
    @Test
    public void testSwitchToIframe() throws InterruptedException {
        HomePage homePage = new HomePage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        homePage.clickVehiclesButton();
        //driver.switchTo().frame(0);
        Vehicles vehicles = new Vehicles();
        vehicles.clickElectricButton();
        vehicles.clickEqsSedanButton();

        String expectedText = excel.readStringList("Sheet1").get(0);
        String actualText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/section[2]/section/div[1]/h2")).getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Test
    public void testSearchProducts(){
        HomePage homepage = new HomePage();
        homepage.clickSearchButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        homepage.clickSearchInputField();
        //String searchTerm = "Future Vehicles";
        homepage.sendKeysToElement(homepage.searchInputField, "Future Vehicles");
        homepage.clickInnerSearchButton();
    }
    public TestHomePage(){
        PageFactory.initElements(driver, this);
    }

}
