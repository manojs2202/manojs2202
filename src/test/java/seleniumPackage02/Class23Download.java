package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Class23Download {
    public static String basiUrl="https://the-internet.herokuapp.com/download";
    public static WebDriver driver;
    @BeforeTest
    public static void alertappear() {
        WebDriverManager.chromedriver().setup();
        String downloadPath=System.getProperty("user.dir")+"\\src\\main\\resources";
        System.out.println(downloadPath);
        HashMap<String,Object> myChromeSettings=new HashMap<>();
        myChromeSettings.put("profile.default_content.setting.popups", 0);
        myChromeSettings.put("download.default_directory",downloadPath);

        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs", myChromeSettings);
        driver=new ChromeDriver(options);
           }
    @Test
    public static void testAlertappear() throws InterruptedException {
        driver.get(basiUrl);
        By secoundfile=By.xpath("//a[contains(text(),'LambdaTest.txt')]");
        WebElement lambdafile=driver.findElement(secoundfile);
        lambdafile.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
