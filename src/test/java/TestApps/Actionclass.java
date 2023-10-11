package TestApps;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
    private static final  String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    private static final String URL = "https://formy-project.herokuapp.com/scroll";

    WebDriver driver = new ChromeDriver();
@Test
    public void actionandSroll(){
        System.setProperty("webdriver.chrome.driver", driversPath);
        driver.navigate().to(URL);
        driver.manage().window().maximize();

        Actions builder = new Actions(driver);

        WebElement inputName = driver.findElement(By.xpath("//input[@placeholder = 'Full name']"));
     //   inputName.sendKeys("Hola");

    Action ac1 = builder
            .moveToElement(inputName)
            .click()
            .sendKeys("hOLASD")
            .build();

    ac1.perform();

        WebElement inputDate = driver.findElement(By.xpath("//input[@placeholder = 'MM/DD/YYYY']"));
        inputDate.sendKeys("06/06/1998");

    }
}
