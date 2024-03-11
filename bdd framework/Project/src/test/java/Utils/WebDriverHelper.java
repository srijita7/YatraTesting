package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WebDriverHelper {
    public static final int IMPLICIT_WAIT_TIME = 10;
    public static final int PAGE_LOAD_TIME = 10;
    private WebDriver driver;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToBeVisible(By element, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (Exception e) {
            LoggerHandler.logError("wait for element to be visible failed");
        }
    }

    public void waitForVisibilityOfText(By element, String text, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.textToBePresentInElementValue(element, text));
        } catch (Exception e) {
            LoggerHandler.logError("wait for visibility of text failed");
        }
    }

    public void clickOnElement(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.click();
        } catch (Exception e) {
            LoggerHandler.logError("click on element failed");
        }
    }

    public void clearElement(By element)
    {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE));
        } catch (Exception e) {
            LoggerHandler.logError("clear element failed");
        }
    }

    public void sendKeys(By element, String data) {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.sendKeys(data);
        } catch (Exception e) {
            LoggerHandler.logError("send keys failed");
        }
    }

    public void sendKeyboardKeys(By element, Keys keys) {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.sendKeys(keys);
        } catch (Exception e) {
            LoggerHandler.logError("send keyboard keys failed");
        }
    }

    public String getText(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            return webElement.getText();
        } catch (Exception e) {
            LoggerHandler.logError("get text failed");
            return null;
        }
    }

    public void switchToNewWindow() {
        try {
            Set<String> windowHandles = driver.getWindowHandles();
            for (String windowHandle : windowHandles) {
                if (!windowHandle.isEmpty()) {
                    driver.switchTo().window(windowHandle);
                } else {
                    throw new Exception("New window could not be retrieved");
                }
            }
        } catch (Exception e) {
            LoggerHandler.logError("switch to new window failed");
        }
    }

    public void enterAction(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            LoggerHandler.logError("enter action failed");
        }
    }

    public void hoverOverElement(By element) {
        try {
            WebElement webElement = driver.findElement(element);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            LoggerHandler.logError("hover over element failed");
        }
    }

    public String getAttributeValue(By element, String attribute) {
        try {
            WebElement webElement = driver.findElement(element);
            return webElement.getAttribute(attribute);
        } catch (Exception e) {
            LoggerHandler.logError("failed to fetch value of attribute");
            return null;
        }
    }
}
