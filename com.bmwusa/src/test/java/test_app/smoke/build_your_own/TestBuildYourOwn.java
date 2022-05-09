package test_app.smoke.build_your_own;

import app.pom.BuildYourOwn;
import app.pom.DesignPage;
import app.pom.Homepage;
import base_test.BaseTest;
import org.testng.annotations.Test;

public class TestBuildYourOwn extends BaseTest {

    @Test
    public void testBuildMSeries() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.navigateToBuildYourOwnPage();
        BuildYourOwn byo = new BuildYourOwn();
        byo.selectMSeries();
        DesignPage designPage = new DesignPage();
        Thread.sleep(2500);

    }

    @Test
    public void testBuildCustomVehicle() {
        Homepage homepage = new Homepage();
        homepage.navigateToBuildYourOwnPage();
        BuildYourOwn byo = new BuildYourOwn();
        byo.selectARandomModelSeries();

    }
}
