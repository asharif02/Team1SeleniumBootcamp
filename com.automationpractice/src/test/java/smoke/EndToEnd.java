package smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.MyAccount;
import pom.SearchResults;
import shared.SystemBar;

import java.time.Duration;

public class EndToEnd extends SystemBar {

    @Test
    public void testAddToCart() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement emailAddress = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement submit = driver.findElement(By.id("SubmitLogin"));
        JavascriptExecutor jse =((JavascriptExecutor)driver);
        jse.executeScript("arguments[0].value='tadefi_01@yahoo.fr';", emailAddress);
        jse.executeScript("arguments[0].value='tadefi2022';", password);
        jse.executeScript("arguments[0].click();", submit);

        MyAccount myAccount = new MyAccount();
        WebElement searchField = driver.findElement(By.xpath("//*[@id='search_query_top']"));
        WebElement search = driver.findElement(By.xpath("//*[@name='submit_search']"));
        jse.executeScript("arguments[0].value='shoes';", searchField);
        jse.executeScript("arguments[0].click();", search);

        SearchResults searchResults = new SearchResults();
        WebElement dress = driver.findElement(By.xpath("//*[@id='center_column']//ul//li[1]//div[1]//a[1]//img"));
        WebElement quantity = driver.findElement(By.id("//*[@id='color_11']"));
        WebElement add = driver.findElement(By.id("//*[@id='add_to_cart']"));
        jse.executeScript("arguments[0].click();", dress);
        jse.executeScript("arguments[0].click();", quantity);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        jse.executeScript("arguments[0].click();", add);







    }



//        String expectedText = excel.readStringList("Sheet1").get(0);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/section[2]/section/div[1]/h2")).getText();
//        Assert.assertTrue(actualText.contains(expectedText));

}
