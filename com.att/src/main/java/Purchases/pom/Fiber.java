package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.support.PageFactory;

public class Fiber extends SystemBar {

    public Fiber(){
        PageFactory.initElements(driver, this);
    }
}
