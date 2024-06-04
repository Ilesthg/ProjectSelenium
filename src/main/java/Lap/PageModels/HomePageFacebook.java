package Lap.PageModels;

import Lap.Utility.Selectors;
import Lap.Base.BaseModeloparaLap;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePageFacebook extends BaseModeloparaLap{


    public  static void Login(){
        List<WebElement> hola = new ArrayList<>();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/?locale=en_US");
        Selectors.findElementWithWait("XPATH", Lap.PageElements.HomePageFacebook.emailInput).sendKeys("Hola");
      hola =  Selectors.findElementsWithWait("XPATH", Lap.PageElements.HomePageFacebook.listOfElements);
      System.out.println(hola.size());

    }
}
