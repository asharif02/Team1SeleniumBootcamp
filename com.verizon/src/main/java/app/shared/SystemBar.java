package app.shared;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

import static base.BasePage.driver;

public class SystemBar extends BasePage {


    public SystemBar(){
        PageFactory.initElements(driver, this);
    }
}