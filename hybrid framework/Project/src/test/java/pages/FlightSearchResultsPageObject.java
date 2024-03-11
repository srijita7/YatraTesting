package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.FlightSearchResultsPageLocators;
import utils.*;

public class FlightSearchResultsPageObject extends FlightSearchResultsPageLocators {

    WebDriverHelper webDriverHelper;

    String getStopsText = "fetched text from Stops span";
    String verifyText = "verified Stops text from Flight Search Results Page";

    public String getStopsText(WebDriver driver, ExtentTest test) {
        String text = "";
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getStopsSpan(), 10);
            text = webDriverHelper.getText(getStopsSpan());
            test.log(Status.PASS, getStopsText);
            LoggerHandler.logInfo(getStopsText);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + getStopsText);
            LoggerHandler.logError("not " + getStopsText);
        }
        return text;
    }

    public void verifyText(WebDriver driver, ExtentTest test, String actualText, String expectedText) {
        try {
            actualText = actualText.trim().substring(0, 5);
            Assert.assertEquals(expectedText, actualText);
            test.log(Status.PASS, verifyText);
            LoggerHandler.logInfo(verifyText);
            Screenshot.getScreenShot(driver, verifyText);
        } catch (Throwable e) {
            test.log(Status.FAIL, "not " + verifyText);
            LoggerHandler.logError("not " + verifyText);
        }
    }

}
