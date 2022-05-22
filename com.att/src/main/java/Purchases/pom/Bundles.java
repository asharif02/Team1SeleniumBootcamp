package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.support.PageFactory;

public class Bundles extends SystemBar {

    public Bundles(){
        PageFactory.initElements(driver, this);
    }
}
