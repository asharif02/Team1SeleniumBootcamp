import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.SmallBusinessPage;
import shared.Homepage;


public class TestSmallBusinessPage extends BasePage {
    @Test
    public void testFinanceCashFlow(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Finance");
        smallBusinessPage.navigateSubMenu("Cash flow");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(0));
    }
    @Test
    public void testFinanceCreditFunding(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Finance");
        smallBusinessPage.navigateSubMenu("Credit and funding");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(1));
    }
    @Test
    public void testFinanceTaxes(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Finance");
        smallBusinessPage.navigateSubMenu("Taxes");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(2));
    }
    @Test
    public void testFinanceRetirement(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Finance");
        smallBusinessPage.navigateSubMenu("Retirement");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(3));
    }
    @Test
    public void testOperationsHR(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Operations");
        smallBusinessPage.navigateSubMenu("HR");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(4));
    }
    @Test
    public void testOperationsCustomerRelations(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Operations");
        smallBusinessPage.navigateSubMenu("Customer relations");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(5));
    }
    @Test
    public void testOperationsBusinessStrategy(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Operations");
        smallBusinessPage.navigateSubMenu("Business strategy");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(6));
    }
    @Test
    public void testInsightsNews(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Insights");
        smallBusinessPage.navigateSubMenu("News");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(7));
    }
    @Test
    public void testInsightsIndustryTrends(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Insights");
        smallBusinessPage.navigateSubMenu("Industry trends");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(8));
    }
    @Test
    public void testStoriesWomenEntrepreneurs(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Stories");
        smallBusinessPage.navigateSubMenu("Women Entrepreneurs");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(9));
    }
    @Test
    public void testStoriesSmallBusinessSpotlight(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Stories");
        smallBusinessPage.navigateSubMenu("Small Business Spotlight");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(10));
    }
    @Test
    public void testStoriesHeartbeatOfMainStreet(){
        Homepage homepage = new Homepage();
        SmallBusinessPage smallBusinessPage = homepage.clickSmallBusiness();
        smallBusinessPage.clickSmallBusinessResources();
        smallBusinessPage.clickVisitSmallBusinessResources();
        smallBusinessPage.waitForPageToLoad();
        smallBusinessPage.navigateSmallBusinessResourceOptions("Stories");
        smallBusinessPage.navigateSubMenu("Heartbeat of Main Street");

        Assert.assertTrue(isElementVisible(smallBusinessPage.smallBusinessResourceSelectionConfirmation));
        Assert.assertEquals(getElementText(smallBusinessPage.smallBusinessResourceSelectionConfirmation),
                excel.readStringList("SmallBusiness").get(11));
    }
}