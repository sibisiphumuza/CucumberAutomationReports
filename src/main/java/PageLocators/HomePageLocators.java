package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class HomePageLocators {
 
      @FindBy(xpath = "//h2[@class='title']")
      public  WebElement homePageTitle;
       
}
