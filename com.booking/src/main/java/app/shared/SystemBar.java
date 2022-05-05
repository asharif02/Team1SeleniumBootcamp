package app.shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//div[@id='app-header']//ul/li[1]")
    public WebElement staysButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }
}
