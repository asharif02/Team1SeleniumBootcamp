package test_app.smoke;

import app.pom.Homepage;
import base_test.BaseTest;
import org.testng.annotations.Test;

public class TestPropertyType extends BaseTest {

    @Test
    public void testSearchForAnyPropertyType() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.scrollUntilFirstCarouselItemSubTitleIsVisible();
        Thread.sleep(3000);

    }

}
