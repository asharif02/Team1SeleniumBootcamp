package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.Flights;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//a[@href='?pwaLob=wizard-hotel-pwa-v2']")
    public WebElement staysButton;

    @FindBy(xpath = "//a[@href='?pwaLob=wizard-flight-pwa']")
    public WebElement flightsButton;

    @FindBy(xpath = "//a[@href='?pwaLob=wizard-car-pwa']")
    public WebElement carsButton;

    @FindBy(xpath = "//a[@href='?pwaLob=wizard-package-pwa']")
    public WebElement packagesButton;

    @FindBy(xpath = "//a[@href='?pwaLob=wizard-lx-pwa']")
    public WebElement thingsToDoButton;

    @FindBy(xpath = "//a[@href='?pwaLob=wizard-cruise-pwa']")
    public WebElement cruisesButton;

    public SystemBar(){
        PageFactory.initElements(driver, this);

    }
    /**If I need to use this method, I have to create a class 'Stays':

     public Stays clickStaysButton(){
     clickOnElement(staysButton);
    return new Stays();
     }
     */

    public Flights clickFlightsButton(){
        clickOnElement(flightsButton);
        return new Flights();
    }
}   /**If I need to use this method, I have to create a class 'Cars':

     public Cars clickCarsButton(){
     clickOnElement(carsButton);
     return new Cars();
 }
    Same for Packages, ThingToDo and Cruises:

     public Packages clickPackagesButton(){
     clickOnElement(packagesButton);
     return new Packages();
 }
     public ThingsToDo clickThingToDoButton(){
     clickOnElement(thingsToDoButton);
     return new thingsToDo();
     }
     public Cruises clickCruisesButton(){
     clickOnElement(cruisesButton);
     return new cruises();
 }
 */

