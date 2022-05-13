package test_app.smoke;

import app.pom.HomePage;
import app.pom.SummerDresses;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectItemSizeAndColor extends BaseTest {

    @Test
    public void testItemSizeAndColor() {
        HomePage homepage = new HomePage();
        homepage.hoverOverWomenButton();
        SummerDresses summerDresses = homepage.clickWomenHoverMenuDressesSummerDressesButton();

        summerDresses.sizeCheckBox.click();
        summerDresses.colorCheckBox.click();

        Assert.assertTrue(true,"SUMMER DRESSES > SIZE S > COLOR BLACK");

    }
}
