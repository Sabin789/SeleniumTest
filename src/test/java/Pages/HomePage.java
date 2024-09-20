package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
   private By username= By.id("loggedInUserName");

   public boolean isUsernameDisplayed(){
    return find(username).isDisplayed();
   }

}
