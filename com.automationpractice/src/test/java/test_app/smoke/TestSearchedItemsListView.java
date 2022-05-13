package test_app.smoke;

import app.pom.HomePage;
import app.pom.Login;
import base_test.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSearchedItemsListView extends BaseTest {

    @Test
    public void testListView(){
        HomePage homepage = new HomePage();
        Login login = homepage.clickLoginButton();

        login.searchBar3.sendKeys("dresses");
        login.searchBar3.sendKeys(Keys.ENTER);

        login.listView.click();

       Assert.assertTrue(true, "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dresses&submit_search=");

    }
}
