package TestNg_JAVA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clas1_OrangeHRM {
    public static String basiUrl="https://opensource-demo.orangehrmlive.com/";
    public static WebDriver driver;
    @BeforeMethod
    public static void orange(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void username(){
        By pathUserName=By.xpath("//*[@id='txtUsername']");
        WebElement name=driver.findElement(pathUserName);
        name.sendKeys("Admin");
    }
    @Test
    public static void Password(){
        By pathPassword=By.xpath("//*[@id='txtPassword']");
        WebElement passw=driver.findElement(pathPassword);
        passw.sendKeys("admin123");
    }
    @Test
    public static void login() throws InterruptedException {
        By pathLogin=By.xpath("//*[@id='btnLogin']");
        WebElement log=driver.findElement(pathLogin);
        log.click();
//        Thread.sleep(5000);
    }
    @AfterMethod
    public static void end(){
//        driver.quit();
    }
}
