package pom;

import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class MobileAndOnlineBanking extends SystemBar {

    public MobileAndOnlineBanking(){
        PageFactory.initElements(driver, this);
    }
}
