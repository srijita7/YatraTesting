package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HotelSearchPageLocators;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HotelSearchPageObject extends HotelSearchPageLocators {
    WebDriverHelper webDriverHelper;

    String pageLoad="loaded Hotel Search Page successfully";

    String locationInputFieldClick="clicked on Select Location Input field";
    String enterLocation="entered Hotel Location in Location input field";
    String enterAction="pressed enter key";

    String clickOnCheckIn="clicked on Checkin date";
    String selectCheckInDate="selected Checkin date";

    String clickOnCheckOut="clicked on Checkout date";
    String selectCheckOutDate="selected Checkout date";

    String searchHotelButtonClick="clicked on Search Hotel button";

    String iException="Interrupted Exception";

    public void waitForPageToLoad(WebDriver driver, ExtentTest test)
    {
        try {
            webDriverHelper=new WebDriverHelper(driver);
            webDriverHelper.waitForElementToBeVisible(getDiscountsText(), 10);
            test.log(Status.PASS, pageLoad);
            LoggerHandler.logInfo(pageLoad);
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+pageLoad);
            LoggerHandler.logError("not "+pageLoad);
        }
    }

    public void clickOnEnterLocationInput(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);
            waitForPageToLoad(driver, test);
            webDriverHelper.clickOnElement(getSelectLocationInput());
            webDriverHelper.waitForElementToBeVisible(getDropdownDiv(), 5);
            test.log(Status.PASS, locationInputFieldClick);
            LoggerHandler.logInfo(locationInputFieldClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+locationInputFieldClick);
            LoggerHandler.logError("not "+locationInputFieldClick);
        }
    }

    public void enterLocationForHotel(WebDriver driver, String location, ExtentTest test){
        try {
            webDriverHelper = new WebDriverHelper(driver);
            Thread.sleep(1000*(long)2);
            webDriverHelper.clearElement(getSelectLocationInput());
            webDriverHelper.waitForVisibilityOfText(getSelectLocationInput(), "", 10);
            Thread.sleep(1000*(long)2);
            webDriverHelper.sendKeys(getSelectLocationInput(), location);
            webDriverHelper.waitForVisibilityOfText(getSelectLocationInput(), location, 10);
            Thread.sleep(1000*(long)2);
            test.log(Status.PASS, enterLocation);
            LoggerHandler.logInfo(enterLocation);
        }
        catch(InterruptedException ie) 
        {
            test.log(Status.FAIL, iException);
            LoggerHandler.logError(iException);
        }
         catch (Exception e) {
            test.log(Status.FAIL, "not "+enterLocation);
            LoggerHandler.logError("not "+enterLocation);
        }
    }

    public void sendEnterKey(WebDriver driver, ExtentTest test)
    {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.enterAction(getSelectLocationInput());
            test.log(Status.PASS, enterAction);
            LoggerHandler.logInfo(enterAction);
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+enterAction);
            LoggerHandler.logError("not "+enterAction);
        }
    }

    public void clickOnCheckIn(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHotelCheckinDateElement(), 10);
            webDriverHelper.clickOnElement(getHotelCheckinDateElement());
            test.log(Status.PASS, clickOnCheckIn);
            LoggerHandler.logInfo(clickOnCheckIn);
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+clickOnCheckIn);
            LoggerHandler.logError("not "+clickOnCheckIn);
        }
    }

    public void selectDateForCheckIn(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHotelCheckinDateData(), 10);
            webDriverHelper.clickOnElement(getHotelCheckinDateData());
            test.log(Status.PASS, selectCheckInDate);
            LoggerHandler.logInfo(selectCheckInDate);
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+selectCheckInDate);
            LoggerHandler.logError("not "+selectCheckInDate);
        }
    }

    public void clickOnCheckOut(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHotelCheckoutDateElement(), 10);
            webDriverHelper.clickOnElement(getHotelCheckoutDateElement());
            test.log(Status.PASS, clickOnCheckOut);
            LoggerHandler.logInfo(clickOnCheckOut);
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+clickOnCheckOut);
            LoggerHandler.logError("not "+clickOnCheckOut);
        }
    }

    public void selectDateForCheckOut(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHotelCheckoutDateData(), 10);
            webDriverHelper.clickOnElement(getHotelCheckoutDateData());
            test.log(Status.PASS, selectCheckOutDate);
            LoggerHandler.logInfo(selectCheckOutDate);
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+selectCheckOutDate);
            LoggerHandler.logError("not "+selectCheckOutDate);
        }
    }

    public void clickOnSearchHotelButton(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getSearchHotelsButton(), 10);
            webDriverHelper.clickOnElement(getSearchHotelsButton());
            test.log(Status.PASS, searchHotelButtonClick);
            LoggerHandler.logInfo(searchHotelButtonClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not "+searchHotelButtonClick);
            LoggerHandler.logError("not "+searchHotelButtonClick);
        }
    }

}
