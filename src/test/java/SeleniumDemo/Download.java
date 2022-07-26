package SeleniumDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;

public class Download {
    public static String basiUrl="https://www.pexels.com/search/free%20wallpaper/";
    public static WebDriver driver;
    @BeforeTest
    public static void downloadImg(){
        WebDriverManager.chromedriver().setup();
        String downloadPath=System.getProperty("user.dir")+"src//main//resources";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        HashMap<String,Object> myChromeSettings=new HashMap<>();

        myChromeSettings.put("profile.default_content_settings.popups",0);
        myChromeSettings.put("download.default_directory", downloadPath);

        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs", myChromeSettings);
        driver=new ChromeDriver(options);
    }
    @Test
    public static void image(){
        driver.get(basiUrl);
        By file=By.xpath("//*[@id='-']/div[1]/div[1]/div[2]/div[1]/article/div/a)");
        WebElement newFile=driver.findElement(file);
        newFile.click();
    }
    @AfterTest
    public static void end(){
        driver.quit();
    }

}
