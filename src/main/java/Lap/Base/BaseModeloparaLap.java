package Lap.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseModeloparaLap {

    public static WebDriver driver;
    //private final static String driverPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";

    @BeforeClass
    public void setupApplication() {
        System.out.println("Initiating Driver ");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }


    @AfterClass
    public void closeApplication() {
        System.out.println("Closing Driver ");
        driver.quit();


    }
}
