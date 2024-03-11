package runner;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.*;
import utils.*;

public class RunTest {

    static WebDriver driver;
    
    Base baseObj=new Base();

    static ExtentReports extentReports;
    static ExtentTest extentTest;

    HomePageObject homePageObject=new HomePageObject();
    FlightSearchResultsPageObject flightSearchResultsPageObject=new FlightSearchResultsPageObject();

    HotelSearchPageObject hotelSearchPageObject=new HotelSearchPageObject();
    HotelSearchResultsPageObject hotelSearchResultsPageObject=new HotelSearchResultsPageObject();

    HolidaySearchPageObject holidaySearchPageObject=new HolidaySearchPageObject();
    HolidaySearchResultsPageObject holidaySearchResultsPageObject=new HolidaySearchResultsPageObject();

    ExcelReader excelReader=new ExcelReader();

    String sheetName="Sheet1";

    @BeforeTest
    public void setup()
    {
        extentReports=Reporter.generateExtentReport("Yatra Test Report");
    }

    @BeforeMethod
    public void initializeDriver(Method method)
    {
        try {
            driver=baseObj.openBrowser();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        extentTest=extentReports.createTest(method.getName());
    }

    @Test(priority = 1)
    public void testHotelSearch() 
    {
        try {
            homePageObject.clickOnOffersButton(driver, extentTest);

            homePageObject.clickOnYatraLogo(driver, extentTest);

            homePageObject.clickOnHotelsOption(driver, extentTest);

            String hotelLoc1=excelReader.readDataFromExcel(System.getProperty("user.dir")+"/testdata/Testdata.xlsx", sheetName, 1, 0);
            hotelSearchPageObject.clickOnEnterLocationInput(driver, extentTest);
            hotelSearchPageObject.enterLocationForHotel(driver, hotelLoc1, extentTest);
            hotelSearchPageObject.sendEnterKey(driver, extentTest);

            String hotelLoc2=excelReader.readDataFromExcel(System.getProperty("user.dir")+"/testdata/Testdata.xlsx", sheetName, 2, 0);
            hotelSearchPageObject.clickOnEnterLocationInput(driver, extentTest);
            hotelSearchPageObject.enterLocationForHotel(driver, hotelLoc2, extentTest);
            hotelSearchPageObject.sendEnterKey(driver, extentTest);

            hotelSearchPageObject.clickOnCheckIn(driver, extentTest);
            hotelSearchPageObject.selectDateForCheckIn(driver, extentTest);

            hotelSearchPageObject.clickOnCheckOut(driver, extentTest);
            hotelSearchPageObject.selectDateForCheckOut(driver, extentTest);
            
            hotelSearchPageObject.clickOnSearchHotelButton(driver, extentTest);

            hotelSearchResultsPageObject.resultsPageLoaded(driver, extentTest);

        } catch (Exception e) {
            extentTest.log(Status.FAIL, "Test case 1 failed");
            LoggerHandler.logError("Test case 1 failed");
        }
    }

    @Test(priority = 2)
    public void testFlightSearch()
    {
        try {
            homePageObject.clickOnRoundTrip(driver, extentTest);

            String flightDst=excelReader.readDataFromExcel(System.getProperty("user.dir")+"/testdata/Testdata.xlsx", sheetName, 1, 1);
            homePageObject.clickOnDepartFromInputField(driver, extentTest);
            homePageObject.enterFlightDepartureCity(driver, flightDst, extentTest);
            homePageObject.selectFlightDepartureCity(driver, extentTest);

            String flightArrival=excelReader.readDataFromExcel(System.getProperty("user.dir")+"/testdata/Testdata.xlsx", sheetName, 1, 2);
            homePageObject.clickOnArrivalToInputField(driver, extentTest);
            homePageObject.enterFlightArrivalCity(driver, flightArrival, extentTest);
            homePageObject.selectFlightArrivalCity(driver, extentTest);

            homePageObject.clickOnDepartureDateInputField(driver, extentTest);
            homePageObject.selectDepartureDate(driver, extentTest);

            homePageObject.clickOnArrivalDateInputField(driver, extentTest);
            homePageObject.selectArrivalDate(driver, extentTest);

            homePageObject.selectSeniorCitizenCheckbox(driver, extentTest);

            homePageObject.clickOnSearchFlightButton(driver, extentTest);

            String actualText=flightSearchResultsPageObject.getStopsText(driver, extentTest);
            flightSearchResultsPageObject.verifyText(driver, extentTest, actualText, "Stops");

        } catch (Exception e) {
            extentTest.log(Status.FAIL, "Test case 2 failed");
            LoggerHandler.logError("Test case 2 failed");
        }
    }
    
    @Test(priority = 3)
    public void testHolidaysSearch()
    {
        try {

            homePageObject.clickOnHolidaysOption(driver, extentTest);

            String departureCity=excelReader.readDataFromExcel(System.getProperty("user.dir")+"/testdata/Testdata.xlsx", sheetName, 1, 3);
            holidaySearchPageObject.clickOnHolidayDepartureInputField(driver, extentTest);
            holidaySearchPageObject.enterHolidayDepartureCity(driver, departureCity, extentTest);
            holidaySearchPageObject.selectHolidayDepartureCity(driver, extentTest);

            String goingToCity=excelReader.readDataFromExcel(System.getProperty("user.dir")+"/testdata/Testdata.xlsx", sheetName, 1, 4);
            holidaySearchPageObject.clickOnHolidayGoingToInputField(driver, extentTest);
            holidaySearchPageObject.enterHolidayGoingToCity(driver, goingToCity, extentTest);
            holidaySearchPageObject.selectHolidayGoingToCity(driver, extentTest);

            holidaySearchPageObject.clickOnHolidayMonth(driver, extentTest);
            holidaySearchPageObject.selectHolidayMonth(driver, extentTest);

            holidaySearchPageObject.clickOnSearchHolidaysButton(driver, extentTest);
            
            String actualResult=holidaySearchResultsPageObject.getDestination(driver, extentTest);
            holidaySearchResultsPageObject.verifyDestination(driver, extentTest, actualResult, goingToCity);

        } catch (Exception e) {
            extentTest.log(Status.FAIL, "Test case 3 failed");
            LoggerHandler.logError("Test case 3 failed");
        }
    }

    @AfterMethod
    public void quitDriver()
    {
        driver.quit();
    }

    @AfterTest
    public void tearDown()
    {
        extentReports.flush();
    }

}

