package app.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignPage extends BasePage {

    @FindBy(xpath = "//a[@analytics-event='byo-vehicle-selector.byo-design.build-recommended.button']")
    public WebElement recommendedBuild;

    public DesignPage() {
        PageFactory.initElements(driver, this);
    }
}
