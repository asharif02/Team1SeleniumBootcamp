package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.support.PageFactory;

public class NBAHomepage extends SystemBar {



    public NBAHomepage() {
        PageFactory.initElements(driver, this);
    }
}
