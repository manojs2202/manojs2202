package SeleniumAssertions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestingCode {
//    public static String basiUrl="URL";
    public static WebDriver driver;
    public static void frame(String url,String xpath ) throws IOException {

        driver=new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);

        By buttonPath = By.xpath(xpath);
        WebElement button1 = driver.findElement(buttonPath);
        button1.click();
        driver.switchTo().defaultContent();
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println(iframes.size());

//        TakesScreenshot scrShot =(TakesScreenshot)driver;
//        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//        File DestFile=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\test1.png");
//        FileUtils.copyFile(SrcFile, DestFile);
    }
}
