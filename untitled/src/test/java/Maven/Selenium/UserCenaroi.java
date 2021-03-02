package Maven.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserCenaroi {
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
        driver.navigate().to("https://biotic.store/Users");
        String actualUrl="https://biotic.store/Users";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        WebElement logBtn1=driver.findElement(By.xpath("/html/body/main/div/div[2]/main/div[1]/div[1]/a/span"));
        logBtn1.click();
    }
@Test
    public void CreateTask(){

        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("amina@yopmail.com");
        WebElement email=driver.findElement(By.id("email"));
        WebElement fullNmae=driver.findElement(By.id("fullname"));
        email.sendKeys("amina@yopmail.com");
    fullNmae.sendKeys("amina");
    Select usertype = new Select(driver.findElement(By.id("usertype")));
    usertype.selectByValue("3");
    Select langtype = new Select(driver.findElement(By.id("langtype")));
    langtype.selectByValue("en");
    Select country = new Select(driver.findElement(By.id("countries_title")));
    country.selectByValue("239");
    WebElement phone=driver.findElement(By.id("mobiles"));
    phone.sendKeys("859746321");
    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("Biotic@1234");
        WebElement comment=driver.findElement(By.id("comment"));
        comment.sendKeys("user");
        WebElement createBtn=driver.findElement(By.xpath("//*[@id=\"btnUser\"]"));
        createBtn.click();
    }
}


