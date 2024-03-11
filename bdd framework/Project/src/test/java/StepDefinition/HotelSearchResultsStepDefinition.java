package StepDefinition;

import org.openqa.selenium.WebDriver;

import Pages.HotelSearchResultsPageObject;
import cucumber.api.java.en.Then;

public class HotelSearchResultsStepDefinition {

    WebDriver driver = Hooks.driver;

    HotelSearchResultsPageObject hotelSearchResultsPageObject = new HotelSearchResultsPageObject();

    @Then("^hotel search results for \"([^\"]*)\" are displayed$")
    public void hotel_search_results_for_are_displayed(String arg1) {
        hotelSearchResultsPageObject.resultsPageLoaded(driver, Hooks.extentTest);
    }

}
