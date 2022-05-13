package test_app.news_search;

import app.pom.NewsPage;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNewsSearch extends BaseTest {

    @Test
    public void testNewsButtonSearch() {
        NewsPage newsPage = new NewsPage();
        newsPage.clickHousingNewsButton();

        String ExpectedText = excel.readStringList("Redfin").get(0);
        String ActualText = driver.findElement(By.xpath("//h2[@class='elementor-heading-title elementor-size-large']")).getText();
        Assert.assertTrue(ActualText.contains(ExpectedText));
    }

    @Test
    public void testDataCenterGraphFullScreenView() {
        NewsPage newsPage = new NewsPage();
        newsPage.clickHousingNewsButton();
        newsPage.clickDataCenterButton();
        newsPage.clickRedfinDataQuality();
        driver.navigate().to("https://www.redfin.com/about/data-quality-on-redfin");

        String ExpectedText = excel.readStringList("Redfin").get(1);
        String ActualText = driver.findElement(By.xpath("//*[@id=\"search-agents\"]/div/div/h1/span")).getText();
        Assert.assertTrue(ActualText.contains(ExpectedText));
    }

    @Test
    public void testSigningUpForRealEstateNews() {
        NewsPage newsPage = new NewsPage();
        newsPage.clickHousingNewsButton();
        newsPage.emailSignupPlaceHolder.sendKeys("kamoka@gmail.com");

        String ExpectedText = excel.readStringList("Redfin").get(0);
        String ActualText = driver.findElement(By.xpath("//h2[@class='elementor-heading-title elementor-size-large']")).getText();
        Assert.assertTrue(ActualText.contains(ExpectedText));
    }

    @Test
    public void testSearchAnAddress() {
        NewsPage newsPage = new NewsPage();
        newsPage.clickHousingNewsButton();
        newsPage.searchBar.sendKeys("Virginia");
        newsPage.clickSearchButton.click();

        String ExpectedText = "Search Results for: Virginia";
        Assert.assertEquals(ExpectedText,"Search Results for: Virginia");
    }

    @Test
    public void testMarketTrackerLink() {
        NewsPage newsPage = new NewsPage();
        newsPage.clickHousingNewsButton();
        newsPage.clickHousingMarketButton();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.redfin.com/news/");
    }

    @Test
    public void testLastMarketNewsPageLink() {
        NewsPage newsPage = new NewsPage();
        newsPage.clickHousingNewsButton();
        newsPage.clickHousingMarketButton();
        newsPage.clickLastNewsPage();

        String ExpectedText = "139";
        Assert.assertEquals(ExpectedText,"139");

    }

    @Test
    public void testMedianSalePrices(){
        NewsPage newsPage = new NewsPage();
        newsPage.clickHousingNewsButton();
        newsPage.clickMedianSalePriceLink();


        String ExpectedText = "What is the housing market like right now?";
        Assert.assertEquals(ExpectedText,"What is the housing market like right now?");

    }

}
