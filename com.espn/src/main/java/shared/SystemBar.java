package shared;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    public SystemBar(){
        PageFactory.initElements(driver, this);
    }
}
