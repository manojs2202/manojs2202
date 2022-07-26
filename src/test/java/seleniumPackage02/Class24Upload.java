package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class24Upload {
    public static String basiUrl="http://www.leafground.com/pages/upload.html";
    public static WebDriver driver;
    @BeforeTest
    public static void upload() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);

    }
    @Test
    public static void testUpload() throws InterruptedException {
    By btnOR =By.xpath("//input[@name='filename']");
    WebElement btn =driver.findElement(btnOR);
    btn.sendKeys("C:\\Users\\shiva\\Downloads\\New folder\\Library-API.docx");
    Thread.sleep(2000);
    driver.quit();
    }
}
