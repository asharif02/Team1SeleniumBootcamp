package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPropertyType extends BaseTest {

    @Test
    public void testSearchForAnyPropertyType() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyPropertyType("vacation homes");
        Thread.sleep(2500);

    }

}
