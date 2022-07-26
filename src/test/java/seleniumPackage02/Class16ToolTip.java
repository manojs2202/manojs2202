package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class16ToolTip {
    public static String basiUrl="http://www.leafground.com/pages/tooltip.html";
    public static WebDriver driver;
    @BeforeTest
    public static void tooTip() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);
    }

    @Test
    public static void titleName() {
        By pathBox = By.xpath("//input[@id='age']");
        WebElement inputBox = driver.findElement(pathBox);
        String tool = inputBox.getAttribute("title");
        System.out.println(tool);
    }
    @Test
    public static void writeName(){
       By pathBox =By.xpath("//input[@id='age']");
       WebElement inputBox =driver.findElement(pathBox);
       inputBox.sendKeys("manojkumar");
    }
    @AfterTest
        public static void endTest () throws InterruptedException {
        Thread.sleep(5000);
            driver.quit();
        }

    }
