package UiStore;

import org.openqa.selenium.By;

public class HotelSearchResultsPageLocators {
    private By allHotelsHeader=By.xpath("//p[contains(text(), 'All Hotels')]");

    public By getAllHotelsHeader() {
        return allHotelsHeader;
    }
}
