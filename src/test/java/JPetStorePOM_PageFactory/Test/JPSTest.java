package JPetStorePOM_PageFactory.Test;

import JPetStorePOM_PageFactory.Pages.JPSHome;
import JPetStorePOM_PageFactory.Pages.JPSSingIn;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JPSTest {
    //Instancia e Inizializacion del Driver
    WebDriver driver = new ChromeDriver();
    //Ruta driver
    private String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";
    //URL de la pagina
    private final String URL = "https://jpetstore.aspectran.com/catalog/";


    //Instancias las clases por cada pagina
    JPSHome jpsHome;
    JPSSingIn jpsSingIn;

     @Test
    public void LoginWithInvalidCredentials(){
        System.setProperty("webdriver.chrome.driver", driversPath);

         jpsHome = new JPSHome(driver);
         jpsSingIn = new JPSSingIn(driver);

        driver.navigate().to(URL);
        driver.manage().window().maximize();

        jpsHome.clickOnSignIn();
        jpsSingIn.fillLoginPage("2" , "2");

        //driver.quit();
    }


}
