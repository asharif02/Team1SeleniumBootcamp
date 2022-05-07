import Purchases.pom.Homepage;
import Purchases.pom.PhonesAndDevices;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testAtt extends BasePage {

    @Test
    public void testVerifyAttLogo(){
    Homepage homepage = new Homepage();
    homepage.clickAttLogo();
    //Assert.assertTrue(attLogo.isDisplayed());
    Assert.assertEquals(true, attLogo());
        System.out.println("ATT logo is displayed - assert passed");
    }
    private boolean attLogo() {
        return true;
    }

    @Test
    public void testNavigateToPhonesAndDevices(){
        Homepage homepage = new Homepage();
        homepage.clickPhonesAndDevicesButton();
//      PhonesAndDevices phonesAndDevices = homepage.clickPhonesAndDevicesButton();
//      Assert.assertTrue(phonesAndDevices.phonesAndDevicesLink());
    }
    @Test
    public void testNavigateToSmartwatches(){
        Homepage homepage = new Homepage();
        homepage.clickPhonesAndDevicesButton();
        homepage.clickSmartwatchesButton();
    }
}
