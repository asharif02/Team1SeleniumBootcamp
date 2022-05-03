package app.pom;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class Homepage extends BasePage {

    @FindBy(xpath = "//button[@name='Models Flyout']")
    public WebElement modelsFlyoutButton;

    @FindBy(xpath = "//li[@data-child-filter='all models']//button")
    public WebElement allModelsButton;

    @FindBy(xpath = "//div[@data-filter='all models']//*[contains(text(), 'All Models')]")
    public WebElement allModelsHeadline;

    @FindBy(xpath = "//li[@data-child-filter='savs']//button")
    public WebElement savsButton;

    @FindBy(xpath = "//*[contains(text(), 'Sports Activity Vehicles')]")
    public WebElement savsHeadline;

    @FindBy(xpath = "//li[@data-child-filter='sedans']//button")
    public WebElement sedansButton;

    @FindBy(xpath = "//*[contains(text(), 'Sedans & Gran Coupes')]")
    public WebElement sedansHeadline;

    @FindBy(xpath = "//li[@data-child-filter='coupes']//button")
    public WebElement coupesButton;

    @FindBy(xpath = "//div[@data-filter='coupes']//*[contains(text(), 'Coupes')]")
    public WebElement coupesHeadline;

    @FindBy(xpath = "//li[@data-child-filter='convertibles']//button")
    public WebElement convertiblesButton;

    @FindBy(xpath = "//div[@data-filter='convertibles']//*[contains(text(), 'Convertibles')]")
    public WebElement convertiblesHeadline;

    @FindBy(xpath = "//div[@data-filter='all models']//div[@class='globalnav-primary-vehicles__car']")
//    @FindBy(xpath = "//div[@data-filter='all models']//div[@class='globalnav-primary-vehicles__car']//div[text()= '%s']")
    public List<WebElement> allBMWModels;

    @FindBy(xpath = "//div[@data-filter='savs']//div[@class='globalnav-primary-vehicles__car']")
    public List<WebElement> allSAVModels;

    @FindBy(xpath = "//div[@data-filter='sedans']//div[@class='globalnav-primary-vehicles__car']")
    public List<WebElement> allSedanModels;

    @FindBy(xpath = "//div[@data-filter='coupes']//div[@class='globalnav-primary-vehicles__car']")
    public List<WebElement> allCoupeModels;

    @FindBy(xpath = "//div[@data-filter='convertibles']//div[@class='globalnav-primary-vehicles__car']")
    public List<WebElement> allConvertibleModels;

    @FindBy(xpath = "//div[@data-filter='all models']//div[@class='globalnav-primary-vehicles__car']//img[@alt='A BMW i7 Electric Vehicle']")
    public WebElement comingSooni7Option;

    @FindBy(xpath = "//div[@data-filter='all models']//div[@class='globalnav-primary-vehicles__car']//div//span")
    public WebElement mModelsButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToBMWAllModels() {
        Homepage homepage = new Homepage();
        homepage.hoverOverModelsFlyoutButton();
        homepage.clickModelsFlyoutButton();
    }

    public void chooseBMWModel(String modelName) {
        navigateToBMWAllModels();
        webDriverWait.until(ExpectedConditions.visibilityOf(comingSooni7Option));

        if(modelName == "m" || modelName == "M") {
            clickOnElement(mModelsButton);
        } else if (modelName.startsWith("x") || modelName.startsWith("X") || modelName.startsWith("z")
                || modelName.startsWith("Z")) {
            WebElement desiredModel = getClickableElement(By.xpath
                    (String.format("//div[@data-filter='all models']//div[@class='globalnav-primary-vehicles__car']" +
                            "//div[text()=\"%s\"]", modelName.toUpperCase())));
            clickOnElement(desiredModel);
        } else if (modelName.startsWith("i") || modelName.startsWith("I")) {
            String i = "i";
            String str = new String(modelName);
            String lastLetter = String.valueOf(str.charAt(str.length()-1));
            modelName = i + lastLetter.toUpperCase();

            WebElement desiredModel = getClickableElement(By.xpath
                    (String.format("//div[@data-filter='all models']//div[@class='globalnav-primary-vehicles__car']" +
                            "//div[contains(text(), \"%s\")]", modelName)));
            clickOnElement(desiredModel);
        } else {
            WebElement desiredModel = getClickableElement(By.xpath
                    (String.format("//div[@data-filter='all models']//div[@class='globalnav-primary-vehicles__car']" +
                            "//div[text()=\"%s\"]", modelName)));
            clickOnElement(desiredModel);
        }

        try {
            ModelPage modelPage = new ModelPage();
            modelPage.waitForModelNameAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // does not work, see method above
    public void navigateToBMWModelByName(String modelName) {
        navigateToBMWAllModels();
        webDriverWait.until(ExpectedConditions.visibilityOf(allModelsHeadline));

        List<WebElement> models = allBMWModels;

        try {
            for (WebElement model : models) {
                if (model.getAttribute("innerHTML").toLowerCase().contains(modelName)) {
                    model.click();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ModelPage modelPage = new ModelPage();
            modelPage.waitForModelNameAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectRandomBMWModel() {
        Homepage homepage = new Homepage();
        homepage.hoverOverModelsFlyoutButton();
        homepage.clickModelsFlyoutButton();

        List<WebElement> models = allBMWModels;
        int maxModels = models.size();

        Random random = new Random();
        int randomModel = random.nextInt(maxModels);
        models.get(randomModel).click();

        try {
            ModelPage modelPage = new ModelPage();
            modelPage.waitForModelNameAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToBMWSAVs() {
        Homepage homepage = new Homepage();
        homepage.hoverOverModelsFlyoutButton();
        homepage.clickModelsFlyoutButton();
        homepage.clickSAVsButton();
    }

    public void selectRandomBMWSportsActivityVehicle() {
        navigateToBMWSAVs();
        webDriverWait.until(ExpectedConditions.visibilityOf(savsHeadline));

        List<WebElement> savs = allSAVModels;
        int maxSAVs = savs.size();

        Random random = new Random();
        int randomSAV = random.nextInt(maxSAVs);
        savs.get(randomSAV).click();

        try {
            ModelPage modelPage = new ModelPage();
            modelPage.waitForModelNameAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToBMWSedans() {
        Homepage homepage = new Homepage();
        homepage.hoverOverModelsFlyoutButton();
        homepage.clickModelsFlyoutButton();
        homepage.clickSedansButton();
    }

    public void selectRandomBMWSedan() {
        navigateToBMWSedans();
        webDriverWait.until(ExpectedConditions.visibilityOf(sedansHeadline));

        List<WebElement> sedans = allSedanModels;
        int maxSedans = sedans.size();

        Random random = new Random();
        int randomSedan = random.nextInt(maxSedans);
        sedans.get(randomSedan).click();

        try {
            ModelPage modelPage = new ModelPage();
            modelPage.waitForModelNameAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToBMWCoupes() {
        Homepage homepage = new Homepage();
        homepage.hoverOverModelsFlyoutButton();
        homepage.clickModelsFlyoutButton();
        homepage.clickCoupesButton();
    }

    public void selectRandomBMWCoupe() {
        navigateToBMWCoupes();
        webDriverWait.until(ExpectedConditions.visibilityOf(coupesHeadline));

        List<WebElement> coupes = allCoupeModels;
        int maxCoupes = coupes.size();

        Random random = new Random();
        int randomCoupe = random.nextInt(maxCoupes);
        coupes.get(randomCoupe).click();

        try {
            ModelPage modelPage = new ModelPage();
            modelPage.waitForModelNameAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToBMWConvertibles() {
        Homepage homepage = new Homepage();
        homepage.hoverOverModelsFlyoutButton();
        homepage.clickModelsFlyoutButton();
        homepage.clickConvertiblesButton();
    }

    public void selectRandomBMWConvertible() {
        navigateToBMWConvertibles();
        webDriverWait.until(ExpectedConditions.visibilityOf(convertiblesHeadline));

        List<WebElement> convertibles = allConvertibleModels;
        int maxConvertibles = convertibles.size();

        Random random = new Random();
        int randomConvertible = random.nextInt(maxConvertibles);
        convertibles.get(randomConvertible).click();

        try {
            ModelPage modelPage = new ModelPage();
            modelPage.waitForModelNameAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToMSeries() {
        navigateToBMWAllModels();
        webDriverWait.until(ExpectedConditions.visibilityOf(allModelsHeadline));
        clickOnElement(mModelsButton);

        try {
            ModelPage modelPage = new ModelPage();
            modelPage.waitForModelNameAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverOverModelsFlyoutButton() {
        hoverOverElement(modelsFlyoutButton);
    }

    public void clickModelsFlyoutButton() {
        clickOnElement(modelsFlyoutButton);
    }

    public void hoverOverSAVsButton() {
        hoverOverElement(savsButton);
    }

    public void clickSAVsButton() {
        clickOnElement(savsButton);
    }

    public void clickSedansButton() {
        clickOnElement(sedansButton);
    }

    public void clickCoupesButton() {
        clickOnElement(coupesButton);
    }

    public void clickConvertiblesButton() {
        clickOnElement(convertiblesButton);
    }
}
