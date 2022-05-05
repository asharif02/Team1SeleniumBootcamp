package test_app.smoke.registration;

import app.pom.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import base.BasePage;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import org.openqa.selenium.Keys;

public class Search extends TestBasePage {

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
