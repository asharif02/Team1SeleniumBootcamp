package app.pom;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwn extends BasePage {



    public BuildYourOwn() {
        PageFactory.initElements(driver, this);
    }
}
