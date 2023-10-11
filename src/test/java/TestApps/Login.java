package TestApps;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    private final String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";

    WebDriver driver = new ChromeDriver();

@Test
    public void gotoFormy(){
        System.setProperty("webdriver.chrome.driver", driversPath);

        driver.navigate().to("https://formy-project.herokuapp.com/keypress");

        WebElement inputText = driver.findElement(By.id("name"));
        inputText.sendKeys("Hola pepe");

        WebElement button1 = driver.findElement(By.xpath("//button[contains(text(), 'Button')]"));
        button1.click();

        driver.close();

        }
    }


