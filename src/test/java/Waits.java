
import Utility.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import java.time.Duration;

public class Waits {
    public String url = "https://www.demoblaze.com/index.html";
    public WebDriver driver = DriverFactory.selectDriver();

    @Test
    public void implicitWait() {
        // el codigo para user implicit wait fue movido de esta linea al DriverFactory
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]")).click();
    }

    @Test
    public void explicitWait() {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(2));
        driver.get(url);
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sony vaio i5')]"))).click();
    }
}