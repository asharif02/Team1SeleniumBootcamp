package test_app.smoke.models;

import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base_test.BaseTest;

import java.util.List;

public class TestBMWModels extends BaseTest {

    @Test
    public void navigateToAnyBMWModel() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("m series");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(14));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    // region Navigate to random BMW Model / Body Type
    @Test(enabled = false)
    public void testNavigateToRandomBMWModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWModel();

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(22));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToRandomSedanModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWSedan();

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(18));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToRandomCoupeModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWCoupe();

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(20));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToRandomConvertibleModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWConvertible();

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(21));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToRandomSAVModel() {
        Homepage homepage = new Homepage();
        homepage.selectRandomBMWSportsActivityVehicle();

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(19));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }
    // endregion

    // region BMW Models
    @Test(enabled = false)
    public void testNavigateToX1() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x1");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(0));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToX2() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x2");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(1));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToX3() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x3");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(2));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToX4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x4");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(3));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToX5() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x5");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(4));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToX6() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x6");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(5));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToX7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x7");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(6));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateTo2Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("2");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(7).charAt(0));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateTo3Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("3");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(8).charAt(0));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateTo4Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("4");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(9).charAt(0));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateTo5Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("5");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(10).charAt(0));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateTo7Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("7");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(11).charAt(0));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateTo8Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("8");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(12).charAt(0));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToZ4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("z4");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(13));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToMSeries() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("m");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(14));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToiX() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("ix");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(15));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
    public void testNavigateToi4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("i4");

        String expectedModel = String.valueOf(excel.readStringList("bmwModels").get(16));
        String actualModel = String.valueOf(driver.getTitle());
        System.out.println(actualModel);
        System.out.println(expectedModel);

        Assert.assertTrue(actualModel.contains(expectedModel), "Actual Model does not match Expected Model");
    }

    @Test(enabled = false)
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
