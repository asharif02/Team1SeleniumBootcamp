package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonesAndDevices extends SystemBar {

    @FindBy(xpath = "")
    public WebElement phonesAndDevicesLink;

    public boolean phonesAndDevicesLink() {
        clickOnElement(phonesAndDevicesLink);
        return false;
    }


    public PhonesAndDevices(){
        PageFactory.initElements(driver, this);
    }

}
