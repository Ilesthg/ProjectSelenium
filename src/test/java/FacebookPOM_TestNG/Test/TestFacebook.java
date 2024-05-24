package FacebookPOM_TestNG.Test;
import org.apache.commons.io.*;
import FacebookPOM_TestNG.Pages.FacebookLogin;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

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

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:/Users/vhgm/IdeaProjects/ProjectSeleniumWebD/src/test/java/FacebookPOM_TestNG/SS/imagen.png"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        facebookLogin.fillData("Pepe", "12355dasda@");




     //   driver.close();

    }




}
