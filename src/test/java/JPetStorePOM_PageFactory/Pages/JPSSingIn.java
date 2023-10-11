package JPetStorePOM_PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPSSingIn {
    //Driver instancia y Atributos
    WebDriver driver;

    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement contravene;
    @FindBy(xpath = "//button[text()= 'Login']")
    WebElement buttonLogin;

//    By inputUsername  = By.cssSelector("[name = 'username']");
  //  By inputPassword = By.cssSelector("[name = 'password']");
    //By buttonLogIn = By.xpath("//button[text()= 'Login']");

    //Constructor
    public JPSSingIn(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Metodos
    public void fillLoginPage(String userName, String password){
       // driver.findElement(inputUsername).sendKeys(userName);
        //driver.findElement(inputPassword).sendKeys(password);
        //driver.findElement(buttonLogIn).click();
        username.sendKeys(userName);
        contravene.sendKeys(password);
        buttonLogin.click();
    }
}
