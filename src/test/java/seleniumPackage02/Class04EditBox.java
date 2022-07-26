package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class04EditBox {
    @Test
    public static void box01(){
        WebDriverManager.chromedriver().setup();
        WebDriver drive =new ChromeDriver();
        drive.get("http://www.leafground.com/pages/Edit.html");
        WebElement box1=drive.findElement(By.xpath("//*[@id='email']"));
//        WebElement box2=drive.findElement(By.xpath("//"));

        box1.sendKeys("manoj@123");
        drive.quit();

    }
}
