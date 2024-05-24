import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {

    private String url = "https://www.google.com";
    private static String driversPath = "./src/main/resources/drivers/chromedriver.exe";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , driversPath);
        WebDriver wb = new ChromeDriver();
        wb.navigate().to("https://www.google.com");
        wb.close();
    }
@Test
 public void visitGoogle_usingCssSelector() {
    System.setProperty("webdriver.chrome.driver", driversPath);
    WebDriver driver = new ChromeDriver();


    driver.manage().window().maximize();
    driver.navigate().to(url);
    ;
    System.out.println(driver.manage().getCookies());

    //driver.get(url);
    WebElement searchInput = driver.findElement(By.id("APjFqb"));
    searchInput.sendKeys("Selenium");
    searchInput.sendKeys(Keys.ENTER);
    
    assertEquals("Selenium - Buscar con Google", driver.getTitle());


   driver.close();



}





}
