package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.support.PageFactory;

public class Smartwatches extends SystemBar {

    public Smartwatches(){
        PageFactory.initElements(driver, this);
    }
}
