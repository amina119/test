package Maven.Selenium;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;


public class  Signup   {
    static public WebDriver driver;
    @BeforeTest
    public void OpenurlSignup() {
        //open chrome
        System.setProperty("webdriver.chrome.driver", "src/chromedriver");

        driver = new ChromeDriver();
        //open driver
        driver.navigate().to("https://biotic.store/Users/Login");
        driver.manage().window().maximize();
    }
    @Test
    public  void SignupPage(){

        WebElement signup=driver.findElement(By.xpath("/html/body/main/div/div/div/form/button"));
        signup.click();
        driver.navigate().to("https://biotic.store/Users/Register");

        WebElement fullName=driver.findElement(By.id("UserData_Person_FullName"));
        WebElement email=driver.findElement(By.id("UserData_User_UserName"));
        WebElement phone=driver.findElement(By.id("UserData_Person_MobileNumber"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement confirmPW=driver.findElement(By.id("password2"));
        fullName.sendKeys("amina");
        email.sendKeys("tester2021@yopmail.com");
        Select dropdown = new Select(driver.findElement(By.id("countries_title")));
        dropdown.selectByVisibleText("221");
        phone.sendKeys("589748635");
        password.sendKeys("Biotic@1234");
        confirmPW.sendKeys("Biotic@1234");
       // drpCountry.sendKeys("239");
        WebElement signBtn=driver.findElement(By.xpath("//html/body/main/div/div/div/form/button"));
    signBtn.click();

    }

    }

