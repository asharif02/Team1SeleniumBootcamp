package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//*[@id=\"navChecking\"]")
    public WebElement checkingButton;

    @FindBy (xpath = "//*[@id=\"navSavings\"]")
    public WebElement savingsButton;

    @FindBy (xpath = "//*[@id=\"navCreditCards\"]")
    public WebElement creditCardsButton;

    @FindBy (xpath = "//*[@id=\"navHomeLoans\"]")
    public WebElement homeLoansButton;

    @FindBy (xpath = "//*[@id=\"navAutoLoans\"]")
    public WebElement autoLoans;

    @FindBy (xpath = "//*[@id=\"navInvesting\"]")
    public WebElement investingButton;

    @FindBy (xpath = "//*[@id=\"navBetterMoneyHabits\"]")
    public WebElement betterMoneyHabitsButton;

    @FindBy (xpath = "//*[@id=\"NAV_HELP\"]")
    public WebElement helpButton;

    @FindBy (xpath = "//*[@id=\"finCenterLocator\"]")
    public WebElement findClosestAtmButton;

    @FindBy (xpath = "//*[@id=\"skip-to-h1\"]")
    public WebElement AtmAssert;

    @FindBy (xpath = "//*[@id=\"open\"]")
    public WebElement openAnAccountButton;

    @FindBy (xpath = "//*[@id=\"main\"]/div/div[1]/h1")
    public WebElement accountOpen;

    @FindBy (xpath = "//*[@id=\"Card_GetStarted_2017mOAA2RS\"]")
    public WebElement gettingStartedCreditCards;

    @FindBy (xpath = "//*[@id=\"skip-to-h1\"]")
    public  WebElement creditCardHeading;

    @FindBy (xpath = "//*[@id=\"Edge_GetStarted_2017mOAA2RS\"]")
    public WebElement merrillInvestingButton;

    @FindBy (xpath = "//*[@id=\"ctl00_ctl00_siteContent_MainContent_SimpleContentControl1_ctl00_ecmsWPRECMSContentCtrl1\"]/div[2]/div[3]/h2")
    public WebElement merillInvestingAssert;

    @FindBy (xpath = "//*[@id=\"AutoLoans_GetStarted_2017mOAA2RS\"]")
    public WebElement getAutoLoansLink;

    @FindBy (xpath = "//*[@id=\"CheckingSavings_GetStarted_2017mOAA2RS\"]")
    public WebElement checkingAndSavingsLink;

    @FindBy (xpath = "//*[@id=\"masthead\"]/div/div[1]/div/h1")
    public WebElement checkingAndSavingsAssert;

    @FindBy (xpath = "//*[@id=\"Footer_Privacy\"]")
    public WebElement privacyLink;

    @FindBy (xpath = "//*[@id=\"reviewOnlinePrivacyNotice\"]")
    public WebElement privacyAssert;

    @FindBy (xpath = "//*[@id=\"Footer_Security\"]")
    public WebElement securityPageLink;

    @FindBy (xpath = "//*[@id=\"topPriorityModule\"]/div[1]/div/h2")
    public WebElement securityPriorityAssert;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickCheckingButton(){clickOnElement(checkingButton);}

    public void clickSavingsButton(){clickOnElement(savingsButton);}

    public void clickCreditCardsButton(){clickOnElement(creditCardsButton);}

    public void clickHomeLoansButton(){clickOnElement(homeLoansButton);}

    public void clickAutoLoansButton(){clickOnElement(autoLoans);}

    public void clickInvestingButton(){clickOnElement(investingButton);}

    public void clickBetterMoneyHabitsButton(){clickOnElement(betterMoneyHabitsButton);}

    public void clickOnHelpButton(){clickOnElement(helpButton);}

    public void openingAnAccount(){clickOnElement(openAnAccountButton);}

    public void navigateToGettingStartedWithCreditCards(){clickOnElement(gettingStartedCreditCards);}

    }
