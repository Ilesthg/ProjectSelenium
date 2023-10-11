package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    //Creacion del objeto driver

    public static WebDriver driver;
    public static String driversPath = "C:\\Users\\vhgm\\IdeaProjects\\ProjectSeleniumWebD\\src\\main\\resources\\drivers\\chromedriver.exe";

    //METODO PARA SLECCECIONAR UN BROWSER APLICANDO MODULARIDAD Y SEPRANDO EL BROWSER EN EL ARCHIVO DATA.PROPERTIES
    private static String browser = PropertiesFile.getProperty("browser");;
    //public static String url= PropertiesFile.getProperty("url");
    private static String url= PropertiesFile.getProperty("url");

 public static String selectURL(){
    return url;
    }


    public static WebDriver selectDriver (){

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driversPath );
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", driversPath + "geckodriver");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver" , driversPath + "msedgedriver");
            driver = new EdgeDriver();

        }

        return  driver;
    }
    public static WebDriver selectDriverwithParameter (String browser){

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driversPath );
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", driversPath + "geckodriver");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver" , driversPath + "msedgedriver");
            driver = new EdgeDriver();

        }

        return  driver;
    }

}
