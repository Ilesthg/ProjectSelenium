import Utility.DriverFactory;
import Utility.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.net.URL;

import static org.junit.Assert.assertEquals;

public class TestUsingDriverPool_and_Properties {

    //private String url = "https://www.google.com";

    private String url = PropertiesFile.getProperty("url");
    private WebDriver driver = DriverFactory.selectDriver();


@Test

 public void visitGoogle() {
    WebDriverManager.chromedriver().setup();

     driver.manage().window().maximize();
     driver.navigate().to(url);


        //driver.get(url);
        WebElement searchInput = driver.findElement(By.id("APjFqb"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);

    assertEquals("Selenium - Buscar con Google" ,driver.getTitle());



        driver.close();



}





}
