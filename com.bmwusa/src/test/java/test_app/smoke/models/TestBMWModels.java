package test_app.smoke.models;

import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import base_test.BaseTest;

public class TestBMWModels extends BaseTest {

    @Test
    public void navigateToAnyBMWModel() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("m series");

        // figure out how to assert with random data
    }

    // region Navigate to random BMW Model / Body Type
    @Test
    public void testNavigateToRandomBMWModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWModel();

        // figure out how to assert with random data
    }

    @Test
    public void testNavigateToRandomSedanModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWSedan();

        // figure out how to assert with random data
    }

    @Test
    public void testNavigateToRandomCoupeModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWCoupe();

        // figure out how to assert with random data
    }

    @Test
    public void testNavigateToRandomConvertibleModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWConvertible();

        // figure out how to assert with random data
    }

    @Test void testNavigateToRandomSAVModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWSportsActivityVehicle();

        // figure out how to assert with random data
    }
    // endregion

    // region BMW Models
    @Test
    public void testNavigateToX1() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x1");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(0));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToX2() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x2");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(1));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToX3() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x3");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(2));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToX4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x4");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(3));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToX5() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x5");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(4));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToX6() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x6");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(5));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToX7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x7");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(6));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateTo2Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("2");

        String expectedModel = excel.readStringList("bmwModels").get(7).toString();
        String newModel = String.valueOf(Integer.parseInt(expectedModel));
        System.out.println(newModel);
        System.out.println(expectedModel);
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);

        Assert.assertTrue(actualModel.contains(newModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateTo3Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("3");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(8));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateTo4Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("4");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(9));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateTo5Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("5");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(10));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateTo7Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("7");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(11));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateTo8Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("8");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(12));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToZ4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("z4");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(13));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToMSeries() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("m");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(14));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToiX() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("ix");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(15));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToi4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("i4");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(16));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test
    public void testNavigateToi7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("i7");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(17));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }
    // endregion

}
