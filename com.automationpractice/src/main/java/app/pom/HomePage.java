package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SystemBar {



    @FindBy(xpath = "//*[@class='blockbestsellers']")
    public WebElement bestSellerButton1;

    @FindBy (xpath = "//*[@id=\"blockbestsellers\"]/li[1]/div")
    public WebElement clickPrintedChiffonDress1;

    @FindBy (xpath = "//*[@class='btn btn-default button-plus product_quantity_up']")
    public WebElement clickThePlusButton;



    public HomePage() {PageFactory.initElements(driver,this);}
}
