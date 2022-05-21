package test_app.smoke;

import app.pom.NBATeamPage;
import app.shared.SystemBar;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base_test.BaseTest;
import test_app.system.EspnData;

import java.util.Arrays;

public class TestNBATeams extends BaseTest {

//    @DataProvider(name = "nbaTeams")
//    public Object[][] getNBATeam() {
////        return new Object[][] {{"atlanta", "hawks"}, {"boston", "celtics"}};
//        return excel.readStringArrays("nbaCityNameTeamName");
//    }

    @Test(dataProviderClass = test_app.system.EspnData.class, dataProvider = "NBA")
    public void testNavigateToNBATeamUsingDataProvider(String city, String team) {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateToNBATeam(city, team);

//        String expectedResult = excel.readStringList("nbaPage").get(0);
//        String actualResult = driver.findElement(By.xpath("//li[@class='Nav__Primary__Menu__Item flex items-center relative Nav__Primary__Menu__Item--active']//span")).getText();
//
//        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(enabled = false)
    public void testNavigateToRandomNBATeam() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.selectRandomNBATeam();

        String expectedResult = excel.readStringList("nbaPage").get(0);
        String actualResult = driver.findElement(By.xpath("//li[@class='Nav__Primary__Menu__Item flex items-center relative Nav__Primary__Menu__Item--active']//span")).getText();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testNavigateByTeamName() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Knicks");
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='Nav__Primary__Menu__Item flex items-center relative Nav__Primary__Menu__Item--active']//span")));

        String expectedResult = excel.readStringList("nbaPage").get(0);
//        String actualResult = nbaTeamPage.getElementText(nbaTeamPage.nbaText);
        String actualResult = driver.findElement(By.xpath("//li[@class='Nav__Primary__Menu__Item flex items-center relative Nav__Primary__Menu__Item--active']//span")).getText();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testNavigateByCityName() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBACityName("New York");

        String expectedResult = excel.readStringList("nbaPage").get(0);
        String actualResult = driver.findElement(By.xpath("//li[@class='Nav__Primary__Menu__Item flex items-center relative Nav__Primary__Menu__Item--active']//span")).getText();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    // region 30 NBA Teams
    @Test(enabled = false)
    public void testNavigateToAtlantaHawks() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Hawks");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(0).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToBostonCeltics() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Celtics");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(1).toLowerCase();

        System.out.println("Actual Result: " + teamName);
        System.out.println("Expected Result: " + expectedResult);

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToBrooklynNets() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Nets");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(2).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToCharlotteHornets() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Hornets");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(3).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToChicagoBulls() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Bulls");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(4).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToClevelandCavaliers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Cavaliers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(5).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToDallasMavericks() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Mavericks");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(6).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToDenverNuggets() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Nuggets");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(7).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToDetroitPistons() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Pistons");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(8).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToGoldenStateWarriors() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Warriors");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(9).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToHoustonRockets() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Rockets");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(10).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToIndianaPacers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Pacers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(11).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToLAClippers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Clippers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(12).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToLosAngelesLakers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Lakers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(13).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToMemphisGrizzlies() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Grizzlies");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(14).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToMiamiHeat() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Heat");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(15).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToMilwaukeeBucks() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Bucks");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(16).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToMinnesotaTimberwolves() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Timberwolves");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(17).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToNewOrleansPelicans() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Pelicans");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(18).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToNewYorkKnicks() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Knicks");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(19).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToOklahomaCityThunder() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Thunder");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(20).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToOrlandoMagic() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Magic");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(21).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToPhiladelphia76ers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("76ers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(22).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToPhoenixSuns() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Suns");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(23).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToPortlandTrailBlazers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Trail Blazers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(24).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToSacramentoKings() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Kings");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(25).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToSanAntonioSpurs() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Spurs");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(26).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToTorontoRaptors() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Raptors");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(27).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToUtahJazz() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Jazz");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(28).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test(enabled = false)
    public void testNavigateToWashingtonWizards() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Wizards");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(29).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }
    // endregion

}
