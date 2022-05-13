package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Homepage extends SystemBar {

    @FindBy(id = "//*[@id='apptScheduler']")
    public WebElement scheduleAnAppointmentLink;

    @FindBy(id = "//a[@id='security']")
    public WebElement securityAndHelpLink;

    public ScheduleAnAppointment clickScheduleAnAppointmentLink(){
           clickOnElement(scheduleAnAppointmentLink);
           return new ScheduleAnAppointment();
    }
    public void clickSecurityAndHelpLink(){
        clickOnElement(securityAndHelpLink);
    }

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
