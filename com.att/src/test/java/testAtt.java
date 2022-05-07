import Purchases.pom.Homepage;
import Purchases.pom.PhonesAndDevices;
import base.BasePage;
import org.testng.annotations.Test;

public class testAtt extends BasePage {

    @Test
    public void testNavigateToPhonesAndDevices(){
        Homepage homepage = new Homepage();
        homepage.clickPhonesAndDevicesButton();
      //  PhonesAndDevices phonesAndDevices = homepage.PhonesAndDevices();
      //  phonesAndDevices.phonesAndDevicesLink();
    }
}
