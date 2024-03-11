package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {

    private By offerButton = By.xpath("//a[@class='simple-tab eventTrackable dropdown-toggle skipForLink list-dropdownNull']");
    private By yatraLogo = By.xpath("//a[@href='https://www.yatra.com']");

    private By hotelsOption = By.xpath("//a[@id='booking_engine_hotels']");
    private By flightOption=By.xpath("//a[@id='booking_engine_flights']");
    private By holidayOption=By.xpath("//a[@id='booking_engine_holidays']");

    private By roundTrip = By.xpath("//a[@title='Round Trip']");
    private By flightDepartFromBox = By.xpath("//li[@class='initial-tab flex1 safariFix__field activeBox safariFix__field--fifty']");
    private By flightArrivalToBox = By.xpath("//li[@class='flex1 destAutoSugestField safariFix__field activeBox safariFix__field--fifty']");
    private By flightDepartFromElement = By.xpath("//input[@id='BE_flight_origin_city']");
    private By flightDepartureCity = By.xpath("//p[@class='ac_cityname'][text()='Bangalore ']");
    private By flightArrivalElement = By.xpath("//input[@id='BE_flight_arrival_city']");
    private By flightArrivalCity=By.xpath("//span[text()='Chennai']");
    private By flightDepartureDateElement = By.xpath("//input[@id='BE_flight_origin_date']");
    private By flightDepartureDateData = By.xpath("//td[@id='21/02/2024']");
    private By flightArrivalDateElement = By.xpath("//input[@id='BE_flight_arrival_date']");
    private By flightArrivalDateData = By.xpath("//td[@id='22/02/2024']");
    private By seniorCitizenCheckbox = By.xpath("//li[@id='seniorcitizen_offer']");
    private By searchFlightButton = By.xpath("//input[@value='Search Flights']");
    
    public By getOfferButton() {
        return offerButton;
    }
    public By getYatraLogo() {
        return yatraLogo;
    }
    public By getHotelsOption() {
        return hotelsOption;
    }
    public By getFlightOption() {
        return flightOption;
    }
    public By getHolidayOption() {
        return holidayOption;
    }
    public By getRoundTrip() {
        return roundTrip;
    }
    public By getFlightDepartFromBox() {
        return flightDepartFromBox;
    }
    public By getFlightArrivalToBox() {
        return flightArrivalToBox;
    }
    public By getFlightDepartFromElement() {
        return flightDepartFromElement;
    }
    public By getFlightDepartureCity() {
        return flightDepartureCity;
    }
    public By getFlightArrivalElement() {
        return flightArrivalElement;
    }
    public By getFlightArrivalCity() {
        return flightArrivalCity;
    }
    public By getFlightDepartureDateElement() {
        return flightDepartureDateElement;
    }
    public By getFlightDepartureDateData() {
        return flightDepartureDateData;
    }
    public By getFlightArrivalDateElement() {
        return flightArrivalDateElement;
    }
    public By getFlightArrivalDateData() {
        return flightArrivalDateData;
    }
    public By getSeniorCitizenCheckbox() {
        return seniorCitizenCheckbox;
    }
    public By getSearchFlightButton() {
        return searchFlightButton;
    }
    

    
}
