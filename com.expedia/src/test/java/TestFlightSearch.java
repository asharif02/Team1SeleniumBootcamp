import base.BasePage;
import org.testng.annotations.Test;
import pom.Flights;
import pom.HomePage;

import java.time.Duration;

public class TestFlightSearch extends BasePage {

    @Test
    public void testSearchForFlight() throws InterruptedException {
        HomePage homePage = new HomePage();
        Flights flights = homePage.clickFlightsButton();
        flights.clickLeavingFromButton();
        flights.sendTextToWhereAreYouLeavingFromInputField("SFO");
        flights.selectAirportFormSearchListByIndex(0);

        flights.clickGoingToButton();
        flights.sendTextToGoingToInputField("Algiers");
        flights.selectAirportFormSearchListByIndex(0);
    }
}
