package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//button[@id='gh-shop-a']")
    public WebElement shopByCategoryDropdownButton;

    @FindBy(xpath = "//li[@data-hover-track='p2481888.m1384.l6435']")
    public WebElement toysButton;

    @FindBy(xpath = "//button[@data-marko='{\"onclick\":\"toggleSublinks s0-18-12-0-1[0]-0-0-27[1]-0 false\"}']")
    public WebElement babyToysLink;

    @FindBy(xpath = "//a[@data-track='{\"eventFamily\":\"LST\",\"eventAction\":\"ACTN\",\"actionKind\":\"NAVSRC\",\"operationId\":\"2489527\",\"flushImmediately\":false,\"eventProperty\":{\"parentrq\":\"aaa9e2f21800aab153c3f2ddfff441ea\",\"pageci\":\"018d4a1f-2efd-4e45-bd5b-71423855c5b7\",\"moduledtl\":\"mi:4337|iid:1|li:9750|luid:13|c:13|uxComponentGroup:CATEGORY_NAV_STRUCTURED_VERTICAL_GROUP|level:3\"}}']")
    public WebElement blocksAndShapeSortersLink;

    @FindBy(xpath = "//a[@href='https://ocsnext.ebay.com/ocs/home']")
    public WebElement helpAndContactLink;

    public boolean clickShopByCategoryDropDownButton(){
        clickOnElement(shopByCategoryDropdownButton);
        return DropdownMenu();
    }
    private boolean DropdownMenu() {
        return true;
    }

    public ToysPage clickToysButton(){
    clickToysButton();
        return null;
    }

    public void clickHelpAndContactButton(){
        clickOnElement(helpAndContactLink);
    }

    public void clickBabyToysLink() {
        clickOnElement(babyToysLink);
    }
    public void clickBlocksAndShapeSortersLink(){
        clickOnElement(blocksAndShapeSortersLink);
    }

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
}
