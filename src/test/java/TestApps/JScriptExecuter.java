package TestApps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JScriptExecuter {
    private String url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
    private String driversPath = "src/main/resources/drivers/chromedriver.exe";
    WebDriver driver;

    @Test
    public void JSE() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driversPath);
        driver = new ChromeDriver();
        driver.get(url);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //Print the Title of the page
        String Script = "return document.title;";
        String resultTitle = (String) jse.executeScript(Script);
        System.out.println(resultTitle);

        //Click on button
        driver.switchTo().frame("iframeResult");
        jse.executeScript("myFunction()");
        driver.switchTo().alert().accept();

        //Higlight a button
        WebElement button = driver.findElement(By.xpath("//button[text() = 'Try it']"));
        jse.executeScript("arguments[0].style.border='5px solid green';", button);

        //Scroll
        driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
        WebElement next = driver.findElement(By.xpath("//*[@id='main']/div[11]/a[2]"));
        jse.executeScript("arguments[0].scrollIntoView(true);",next);
    }
}
