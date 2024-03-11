package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HotelSearchResultsPageLocators;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HotelSearchResultsPageObject extends HotelSearchResultsPageLocators{
    WebDriverHelper webDriverHelper;

    String resultsPageLoaded="loaded Hotel Search Results Page";

    public void resultsPageLoaded(WebDriver driver, ExtentTest test)
    {
        try {
            webDriverHelper=new WebDriverHelper(driver);
            webDriverHelper.waitForElementToBeVisible(getAllHotelsHeader(), 20);
            test.log(Status.PASS, resultsPageLoaded);
            LoggerHandler.logInfo(resultsPageLoaded);
            Screenshot.getScreenShot(driver, "Hotel Search results page");
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+resultsPageLoaded);
            LoggerHandler.logError("not "+resultsPageLoaded);          
        }
    }
}
