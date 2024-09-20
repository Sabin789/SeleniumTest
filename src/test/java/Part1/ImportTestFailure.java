package Part1;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.ImportPage;
import Pages.LoginPage;





public class ImportTestFailure extends BaseTest {
  private String urlString = "https://qa-test.devops.dm.formpipe.dev/dm/dm.do";
    private LoginPage loginPage;
    private ImportPage importPage;


  @Test
  public void loginAndImportFailure(){
    driver.get(urlString);
    loginPage = new LoginPage(driver);
    importPage = new ImportPage(driver);

    loginPage.logIntoApplication("sabin", "Q2gyYK4qYj55Wgm");


    importPage.clickButton();
        importPage.clickUploadButton();
        importPage.clickYesButton();
        importPage.clickStatementButton();
        importPage.setDateField("0002-03-31");
        importPage.clickImportButton();

    String errorText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmissionState\"]/div[1]/div[3]/span"))).getText();
    var expectedError="Some documents had errors:";
    Assert.assertTrue(errorText.contains(expectedError));

}

  }
