package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Class24_1Upload {
    public static String basiUrl="https://demoqa.com/upload-download";
    public static WebDriver driver;
    @BeforeTest
    public static void upload() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);
    }
   @Test
   public static void testUpload() throws AWTException, InterruptedException {
        By btnOR =By.id("uploadFile");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
       WebElement btn=driver.findElement(btnOR);
       Actions actions=new Actions(driver);
       actions.click(btn).build().perform();

       String fliepath="C:\\Users\\shiva\\Downloads\\New folder\\Library-API.docx";
       StringSelection selection=new StringSelection(fliepath);
       Clipboard clip= Toolkit.getDefaultToolkit().getSystemClipboard();
       clip.setContents(selection, null);

       Robot robot=new Robot();
       robot.delay(3000);
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.delay(2000);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(5000);
       driver.quit();

   }
}
