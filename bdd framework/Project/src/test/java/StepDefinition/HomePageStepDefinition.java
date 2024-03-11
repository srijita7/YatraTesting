package StepDefinition;

import org.openqa.selenium.WebDriver;

import Pages.HomePageObject;
import Utils.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDefinition {
    WebDriver driver = Hooks.driver;

    HomePageObject homePageObject = new HomePageObject();

    Base base = new Base();

    @Given("^I am in Home Page$")
    public void i_am_in_Home_Page(){

    }

    @When("^I enter \"([^\"]*)\" in depart from field$")
    public void i_enter_in_depart_from_field(String dst) {
        homePageObject.clickOnDepartFromInputField(driver, Hooks.extentTest);
        homePageObject.enterFlightDepartureCity(driver, dst, Hooks.extentTest);
        homePageObject.selectFlightDepartureCity(driver, Hooks.extentTest);
    }

    @When("^enter \"([^\"]*)\" in going to field$")
    public void enter_in_going_to_field(String arrival) {
        homePageObject.clickOnArrivalToInputField(driver, Hooks.extentTest);
        homePageObject.enterFlightArrivalCity(driver, arrival, Hooks.extentTest);
        homePageObject.selectFlightArrivalCity(driver, Hooks.extentTest);
    }

    @When("^select departure date$")
    public void select_departure_date() {
        homePageObject.clickOnDepartureDateInputField(driver, Hooks.extentTest);
        homePageObject.selectDepartureDate(driver, Hooks.extentTest);
    }

    @When("^select return date$")
    public void select_return_date() {
        homePageObject.clickOnArrivalDateInputField(driver, Hooks.extentTest);
        homePageObject.selectArrivalDate(driver, Hooks.extentTest);
    }

    @When("^select Senior Citizen checkbox$")
    public void select_Senior_Citizen_checkbox() {
        homePageObject.selectSeniorCitizenCheckbox(driver, Hooks.extentTest);
    }

    @When("^click on Search Flights button$")
    public void click_on_Search_Flights_button() {
        homePageObject.clickOnSearchFlightButton(driver, Hooks.extentTest);
    }


    @When("^I click on Hotels$")
    public void i_click_on_Hotels(){
        homePageObject.clickOnHotelsOption(driver, Hooks.extentTest);
    }


    @When("^I click on Holidays option$")
    public void i_click_on_Holidays_option(){
        homePageObject.clickOnHolidaysOption(driver, Hooks.extentTest);
    }
}
