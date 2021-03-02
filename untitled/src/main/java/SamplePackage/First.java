package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class First {
    public static void main (String[] args){

        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://biotic.store/Home/Index");



    }
}
