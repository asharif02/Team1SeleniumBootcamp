package test_app.smoke.registration;

import automationpractice.pom.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import org.openqa.selenium.Keys;
import base.BasePage;

public class Search extends BasePage {

    @Test

    public void testSearchButton(){

    HomePage homePage= new HomePage();
    homePage.searchButton.click();
    homePage.searchButton.sendKeys("Please enter a search keyword");
    homePage.searchButton.sendKeys(Keys.ENTER);

    String actualtext = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
    String expectedtext = "Please enter a search keyword";
    Assert.assertEquals(actualtext,expectedtext);
    }
}
