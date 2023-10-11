package FacebookPOM.Test;

import FacebookPOM.Pages.FacebookLogin;
import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class TestFacebook {

    WebDriver driver = new ChromeDriver();

    private String URL = "https://www.facebook.com/?locale=en_US";
    private String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";


    FacebookLogin  facebookLogin;


    @Test
    public void invalidCredentialsforFacebook(){
        System.setProperty("webdriver.chrome.driver", driversPath);

        driver.navigate().to(URL);
        driver.manage().window().maximize();
        facebookLogin = new FacebookLogin(driver);
        facebookLogin.fillData("Pepe", "12355dasda@");

        driver.close();

    }




}
