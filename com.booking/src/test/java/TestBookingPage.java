import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;

public class TestBookingPage extends Homepage {

    @Test
    public void testTorontoStay() {
        Homepage homepage = new Homepage();
        String destination = "Toronto";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        String actualLocation = homepage.locationText.getText();
        System.out.println(actualLocation);
        String expectedLocation = excel.readStringList("Locations").get(0);
        System.out.println(expectedLocation);
        Assert.assertTrue(actualLocation.contains(expectedLocation));

//        Assert.assertEquals(getElementText(homepage.getLocationText()), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testNewYorkStay() {
        Homepage homepage = new Homepage();
        String destination = "New York";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }
        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testCaliforniaStay() {
        Homepage homepage = new Homepage();
        String destination = "California";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testLondonStay() {
        Homepage homepage = new Homepage();
        String destination = "Greater London";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testParisStay() {
        Homepage homepage = new Homepage();
        String destination = "Paris";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testMadridStay() {
        Homepage homepage = new Homepage();
        String destination = "Madrid";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testMilanStay() {
        Homepage homepage = new Homepage();
        String destination = "Milan";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testBarcelonaStay() {
        Homepage homepage = new Homepage();
        String destination = "Barcelona";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testLisbonStay() {
        Homepage homepage = new Homepage();
        String destination = "Lisbon";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testRomeStay() {
        Homepage homepage = new Homepage();
        String destination = "Rome";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testManchesterStay() {
        Homepage homepage = new Homepage();
        String destination = "Manchester";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testNewcastleStay() {
        Homepage homepage = new Homepage();
        String destination = "Newcastle";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testSydneyStay() {
        Homepage homepage = new Homepage();
        String destination = "Sydney";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testPerthStay() {
        Homepage homepage = new Homepage();
        String destination = "Perth";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testLiverpoolStay() {
        Homepage homepage = new Homepage();
        String destination = "Liverpool";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

    @Test(enabled = false)
    public void testBerlinStay() {
        Homepage homepage = new Homepage();
        String destination = "Berlin";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.staysSearchConfirmation), excel.readStringList("Locations").get(0));
    }

}