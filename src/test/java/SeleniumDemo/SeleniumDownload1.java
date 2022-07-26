package SeleniumDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;

public class SeleniumDownload1 {
    public static String basiUrl="https://demoqa.com/upload-download";
    public static WebDriver driver;
    @BeforeTest
    public static void downloadFile() {
        WebDriverManager.chromedriver().setup();
        String downloadPath = System.getProperty("user.dir") + "\\src\\main\\resources";
        System.out.println(downloadPath);

        HashMap<String, Object> mychromeSetting = new HashMap<>();

        mychromeSetting.put("profile.default_content_settings.popups", 0);
        mychromeSetting.put("download.default_directory", downloadPath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", mychromeSetting);
        driver = new ChromeDriver(options);
    }

        @Test
        public static void testDownload() throws InterruptedException {
        driver.get(basiUrl);
        By firstFile= By.xpath("//*[@id='downloadButton']");
            WebElement newFile=driver.findElement(firstFile);
            newFile.click();

            Thread.sleep(3000);
            driver.quit();


        }



    }

