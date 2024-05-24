package TestsUsingCommonPractices;

import Utility.DriverFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Listeners.Listener;
import Common.CommonTest;
@Listeners(Listener.class)
public class Exmp1 extends CommonTest {
    private String url = "https://www.facebook.com/?locale=en_US";

    @Test
    public void openFacebookAsserTitle(){

        driver.navigate().to(url);
        driver.manage().window().maximize();
        Assert.assertEquals("Facebook - log in or sign up", driver.getTitle());

    }
    @Test(enabled = true)
    public void failTest(){

        driver.navigate().to(url);
        driver.manage().window().maximize();
        Assert.fail();

    }
}
