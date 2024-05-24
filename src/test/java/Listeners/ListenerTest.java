package Listeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Listeners.Listener;


@Listeners(Listener.class)
public class ListenerTest {
    WebDriver driver;
    private static final String URL ="https://www.facebook.com/?locale=en_US";
    private static final String driversPath ="C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";



    @Test
    public void openFacebookAsserTitle(){
        System.setProperty("webdriver.chrome.driver", driversPath);
        driver = new ChromeDriver();
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        Assert.assertEquals("Facebook - log in or sign up", driver.getTitle());
        driver.close();
    }
}