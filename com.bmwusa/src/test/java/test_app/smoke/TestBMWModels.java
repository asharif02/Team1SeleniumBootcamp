package test_app.smoke;

import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import base_test.BaseTest;

public class TestBMWModels extends BaseTest {

    @Test
    public void navigateToAnyBMWModel() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("m series");
    }

    // region Navigate to random BMW Model / Body Type
    @Test
    public void testNavigateToRandomBMWModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWModel();
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

    @Test void testNavigateToRandomSAVModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWSportsActivityVehicle();
    }
    // endregion

    // region BMW Models
    @Test
    public void testNavigateToX1() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x1");

//        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(0));
        String expectedModel = String.valueOf(excel.readStringArrays("bmwModels"));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

//        String test = excel.readStringList("bmwModels").get(0);
//        System.out.println(test);

//        System.out.println("Actual Result: " + actualModel);
//        System.out.println("Expected Result: " + expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }










    @Test
    public void testNavigateToX2() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x2");
    }

    @Test
    public void testNavigateToX3() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x3");
    }

    @Test
    public void testNavigateToX4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x4");
    }

    @Test
    public void testNavigateToX5() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x5");
    }

    @Test
    public void testNavigateToX6() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x6");
    }

    @Test
    public void testNavigateToX7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x7");
    }

    @Test
    public void testNavigateTo2Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("2");
    }

    @Test
    public void testNavigateTo3Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("3");
    }

    @Test
    public void testNavigateTo4Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("4");
    }

    @Test
    public void testNavigateTo5Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("5");
    }

    @Test
    public void testNavigateTo7Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("7");
    }

    @Test
    public void testNavigateTo8Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("8");
    }

    @Test
    public void testNavigateToZ4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("z4");
    }

    @Test
    public void testNavigateToMSeries() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("m");
    }

    @Test
    public void testNavigateToiX() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("ix");
    }

    @Test
    public void testNavigateToi4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("i4");
    }

    @Test
    public void testNavigateToi7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("i7");
    }
    // endregion

}
