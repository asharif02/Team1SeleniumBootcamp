package shared;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pom.InventoryPage;
import pom.ShoppingPage;
import pom.VehiclePage;

public class MercedesNavigationPage extends Homepage{

    public MercedesNavigationPage (){
        PageFactory.initElements(driver, this);
    }

    public VehiclePage navigateVehicleOptions(String options){
        driver.findElement(By.xpath(String.format("//div[@class=\"global-header__vehicles-link-list\"]" +
                "//a[contains(text(),'%s')]", options))).click();

        return new VehiclePage();
    }

    public ShoppingPage navigateShoppingOptions(String options){
        driver.findElement(By.xpath(String.format("//ul[@class='global-header__menu-l3-panel-list " +
                "global-header__menu-l3-panel-list--shopping global-header__menu-l3__container-spacing']" +
                "//a[contains(text(),'%s')]", options))).click();

        return new ShoppingPage();
    }

    public InventoryPage navigateInventoryOptions(String options){
        driver.findElement(By.xpath(String.format("//ul[@class='global-header__menu-l3-panel-list " +
                "global-header__menu-l3-panel-list--additional global-header__menu-l3__container-spacing']" +
                "//a[contains(text(),'%s')]", options))).click();

        return new InventoryPage();
    }
}