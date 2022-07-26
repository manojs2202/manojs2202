package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShot {
    public static String basiUrl="https://www.amazon.in/";
    public static WebDriver driver;
    @BeforeTest
    public static void upload() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);
    }

    @Test
    public static void screen() throws IOException, InterruptedException {
//        File screenImage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenImage,new File( System.getProperty("user.dir")+"\\src\\main\\resources"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By ele = By.className("navFooterBackToTop");
        wait.until(ExpectedConditions.presenceOfElementLocated(ele));
        TakesScreenshot scrShot =(TakesScreenshot)driver;
//        Thread.sleep(5000);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\test1.png");
        FileUtils.copyFile(SrcFile, DestFile);

    }}

