package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domsnapshot.model.StringIndex;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class FlightsResults extends SystemBar {

    @FindBy(xpath = "//div[@class='uitk-text uitk-type-start truncate uitk-type-500 uitk-type-medium uitk-text-default-theme']")
    public WebElement searchResultFromToLink;

    public String getSearchResultFromTo(){
        String fromToText = getTrimmedElementText(searchResultFromToLink);
        String [] textToArray = fromToText.split(" ");
        return getSearchResultFromTo();
    }

    public FlightsResults(){
        PageFactory.initElements(driver, this);
    }

}
