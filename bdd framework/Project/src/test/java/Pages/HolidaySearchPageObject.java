package Pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import UiStore.HolidaySearchPageLocators;
import Utils.LoggerHandler;
import Utils.WebDriverHelper;

public class HolidaySearchPageObject extends HolidaySearchPageLocators {
    WebDriverHelper webDriverHelper;

    String holidaySearchPageLoad = "loaded Holiday Search Page";

    String holidayDepartureInputFieldClick = "clicked on Holiday Departure Input field";
    String enterHolidayDepartureCity = "entered Holiday Departure city";
    String selectHolidayDepartureCity = "selected Holiday Departure city (Jaipur)";

    String holidayGoingToInputFieldClick = "clicked on Holiday Going To Input field";
    String enterHolidayGoingToCity = "entered Holiday Going To city";
    String selectHolidayGoingToCity = "selected Holiday Going To city (Bengaluru)";

    String holidayMonthClick = "clicked on Holiday Month field";
    String selectHolidayMonth = "selected Holiday Month";

    String searchHolidaysButtonClick = "clicked on Search Holidays button";

    String iException = "Interrupted Exception";

    public void waitForHolidaySearchPageToLoad(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getPackageImage(), 10);
            test.log(Status.PASS, holidaySearchPageLoad);
            LoggerHandler.logInfo(holidaySearchPageLoad);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + holidaySearchPageLoad);
            LoggerHandler.logError("not " + holidaySearchPageLoad);
        }
    }

    public void clickOnHolidayDepartureInputField(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            waitForHolidaySearchPageToLoad(driver, test);
            webDriverHelper.clickOnElement(getHolidayDepartEle());
            webDriverHelper.waitForElementToBeVisible(getDropdownDiv(), 10);
            test.log(Status.PASS, holidayDepartureInputFieldClick);
            LoggerHandler.logInfo(holidayDepartureInputFieldClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + holidayDepartureInputFieldClick);
            LoggerHandler.logError("not " + holidayDepartureInputFieldClick);
        }
    }

    public void enterHolidayDepartureCity(WebDriver driver, String departureCity, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            Thread.sleep(1000 * (long) 2);
            webDriverHelper.clearElement(getHolidayDepartEle());
            webDriverHelper.waitForVisibilityOfText(getHolidayDepartEle(), "", 10);
            Thread.sleep(1000 * (long) 2);
            webDriverHelper.sendKeys(getHolidayDepartEle(), departureCity);
            test.log(Status.PASS, enterHolidayDepartureCity);
            LoggerHandler.logInfo(enterHolidayDepartureCity);
        } catch (InterruptedException ie) {
            test.log(Status.FAIL, iException);
            LoggerHandler.logError(iException);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + enterHolidayDepartureCity);
            LoggerHandler.logError("not " + enterHolidayDepartureCity);
        }
    }

    public void selectHolidayDepartureCity(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getJaipurOption(), 10);
            webDriverHelper.clickOnElement(getJaipurOption());
            test.log(Status.PASS, selectHolidayDepartureCity);
            LoggerHandler.logInfo(selectHolidayDepartureCity);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + selectHolidayDepartureCity);
            LoggerHandler.logError("not " + selectHolidayDepartureCity);
        }
    }

    public void clickOnHolidayGoingToInputField(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHolidayGoingToEle(), 10);
            webDriverHelper.clickOnElement(getHolidayGoingToEle());
            webDriverHelper.waitForElementToBeVisible(getDropdownDiv(), 10);
            test.log(Status.PASS, holidayGoingToInputFieldClick);
            LoggerHandler.logInfo(holidayGoingToInputFieldClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + holidayGoingToInputFieldClick);
            LoggerHandler.logError("not " + holidayGoingToInputFieldClick);
        }
    }

    public void enterHolidayGoingToCity(WebDriver driver, String arrivalCity, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            Thread.sleep(1000 * (long) 2);
            webDriverHelper.clearElement(getHolidayGoingToEle());
            webDriverHelper.waitForVisibilityOfText(getHolidayGoingToEle(), "", 10);
            Thread.sleep(1000 * (long) 2);
            webDriverHelper.sendKeys(getHolidayGoingToEle(), arrivalCity);
            test.log(Status.PASS, enterHolidayGoingToCity);
            LoggerHandler.logInfo(enterHolidayGoingToCity);
        } catch (InterruptedException ie) {
            test.log(Status.FAIL, iException);
            LoggerHandler.logError(iException);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + enterHolidayGoingToCity);
            LoggerHandler.logError("not " + enterHolidayGoingToCity);
        }
    }

    public void selectHolidayGoingToCity(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getBengaluruOption(), 10);
            webDriverHelper.clickOnElement(getBengaluruOption());
            test.log(Status.PASS, selectHolidayGoingToCity);
            LoggerHandler.logInfo(selectHolidayGoingToCity);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + selectHolidayGoingToCity);
            LoggerHandler.logError("not " + selectHolidayGoingToCity);
        }
    }

    public void clickOnHolidayMonth(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHolidayMonthEle(), 10);
            webDriverHelper.clickOnElement(getHolidayMonthEle());
            test.log(Status.PASS, holidayMonthClick);
            LoggerHandler.logInfo(holidayMonthClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + holidayMonthClick);
            LoggerHandler.logError("not " + holidayMonthClick);
        }
    }

    public void selectHolidayMonth(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHolidayMonthData(), 10);
            webDriverHelper.clickOnElement(getHolidayMonthData());
            test.log(Status.PASS, selectHolidayMonth);
            LoggerHandler.logInfo(selectHolidayMonth);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + selectHolidayMonth);
            LoggerHandler.logError("not " + selectHolidayMonth);
        }
    }

    public void clickOnSearchHolidaysButton(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getSearchHolidaysButton(), 10);
            webDriverHelper.clickOnElement(getSearchHolidaysButton());
            test.log(Status.PASS, searchHolidaysButtonClick);
            LoggerHandler.logInfo(searchHolidaysButtonClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + searchHolidaysButtonClick);
            LoggerHandler.logError("not " + searchHolidaysButtonClick);
        }
    }
}
