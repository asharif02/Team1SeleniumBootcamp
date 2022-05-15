package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.Homepage;

import java.util.List;

public class AccessoriesPage extends Homepage {

    @FindBy(xpath = "//div[@id='accordionOnePanel']//ul//li")
    public List<WebElement> phoneAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionTwoPanel']//ul//li")
    public List<WebElement> tabletAccessoriesColumn;

    public void clickPhoneAccessoriesColumnCategory(String categoryName){

        for(WebElement element : phoneAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }
    public void clickTabletAccessoriesColumnCategory(String categoryName){

        for(WebElement element : tabletAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public AccessoriesPage(){
        PageFactory.initElements(driver, this);
    }
}