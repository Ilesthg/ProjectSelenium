package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseMode {

    public static WebDriver driver;
    //private final static String driverPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";

    @BeforeClass
    public void setupApplication() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }


    @AfterClass
    public void closeApplication() {
        driver.quit();


    }
}
