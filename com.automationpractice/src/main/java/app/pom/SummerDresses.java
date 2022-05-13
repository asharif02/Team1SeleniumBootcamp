package app.pom;


import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDresses extends SystemBar {


    @FindBy (xpath = "//*[@id='layered_id_attribute_group_1']")
    public WebElement sizeCheckBox;

    @FindBy (xpath = "//*[@style='background: #434A54;']")
    public WebElement colorCheckBox;


    public SummerDresses() {
        PageFactory.initElements(driver, this);
    }


}
