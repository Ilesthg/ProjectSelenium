import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionClass {

    private static final String driversPath ="C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    private static final String URL = "https://www.google.com/?hl=es";

    WebDriver driver = new ChromeDriver();

    @Test
    public void manjeoDeEventos(){
        System.setProperty("webdriver.chrome.driver" , driversPath);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.navigate().to(URL);
        driver.manage().window().maximize();

        WebElement lens = driver.findElement(By.cssSelector("[aria-label = 'Búsqueda por imagen']"));
        //lens.click();
        WebElement inputGoogle = driver.findElement(By.cssSelector(".gLFyf"));
       // inputGoogle.sendKeys("Hola pepe");

        Actions builder = new Actions(driver);

        Action action = builder
                .moveToElement(lens)
                .build();

        action.perform();

        Action ac2 = builder
                .moveToElement(inputGoogle)
                .click()
                .keyDown(inputGoogle, Keys.SHIFT)
                .sendKeys("Hola Pepe")
                .contextClick()
                .build();

        ac2.perform();

        driver.quit();





    }


}
