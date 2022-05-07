package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//li[@id='HEADBAND01']")
    WebElement phonesAndDevicesButton;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }

    public PhonesAndDevices clickPhonesAndDevicesButton(){
    clickOnElement(phonesAndDevicesButton);
    return new PhonesAndDevices();
    }
}
