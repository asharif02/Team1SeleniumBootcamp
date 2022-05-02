package test_app.smoke;

import app.pom.Homepage;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestBMWModels extends BaseTest {

//    @Test
//    public void testBuildYourOwnBMW() {
//
//        // TBD
//
//    }
//
//    @Test
//    public void navigateToAnyBMWModel() {
//        Homepage homepage = new Homepage();
//        homepage.navigateByBMWModelName("M");
//    }
//
    @Test
    public void testNavigateToRandomBMWModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWModel();
    }

    @Test void testNavigateToRandomSAVModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWSportsActivityVehicle();
    }

    @Test
    public void testNavigateToRandomSedanModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWSedan();
    }

    @Test
    public void testNavigateToRandomCoupeModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWCoupe();
    }

    @Test
    public void testNavigateToRandomConvertibleModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWConvertible();
    }

    // region BMW Models
    @Test
    public void testNavigateToX1() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("x1");
    }

    @Test
    public void testNavigateToX2() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("x2");
    }

    @Test
    public void testNavigateToX3() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("x3");
    }

    @Test
    public void testNavigateToX4() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("x4");
    }

    @Test
    public void testNavigateToX5() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("x5");
    }

    @Test
    public void testNavigateToX6() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("x6");
    }

    @Test
    public void testNavigateToX7() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("x7");
    }

//    @Test
//    public void testNavigateTo2Series() {
//        Homepage homepage = new Homepage();
//        homepage.navigateByBMWModelName("2");
//    }
//
//    @Test
//    public void testNavigateTo3Series() {
//        Homepage homepage = new Homepage();
//        homepage.navigateByBMWModelName("3");
//    }
//
//    @Test
//    public void testNavigateTo4Series() {
//        Homepage homepage = new Homepage();
//        homepage.navigateByBMWModelName("4");
//    }
//
//    @Test
//    public void testNavigateTo5Series() {
//        Homepage homepage = new Homepage();
//        homepage.navigateByBMWModelName("5");
//    }
//
//    @Test
//    public void testNavigateTo7Series() {
//        Homepage homepage = new Homepage();
//        homepage.navigateByBMWModelName("7");
//    }
//
//    @Test
//    public void testNavigateTo8Series() {
//        Homepage homepage = new Homepage();
//        homepage.navigateByBMWModelName("8");
//    }

    @Test
    public void testNavigateToZ4() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("z4");
    }

//    @Test
//    public void testNavigateToMSeries() {
//        Homepage homepage = new Homepage();
//        homepage.navigateByBMWModelName("m models");
//    }

    @Test
    public void testNavigateToi4() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("i4");
    }

    @Test
    public void testNavigateToi7() {
        Homepage homepage = new Homepage();
        homepage.navigateByBMWModelName("i7");
    }
    // endregion

}
