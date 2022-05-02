package test_app.smoke.navigation;

import app.pom.Homepage;
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
    }

    @Test
    public void testNavigateToBostonCeltics() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Celtics");
    }

    @Test
    public void testNavigateToBrooklynNets() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Nets");
    }

    @Test
    public void testNavigateToCharlotteHornets() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Hornets");
    }

    @Test
    public void testNavigateToChicagoBulls() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Bulls");
    }

    @Test
    public void testNavigateToClevelandCavaliers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Cavaliers");
    }

    @Test
    public void testNavigateToDallasMavericks() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Mavericks");
    }

    @Test
    public void testNavigateToDenverNuggets() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Nuggets");
    }

    @Test
    public void testNavigateToDetroitPistons() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Pistons");
    }

    @Test
    public void testNavigateToGoldenStateWarriors() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Warriors");
    }

    @Test
    public void testNavigateToHoustonRockets() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Rockets");
    }

    @Test
    public void testNavigateToIndianaPacers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Pacers");
    }

    @Test
    public void testNavigateToLAClippers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Clippers");
    }

    @Test
    public void testNavigateToLosAngelesLakers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Lakers");
    }

    @Test
    public void testNavigateToMemphisGrizzlies() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Grizzlies");
    }

    @Test
    public void testNavigateToMiamiHeat() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Heat");
    }

    @Test
    public void testNavigateToMilwaukeeBucks() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Bucks");
    }

    @Test
    public void testNavigateToMinnesotaTimberwolves() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Timberwolves");
    }

    @Test
    public void testNavigateToNewOrleansPelicans() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Pelicans");
    }

    @Test
    public void testNavigateToNewYorkKnicks() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Knicks");
    }

    @Test
    public void testNavigateToOklahomaCityThunder() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Thunder");
    }

    @Test
    public void testNavigateToOrlandoMagic() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Magic");
    }

    @Test
    public void testNavigateToPhiladelphia76ers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("76ers");
    }

    @Test
    public void testNavigateToPhoenixSuns() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Suns");
    }

    @Test
    public void testNavigateToPortlandTrailBlazers() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Trail Blazers");
    }

    @Test
    public void testNavigateToSacramentoKings() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Kings");
    }

    @Test
    public void testNavigateToSanAntonioSpurs() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Spurs");
    }

    @Test
    public void testNavigateToTorontoRaptors() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Raptors");
    }

    @Test
    public void testNavigateToUtahJazz() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Jazz");
    }

    @Test
    public void testNavigateToWashingtonWizards() {
        Homepage homepage = new Homepage();
        homepage.navigateByNBATeamName("Wizards");
    }
    // endregion

//    @Test
//    public void testNavigateToCeltics() {
//        Homepage homepage = new Homepage();
//        homepage.hoverOverNBASportsMenu();
//        homepage.clickBostonCelticsTeam();
//
//        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
//        String expectedResult = excel.readStringList("nbaTeams").get(0).toLowerCase();
//
//        Assert.assertEquals(teamName, expectedResult);
//
//    }
//
//    @Test
//    public void testNavigateToNets()  {
//        Homepage homepage = new Homepage();
//        homepage.hoverOverNBASportsMenu();
//        homepage.clickBrooklynNetsTeam();
//
//        String teamName = homepage.nbaTeamName.getText().replace("\n", " ").toLowerCase();
//        String expectedResult = excel.readStringList("nbaTeams").get(1).toLowerCase();
//
//        Assert.assertEquals(teamName, expectedResult);
//
//    }
}
