package uistore;

import org.openqa.selenium.By;

public class FlightSearchResultsPageLocators {
    private By stopsSpan=By.xpath("//span[text()='Stops: ']");

    public By getStopsSpan() {
        return stopsSpan;
    }
    
}
