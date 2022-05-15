package testmarketwatch;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;

import java.time.Duration;
import java.util.List;

public class TestOneDollarForFourWeeks extends BasePage {

    @Test void testCheckPageTimeLoad(){
        Homepage homepage = new Homepage();
        long start = System.currentTimeMillis();
        WebElement element = driver.findElement(By.xpath("//*[@for='main-menu']"));
        long finish = System.currentTimeMillis();
        long totalTime = finish - start;
        System.out.println("Total time for page load - " + totalTime); //25 millis
    }
    @Test
    public void testGetWebTableCellContent() {
        Homepage homepage = new Homepage();
        WebElement baseTable = driver.findElement(By.tagName("table"));
        WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[6]//td[2]"));
        WebElement tableRowText = baseTable.findElement(By.xpath("//table//tbody//tr[6]//td[2]/a"));

        String RowText = tableRow.getText();
        WebElement cellNeeded = tableRow.findElement(By.xpath("//section[1]//div[2]//div//div[2]//div//div[1]//table//tbody//tr[6]//td[2]"));
        String valueNeeded = cellNeeded.getText();
        System.out.println("Cell Value is: " + valueNeeded);

        String expectedText = excel.readStringList("webTableCellContent").get(0);
        String actualText = String.valueOf(driver.findElement(By.xpath("//table//tbody//tr[6]//td[2]/a")));
        Assert.assertTrue(actualText.contains(expectedText));
    }
    @Test
    public void testGetWebTableRowsAndColumns(){
        Homepage homepage = new Homepage();
        List<WebElement> rows = (List<WebElement>) driver.findElement(By.xpath("//section[1]//div[2]//div[1]//tbody//tr[1]//td[2]/a"));
        System.out.println("Number of Rows are: " + rows.size());
        List<WebElement> columns = driver.findElements(By.xpath(""));
    }

    @Test
    public void testVerifyTrendingVideoPlayButton(){
        Homepage homepage = new Homepage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        homepage.clickTrendingVideoPlayButton();
//        homepage.clickOneDollarForFourWeeksButton();
    }
}
    /** Page load takes sometime to load and
     * doesn't display the homepage, error
     * message appears. need to figure out
     * how to handle it or find out what is
     * going on.
     */