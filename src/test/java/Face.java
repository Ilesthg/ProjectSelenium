import Lap.Utility.Screenshots;
import Utility.BaseMode;



import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class Face extends BaseMode{

Screenshots ss = new Screenshots();


   // WebDriver driver = new ChromeDriver();
// public static  WebDriver driver;
    private static final String URL ="https://www.facebook.com/?locale=en_US";
    //private static final String driversPath ="C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";

@Test
    public void selectText() throws IOException {
driver.get(URL);
driver.manage().window().maximize();
Screenshots.takeScreenS();






   Actions builder = new Actions(driver);

        Action ac1 = builder
                //.moveToElement(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/h2")))
                .moveToElement(driver.findElement(By.className("_8eso")))

                //.moveToElement( driver.findElement(By.xpath("//h2[contains(text(), 'Connect with friends')]")))
                .doubleClick()
                .moveToElement(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/h2")),8,1)

                .build();

        ac1.perform();


    }
}
