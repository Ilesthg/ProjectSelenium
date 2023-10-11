package TestApps;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Checkbox {
    private static final  String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    private static final String URL = "https://formy-project.herokuapp.com/checkbox";

    WebDriver driver = new ChromeDriver();

    @Test
    public void radioButtonsSelect(){
        System.setProperty("webdriver.chrome.driver" ,driversPath);
        driver.navigate().to(URL);
        driver.manage().window().maximize();

        WebElement c1 = driver.findElement(By.id("checkbox-1"));

        WebElement c2 = driver.findElement(By.cssSelector("input[value = 'checkbox-2']"));

        WebElement c3 = driver.findElement(By.xpath("//input[@value = 'checkbox-3']")); //Using Xpath with family

        c1.click();
        c2.click();
        c3.click();

//      //label[contains(text() , 'Radio button 3')]//preceding-sibling::input
//      //label[contains(text() , 'Radio button 3')]//parent::div//following-sibling::input

    }
}
