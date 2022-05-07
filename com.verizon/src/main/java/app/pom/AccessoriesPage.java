package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessoriesPage extends SystemBar {

    @FindBy(xpath = "//div[@id='accordionOnePanel']//ul//li")
    public List<WebElement> phoneAccessoriesColumn;

    public void clickPhoneAccessoriesColumnCategory(String categoryName){

        for(WebElement element : phoneAccessoriesColumn){
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