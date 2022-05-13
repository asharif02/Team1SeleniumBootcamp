package pom;

import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class ScheduleAnAppointment extends SystemBar {

    public ScheduleAnAppointment(){
        PageFactory.initElements(driver, this);
    }
}
