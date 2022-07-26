package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Class12Framework {
    public static String basiUrl="http://www.leafground.com/pages/frame.html";
    public static WebDriver driver;
    @Test
    public static void frame() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(basiUrl);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        By buttonPath=By.xpath("//*[@id='Click']");
        WebElement button1=driver.findElement(buttonPath);
        button1.click();
        driver.switchTo().defaultContent();

//        By framePath2=By.xpath("//iframe[@src='nested.html']");
//        WebElement frame2=driver.findElement(framePath2);
//        driver.switchTo().frame(frame2);
//        driver.switchTo().frame("frame2");

     List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
        System.out.println(iframes.size());
        Thread.sleep(5000);
         driver.quit();

    }
}
