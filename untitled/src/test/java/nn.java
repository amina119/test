
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class nn {
    public static void main (String[] args){
        //open chrome
        System.setProperty("webdriver.chrome.driver","src/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        //open driver
        driver.navigate().to("https://biotic.store/Home/Index");



    }
}
