package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public static WebDriver driver = null;

    @BeforeSuite
    public void initiateDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //DriverFactory.selectDriver();
        System.out.println("Initializating driver");

    }
    @AfterSuite
    public void closeDriverSession(){
        driver.quit();
        System.out.println("Driver Closed");
    }
}
