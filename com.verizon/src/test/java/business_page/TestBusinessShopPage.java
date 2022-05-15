package business_page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BusinessPage;
import shared.Homepage;

import java.time.Duration;

public class TestBusinessShopPage extends BasePage {

    @Test
    public void testBusinessSmartPhonesAllBrands() {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.clickShopButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.waitForPageToLoad();
        businessPage.selectBrand("All");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(0));
    }

    @Test
    public void testBusinessSmartPhonesAppleBrands() {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.clickShopButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.waitForPageToLoad();
        businessPage.selectBrand("Apple");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(1));
    }

    @Test
    public void testBusinessSmartPhonesSamsungBrands() {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.clickShopButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.waitForPageToLoad();
        businessPage.selectBrand("Samsung");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(2));
    }

    @Test
    public void testBusinessSmartPhonesMotorolaBrands() {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.clickShopButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.waitForPageToLoad();
        businessPage.selectBrand("Motorola");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(3));
    }

    @Test
    public void testBusinessSmartPhonesGoogleBrands() {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.clickShopButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        businessPage.waitForPageToLoad();
        businessPage.selectBrand("Google");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(4));
    }
}