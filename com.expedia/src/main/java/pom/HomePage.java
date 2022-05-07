package pom;

import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    public HomePage(){
        PageFactory.initElements(driver, this);

    }
}
