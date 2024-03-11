package StepDefinition;

import org.openqa.selenium.WebDriver;

import Pages.HolidaySearchResultsPageObject;
import cucumber.api.java.en.Then;

public class HolidaySearchResultsPageStepDefinition {
    HolidaySearchResultsPageObject holidaySearchResultsPageObject=new HolidaySearchResultsPageObject();

    WebDriver driver = Hooks.driver;

    @Then("^holiday search results containing the destination \"([^\"]*)\" are displayed$")
    public void holiday_search_results_containing_the_destination_are_displayed(String expectedDst) {
        String actualDst=holidaySearchResultsPageObject.getDestination(driver, Hooks.extentTest);
        holidaySearchResultsPageObject.verifyDestination(driver, Hooks.extentTest, actualDst, expectedDst);
    }
}
