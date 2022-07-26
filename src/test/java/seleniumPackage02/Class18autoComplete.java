
package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static seleniumPackage02.Class16ToolTip.driver;

public class Class18autoComplete {
    public static String basiUrl="http://www.leafground.com/pages/autoComplete.html";
    public static WebDriver driver;
    @BeforeTest
    public static void autoComplete(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void auto() throws InterruptedException {
        By pathname=By.xpath("//input[@id='tags']");
        WebElement autoEditBox=driver.findElement(pathname);
        autoEditBox.sendKeys("s");
        Thread.sleep(1000);
        By coursesPath= By.xpath("//*[@id='ui-id-1']/li");
        List<WebElement> courses=driver.findElements(coursesPath);
        System.out.println(courses.size());
        System.out.println(courses);

        for(WebElement course:courses){
            System.out.println(course.getText());
        if(course.getText().equalsIgnoreCase("Web Services")){
            course.click();
            break;
        }
        }

    }
    @AfterTest
    public static void endTask(){
        driver.quit();
    }

}
