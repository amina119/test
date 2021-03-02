package Maven.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TasksCenario {


    static public WebDriver driver;
    @BeforeTest
    public void OpenurlSignup() {
        //open chrome
        System.setProperty("webdriver.chrome.driver", "src/chromedriver");

        driver = new ChromeDriver();
        //open driver
        driver.navigate().to("https://biotic.store/Users/Login");
        driver.manage().window().maximize();
        WebElement usernameTxt=driver.findElement(By.id("UserData_User_UserName"));
        WebElement passwordTxt=driver.findElement(By.id("password"));
        usernameTxt.sendKeys("support@flexible.sa");
        passwordTxt.sendKeys("Biotic@1234");
        WebElement logBtn=driver.findElement(By.xpath("/html/body/main/div/div/div/form/button"));
        logBtn.click();
        String actualUrl="https://biotic.store/Tasks/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
       // System.out.println("Test passed");
       // (  new LoginCenario()).login();

    }
@Test
    public void CreateTask(){

        WebElement newTask=driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[1]/a"));
        newTask.click();
        WebElement disAEN=driver.findElement(By.id("descriptionen"));
        WebElement disAR=driver.findElement(By.id("descriptionar"));
        disAEN.sendKeys("New Task");
        disAR.sendKeys("مهمة جديدة");
    Select listBox = new Select(driver.findElement(By.id("select")));
    listBox.selectByValue("8");
    Select listBox2 = new Select(driver.findElement(By.id("select")));
    listBox2.selectByValue("2");
    Select listBox3 = new Select(driver.findElement(By.id("select")));
    listBox3.selectByValue("3");
       WebElement taskName=driver.findElement(By.id("taskname"));
       taskName.sendKeys("testtask");
       WebElement createBtn=driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[2]/div[2]/form/div[2]/button[1]"));
       createBtn.click();
    }
    @Test
    public void NotAssignedTask(){
        WebElement notassigned =driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[1]/a[2]/div/div/div"));
        notassigned.click();
        Select priorityBox = new Select(driver.findElement(By.id("ddlpriorityy1jyS+XM0Gs=")));
        priorityBox.selectByValue("2");
        Select driverBox = new Select(driver.findElement(By.id("ddlassignedToy1jyS+XM0Gs=")));
        driverBox.selectByValue("3");
        Select statusBox = new Select(driver.findElement(By.id("ddlstatusy1jyS+XM0Gs=")));
        statusBox.selectByValue("5");

       // WebElement newTask=driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[2]/a[2]/div/div/div"));
      //  WebElement startedTask =driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[3]/a[2]/div/div/div"));
      //  WebElement PendingTask=driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[4]/a[2]/div/div/div"));
     // WebElement DeliverdTask =driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[5]/a[2]/div/div/div"));
      //WebElement CompletedTask=driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[6]/a[2]/div/div/div"));
     // WebElement CancelledTask =driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[7]/a[2]/div/div/div"));
     // WebElement PickupStrated=driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[10]/a[2]/div/div/div"));
   // WebElement PickUpCompleted =driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div/div[11]/a[2]/div"));




    }
}
