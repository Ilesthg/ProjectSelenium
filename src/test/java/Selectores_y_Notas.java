import Utility.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selectores_y_Notas {
    public String url = "https://facebook.com";
    public WebDriver driver = DriverFactory.selectDriver();

    @Test //BY ID
    public void typeEmail() {
        driver.get(url);
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("coderhouse@coder.com");
    }

    @Test //BY LINKTEXT
    public void forgotLink() {
        driver.get(url);
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
        forgotPasswordLink.click();
    }

    @Test //BY TAGNAME
    public void loginButton()  {
        driver.get(url);
        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();
    }

    @Test//BY CLASSNAME
    public void password()  {
        driver.get(url);
        WebElement passwordInput = driver.findElement(By.className("_9npi"));
        passwordInput.sendKeys("password123456");
    }

    // Css Selectors  "TagNam(selector ya sea "#" o ".")Value"

    @Test//CSS SELECTOR BY ID
    public void typeEmailCss() {
        driver.get(url);
        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        emailInput.sendKeys("coderhouse@coder.com");
    }

    @Test //CSS SELECTOR BY CLASSNAME
    public void passwordCss()  {
        driver.get(url);
        WebElement passwordInput = driver.findElement(By.cssSelector("._9npi"));
        passwordInput.sendKeys("password123456");
    }

    @Test
    public void loginButtonCss()  {
        driver.get(url);
        WebElement loginButton = driver.findElement(By.cssSelector("button[name=\"login\"]"));
        loginButton.click();
    }

    /*
       Para localizar al elemento Tag- Attribute        css = tag[attribute=value]
       Para localizar al elemento Class - Attribute     css = tag.class[attribute=value]
    1. Para localizar al elemento Ending Attribute      css = tag[attribute$=value]
    2. Para localizar el elemento Parcial - Attribute   css = tag[attribute*=value]

     */
  //

}