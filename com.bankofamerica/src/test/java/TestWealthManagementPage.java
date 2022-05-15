import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.WealthManagementPage;
import shared.Homepage;
import utils.GenerateData;

public class TestWealthManagementPage extends BasePage {
    @Test
    public void testRequestConnectWithMerrillAdvisorFor250kInvestmentOrLess(){
        Homepage homepage = new Homepage();
        WealthManagementPage wealthManagementPage = homepage.clickWealthManagement();
        String firstName = GenerateData.firstName();
        wealthManagementPage.keyFirstName(firstName);
        String lastName = GenerateData.lastName();
        wealthManagementPage.keyLastName(lastName);
        wealthManagementPage.keyEmail("john51@yahoo.com");
        wealthManagementPage.confirmEmail("john51@yahoo.com");
        wealthManagementPage.keyPhoneNumber("7189172342");
        String zipCode = GenerateData.zipCode();
        wealthManagementPage.keyZipCode(zipCode);
        wealthManagementPage.selectPortfolioSize(1);
        wealthManagementPage.clickGetStarted();

        Assert.assertTrue(isElementVisible(wealthManagementPage.merrillSubmissionConfirmation));
        Assert.assertEquals(getElementText(wealthManagementPage.merrillSubmissionConfirmation),
                excel.readStringList("WealthManagement").get(0));

    }
    @Test
    public void testRequestConnectWithMerrillAdvisorFor250kTo1MillInvestment(){
        Homepage homepage = new Homepage();
        WealthManagementPage wealthManagementPage = homepage.clickWealthManagement();
        String firstName = GenerateData.firstName();
        wealthManagementPage.keyFirstName(firstName);
        String lastName = GenerateData.lastName();
        wealthManagementPage.keyLastName(lastName);
        wealthManagementPage.keyEmail("adam91@yahoo.com");
        wealthManagementPage.confirmEmail("adam91@yahoo.com");
        wealthManagementPage.keyPhoneNumber("6467122441");
        String zipCode = GenerateData.zipCode();
        wealthManagementPage.keyZipCode(zipCode);
        wealthManagementPage.selectPortfolioSize(2);
        wealthManagementPage.clickGetStarted();

        Assert.assertTrue(isElementVisible(wealthManagementPage.merrillSubmissionConfirmation));
        Assert.assertEquals(getElementText(wealthManagementPage.merrillSubmissionConfirmation),
                excel.readStringList("WealthManagement").get(0));

    }
    @Test
    public void testRequestConnectWithMerrillAdvisorFor1MillTo10MillInvestment(){
        Homepage homepage = new Homepage();
        WealthManagementPage wealthManagementPage = homepage.clickWealthManagement();
        String firstName = GenerateData.firstName();
        wealthManagementPage.keyFirstName(firstName);
        String lastName = GenerateData.lastName();
        wealthManagementPage.keyLastName(lastName);
        wealthManagementPage.keyEmail("r_donald73@gmail.com");
        wealthManagementPage.confirmEmail("r_donald73@gmail.com");
        wealthManagementPage.keyPhoneNumber("8605462417");
        String zipCode = GenerateData.zipCode();
        wealthManagementPage.keyZipCode(zipCode);
        wealthManagementPage.selectPortfolioSize(3);
        wealthManagementPage.clickGetStarted();

        Assert.assertTrue(isElementVisible(wealthManagementPage.merrillSubmissionConfirmation));
        Assert.assertEquals(getElementText(wealthManagementPage.merrillSubmissionConfirmation),
                excel.readStringList("WealthManagement").get(0));

    }
    @Test
    public void testRequestConnectWithMerrillAdvisorForOver10MillInvestment(){
        Homepage homepage = new Homepage();
        WealthManagementPage wealthManagementPage = homepage.clickWealthManagement();
        String firstName = GenerateData.firstName();
        wealthManagementPage.keyFirstName(firstName);
        String lastName = GenerateData.lastName();
        wealthManagementPage.keyLastName(lastName);
        wealthManagementPage.keyEmail("j_smith81@gmail.com");
        wealthManagementPage.confirmEmail("j_smith81@gmail.com");
        wealthManagementPage.keyPhoneNumber("7037236172");
        String zipCode = GenerateData.zipCode();
        wealthManagementPage.keyZipCode(zipCode);
        wealthManagementPage.selectPortfolioSize(4);
        wealthManagementPage.clickGetStarted();

        Assert.assertTrue(isElementVisible(wealthManagementPage.merrillSubmissionConfirmation));
        Assert.assertEquals(getElementText(wealthManagementPage.merrillSubmissionConfirmation),
                excel.readStringList("WealthManagement").get(0));

    }
    @Test
    public void testRequestConnectWithMerrillAdvisorSpeakToSomeoneFirst(){
        Homepage homepage = new Homepage();
        WealthManagementPage wealthManagementPage = homepage.clickWealthManagement();
        String firstName = GenerateData.firstName();
        wealthManagementPage.keyFirstName(firstName);
        String lastName = GenerateData.lastName();
        wealthManagementPage.keyLastName(lastName);
        wealthManagementPage.keyEmail("amy_w93@live.com");
        wealthManagementPage.confirmEmail("amy_w93@live.com");
        wealthManagementPage.keyPhoneNumber("5715624253");
        String zipCode = GenerateData.zipCode();
        wealthManagementPage.keyZipCode(zipCode);
        wealthManagementPage.selectPortfolioSize(5);
        wealthManagementPage.clickGetStarted();

        Assert.assertTrue(isElementVisible(wealthManagementPage.merrillSubmissionConfirmation));
        Assert.assertEquals(getElementText(wealthManagementPage.merrillSubmissionConfirmation),
                excel.readStringList("WealthManagement").get(0));

    }

}