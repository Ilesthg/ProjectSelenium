package FacebookPOM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLogin {
    //Driver y atributos
    WebDriver driver;
    By email_or_phoneInput = By.cssSelector("[name = email]");
    By passwordInput = By.name("pass");
    By buttonLogIn = By.cssSelector("[type = submit]");
    //Constructor
    public FacebookLogin(WebDriver driver){
        this.driver = driver;
    }

    //Metodos
    public void fillData(String email, String password){
        driver.findElement(email_or_phoneInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(buttonLogIn).click();
    }





}
