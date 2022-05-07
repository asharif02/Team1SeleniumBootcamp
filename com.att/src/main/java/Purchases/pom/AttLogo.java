package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.support.PageFactory;

public class AttLogo extends SystemBar {

    public AttLogo(){
        PageFactory.initElements(driver, this);
    }
}
