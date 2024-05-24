package FacebookPOM_TestNG.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLogin extends BaseModel{
    //Driver y atributos
  //  WebDriver driver; Borra este driver si ya tenemos uno en la Page BaseModel
    By email_or_phoneInput = By.cssSelector("[name = email]");
    By passwordInput = By.name("pass");
    By buttonLogIn = By.cssSelector("[type = submit]");
    By createAccountButton = By.xpath("//a[@data-testid = 'open-registration-form-button']");
    By modalFirstNameInput = By.xpath("//input[@placeholder = 'First name']");


    //Constructor heredado
    public FacebookLogin(WebDriver driver) {
        super(driver);
    }
    //Constructor
   /*
    public FacebookLogin(WebDriver driver){
        this.driver = driver;
    }
    */
    BaseModel bm = new BaseModel(driver);
    //FacebookLogin fl = new FacebookLogin(driver);//Hereda los metodos de la clase padre





    //Metodos
    public void fillData(String email, String password){

        driver.findElement(email_or_phoneInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
       // driver.findElement(buttonLogIn).click();
        bm.waitForElementandClick(createAccountButton);
        //driver.findElement(createAccountButton).click();
        bm.waitForElementandgiveText(modalFirstNameInput, "NOMAS");
    }





}
