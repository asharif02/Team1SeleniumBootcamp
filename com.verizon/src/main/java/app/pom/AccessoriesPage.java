package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessoriesPage extends SystemBar {

    @FindBy(xpath = "//div[@id='accordionOnePanel']//ul//li")
    public List<WebElement> phoneAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionTwoPanel']//ul//li")
    public List<WebElement> tabletAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionFourPanel']//ul//li")
    public List<WebElement> chargingAccessoriesColumn;

    public void clickPhoneAccessoriesColumnCategory(String categoryName){

        for(WebElement element : phoneAccessoriesColumn){
            if(element.getText().toLowerCase().contains(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickTabletAccessoriesColumnCategory(String categoryName){

        for(WebElement element : tabletAccessoriesColumn){
            if(element.getText().toLowerCase().contains(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickChargingAccessoriesColumnCategory(String categoryName){

        for(WebElement element : chargingAccessoriesColumn){
            if(element.getText().toLowerCase().replace("/", " ").contains(categoryName)){
                element.click();
                break;
            }
        }
    }

    public AccessoriesPage(){
        PageFactory.initElements(driver, this);
    }
}