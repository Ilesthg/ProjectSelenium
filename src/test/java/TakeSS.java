import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeSS {

    private String url = "https://www.google.com.mx/?hl=es";
    private String driversPATH = "src/main/resources/drivers/chromedriver.exe";
    WebDriver driver;
@Test
public  void takeSS() throws IOException {
    Date date = new Date();

 String ssDate =   date.toString().replace(" ", "-").replace(":","-");

    System.setProperty("webdriver.chrome.driver" , driversPATH);
    driver= new ChromeDriver();
    driver.get(url);


    File ssFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(ssFile, new File("src/test/java/ssEvidence/"+ssDate+".png"));
}
}
