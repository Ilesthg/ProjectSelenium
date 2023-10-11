import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Alertas {

    WebDriver driver  = new ChromeDriver();

    private final static String driverPath= "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    private final static String URL= "https://www.demoblaze.com/";


    @Test
    public void acceptAlert(){
        System.setProperty("webdriver.chrome.driver" , driverPath);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //--
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //--
        driver.navigate().to(URL);
        driver.manage().window().maximize();

      WebElement selectProduct = driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/a/img"));
      selectProduct.click();
      WebElement agregarProducto = driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a"));
      agregarProducto.click();

        /*
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tbodyid']/div[1]/div"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tbodyid']/div[2]/div/a"))).click();
*/
       wait.until(ExpectedConditions.alertIsPresent());
       driver.switchTo().alert().accept();











    }
}
