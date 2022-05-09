package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends SystemBar {

    @FindBy (xpath = "//input[@aria-label='User ID or Verizon mobile number']")
    public WebElement inputUserIdLogin;

    @FindBy (xpath = "//input[@aria-label='Password']")
    public WebElement inputUserPassword;

    @FindBy (xpath = "//button[@id='login-submit']")
    public WebElement clickLoginButton;


//    @FindBy (xpath = "//*[@id=\"main-content\"]/div[2]/div[1]/h3")
//    public WebElement locationAssertText;

    @FindBy (xpath = "//a[@href='https://www.verizon.com/stores']")
    public WebElement storeButton;

    @FindBy (xpath = "//input[@aria-label='Enter a zip code, city or state']")
    public WebElement enteringZipcode;

    @FindBy (xpath = "//option[@data-url='/stores/state/wyoming/']")
    public WebElement WyomingStores;

    @FindBy (xpath = "//a[@data-track='{\"type\":\"impression\",\"name\":\"l9|p1||||||Find Verizon stores by state.|View stores\"}']")
    public WebElement clickViewStoresButton;

    @FindBy (xpath = "//a[@href='https://www.verizon.com/wireless-devices/smartphones/google/']")
    public WebElement clickOnGoogleButton;

    @FindBy (xpath = "//a[@href='https://www.verizon.com/wireless-devices/amazon/']")
    public WebElement clickOnAmazonButton;

    @FindBy (xpath = "//*[@id=\"accordHeader-4\"]/button")
    public WebElement clickOn5gHomeInternet;

    @FindBy (xpath =  "//a[@href='https://www.verizon.com/wireless-devices/smartphones/motorola/']")
    public WebElement clickOnMotorolaButton;

    @FindBy (xpath = "//a[@aria-label='Buy Motorola edge+ 5G UW']")
    public WebElement buyMotorolaEdgeButton;

    @FindBy (xpath = "//*[@id=\"cta-btn\"]/div/a/span[2]")
    public WebElement clickAddToWishlistButton;

    @FindBy (xpath = "//*[@id=\"page\"]/div/div[4]/div/div[3]/div[1]/div[2]/a/span[2]")
    public WebElement watchVideoButton;

    @FindBy (xpath = "//div[@class='IconWrapper-sc-xk14bb-1 bCULWv']")
    public WebElement exitEmailPopup;

    @FindBy (xpath = "//video[@id='video-gallery-player']")
    public WebElement playVideoButton;


    public void clickStoreButton() {clickOnElement(storeButton);}

    public void selectingWyomingStores(){clickOnElement(WyomingStores);}

    public void clickTheViewStoresButton(){clickOnElement(clickViewStoresButton);}

    public void navigatingToBuyingMotorolaEdgePhone() {clickOnElement(buyMotorolaEdgeButton);}

    public void AddingToWishlist() {clickOnElement(clickAddToWishlistButton);}

    public void exitEmailSignUpPopup(){ clickOnElement(exitEmailPopup);}

    public void clickOnWatchVideo() {clickOnElement(watchVideoButton);}

    public void clickPlayVideoButton() {clickOnElement(playVideoButton);}




}
