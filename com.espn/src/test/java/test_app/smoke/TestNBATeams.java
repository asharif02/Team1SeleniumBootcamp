package test_app.smoke;

import app.pom.NBATeamPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestNBATeams extends BaseTest {

    @Test
    public void testNavigateToRandomNBATeam() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.selectRandomNBATeam();
    }

    @Test
    public void testNavigateByTeamName() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Bulls");
    }

    @Test
    public void testNavigateByCityName() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBACityName("New York");
    }

    // try to clean up assertions'
    // region 30 NBA Teams
    @Test
    public void testNavigateToAtlantaHawks() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Hawks");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(0).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToBostonCeltics() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Celtics");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(1).toLowerCase();

        System.out.println("Actual Result: " + teamName);
        System.out.println("Expected Result: " + expectedResult);

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToBrooklynNets() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Nets");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(2).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToCharlotteHornets() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Hornets");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(3).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToChicagoBulls() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Bulls");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(4).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToClevelandCavaliers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Cavaliers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(5).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToDallasMavericks() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Mavericks");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(6).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToDenverNuggets() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Nuggets");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(7).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToDetroitPistons() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Pistons");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(8).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToGoldenStateWarriors() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Warriors");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(9).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToHoustonRockets() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Rockets");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(10).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToIndianaPacers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Pacers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(11).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToLAClippers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Clippers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(12).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToLosAngelesLakers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Lakers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(13).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToMemphisGrizzlies() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Grizzlies");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(14).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToMiamiHeat() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Heat");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(15).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToMilwaukeeBucks() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Bucks");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(16).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToMinnesotaTimberwolves() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Timberwolves");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(17).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToNewOrleansPelicans() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Pelicans");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(18).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToNewYorkKnicks() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Knicks");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(19).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToOklahomaCityThunder() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Thunder");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(20).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToOrlandoMagic() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Magic");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(21).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToPhiladelphia76ers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("76ers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(22).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToPhoenixSuns() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Suns");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(23).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToPortlandTrailBlazers() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Trail Blazers");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(24).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToSacramentoKings() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Kings");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(25).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToSanAntonioSpurs() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Spurs");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(26).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToTorontoRaptors() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Raptors");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(27).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToUtahJazz() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Jazz");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(28).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }

    @Test
    public void testNavigateToWashingtonWizards() {
        NBATeamPage nbaTeamPage = new NBATeamPage();
        nbaTeamPage.navigateByNBATeamName("Wizards");

        String teamName = nbaTeamPage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
        String expectedResult = excel.readStringList("nbaTeams").get(29).toLowerCase();

        Assert.assertEquals(teamName, expectedResult);
    }
    // endregion

}
