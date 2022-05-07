package pom;

import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class ShopByCategory extends SystemBar {

    public ShopByCategory() {
        PageFactory.initElements(driver, this);
    }

    public ShopByCategory clickShopByCategoryDropdownButton() {
        clickOnElement(shopByCategoryDropdownButton);
        return new ShopByCategory();
    }
}