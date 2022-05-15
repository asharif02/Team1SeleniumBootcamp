package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.BusinessPage;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@id='gnav20-eyebrow-link-Business']")
    public WebElement businessPage;

    @FindBy(xpath = "//h1[@class='h1 u-marginBottomNone']")
    public WebElement smartPhoneBrandSearchConfirmation;

    @FindBy(xpath = "//a[@href='https://www.verizon.com/products/bundle-eligible-cases/']")
    public WebElement caseSearchConfirmation;

    @FindBy(xpath = "//a[@href='https://www.verizon.com/products/bundle-eligible-screen-protectors/']")
    public WebElement screenProtectorSearchConfirmation;

    @FindBy(xpath = "//a[@href='https://www.verizon.com/products/ipad-cases/']")
    public WebElement tabletCaseSearchConfirmation;

    @FindBy(xpath = "//a[@href='https://www.verizon.com/products/cases-and-protection/']")
    public WebElement caseBundleConfirmation;

    @FindBy(xpath = "//a[@href='https://www.verizon.com/products/tablet-accessories/']")
    public WebElement tabletAccessoriesSearchConfirmation;

    @FindBy(xpath = "//ul[@class='gnav20-footer-list']//a[contains(text(), 'Accessories')]")
    public WebElement accessoriesLink;

    public void clickAccessoriesLink(){
        clickOnElement(accessoriesLink);
    }

    public Homepage(){
        PageFactory.initElements(driver, this);
    }

    public BusinessPage clickOnBusinessPage(){
        clickOnElement(businessPage);

        return new BusinessPage();
    }
}