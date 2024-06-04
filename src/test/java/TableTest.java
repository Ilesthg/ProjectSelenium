import Utility.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TableTest {
    private String url = "https://www.asx.com.au";
    public WebDriver driver;


@Test
    public void printTable(){

        WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(url);
         WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler"))).click();
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() = 'S&P ASX200 top 5']"))).click();


        List<WebElement> rowList = driver.findElements(By.xpath("//*[@id='home_top_five']/div/div[1]/div/div[1]/table/tr"));
        System.out.println(rowList.size());

        List<WebElement> columnList = driver.findElements(By.xpath("//*[@id='home_top_five']/div/div[1]/div/div[1]/table/tr[2]/td"));
    System.out.println(columnList.size());


    for(int i = 2; i <= rowList.size(); i++) {
        for (int j = 1; j <= columnList.size(); j++) {
            System.out.printf("-- %-5s --", driver.findElement(By.xpath("//*[@id='home_top_five']/div/div[1]/div/div[1]/table/tr[" + i + "]/td[" + j + "]")).getText());

        }


        System.out.println();
        System.out.println();
    }
  //

    }
}
//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[2]/td[3]