package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevicesPage extends SystemBar {

    @FindBy(xpath = "//*[@id=\"vz-gf20\"]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div[2]/ul/li[1]/a")
    public WebElement clickDeviceButton;

    @FindBy (xpath = "//button[@data-analyticstrack='tab-Apple']")
    public WebElement clickAppleButton;

    @FindBy (xpath = "//div[@id='LPMlabel-1652053405448-10']")
    public WebElement clickChatButton;

    @FindBy (xpath = "//span[@class='_15gifts-tab-span fgifts-xd8uv1']")
    public WebElement clickHelpMeChooseButton;

    @FindBy (xpath = "//div[@class='IconWrapper-sc-xk14bb-1 bCULWv']")
    public WebElement exitEmailPopups;

    public void helpMeChoose(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(clickHelpMeChooseButton));
    }

    public void clickTheChatWithUsButton(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(clickChatButton));
    }

}
