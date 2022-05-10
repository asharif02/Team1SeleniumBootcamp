package test_app.system;

import app.pom.Homepage;
import app.pom.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;


public class Authentication extends TestBasePage {


    @Test (groups = {"BAT"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP1")
    public void testInvalidLogin(String username, String password) {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(username, password);
        String expectedText;

        if (isElementVisible(login.validEmailInputField)) {
            expectedText = "Invalid email address.";
        } else {
            expectedText = "Authentication failed.";
        }

        Assert.assertTrue(isElementVisible(login.errorMessageBanner)
                && (getElementText(login.errorMessageText).equals(expectedText)));
    }
}