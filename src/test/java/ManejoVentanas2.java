import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ManejoVentanas2 {
    WebDriver driver = new ChromeDriver();
   private static String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
   private static String URL ="https://automationintesting.com/selenium/testpage/";

   @Test
   //Cannot put method as a void
    public void manejoVentanas(){
       System.setProperty("webdriver.chrome.driver", driversPath);
       driver.navigate().to(URL);
       driver.manage().window().maximize();

       WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));

       //String mainWindow = driver.getWindowHandle();

       driver.findElement(By.xpath("//a[text()= 'AiT Online']")).click();

       Set<String> allWindows = driver.getWindowHandles();
       driver.switchTo().window(allWindows.toArray()[1].toString());
       System.out.println(driver.getTitle());

       Assert.assertEquals("El titulo es ", driver.getTitle(), "Restful-booker-platform demo" );
       wait.until(ExpectedConditions.titleIs("Restful-booker-platform demo"));
       driver.close();

       driver.switchTo().window(allWindows.toArray()[0].toString());
       System.out.println(driver.getTitle());



   }



}
