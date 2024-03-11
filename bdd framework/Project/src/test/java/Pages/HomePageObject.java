package Pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import UiStore.HomePageLocators;
import Utils.LoggerHandler;
import Utils.WebDriverHelper;

public class HomePageObject extends HomePageLocators {

    WebDriverHelper webDriverHelper;

    String holidaysOptionClick = "clicked on Holidays option";
    String hotelsOptionClick = "clicked on Hotels option";

    String flightDepartureInputFieldClick = "clicked on Flight Departure Input field";
    String enterFlightDepartureCity = "entered Flight Departure city in Flight Departure input field";
    String selectFlightDepartureCity = "selected Flight Departure city from dropdown";

    String flightArrivalInputFieldClick = "clicked on Flight Arrival Input field";
    String enterFlightArrivalCity = "entered Flight Arrival city in Flight Arrival input field";
    String selectFlightArrivalCity = "selected Flight Arrival city from dropdown";

    String flightDepartureDateClick = "clicked on Flight Departure date";
    String selectFlightDepartureDate = "selected Flight Departure date";

    String flightArrivalDateClick = "clicked on Flight Arrival date";
    String selectFlightArrivalDate = "selected Flight Arrival date";

    String seniorCitizenClick = "clicked on Senior Citizen checkbox";

    String searchFlightButtonClick = "clicked on Search Flight button";

    String iException = "Interrupted Exception";

    public void clickOnHolidaysOption(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHolidayOption(), 10);
            webDriverHelper.clickOnElement(getHolidayOption());
            test.log(Status.PASS, holidaysOptionClick);
            LoggerHandler.logInfo(holidaysOptionClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + holidaysOptionClick);
            LoggerHandler.logError("not " + holidaysOptionClick);
        }
    }

    public void clickOnHotelsOption(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getHotelsOption(), 10);
            webDriverHelper.clickOnElement(getHotelsOption());
            test.log(Status.PASS, hotelsOptionClick);
            LoggerHandler.logInfo(hotelsOptionClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + hotelsOptionClick);
            LoggerHandler.logError("not " + hotelsOptionClick);
        }
    }

    public void clickOnDepartFromInputField(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getFlightDepartFromElement(), 10);
            webDriverHelper.clickOnElement(getFlightDepartFromElement());
            webDriverHelper.waitForElementToBeVisible(getFlightDepartFromBox(), 10);
            test.log(Status.PASS, flightDepartureInputFieldClick);
            LoggerHandler.logInfo(flightDepartureInputFieldClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + flightDepartureInputFieldClick);
            LoggerHandler.logError("not " + flightDepartureInputFieldClick);
        }
    }

    public void enterFlightDepartureCity(WebDriver driver, String departure, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            Thread.sleep(1000 * (long) 2);
            webDriverHelper.clearElement(getFlightDepartFromElement());
            webDriverHelper.waitForVisibilityOfText(getFlightDepartFromElement(), "", 10);
            Thread.sleep(1000 * (long) 2);
            webDriverHelper.sendKeys(getFlightDepartFromElement(), departure);
            test.log(Status.PASS, enterFlightDepartureCity);
            LoggerHandler.logInfo(enterFlightDepartureCity);
        } catch (InterruptedException ie) {
            test.log(Status.FAIL, iException);
            LoggerHandler.logError(iException);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + enterFlightDepartureCity);
            LoggerHandler.logError("not " + enterFlightDepartureCity);
        }
    }

    public void selectFlightDepartureCity(WebDriver driver, ExtentTest test) {

        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getFlightDepartureCity(), 10);
            webDriverHelper.clickOnElement(getFlightDepartureCity());
            test.log(Status.PASS, selectFlightDepartureCity);
            LoggerHandler.logInfo(selectFlightDepartureCity);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + selectFlightDepartureCity);
            LoggerHandler.logError("not " + selectFlightDepartureCity);
        }
    }

    public void clickOnArrivalToInputField(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getFlightArrivalElement(), 10);
            webDriverHelper.clickOnElement(getFlightArrivalElement());
            webDriverHelper.waitForElementToBeVisible(getFlightArrivalToBox(), 10);
            test.log(Status.PASS, flightArrivalInputFieldClick);
            LoggerHandler.logInfo(flightArrivalInputFieldClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + flightArrivalInputFieldClick);
            LoggerHandler.logError("not " + flightArrivalInputFieldClick);
        }
    }

    public void enterFlightArrivalCity(WebDriver driver, String arrival, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            Thread.sleep(1000 * (long) 2);
            webDriverHelper.clearElement(getFlightArrivalElement());
            webDriverHelper.waitForVisibilityOfText(getFlightArrivalElement(), "", 10);
            Thread.sleep(1000 * (long) 2);
            webDriverHelper.sendKeys(getFlightArrivalElement(), arrival);
            test.log(Status.PASS, enterFlightArrivalCity);
            LoggerHandler.logInfo(enterFlightArrivalCity);
        } catch (InterruptedException ie) {
            test.log(Status.FAIL, iException);
            LoggerHandler.logError(iException);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + enterFlightArrivalCity);
            LoggerHandler.logError("not " + enterFlightArrivalCity);
        }
    }

    public void selectFlightArrivalCity(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getFlightArrivalCity(), 10);
            webDriverHelper.clickOnElement(getFlightArrivalCity());
            test.log(Status.PASS, selectFlightArrivalCity);
            LoggerHandler.logInfo(selectFlightArrivalCity);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + selectFlightArrivalCity);
            LoggerHandler.logError("not " + selectFlightArrivalCity);
        }
    }

    public void clickOnDepartureDateInputField(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getFlightDepartureDateElement(), 10);
            webDriverHelper.clickOnElement(getFlightDepartureDateElement());
            test.log(Status.PASS, flightDepartureDateClick);
            LoggerHandler.logInfo(flightDepartureDateClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + flightDepartureDateClick);
            LoggerHandler.logError("not " + flightDepartureDateClick);
        }
    }

    public void selectDepartureDate(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getFlightDepartureDateData(), 10);
            webDriverHelper.clickOnElement(getFlightDepartureDateData());
            test.log(Status.PASS, selectFlightDepartureDate);
            LoggerHandler.logInfo(selectFlightDepartureDate);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + selectFlightDepartureDate);
            LoggerHandler.logError("not " + selectFlightDepartureDate);
        }
    }

    public void clickOnArrivalDateInputField(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getFlightArrivalDateElement(), 10);
            webDriverHelper.clickOnElement(getFlightArrivalDateElement());
            test.log(Status.PASS, flightArrivalDateClick);
            LoggerHandler.logInfo(flightArrivalDateClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + flightArrivalDateClick);
            LoggerHandler.logError("not " + flightArrivalDateClick);
        }
    }

    public void selectArrivalDate(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getFlightArrivalDateElement(), 10);
            webDriverHelper.clickOnElement(getFlightArrivalDateData());
            test.log(Status.PASS, selectFlightArrivalDate);
            LoggerHandler.logInfo(selectFlightArrivalDate);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + selectFlightArrivalDate);
            LoggerHandler.logError("not " + selectFlightArrivalDate);
        }
    }

    public void selectSeniorCitizenCheckbox(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getSeniorCitizenCheckbox(), 10);
            webDriverHelper.clickOnElement(getSeniorCitizenCheckbox());
            test.log(Status.PASS, seniorCitizenClick);
            LoggerHandler.logInfo(seniorCitizenClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + seniorCitizenClick);
            LoggerHandler.logError("not " + seniorCitizenClick);
        }
    }

    public void clickOnSearchFlightButton(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);

            webDriverHelper.waitForElementToBeVisible(getSearchFlightButton(), 20);
            webDriverHelper.clickOnElement(getSearchFlightButton());
            test.log(Status.PASS, searchFlightButtonClick);
            LoggerHandler.logInfo(searchFlightButtonClick);
        } catch (Exception e) {
            test.log(Status.FAIL, "not " + searchFlightButtonClick);
            LoggerHandler.logError("not " + searchFlightButtonClick);
        }
    }

}
