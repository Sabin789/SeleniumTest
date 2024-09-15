package Part1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class ImportTest{
    WebDriver driver;
    WebDriverWait wait;

  @BeforeClass
  public void setup(){
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://qa-test.devops.dm.formpipe.dev/dm/dm.do");
    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  }


 


    @AfterClass
  public void tearDown(){
    driver.quit();
  }


  @Test
  public void login(){
    WebElement username=driver.findElement(By.id("j_username"));
    username.sendKeys("sabin");
    var password=driver.findElement(By.id("j_password"));
    //ADD PASSWORD
    password.sendKeys("");
    driver.findElement(By.id("loginButton")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loggedInUserName")));
    String result=driver.findElement(By.id("loggedInUserName")).getText();
    String expectedResult="sabin";
    Assert.assertEquals(result,expectedResult);



    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pdmHeaderTitle")));
    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"importAppV2ListTwo\"]/div/input")));
    button.click();
    WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div/div")));
    uploadButton.click();
    WebElement yesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/button")));
    yesButton.click();
    WebElement statementButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div[1]/div/div/div[2]/div/div/div[3]/div/div/div/div/div[2]")));
    statementButton.click();
    WebElement dateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div/div/div/div[2]/div/div[4]/div/input")));
    dateButton.sendKeys("09/09/2024");
    WebElement amountButton = driver.findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div/div/div/div[2]/div/div[3]/div/input"));
    amountButton.sendKeys("100");
    WebElement nameButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div/input"));
    nameButton.sendKeys("name"); 

    WebElement importButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[3]/button[3]/span")));
    importButton.click();

    By messageLocator = By.xpath("//*[@id='SubmissionState']/div[1]/div[1]/span");
    wait.until(ExpectedConditions.textToBePresentInElementLocated(messageLocator, "Submitted "));    
}

  }




