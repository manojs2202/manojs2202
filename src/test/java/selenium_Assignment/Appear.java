package selenium_Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Appear {
    public static String basiUrl = "http://www.leafground.com/pages/appear.html";
    public static WebDriver driver;

    @BeforeTest
    public static void appeat() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void testAppeat(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(120));
        By path= By.xpath("//*[@id='btn']/b");
       WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(path));
       driver.quit();
    }
}
