import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Face {



    WebDriver driver = new ChromeDriver();

    private static final String URL ="https://www.facebook.com/?locale=en_US";
    private static final String driversPath ="C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";

@Test
    public void selectText(){
        System.setProperty("webdriver.chrome.driver", driversPath);

        driver.navigate().to(URL);
        driver.manage().window().maximize();



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
