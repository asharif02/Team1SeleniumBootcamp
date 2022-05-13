package app.shared;

import app.pom.Login;
import app.pom.SummerDresses;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a[@title='Women']")
    public WebElement womenButton;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement loginButton;

    @FindBy(xpath = "//ul[@style='display: block;']//a[@title='Summer Dresses']")
    public WebElement womenHoverMenuDressesSummerDressesButton;

    public Login clickLoginButton() {
        safeClickOnElement(loginButton);

        return new Login();
    }

    public void hoverOverWomenButton() {
        hoverOverElement(womenButton);
    }

    public SummerDresses clickWomenHoverMenuDressesSummerDressesButton() {
        safeClickOnElement(womenHoverMenuDressesSummerDressesButton);

        return new SummerDresses();
    }

    public SystemBar() {PageFactory.initElements(driver,this);}
}
