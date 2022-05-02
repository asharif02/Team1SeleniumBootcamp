package test_app.smoke;

import app.pom.Homepage;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestBMWModels extends BaseTest {

    @Test
    public void testBuildYourOwnBMW() {

        // TBD

    }

    @Test
    public void testNavigateToRandomBMWModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWModel();
    }

    @Test void testNavigateToRandomSAVModel() {
        Homepage homepage = new Homepage();
        homepage.navigateToBMWSAVs();
        homepage.selectRandomBMWSportsActivityVehicle();
    }

    @Test
    public void testNavigateToRandomSedanModel() {
        Homepage homepage = new Homepage();
        homepage.navigateToBMWSedans();
        homepage.selectRandomBMWSedan();
    }

    @Test
    public void testNavigateToRandomCoupeModel() {
        Homepage homepage = new Homepage();
        homepage.navigateToBMWCoupes();
        homepage.selectRandomBMWCoupe();
    }

    @Test
    public void testNavigateToRandomConvertibleModel() {
        Homepage homepage = new Homepage();
        homepage.navigateToBMWConvertibles();
        homepage.selectRandomBMWConvertible();
    }


//    @Test
//    public void testNavigateToX1Series() {
//        Homepage homepage = new Homepage();
//        homepage.hoverOverModelsFlyoutButton();
//        homepage.clickModelsFlyoutButton();
//    }
}
