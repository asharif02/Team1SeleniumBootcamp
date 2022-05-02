package test_app.smoke.navigation;

import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestNBANavigation extends BaseTest {

    @Test
    public void testSelectRandomNBATeam() {
        Homepage homepage = new Homepage();
        homepage.selectRandomNBATeam();
    }

    @Test
    public void testNavigateToAnyNBATeamByTeamName() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Nuggets");
    }

    @Test
    public void testNavigateToAnyNBATeamByCityName() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBACityName("Boston");
    }

    // region 30 NBA Teams
    @Test
    public void testNavigateToAtlantaHawks() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Hawks");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(0).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToBostonCeltics() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Celtics");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(1).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToBrooklynNets() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Nets");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(2).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToCharlotteHornets() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Hornets");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(3).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToChicagoBulls() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Bulls");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(4).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToClevelandCavaliers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Cavaliers");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(5).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToDallasMavericks() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Mavericks");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(6).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToDenverNuggets() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Nuggets");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(7).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToDetroitPistons() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Pistons");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(8).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToGoldenStateWarriors() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Warriors");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(9).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToHoustonRockets() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Rockets");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(10).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToIndianaPacers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Pacers");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(11).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToLAClippers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Clippers");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(12).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToLosAngelesLakers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Lakers");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(13).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToMemphisGrizzlies() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Grizzlies");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(14).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToMiamiHeat() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Heat");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(15).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToMilwaukeeBucks() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Bucks");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(16).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToMinnesotaTimberwolves() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Timberwolves");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(17).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToNewOrleansPelicans() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Pelicans");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(18).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToNewYorkKnicks() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Knicks");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(19).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToOklahomaCityThunder() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Thunder");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(20).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToOrlandoMagic() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Magic");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(21).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToPhiladelphia76ers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("76ers");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(22).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToPhoenixSuns() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Suns");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(23).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToPortlandTrailBlazers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Trail Blazers");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(24).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToSacramentoKings() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Kings");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(25).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToSanAntonioSpurs() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Spurs");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(26).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToTorontoRaptors() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Raptors");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(27).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToUtahJazz() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Jazz");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(28).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToWashingtonWizards() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Wizards");

        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("Sheet2").get(29).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }
    // endregion

}
