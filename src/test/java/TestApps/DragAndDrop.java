package TestApps;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    private static final  String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    private static final String URL = "https://formy-project.herokuapp.com/dragdrop";

    WebDriver driver = new ChromeDriver();

    @Test
    public void dragAndDrop(){
        System.setProperty("webdriver.chrome.driver" ,driversPath);
        driver.navigate().to(URL);
        driver.manage().window().maximize();

        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

        Actions builder = new Actions(driver);

        Action a1 = builder.
                    dragAndDrop(image,box)
                .build();

        a1.perform();


    }


}
