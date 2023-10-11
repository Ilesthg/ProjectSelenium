package JPetStorePOM_PageFactory.Pages;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPSHome {
    //Driver
    WebDriver driver;

    //Seletores de objetos
   // By signIn = By.xpath("//a[text()= 'Sign In']");

    //Con FindBy
    @FindBy(xpath = "//a[text()= 'Sign In']")//******
    WebElement signIn;//******

    //Crear constructor
    public JPSHome(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);//----
    }

    //Metodos
    public void clickOnSignIn(){
        //driver.findElement(signIn).click();
        signIn.click();//******

    }









}
