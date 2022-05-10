package test_app.smoke.end_to_end;

import app.pom.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import utils.GenerateData;

public class TestEndToEnd extends TestBasePage {

    @Test
    public void testEndToEndProcessVerifyOrder() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.setProductQuantity(2);
        catalog.selectSize(0);
        catalog.pressAddToCartButton();
        catalog.clickCheckoutButton();
        catalog.clickConfirmShoppingCart();
        catalog.clickAddressConfirmation();
        catalog.checkToAgreeTermsConditions();
        catalog.clickDeliveryOptionConfirmation();
        catalog.clickBankWireOption();
        catalog.clickOrderConfirmationButton();
        catalog.clickBackToOrdersButton();
        catalog.clickOrderRef();

        Assert.assertTrue(isElementVisible(catalog.orderRef));
    }
    @Test
    public void testEndToEndProcessViewWishlist() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        MyAccount myAccount = createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        myAccount.viewWishlist();

        Assert.assertTrue(isElementVisible(myAccount.wishlistConfirmation));
        Assert.assertEquals(getElementText(myAccount.wishlistConfirmation), excel.readStringList("EndToEnd").get(0));
    }
    @Test
    public void testEndToEndProcessPersonalInfo() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        MyAccount myAccount = createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        myAccount.viewMyPersonalInfo();

        Assert.assertTrue(isElementVisible(myAccount.personalInfoConfirmation));
        Assert.assertEquals(getElementText(myAccount.personalInfoConfirmation), excel.readStringList("EndToEnd").get(1));
    }
    @Test
    public void testEndToEndProcessViewAddress() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        MyAccount myAccount = createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        myAccount.viewMyAddress();

        Assert.assertTrue(isElementVisible(myAccount.addressConfirmation));
        Assert.assertEquals(getElementText(myAccount.addressConfirmation), excel.readStringList("EndToEnd").get(2));
    }
    @Test
    public void testEndToEndProcessViewCreditSlips() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        MyAccount myAccount = createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        myAccount.viewMyCreditSlips();

        Assert.assertTrue(isElementVisible(myAccount.creditSlipConfirmation));
        Assert.assertEquals(getElementText(myAccount.creditSlipConfirmation), excel.readStringList("EndToEnd").get(3));
    }
    @Test
    public void testEndToEndProcessViewItemsThatAreColorBlack() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectBlackOption();
        webDriverWait.until(ExpectedConditions.invisibilityOf(catalog.loadingCircle));
//        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectBlackOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(0));
    }
    @Test
    public void testEndToEndProcessViewItemsThatAreSizeSmall() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickSmallFilter();
        webDriverWait.until(ExpectedConditions.invisibilityOf(catalog.loadingCircle));
//        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(13));
    }
    @Test
    public void testEndToEndProcessViewItemsThatAreStyleCasual() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickCasualOption();
        webDriverWait.until(ExpectedConditions.invisibilityOf(catalog.loadingCircle));
//        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(8));
    }
    @Test
    public void testEndToEndProcessViewItemsThatAreComposedOfCotton() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickCottonFilter();
        webDriverWait.until(ExpectedConditions.invisibilityOf(catalog.loadingCircle));
//        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(21));
    }
    @Test
    public void testEndToEndProcessViewItemsThatAreConditionNew() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickNewConditionFilter();
        webDriverWait.until(ExpectedConditions.invisibilityOf(catalog.loadingCircle));
//        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(26));
    }
}