package Maven.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class LoginCenario {
static public WebDriver driver;
    @BeforeTest

    public void  openUrl(){

        //open chrome
        System.setProperty("webdriver.chrome.driver","src/chromedriver");

        driver = new ChromeDriver();
        //open driver
        driver.navigate().to("https://biotic.store/Users/Login");
        driver.manage().window().maximize();
    }
    @Test(enabled = true)
    //happy case
    public void login(){
        WebElement usernameTxt=driver.findElement(By.id("UserData_User_UserName"));
        WebElement passwordTxt=driver.findElement(By.id("password"));
      usernameTxt.sendKeys("support@flexible.sa");
      passwordTxt.sendKeys("Biotic@1234");
        WebElement logBtn=driver.findElement(By.xpath("/html/body/main/div/div/div/form/button"));
        logBtn.click();
        String actualUrl="https://biotic.store/Tasks/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("Test passed");

    }
    //negative
    @Test(enabled = false)
     public void loginNgt()

    {
        try {
            WebElement usernameTxt = driver.findElement(By.id("UserData_User_UserName"));
            WebElement passwordTxt = driver.findElement(By.id("password"));
            usernameTxt.sendKeys("support@flexible");
            passwordTxt.sendKeys("Biotic1234");
            WebElement logBtn = driver.findElement(By.xpath("/html/body/main/div/div/div/form/button"));
            logBtn.click();
            String actualUrl="https://biotic.store/Tasks/";
            String expectedUrl= driver.getCurrentUrl();

            Assert.assertEquals(expectedUrl,actualUrl);
            System.out.println("Test Failed");
        }
        catch (Exception e){

            System.out.println(e.getMessage());

        };

    }
}
