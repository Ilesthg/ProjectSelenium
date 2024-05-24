package TestApps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RadioButtons {
    private static final  String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    private static final String URL = "https://formy-project.herokuapp.com/radiobutton";

    WebDriver driver = new ChromeDriver();

    @Test
    public void radioButtonsSelect(){
        System.setProperty("webdriver.chrome.driver" ,driversPath);
        driver.navigate().to(URL);
        driver.manage().window().maximize();

        WebElement r1 = driver.findElement(By.id("radio-button-1"));

        WebElement r2 = driver.findElement(By.cssSelector("input[value = 'option2']"));

        WebElement r3 = driver.findElement(By.xpath("//label[contains(text() , 'Radio button 3')]//preceding-sibling::input")); //Using Xpath with family

        r1.click();
        r2.click();
        r3.click();

//      //label[contains(text() , 'Radio button 3')]//preceding-sibling::input
//      //label[contains(text() , 'Radio button 3')]//parent::div//following-sibling::input

    }
}
