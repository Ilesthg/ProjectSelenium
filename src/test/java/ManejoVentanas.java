import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ManejoVentanas {
   WebDriver driver = new ChromeDriver();


    private final static String driverPath= "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    private final static String URL= "https://automationintesting.com/selenium/testpage/";

@Test
    public void manejoVentanas(){
        System.setProperty("webdriver.chrome.driver" , driverPath);
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        //Implicit wait
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    //  Explicit wait
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //instanciar sting con la main page
        String mainPage = driver.getWindowHandle();
//Click to open a new window
    driver.findElement(By.xpath("//a[text()= 'AiT Online']")).click();

    //Crear Set con todas las ventanas abiertas
    Set<String> allWindnows = driver.getWindowHandles();
    driver.switchTo().window(allWindnows.toArray()[1].toString());


    wait.until(ExpectedConditions.titleContains("Restful-booker-platform demo"));
    System.out.println("Imprime el titulo " + driver.getTitle());
    driver.close();


driver.switchTo().window(allWindnows.toArray()[0].toString());
        System.out.println("Imprime el titulo " + driver.getTitle());
    }
}
