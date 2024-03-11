package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utils.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
    public static WebDriver driver;
    public static ExtentReports extentReports=Reporter.generateExtentReport("Yatra Test Report");
    public static ExtentTest extentTest;
    static int i=1;

    @Before
    public void startUp() {
        try {
            driver = openBrowser();
            extentTest=extentReports.createTest("Test case "+i);
            LoggerHandler.logInfo("Test case "+i);
            i++;
        } catch (Exception e)
        {
            LoggerHandler.logError("cannot initialize driver");
        }
    }

    @After
    public void tearDown() {
        driver.quit();
        extentReports.flush();
    }
}
