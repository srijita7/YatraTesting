package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HolidaySearchResultsPageLocators;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HolidaySearchResultsPageObject extends HolidaySearchResultsPageLocators{
    
    WebDriverHelper webDriverHelper;

    String getDestination = "fetched Destination value";
    String destinationVerification = "verified Destination Bengaluru";

    public String getDestination(WebDriver driver, ExtentTest test) {
        String dst = "";
        try {
            webDriverHelper = new WebDriverHelper(driver);
            dst = webDriverHelper.getAttributeValue(getDestination(), "value");
            test.log(Status.PASS, getDestination);
            LoggerHandler.logInfo(getDestination);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + getDestination);
            LoggerHandler.logError("not " + getDestination);
        }
        return dst;
    }

    public void verifyDestination(WebDriver driver, ExtentTest test, String actual, String expected) {
        try {
            Assert.assertEquals(expected, actual);
            test.log(Status.PASS, destinationVerification);
            LoggerHandler.logInfo(destinationVerification);
            Screenshot.getScreenShot(driver, destinationVerification);
        } catch (Throwable e) {
            test.log(Status.FAIL, "not "+destinationVerification);
            LoggerHandler.logError("not "+destinationVerification);
        }
    }



}
