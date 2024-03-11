package uistore;

import org.openqa.selenium.By;

public class HolidaySearchPageLocators {
    private By packageImage=By.xpath("//img[@class='conta iner large-banner'][@src='https://www.yatra.com/ythomepagecms/media/double_banner/2023/Aug/3247491c57b58e61775d854ed932561e.jpg']");
    private By holidayDepartEle=By.xpath("//input[@name='BE_holiday_leaving']");
    private By jaipurOption=By.xpath("//strong[text()='Jaipur']");
    private By holidayGoingToEle=By.xpath("//input[@name='holiday_destination']");
    private By bengaluruOption=By.xpath("//strong[text()='Bengaluru']");
    private By dropdownDiv=By.xpath("//div[@class='viewport']");
    private By holidayMonthEle=By.xpath("//span[text()='Month of Travel (Optional)']");
    private By holidayMonthData=By.xpath("//span[text()='February 2024']");
    private By searchHolidaysButton=By.xpath("//input[@value='Search Holidays']");
    public By getPackageImage() {
        return packageImage;
    }
    public By getHolidayDepartEle() {
        return holidayDepartEle;
    }
    public By getJaipurOption() {
        return jaipurOption;
    }
    public By getHolidayGoingToEle() {
        return holidayGoingToEle;
    }
    public By getBengaluruOption() {
        return bengaluruOption;
    }
    public By getDropdownDiv() {
        return dropdownDiv;
    }
    public By getHolidayMonthEle() {
        return holidayMonthEle;
    }
    public By getHolidayMonthData() {
        return holidayMonthData;
    }
    public By getSearchHolidaysButton() {
        return searchHolidaysButton;
    }
    
    
}
