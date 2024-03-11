package UiStore;

import org.openqa.selenium.By;

public class HolidaySearchResultsPageLocators {
    private By packagesLabel=By.xpath("(//a[contains(text(),'Packages')])[1]");
    private By destination=By.xpath("//input[@id='holidayDestination']");

    
    public By getPackagesLabel() {
        return packagesLabel;
    }

    public By getDestination() {
        return destination;
    }
}
