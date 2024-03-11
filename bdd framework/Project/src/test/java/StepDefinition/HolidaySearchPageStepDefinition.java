package StepDefinition;

import org.openqa.selenium.WebDriver;

import Pages.HolidaySearchPageObject;
import cucumber.api.java.en.When;

public class HolidaySearchPageStepDefinition {
    HolidaySearchPageObject holidaySearchPageObject = new HolidaySearchPageObject();
    WebDriver driver = Hooks.driver;

    @When("^I enter \"([^\"]*)\" in depart from field for holiday$")
    public void i_enter_in_depart_from_field_for_holiday(String departure) {
        holidaySearchPageObject.clickOnHolidayDepartureInputField(driver, Hooks.extentTest);
        holidaySearchPageObject.enterHolidayDepartureCity(driver, departure, Hooks.extentTest);
        holidaySearchPageObject.selectHolidayDepartureCity(driver, Hooks.extentTest);
    }

    @When("^enter \"([^\"]*)\" in going to field for holiday$")
    public void enter_in_going_to_field_for_holiday(String arrival) {
        holidaySearchPageObject.clickOnHolidayGoingToInputField(driver, Hooks.extentTest);
        holidaySearchPageObject.enterHolidayGoingToCity(driver, arrival, Hooks.extentTest);
        holidaySearchPageObject.selectHolidayGoingToCity(driver, Hooks.extentTest);
    }

    @When("^select month of travel$")
    public void select_month_of_travel() {
        holidaySearchPageObject.clickOnHolidayMonth(driver, Hooks.extentTest);
        holidaySearchPageObject.selectHolidayMonth(driver, Hooks.extentTest);
    }

    @When("^click on Search Holidays button$")
    public void click_on_Search_Holidays_button() {
        holidaySearchPageObject.clickOnSearchHolidaysButton(driver, Hooks.extentTest);
    }

}
