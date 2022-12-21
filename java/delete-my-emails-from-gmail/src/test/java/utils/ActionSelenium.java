package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionSelenium {

    public static void click(WebDriver driver, By by, int wait){

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(wait)))
                .until(ExpectedConditions.elementToBeClickable(by));
        element.click();

    }

    public WebElement sendData(WebDriver driver, By by, String value, int wait){

        WebDriverWait thewait = new WebDriverWait(driver, Duration.ofSeconds(wait));
        thewait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        WebElement element = driver.findElement(by);

        element.sendKeys(value);

        return element;
    }

}
