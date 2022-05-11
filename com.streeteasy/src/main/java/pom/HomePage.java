package pom;

//import org.openqa.selenium.By;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import shared.SystemBar;
//
//public class HomePage extends SystemBar {
//
//
//    @FindBy(xpath = "//a[@class='MainNav-text jsHasSubnav jsHomepageSearchTab']")
//    public WebElement rentButton;
//
//    @FindBy(xpath = "//a[@class='MainNav-text jsHasSubnav jsHomepageSearchTab']")
//    public WebElement buyButton;
//
//    @FindBy(xpath = "//a[@class='MainNav-text']")
//    public WebElement sellButton;
//
//    @FindBy(xpath = "//a[@class='MainNav-text jsHasSubnav']")
//    public WebElement buildingsButton;
//
//    @FindBy(xpath = "//button[@aria-expanded='true']")
//    public WebElement resourcesButton;
//
//    @FindBy(xpath = "//a[@class='MainNav-text jsHasSubnav']")
//    public WebElement blogButton;
//
//    public void clickRentButton(){
//        clickOnElement(rentButton);
//    }
//    public void clickBuyButton(){
//        clickOnElement(buyButton);
//    }
//    public void clickBSellButton(){
//        clickOnElement(sellButton);
//    }
//    public void clickBuildingsButton(){
//        clickOnElement(buildingsButton);
//    }
//    public void clickResourcesButton(){
//        clickOnElement(resourcesButton);
//    }
//    public void clickBlogButton(){
//        clickOnElement(blogButton);
//    }
//
//    public HomePage(){
//        PageFactory.initElements(driver, this);
//    }
//
//    public boolean waitForElementToBeClickableBool(WebDriver driver, By attributeValue, int waitTime) {
//        boolean flag = false;
//        try{
//            new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class)
//                    .until(ExpectedConditions.elementToBeClickable(attributeValue));
//            flag = true;
//            return flag;
//
//        }catch(Exception Ex){
//            return flag;
//        }
//}
//}
