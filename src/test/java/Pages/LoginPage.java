package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameField = By.id("j_username");
    private By passwordField = By.id("j_password");
    private By loginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }
}
