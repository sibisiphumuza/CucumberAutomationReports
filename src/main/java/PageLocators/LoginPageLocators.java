package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginPageLocators {
 
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
  
    @FindBy(id = "pass")
    public WebElement password;
     
    @FindBy(id = "email-error")
    public WebElement missingUsernameErrorMessage;
     
    @FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
    public WebElement login;
  
    @FindBy(xpath = "//span[@class='base']")
    public  WebElement errorMessage;
        
}
