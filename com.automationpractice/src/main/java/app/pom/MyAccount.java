package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount extends SystemBar {

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist']")
    public WebElement myWishlist;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=identity']/i")
    public WebElement myPersonalInfo;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=addresses']/span")
    public WebElement myAddress;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=order-slip']/span")
    public WebElement myCreditSlips;

    public MyAccount() {
        PageFactory.initElements(driver, this);
    }
    public void viewWishlist(){clickOnElement(myWishlist);}
    public void viewMyPersonalInfo(){clickOnElement(myPersonalInfo);}
    public void viewMyAddress(){clickOnElement(myAddress);}
    public void viewMyCreditSlips(){clickOnElement(myCreditSlips);}

}