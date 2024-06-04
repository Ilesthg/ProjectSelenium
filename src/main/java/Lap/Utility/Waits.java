package Lap.Utility;

import Lap.Base.BaseModeloparaLap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits extends BaseModeloparaLap {

    public static void waiter() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    }
}
