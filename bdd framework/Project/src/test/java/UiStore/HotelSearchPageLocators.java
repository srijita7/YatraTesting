package UiStore;

import org.openqa.selenium.By;

public class HotelSearchPageLocators {
    private By searchLocationInputLabel = By.xpath("//label[@class='inp-focus top-on-stack']");
    private By selectLocationInput = By.xpath("//input[@id='BE_hotel_destination_city']");
    private By dropdownDiv=By.xpath("//div[@class='viewport']");
    private By hotelCheckinDateElement = By.xpath("//input[@id='BE_hotel_checkin_date']");
    private By hotelCheckinDateData = By.xpath("//td[@id='15/02/2024']");
    private By hotelCheckoutDateElement = By.xpath("//input[@id='BE_hotel_checkout_date']");
    private By hotelCheckoutDateData = By.xpath("//td[@id='16/02/2024']");
    private By searchHotelsButton = By.xpath("//input[@value='Search Hotels']");
    
    public By getSearchLocationInputLabel() {
        return searchLocationInputLabel;
    }
    public By getSelectLocationInput() {
        return selectLocationInput;
    }
    public By getDropdownDiv() {
        return dropdownDiv;
    }
    public By getHotelCheckinDateElement() {
        return hotelCheckinDateElement;
    }
    public By getHotelCheckinDateData() {
        return hotelCheckinDateData;
    }
    public By getHotelCheckoutDateElement() {
        return hotelCheckoutDateElement;
    }
    public By getHotelCheckoutDateData() {
        return hotelCheckoutDateData;
    }
    public By getSearchHotelsButton() {
        return searchHotelsButton;
    }
    
    

    
}
