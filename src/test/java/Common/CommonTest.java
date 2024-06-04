package Common;

import Utility.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CommonTest {
    public static WebDriver driver = null;

    @BeforeSuite
    public void initiateDriver(){
       // WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        driver = DriverFactory.selectDriver();
        System.out.println("Initializating driver");

    }
    @AfterSuite
    public void closeDriverSession(){
    driver.quit();
        System.out.println("Driver Closed");
    }

}
