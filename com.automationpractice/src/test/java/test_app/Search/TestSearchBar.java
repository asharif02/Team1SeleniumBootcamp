package test_app.Search;

import app.pom.HomePage;
import app.pom.Login;
import base_test.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchBar extends BaseTest {

    @Test
    public void testSearchBar() {
        HomePage homepage = new HomePage();
        Login login = homepage.clickLoginButton();
        login.emailInputBox.sendKeys("malik123@gmail.com");
        login.passwordInputBox.sendKeys("malik123");

        login.searchBar.sendKeys("dresses");
        login.searchBar.sendKeys(Keys.ENTER);

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dresses&submit_search=" );

    }
}
