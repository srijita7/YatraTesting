package StepDefinition;

import org.openqa.selenium.WebDriver;

import Pages.FlightSearchResultsPageObject;
import cucumber.api.java.en.Then;

public class FlightSearchResultsPageStepDefinition {
    FlightSearchResultsPageObject flightSearchResultsPageObject = new FlightSearchResultsPageObject();

    WebDriver driver=Hooks.driver;

    @Then("^flight search results with the text \"([^\"]*)\" are displayed$")
    public void flight_search_results_with_the_text_are_displayed(String expectedText) {
        String actualText = flightSearchResultsPageObject.getStopsText(driver, Hooks.extentTest);
        flightSearchResultsPageObject.verifyText(driver, Hooks.extentTest, actualText, expectedText);
    }
}
