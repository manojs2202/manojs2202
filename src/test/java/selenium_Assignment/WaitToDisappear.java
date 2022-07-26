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

public class WaitToDisappear {
    public static String basiUrl="http://www.leafground.com/pages/disapper.html";
    public static WebDriver driver;
    @BeforeTest
    public static void disappeat() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void testDisappeat(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By path=By.xpath("//*[@id='btn']/b");
        System.out.println(driver.findElement(path).isDisplayed());
        try {
//           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='btn']/b")));
           wait.until(ExpectedConditions.invisibilityOfElementLocated(path));
        }catch(Exception E){
            E.printStackTrace();
        }
       System.out.println(driver.findElement(path).isDisplayed());

        driver.quit();
    }

}
