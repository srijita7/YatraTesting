package StepDefinition;

import org.openqa.selenium.WebDriver;

import Pages.HotelSearchPageObject;
import cucumber.api.java.en.When;

public class HotelSearchPageStepDefinition {
    
    HotelSearchPageObject hotelSearchPageObject=new HotelSearchPageObject();
    WebDriver driver=Hooks.driver;

    @When("^enter \"([^\"]*)\" in location field$")
    public void enter_in_location_field(String location) {
        hotelSearchPageObject.clickOnEnterLocationInput(driver, Hooks.extentTest);
        hotelSearchPageObject.enterLocationForHotel(driver, location, Hooks.extentTest);
        hotelSearchPageObject.sendEnterKey(driver, Hooks.extentTest);
    }

    @When("^select checkin date$")
    public void select_checkin_date() {
        hotelSearchPageObject.clickOnCheckIn(driver, Hooks.extentTest);
        hotelSearchPageObject.selectDateForCheckIn(driver, Hooks.extentTest);
    }

    @When("^select checkout date$")
    public void select_checkout_date() {
        hotelSearchPageObject.clickOnCheckOut(driver, Hooks.extentTest);
        hotelSearchPageObject.selectDateForCheckOut(driver, Hooks.extentTest);
    }

    @When("^click on Search button$")
    public void click_on_Search_button() {
        hotelSearchPageObject.clickOnSearchHotelButton(driver, Hooks.extentTest);
    }

}
