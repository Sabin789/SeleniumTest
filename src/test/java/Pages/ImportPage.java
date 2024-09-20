package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImportPage extends BasePage {

    private By button = By.xpath("//*[@id=\"importAppV2ListTwo\"]/div/input");
    private By uploadButton = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div/div");
    private By yesButton = By.xpath("/html/body/div[6]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/button");
    private By statementButton = By.xpath("/html/body/div[6]/div/div[1]/div/div/div[2]/div/div/div[3]/div/div/div/div/div[2]");
    private By dateField = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div/div/div/div[2]/div/div[4]/div/input");
    private By amountField = By.xpath("//*[@id='root']/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div/div/div/div[2]/div/div[3]/div/input");
    private By nameField = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div/input");
    private By importButton = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[3]/button[3]/span");

    public ImportPage(WebDriver driver) {
        super(driver);
    }

    public void clickButton() {
        click(button);
    }

    public void clickUploadButton() {
        click(uploadButton);
    }

    public void clickYesButton() {
        click(yesButton);
    }

    public void clickStatementButton() {
        click(statementButton);
    }

    public void setDateField(String date) {
        set(dateField, date);
    }

    public void setAmountField(String amount) {
        set(amountField, amount);
    }

    public void setNameField(String name) {
        set(nameField, name);
    }

    public void clickImportButton() {
        click(importButton);
    }
}
