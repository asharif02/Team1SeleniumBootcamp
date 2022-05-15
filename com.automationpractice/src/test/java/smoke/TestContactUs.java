package smoke;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.ContactUsPage;
import utils.GenerateData;

public class TestContactUs extends BasePage {

    @Test
    public void testContactUs() {
        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.selectSubjectHeadingByVisibleText("Customer service");
        String emailAddress = "tadefi_01@yahoo.fr";
       //String emailAddress = GenerateData.email();
        contactUsPage.inputEmailAddress(emailAddress);
        contactUsPage.inputOrderReference("orderReference");
        WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"uniform-fileUpload\"]//span[2]"));
        uploadFile.sendKeys("\\Users\\zohralamrani\\IdeaProjects\\Team1SeleniumBootcamp\\com.automationpractice\\src\\test\\resources\\FileToUpload.docx");
        System.out.println("File is uploaded successfully");
        contactUsPage.inputMessage("This is an automation test");
        contactUsPage.clickSendButton();
        String expectedText = excel.readStringList("contactUs").get(0);
        String actualText = String.valueOf(driver.findElement(By.xpath("//*[@id='center_column']//p"))).trim();
        Assert.assertTrue(actualText.contains(expectedText));
    }
}