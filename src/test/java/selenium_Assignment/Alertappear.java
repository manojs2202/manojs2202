package selenium_Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alertappear {
    public static String basiUrl="http://www.leafground.com/pages/alertappear.html";
    public static WebDriver driver;
    @BeforeTest
    public static void alertappear() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void testalertappear(){
        By path=By.xpath("//*[@id='alert']");
        WebElement clickMe=driver.findElement(path);
        clickMe.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();
    }
}
