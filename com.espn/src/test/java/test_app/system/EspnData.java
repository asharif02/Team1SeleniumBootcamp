package test_app.system;

import base_test.BaseTest;
import org.testng.annotations.DataProvider;

import java.util.List;

public class EspnData extends BaseTest {

    @DataProvider (name = "NBA")
    public static Object[][] getNBATeam() {
        return excel.readStringArrays("nbaCityNameTeamName");
    }
}
