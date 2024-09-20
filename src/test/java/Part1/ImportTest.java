package Part1;

import org.testng.annotations.Test;
import Pages.ImportPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ImportTest extends BaseTest {

    private String urlString = "https://qa-test.devops.dm.formpipe.dev/dm/dm.do";
    private LoginPage loginPage;
    private ImportPage importPage;

    @Test
    public void loginAndImport() {
        // Navigate to the application URL
        driver.get(urlString);

        // Initialize Page Objects
        loginPage = new LoginPage(driver);
        importPage = new ImportPage(driver);

        // Perform login
        loginPage.logIntoApplication("sabin", "Q2gyYK4qYj55Wgm");

        // Interact with the import page
        importPage.clickButton();
        importPage.clickUploadButton();
        importPage.clickYesButton();
        importPage.clickStatementButton();
        importPage.setDateField("09/09/2024");
        importPage.setAmountField("100");
        importPage.setNameField("name");
        importPage.clickImportButton();

        // Wait for the submission confirmation
        By messageLocator = By.xpath("//*[@id='SubmissionState']/div[1]/div[1]/span");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(messageLocator, "Submitted "));
    }
}
