package Lap.Utility;

import Lap.Base.BaseModeloparaLap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Selectors extends BaseModeloparaLap {

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public static WebElement findElement(String elementType, String elementValue) {
        switch (elementType) {
            case "XPATH":
             return  driver.findElement(By.xpath(elementValue));

            case "CSS":
                return  driver.findElement(By.cssSelector(elementValue));

            default:
                System.out.println("No Locator");
                return null;
        }
    }
    public static List<WebElement> findElementS(String elementType, String elementValue) {
        switch (elementType) {
            case "XPATH":
                return  driver.findElements(By.xpath(elementValue));

            case "CSS":
                return  driver.findElements(By.cssSelector(elementValue));

            default:
                System.out.println("No Locator");
                return null;
        }
    }
    public static WebElement findElementWithWait(String elementType, String elementValue) {
        switch (elementType) {
            case "XPATH":
                return  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementValue)));

            case "CSS":
                return  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementValue)));

            default:
                System.out.println("No Locator");
                return null;
        }
    }
    public static List<WebElement> findElementsWithWait(String elementType, String elementValue) {
        switch (elementType) {
            case "XPATH":
                return   wait.until(ExpectedConditions.visibilityOfAllElements((WebElement) By.xpath(elementValue)));


            case "CSS":
                return  driver.findElements(By.cssSelector(elementValue));

            default:
                System.out.println("No Locator");
                return null;
        }
    }
}
