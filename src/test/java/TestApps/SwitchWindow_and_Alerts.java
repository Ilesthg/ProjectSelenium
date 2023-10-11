package TestApps;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindow_and_Alerts {

    private static final  String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    private static final String URL = "https://formy-project.herokuapp.com/switch-window";

    WebDriver driver = new ChromeDriver();

    @Test
    public void switchWindows(){
        System.setProperty("webdriver.chrome.driver" , driversPath);

        driver.navigate().to(URL);
        driver.manage().window().maximize();
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        WebElement bttonNewWindow = driver.findElement(By.cssSelector("#new-tab-button"));
        bttonNewWindow.click();

        Set<String> arraydeWindows = driver.getWindowHandles();
        driver.switchTo().window(arraydeWindows.toArray()[0].toString());
/*
        for (String handl1: driver.getWindowHandles()) {
            System.out.println("foreach "+handl1);
        }
*/
    }
    @Test
    public void swithchToAlert(){
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        WebElement clickAlert = driver.findElement(By.xpath("//button[@id = 'alert-button' ]"));
        clickAlert.click();

      //  driver.switchTo().alert().accept();
        Alert al = driver.switchTo().alert();
        al.accept();
    }





}
