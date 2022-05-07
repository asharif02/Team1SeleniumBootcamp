package app.pom.phone_accessories;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PhoneCases extends SystemBar {

    @FindBy(xpath = "//div[@class='Tile__Pricing-sc-71g958-10 fClbGb blur']/p")
    public List<WebElement> prices;

    public void findLowestPrice(){
        double min = Double.MAX_VALUE;
        WebElement cheapestElement = null;

        for(WebElement element : prices){

            StringBuilder sb = new StringBuilder(element.getText());
            sb.deleteCharAt(0);
            String price = sb.toString();
            System.out.println(price);
            double doublePrice = Double.parseDouble(price);
            if(doublePrice < min){
                min = doublePrice;
                cheapestElement = element;
            }
        }

        System.out.println("THIS IS THE MINIMUM FOUND! " + min);
        cheapestElement.click();
    }

    public void findHighestPrice() {
        double max = Double.MIN_VALUE;
        WebElement cheapestElement = null;

        for (WebElement element : prices) {

            StringBuilder sb = new StringBuilder(element.getText());
            sb.deleteCharAt(0);
            String price = sb.toString();
            System.out.println(price);
            double doublePrice = Double.parseDouble(price);
            if (doublePrice > max) {
                max = doublePrice;
                cheapestElement = element;
            }
        }
    }

    public PhoneCases(){
        PageFactory.initElements(driver, this);
    }

}