package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.ToysPage;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//button[@id='gh-shop-a']")
    public WebElement shopByCategoryDropdownButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBarInputField;

    @FindBy(xpath = "//li[@data-hover-track='p2481888.m1384.l6435']")
    public WebElement toysButton;

    public ToysPage clickToysButton(){
        return new ToysPage();
    }

//    public void clickToysButton(){
//        return new ToysPage();
//    }


    public SystemBar(){
       PageFactory.initElements(driver, this);
   }


}

