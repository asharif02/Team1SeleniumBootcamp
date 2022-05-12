import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom.HomePage;

import java.time.Duration;

public class TestHomePage extends BasePage {

    @Test
    public void testCreateAccountLogInPage() {
        HomePage homePage = new HomePage();
        homePage.clickSubscribeNowButton();
        //String s = driver.getPageSource();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        String url = "https://secure.web.plus.espn.com/account?returnUrl=%2Fbilling%2Fpurchase%2FESPN_PURCHASE_CMPGN%2FESPN_PURCHASE_VOCHR%2FYESPN&start=login&locale=en_US";
        driver.get(url);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        String s = (String) j.executeScript(("return document.body.innerHTML;"));
        System.out.println("Get HTML of page: " + s);

//        WebElement signUpLink = driver.findElement(By.id("//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[4]/a"));
//        String signUp = signUpLink.getAttribute("innerHTML");
//        System.out.println("HTML code of element: " + signUp);

//        String expectedText = excel.readStringList("Sheet1").get(1);
//        String actualText = driver.findElement(By.xpath("//main[1]/div[8]/section[1]/div[2]/section[1]/h3[1]")).getText();
//        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Test
    public void testCheckTopEventsSummaryPage() {
        HomePage homePage = new HomePage();
        homePage.clickTopEventsDropdownMenu();
        homePage.clickTopEventsScrollToTheRightButton();
        for (int i = 0; i < 5; i++) {
            driver.findElement((By.xpath("//*[@id='global-scoreboard']//div/div/div[7]"))).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        homePage.clickTopEventsScrollToTheRightButtonTwo();
        homePage.clickTopEventsScrollToTheRightButton();
        homePage.clickTopEventsScrollToTheRightButton();
        homePage.clickTopEventsScrollToTheRightButton();
            WebElement buttonElement = driver.findElement(By.xpath("//*[@id='global-scoreboard']//div/div/div[7]"));
//            int i;
            for(i = 0; i < 5; i++) {
                buttonElement.click();
            }
        //homePage.clickTopEventsSummaryButton();
        }
    }
    @Test
    public void testFindTheNumberOfIframesInPage(){
        HomePage homePage = new HomePage();
        //Dimension size = driver.findElement(By.tagName("iframe")).getSize();
//        for(int i=0;
//        driver.switchTo().frame("unidFrame"));
//        int total = driver.findElement(By.xpath("html/body/a/img")).getSize();
//        System.out.println(total);
//        driver.switchTo().defaultContent();
    }

    @Test
    public void testPlayLiveVideoPlayButton(){
        HomePage homePage = new HomePage();
        homePage.clickLiveVideoPlayButton();
        //driver.switchTo().frame("unidFrame");
        //driver.findElement(By.xpath("//*[@src='https://a.espncdn.com/espn360/images/affiliates/svg/HULU/HULU-CLR-NEG.svg']")).click();

        //driver.get("https://www.espn.com/watch/player/_/id/a5b4f88c-66c5-4f61-8f40-344a352af8a9");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        //homePage.clickHuluButton();
        //driver.switchTo().frame();
        //System.out.println("***We're switched to the iframe***");
        //driver.findElement(By.xpath()).click();
    }

}