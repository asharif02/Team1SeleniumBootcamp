package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Vehicles extends SystemBar {

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[1]/div/div/div[1]/ul/li[5]/button")
    public WebElement electricButton;

    @FindBy(xpath = "//div[1]//header//ul//li[1]//div[3]//ul//li[5]//ul//div//p[1]")
    public WebElement eqsSedanButton;

    public void clickElectricButton(){
        clickOnElement(electricButton);
    }
    public void clickEqsSedanButton(){
        clickOnElement(eqsSedanButton);
    }


    public Vehicles(){
        PageFactory.initElements(driver, this);
    }
}
