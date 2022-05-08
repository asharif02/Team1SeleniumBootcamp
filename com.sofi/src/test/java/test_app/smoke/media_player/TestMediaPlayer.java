package test_app.smoke.media_player;

import app.pom.Homepage;
import base_test.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestMediaPlayer extends BaseTest {

    // embedded video player located on SoFi Homepage
    @Test
    public void testSoFiMoviePlayer() {
        Homepage homepage = new Homepage();
        homepage.playSoFiVideo();
        homepage.playVideoForSpecificAmountOfSeconds("15");
    }
}
