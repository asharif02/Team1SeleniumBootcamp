package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;


public class DataProviders extends BasePage {

    @DataProvider (name = "DP1")
    public static Object[][] getValidEmailInvalidPasswordLoginData() {
        String sheetName = "EmailData";

        return excel.readStringArrays(sheetName);
    }

    @DataProvider(name = "nbaTeams")
    public Object[][] getNBATeam() {
//        return new Object[][] {{"atlanta", "hawks"}, {"boston", "celtics"}};
        return excel.readStringArrays("nbaCityNameTeamName");
    }

}